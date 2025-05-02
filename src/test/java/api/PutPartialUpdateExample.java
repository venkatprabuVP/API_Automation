package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutPartialUpdateExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .contentType(ContentType.JSON)
                .body("{ \"job\": \"Senior Developer\" }")
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .body("job", equalTo("Senior Developer"));
    }
}
