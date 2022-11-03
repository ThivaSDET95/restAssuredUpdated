package restAssured;


import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;




@Test
public class RestAssuredGetRequest {
	
	public void getRequestExample() {
		
		//https://reqres.in/api/users/3
		 RestAssured.baseURI="https://reqres.in";
		ValidatableResponse response=	RestAssured.given()
		.header("","")
		.param("", "")
		.when()
		.get("/api/users/3")
		.then()
		.statusCode(200);
	}
	public void getRequestExample1() {
		RestAssured.given()
				.header("","")
				.param("", "")
				.when()
				.get("/api/users/3");
//				.then()
//				.body("data.id",equalTo(3));
		        
//		System.out.println(response1.asPrettyString());
//		System.out.println(response1.statusCode());
	}

}
