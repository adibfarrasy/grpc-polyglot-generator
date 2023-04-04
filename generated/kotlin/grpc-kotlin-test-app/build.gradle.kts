plugins {
    `maven-publish`
    kotlin("jvm") version "1.7.10"
}

repositories {
    mavenCentral()
    google()
}

group = "me.adibfarrasy"

version = "0.0.1-SNAPSHOT"

val developerName = "Adib Farrasy" // change with your name
val developerId = "adibfarrasy" // change with your github id
val developerEmail = "adibfarrasy@gmail.com" // change with your email

val artifactName = "gRPC Test App"
val artifactDescription = "Lorem Ipsum"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            versionMapping {
                usage("java-api") { fromResolutionOf("runtimeClasspath") }
                usage("java-runtime") { fromResolutionResult() }
            }
            pom {
                name.set(artifactName)
                description.set(artifactDescription)
                url.set("YOUR_LIBRARY_URL")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set(developerId)
                        name.set(developerName)
                        email.set(developerEmail)
                    }
                }
            }
        }
    }
    repositories {
        maven {
            val releasesRepoUrl = uri("YOUR_LIBRARY_URL")
            val snapshotsRepoUrl = uri("YOUR_LIBRARY_URL")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            name = "YOUR_ORG_NAME"
            credentials {
                username = "username"
                password = "password"
            }
        }
    }
}

tasks.jar { manifest { attributes(mapOf("Title" to project.name, "Version" to project.version)) } }

val grpcVersion by project.properties
val grpcKotlinVersion by project.properties
val protobufVersion by project.properties

dependencies {
    api(kotlin("stdlib-jdk8"))
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    api("io.grpc:grpc-stub:grpcVersion")
    api("io.grpc:grpc-protobuf:$grpcVersion")
    api("com.google.protobuf:protobuf-java-util:$protobufVersion")
    api("com.google.protobuf:protobuf-kotlin:$protobufVersion")
    api("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(11)) } }

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = listOf("-opt-in=kotlin.RequiresOptIn")
    }
}

