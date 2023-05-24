plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "io.github.vinccool96.neural.network"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":neural-network-contrib"))
    implementation(project(":neural-network-core"))

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.8.20-RC")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}