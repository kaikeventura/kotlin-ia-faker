plugins {
    kotlin("jvm")
}

group = "com.kaikeventura"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}