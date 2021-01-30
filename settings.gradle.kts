rootProject.name = "kotlin-learn-demo"

pluginManagement {
    val kotlinVersion = "1.4.21"

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}

include("hello-world")