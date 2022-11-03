package restAssured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class deleteRequest {


	@Test
	public void deleteAPIRequest() {

		RestAssured.baseURI="http://localhost:3000";


		RestAssured.given()
		.header("Content-Type","application/json")
		.delete("/employees/4")
		.then()
		.statusCode(200)
		.log()
		.all();

	}


}
