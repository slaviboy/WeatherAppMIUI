import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io")
    }
}