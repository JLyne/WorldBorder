plugins {
    id("java-library")
}

group = "com.wimbli.WorldBorder"
version = "1.20.6"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://repo.mikeprimm.com/")
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly(group = "io.papermc.paper", name = "paper-api", version = "1.20.6-R0.1-SNAPSHOT")
    compileOnly(group = "us.dynmap", name = "dynmap-api", version = "3.1")
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
}
