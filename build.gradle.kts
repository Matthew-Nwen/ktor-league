val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val reflect_version: String by project

plugins {
    application
    kotlin("jvm") version "1.5.0"
}

group = "com.mnwen"
version = "0.0.1"
application {
    mainClass.set("com.mnwen.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-locations:$ktor_version")
    implementation("io.ktor:ktor-jackson:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    implementation("org.jetbrains.kotlin:kotlin-reflect:$reflect_version")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.mnwen.ApplicationKt"
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(configurations.compileClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}