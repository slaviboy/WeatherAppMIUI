package entities

sealed class Dependency(
    open val path: String,
    open val name: String,
    open val type: DependencyType
) {
    sealed class LibraryDependency(
        override val path: String,
        override val name: String
    ) : Dependency(path, name, DependencyType.Library)

    object App : Dependency(":app", "app", DependencyType.Application)
    object Fonts : LibraryDependency(":fonts", "fonts")
    object Features : LibraryDependency(":features", "features")

    fun matches(project: org.gradle.api.Project): Boolean {
        return (project.path == path && project.name == name)
    }
}