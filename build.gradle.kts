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

    testImplementation("org.springframework.boot:spring-boot-starter-test")

}

tasks.test {
    useJUnitPlatform()
}