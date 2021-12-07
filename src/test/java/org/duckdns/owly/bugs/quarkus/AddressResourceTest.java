package org.duckdns.owly.bugs.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AddressResourceTest {

    @Test
    public void testGetByIdEndpoint() {
        given()
          .when().get("/address/1")
          .then()
             .statusCode(200)
             .body(is("Disney Land, Gate 1"));

        given()
                .when().get("/person/1")
                .then()
                .statusCode(200)
                .body(is("Donald Duck 1"));
    }

    @Test
    public void testTagInOpenApi() {
        given()
                .when().get("/q/openapi")
                .then()
                .statusCode(200)
                .body(containsString("- Address Resource"));

        given()
                .when().get("/q/openapi")
                .then()
                .statusCode(200)
                .body(containsString("- Person Resource"));
    }
}
