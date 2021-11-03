# Reproducer for Quarkus issue 21173

This is a small reproducer project for Quarkus issue [#21173](https://github.com/quarkusio/quarkus/issues/21173).

# Reproduce manually

## Steps

Run the application in dev mode using:
```shell script
./mvnw compile quarkus:dev
```

Download and open (or display in browser) [http://localhost:8080/q/openapi](http://localhost:8080/q/openapi)

## Expected

The operation in path `/adress` carry the `Address Resource` tag.

## Actual

The operation in path `/adress` carry the `Abstract Rest Resource` tag.

# Unit Test

There is a dedicated unit test for this, which can be executed using:
```shell script
./mvnw test -Dtest=AddressResourceTest#testTagInOpenApi
```
