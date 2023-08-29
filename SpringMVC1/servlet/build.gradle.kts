plugins {
    java
    war
    id("org.springframework.boot") version "2.7.14"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "hello"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")

    //JSP 추가 시작
    implementation("org.apache.tomcat.embed:tomcat-embed-jasper")
    implementation("javax.servlet:jstl")
    //JSP 추가 끝

    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
