plugins {
    kotlin("jvm") version "1.8.21"
}

group = "io.github.vinccool96.neural.network"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.8.20-RC")
}

tasks.test {
    useJUnitPlatform()
}