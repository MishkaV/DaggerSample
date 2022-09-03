plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

val daggerVersion: String by project
val compileVersion: String by project
val javaVersion: String by project
val minCompileSdkVersion: String by project

android {
    compileSdk = compileVersion.toInt()

    defaultConfig {
        minSdk = minCompileSdkVersion.toInt()
    }
}

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

    // Logger API
    api(project(":api_core"))
    api(project(":logger:api"))

    // Dagger 2
    implementation("com.google.dagger:dagger-android:$daggerVersion")
    kapt("com.google.dagger:dagger-android-processor:$daggerVersion")
    kapt("com.google.dagger:dagger-compiler:$daggerVersion")
}