package entities

sealed class DependencyType {
    object Application : DependencyType()
    object Library : DependencyType()
}