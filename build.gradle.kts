plugins {
    id("java")
    id("org.springframework.boot") version "3.1.4"
}

apply(plugin = "io.spring.dependency-management")

group = "spring"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.postgresql:postgresql")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}