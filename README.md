# micronaut-hello

A [Micronaut](http://micronaut.io) App written in Kotlin.

## Create App

```sh
mn create-app micronaut-hello -l kotlin
```

## Run
 
```sh
./gradlew run
```

## Run Tests and View Results

```sh
./gradlew test
open build/reports/tests/test/index.html
```

## Build JAR and Docker Image

```sh
./gradlew shadowJar
docker build -t micronaut-hello .
```

## Run Docker Image

```sh
docker run -p 8080:8080 micronaut-hello
```

## Reference

Creating your first Micronaut Kotlin app - http://guides.micronaut.io/creating-your-first-micronaut-app-kotlin/guide/index.html
