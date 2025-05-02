package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PostFormData {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        given()
                .contentType(ContentType.URLENC)
                .formParam("name", "John")
                .formParam("job", "Developer")
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("John"))
                .body("job", equalTo("Developer"));
    }
}
