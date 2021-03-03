buildscript {
    repositories {
        maven(url = "https://files.minecraftforge.net/maven")
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath group: 'net.minecraftforge.gradle', name: 'ForgeGradle', version: '3.+', changing: true
    }

plugins {
    id 'net.minecraftforge.gradle'
    id 'eclipse'
}
    
version = '1.16.4'
group = 'net.tofikarz.toffiumforge'
archivesBaseName = 'Toffium-forge-1.16.4'

sourceCompatibility = 1.8

minecraft {
    mappings channel: 'snapshot', version: '20201028-1.16.3'

    runs {
        client {
            workingDirectory project.file('run')

            property 'forge.logging.markers', 'REGISTRIES'
            property 'forge.logging.console.level', 'debug'

            mods {
                examplemod {
                    source sourceSets.main
                }
            }
        }

        server {
            workingDirectory project.file('run')

            property 'forge.logging.markers', 'REGISTRIES'
            property 'forge.logging.console.level', 'debug'

            mods {
                examplemod {
                    source sourceSets.main
                }
            }
        }
    }
}

dependencies {
    minecraft 'net.minecraftforge:forge:1.16.4-35.1.4'
}

apply from: 'mcreator.gradle'

