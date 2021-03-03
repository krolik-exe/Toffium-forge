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
    
    archiveFileName.set("Toffium-forge-1.16.5.jar")
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile).all {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

minecraft {
    mappings channel("snapshot:version:20201028-1.16.3")

    runs {
        client {
            workingDirectory project.file("run")

            property("forge.logging.markers:REGISTRIES")
            property("forge.logging.console.level:debug")

            mods {
                examplemod {
                    sourceSets {
                    main
                }
            }
        }
        }

        server {
            workingDirectory project.file("run")

            property("forge.logging.markers:REGISTRIES")
            property("forge.logging.console.level:debug")

            mods {
                examplemod {
                    sourceSets {
                        main
                }
            }
        }
    }
}
}

    dependencies {
    minecraft("net.minecraftforge:forge:1.16.4-35.1.37")
    }
        
apply(from = "mcreator.gradle")
