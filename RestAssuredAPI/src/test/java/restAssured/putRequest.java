package restAssured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class putRequest {

	@Test
	public void putAPIRequest() {

		RestAssured.baseURI="http://localhost:3000";

		File putData=new File("putAndPatchData.json");


		RestAssured.given()
		.header("Content-Type","application/json")
		.body(putData)
		.patch("/employees/5")
		.then()
		.statusCode(200)
		.log().all();

	}
}
