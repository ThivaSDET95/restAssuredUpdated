package restAssured;

import java.io.File;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class patchRequest {

	@Test
	public void patchAPIRequest() {
		RestAssured.baseURI="http://localhost:3000";

		File patchData=new File("patch.json");
		RestAssured.given()
		.header("Content-Type","application/json")
		.body(patchData)
		.patch("/employees/5")
		.then()
		.statusCode(200)
		.log().all();
	}
}
