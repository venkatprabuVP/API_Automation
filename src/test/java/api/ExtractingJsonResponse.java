package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractingJsonResponse {
    public static void main(String[] args){

        RestAssured.baseURI = "https://reqres.in";

        Response response = RestAssured.given().when().get("/api/users?page=2");

        JsonPath jsonpath = response.jsonPath();
       String firstname = jsonpath.getString("data.first_name");
       String lastname = jsonpath.getString("data.last_name");
       String email = jsonpath.getString("data.email");

        System.out.println("First name" + firstname);
        System.out.println("Last name" + lastname);
        System.out.println("Email" + email);


    }
}
