plugins {
    id("java")
}

group = "spring"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.springframework:spring-core:6.0.12")
    implementation("org.springframework:spring-context:6.0.12")
    implementation("jakarta.annotation:jakarta.annotation-api:1.3.5")


    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}