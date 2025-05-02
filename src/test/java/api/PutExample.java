package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .contentType(ContentType.JSON)
                .body("{ \"name\": \"Venkatesh\", \"job\": \"Senior Tester\" }")
                .when()
                .put("/users/2")
                .then()
                .statusCode(200)
                .body("name", equalTo("Venkatesh"))
                .body("job", equalTo("Senior Tester"));
    }
}