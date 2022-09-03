plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

val daggerVersion: String by project

dependencies {
    // Dagger 2
    implementation("com.google.dagger:dagger:$daggerVersion")
}