buildscript {
    repositories {
        maven(url = "https://files.minecraftforge.net/maven")
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("net.minecraftforge.gradle:ForgeGradle:4.0.23")
    }
}

plugins {
    id("eclipse")
}
    
    tasks.jar {
    archiveFileName.set("Toffium-forge-1.16.5.jar")
}

sourceCompatibility = 1.8

minecraft {
    mappings channel("snapshot:version:20201028-1.16.3")

    runs {
        client {
            workingDirectory project.file("run")

            property("forge.logging.markers:REGISTRIES")
            property("forge.logging.console.level:debug")

            mods {
                examplemod {
                    source sourceSets.main
                }
            }
        }

        server {
            workingDirectory project.file("run")

            property("forge.logging.markers:REGISTRIES")
            property("forge.logging.console.level:debug")

            mods {
                examplemod {
                    source sourceSets.main
                }
            }
        }
    }
}

    dependencies {
    minecraft("net.minecraftforge:forge:1.16.4-35.1.37")
    }
        
apply(from = "mcreator.gradle")
