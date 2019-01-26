# micronaut-hello

A Micronaut App written in Kotlin.

## Run
 
```sh
./gradlew run
```

## Run Tests and View Results

```sh
./gradlew test
open build/reports/tests/test/index.html
```

## Build Docker Image

```sh
./gradlew shadowJar
docker build -t micronaut-hello .
```

## Run Docker Image

```sh
docker run -p 8080:8080 micronaut-hello
```
