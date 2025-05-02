import static io.restassured.RestAssured.*;

public class DeleteExample {
    public static void main(String[] args) {
        given()
                .when()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(204);
    }
}
