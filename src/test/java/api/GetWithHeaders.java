package api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetWithHeaders {
    public static void main(String[] args) {
        given()
                .header("Accept", "application/json")
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8")
                .body("data.id", equalTo(2));
    }
}
