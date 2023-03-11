import entities.Dependency.App
import entities.Dependency.Fonts
import entities.Dependency.Features
import entities.DependencyType.Library
import entities.DependencyType.Application
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application") version "8.0.0-beta03" apply false
    id("com.android.library") version "8.0.0-beta03" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}

val subProjects = listOf(App, Fonts, Features)

fun getNamespace(name: String): String {
    return "com.slaviboy.$name"
}

fun BaseExtension.setCompileOptions() {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

@Suppress("UnstableApiUsage")
fun BaseExtension.general() {

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "17"
        }
    }

    buildFeatures.compose = true

    composeOptions {
        kotlinCompilerExtensionVersion = ApplicationDependencyVersions.kotlinCompiler
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

fun BaseExtension.setDefaultConfig(name: String) {
    apply {
        namespace = getNamespace(name)
        compileSdkVersion(ApplicationConfiguration.compileSdk)

        defaultConfig {
            minSdk = ApplicationConfiguration.minSdk
            targetSdk = ApplicationConfiguration.targetSdk
            testInstrumentationRunner = ApplicationConfiguration.androidTestInstrumentation
            vectorDrawables {
                useSupportLibrary = true
            }
        }
    }
}

fun BaseExtension.setBuildTypes() {
    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }
}

fun BaseExtension.setup(name: String) {
    setDefaultConfig(name)
    setBuildTypes()
    setCompileOptions()
    general()
}

fun PluginAware.setPlugins() {
    apply {
        plugin("kotlin-kapt")
        plugin("org.jetbrains.kotlin.android")
        plugin("com.google.dagger.hilt.android")
    }
}

fun PluginAware.setApplicationPlugins() {
    setPlugins()
    apply {
        plugin("com.android.application")
    }
}

fun PluginAware.setLibraryPlugins() {
    setPlugins()
    apply {
        plugin("com.android.library")
    }
}

fun Project.setDependencies() {
    dependencies {
        kapt(
            "com.google.dagger:hilt-android-compiler:2.44"
        )
    }
}

subprojects {
    subProjects.find {
        println("subproject- $path - $name")
        it.matches(this)
    }?.let {
        when (it.type) {
            is Application -> {
                setApplicationPlugins()
                configure<BaseExtension> {
                    apply {
                        defaultConfig {
                            applicationId = getNamespace(ApplicationConfiguration.appName)
                            versionCode = ApplicationConfiguration.versionCode
                            versionName = ApplicationConfiguration.versionName
                        }
                    }
                    setup(ApplicationConfiguration.appName)
                }
                setDependencies()
            }

            is Library -> {
                setLibraryPlugins()
                configure<LibraryExtension> {
                    setup(name)
                }
                setDependencies()
            }

            else -> {

            }
        }
    }
}