package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in/api";

        String requestBody = "{\n" +
                "  \"name\": \"Venkatesh\",\n" +
                "  \"job\": \"Tester\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Venkatesh"))
                .body("job", equalTo("Tester"))
                .extract().response();

        System.out.println("Response: " + response.asString());
    }
}
