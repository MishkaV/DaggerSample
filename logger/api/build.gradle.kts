plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
}

val javaVersion: String by project

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = javaVersion
        }
        sourceCompatibility = javaVersion
        targetCompatibility = javaVersion
    }
}

dependencies {
    api(project(":api_core"))
}