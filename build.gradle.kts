plugins {
    id("java")
    id("info.solidsoft.pitest") version "1.9.11"
}

group = "mutation_testing"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("info.solidsoft.gradle.pitest:gradle-pitest-plugin:1.9.11")
    testImplementation("org.pitest:pitest-junit5-plugin:1.2.0")
}

tasks.test {
    useJUnitPlatform()
}
