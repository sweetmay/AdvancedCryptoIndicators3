allprojects {
    apply("${rootDir}/dependencies.gradle.kts")
}

buildscript {
    apply("${rootDir}/dependencies.gradle.kts")
    repositories {
        google()
        mavenCentral()
    }
    val kotlin: String by rootProject.extra
    val gradleTools: String by rootProject.extra
    dependencies {
        classpath(kotlin)
        classpath(gradleTools)
    }
}

tasks.register("clean") {
    doFirst {
        delete(project.buildDir)
    }
}