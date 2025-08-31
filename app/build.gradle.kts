plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
    application
    id("org.sonarqube") version "6.2.0.5505"
    checkstyle
}

checkstyle {
    toolVersion = "10.12.0"
    configFile = file("config/checkstyle/checkstyle.xml")
}

sonar {
  properties {
    property("sonar.projectKey", "anstyfil_java-project-61")
    property("sonar.organization", "anstyfil")
    property("sonar.coverage.exclusions", "**/*")
  }
}

application {
    mainClass.set("hexlet.code.App")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
