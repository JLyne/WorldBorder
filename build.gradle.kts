plugins {
    id("java-library")
    id("maven-publish")
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "com.wimbli.WorldBorder"
version = "1.18"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
    withSourcesJar()
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://repo.mikeprimm.com/")
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly(group = "org.spigotmc", name = "spigot-api", version = "1.14-R0.1-SNAPSHOT")
    compileOnly(group = "us.dynmap", name = "dynmap-api", version = "3.1")
    implementation(group = "io.papermc", name = "paperlib", version = "1.0.8-SNAPSHOT")
}

defaultTasks("clean", "build")

tasks {
    processResources {
        val placeholders = mapOf(
            "name" to project.name,
            "group" to project.group,
            "version" to project.version
        )
        filesMatching("plugin.yml") {
            expand(placeholders)
        }
    }

    jar {
        archiveFileName.set("${project.name}-noshade.jar")
    }

    shadowJar {
        minimize()
        relocate("io.papermc.lib", "${project.group}.paperlib")
        archiveFileName.set("${project.name}.jar")
    }

    build {
        dependsOn(shadowJar)
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "${project.group}"
            artifactId = project.name
            version = "${project.version}"
            from(components["java"])
        }
    }
}
