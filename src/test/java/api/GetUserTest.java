package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class GetUserTest {

    public static void main(String[] args){
        RestAssured.baseURI="https://reqres.in";

        Response response = RestAssured.given().when().get("/api/users?page=2");

        System.out.println(response.getBody().prettyPrint());

        int statuscode = response.getStatusCode();

        Assert.assertEquals(200,statuscode);

        System.out.println("Status code verified" + statuscode);




    }
}
