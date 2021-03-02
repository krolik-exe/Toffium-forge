# Toffium-forge

[![Toffium-forge](https://github.com/tofikarz/Toffium-forge/actions/workflows/gradle.yml/badge.svg)](https://github.com/tofikarz/Toffium-forge/actions/workflows/gradle.yml)

<h3>Modyfikacja dodajaca swinki morskie , trociny , poidelka , miski do gry Minecraft: Java Edition.</h3>
</div>

## Planowane:
### Dodać:
 - Obrazy z swinkami
 - AI do swinek dzialajace
 - Wiecej zwierzat
 - Komende /swinka
 

## Uwaga:

### Modyfikacja nie jest jeszcze stabilna , więc prosimy o tym pamiętać , bo mogą występować błędy !!!
## Kompilowanie

Wykonaj te komendy w folderze z plikami modyfikacji:

```shell
./gradlew processResources
./gradlew classes 
./gradlew jar 
./gradlew downloadMcpConfig 
./gradlew extractSrg 
./gradlew createMcpToSrg
./gradlew reobfJar 
./gradlew assemble 
./gradlew compileTestJava
./gradlew processTestResources
./gradlew testClasses
./gradlew test 
./gradlew check
./gradlew build
```

## License

Informacje na temat licencji sa [tutaj](/LICENSE).
