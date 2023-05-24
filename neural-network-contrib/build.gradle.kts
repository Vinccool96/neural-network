plugins {
    kotlin("jvm") version "1.8.21"
}

group = "io.github.vinccool96.neural.network"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}