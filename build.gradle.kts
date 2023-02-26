plugins {
    id("com.android.application") version "8.0.0-beta03" apply false
    id("com.android.library") version "8.0.0-beta03" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}