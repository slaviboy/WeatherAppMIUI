kapt {
    correctErrorTypes = true
}

dependencies {
    implementation(*ApplicationDependencies.dependenciesApp)
    project(":features")
}