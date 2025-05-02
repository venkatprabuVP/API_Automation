package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample {
    public static void main(String[] args){
      RestAssured.baseURI = "https://reqres.in";

      Response response = RestAssured.given().when().get("/api/users?page=2");

      System.out.println("Status code:"+ response.getStatusCode());
      System.out.println("Response Body:"+ response.getBody().prettyPrint());


    }
}
