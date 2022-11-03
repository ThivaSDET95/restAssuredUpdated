package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class GetEmployees {

	@Test
	public void getAllEmp() {

		RestAssured.baseURI="http://localhost:3000";

		ValidatableResponse response	=RestAssured.given()
				.header("Content-Type","application/json")
				.get("/employees").then().statusCode(200).log().all();

		String line=	RestAssured.given()
				.header("Content-Type","application/json")
				.get("/employees").getStatusLine();
		System.out.println(line);
		Assert.assertEquals(line, "HTTP/1.1 200 OK");




	}

}
