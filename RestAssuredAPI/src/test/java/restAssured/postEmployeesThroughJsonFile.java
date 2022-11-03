package restAssured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class postEmployeesThroughJsonFile {

	
	@Test
	public void postThroughJsonFile() {
		RestAssured.baseURI="http://localhost:3000";
		
		File file=new File("postData.json");
		
		RestAssured.given()
		.header("Content-Type","application/json")
		.body(file)
		.post("/employees").then().log().all();
	}
}
