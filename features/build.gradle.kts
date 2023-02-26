plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

kapt {
    correctErrorTypes = true
}

android {

    namespace = "com.slaviboy.features"
    compileSdk = ApplicationConfiguration.compileSdk

    defaultConfig {
        minSdk = ApplicationConfiguration.minSdk
        targetSdk = ApplicationConfiguration.targetSdk
        testInstrumentationRunner = ApplicationConfiguration.androidTestInstrumentation
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"//ApplicationDependencyVersions.compose
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(ApplicationDependencies.dependenciesApp)
    implementation(project(mapOf("path" to ":fonts")))
    kapt("com.google.dagger:hilt-android-compiler:2.44")
}