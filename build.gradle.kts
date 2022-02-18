import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.4"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	war
	kotlin("jvm") version "1.5.21"
	kotlin("plugin.spring") version "1.5.21"
}

group = "com.easyappium"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.springframework.boot:spring-boot-starter-freemarker")
	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
	implementation("com.qcloud:cos_api:5.6.54")
	implementation("commons-io:commons-io:2.11.0")
	implementation("org.springframework.boot:spring-boot-starter-jdbc:2.5.4")
	implementation("mysql:mysql-connector-java")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("com.qcloud:cos_api:5.6.54")
	testImplementation("commons-io:commons-io:2.11.0")
	// https://mvnrepository.com/artifact/com.tencentcloudapi/tencentcloud-sdk-java-sms
	implementation("com.tencentcloudapi:tencentcloud-sdk-java-sms:3.1.420")
	testImplementation("com.tencentcloudapi:tencentcloud-sdk-java-sms:3.1.420")


}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
