package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

public class GetAllFirstNames {

    public static void main(String[] args){

        RestAssured.baseURI = "https://reqres.in";

        Response response = RestAssured.given().when().get("/api/users?page=2");

        JsonPath Jsonpath = response.jsonPath();

        List<String> firstname = Jsonpath.getList("data.first_name");

        System.out.println("First names");

        for (String name : firstname)
        {
            System.out.println(name);
        }


    }
}
