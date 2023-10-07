plugins {
    id("java")
    id("org.springframework.boot") version "3.1.4"
    id("io.freefair.lombok") version "8.3"
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
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.data:spring-data-envers")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.testcontainers:postgresql:1.19.1")


}

tasks.test {
    useJUnitPlatform()
}