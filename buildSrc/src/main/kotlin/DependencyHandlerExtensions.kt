import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.kapt(vararg list: String) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(vararg list: String) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.project(vararg list: String) {
    list.forEach { dependency ->
        add("implementation", project(mapOf("path" to dependency)))
    }
}

fun DependencyHandler.androidTestImplementation(vararg list: String) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(vararg list: String) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}