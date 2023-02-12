plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "myproject"
version = "0.0.1-SNAPSHOT"
description = "quickstart"

repositories {
    maven { // The google mirror is less flaky than mavenCentral()
        url = uri("https://maven-central.storage-download.googleapis.com/maven2/")
    }
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("com.pulumi:pulumi:0.7.1")
    implementation("com.pulumi:aws:5.29.1")
}

application {
    mainClass.set(
        project.findProperty("mainClass") as? String ?: "${group}.MainKt"
    )
}