package restAssured;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.core.Is;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class postEmployee {

	@Test
	public void name() {
		
		RestAssured.baseURI="http://localhost:3000";
		
	JSONObject tData=new JSONObject();
	tData.put("first_name", "thiva");
	tData.put("last_name", "karthika");
	tData.put("email", "thiva@testqa.com");
		
		
		RestAssured.given()
		.header("Content-Type","application/json")
		.body(tData.toJSONString())
		.post("/employees").then().statusCode(201).log().all().assertThat().body("last_name", Is.is("karthika"));
		
		
		
	}
}
