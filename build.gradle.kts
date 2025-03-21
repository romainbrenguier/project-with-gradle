plugins {
    id("java")
    id("org.sonarqube") version "6.1-SNAPSHOT"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
    properties {
        property("sonar.projectKey", "romainbrenguier_project-with-gradle")
        property("sonar.organization", "romainbrenguier")
//        property("sonar.host.url", "https://sonarqube.us")
//        property("sonar.region", "us")
    }
}