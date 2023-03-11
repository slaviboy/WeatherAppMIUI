kapt {
    correctErrorTypes = true
}

dependencies {
    implementation(ApplicationDependencies.dependenciesApp)
    implementation(project(mapOf("path" to ":features")))
}