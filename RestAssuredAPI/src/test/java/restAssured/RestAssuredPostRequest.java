package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import netscape.javascript.JSObject;

public class RestAssuredPostRequest {
	
	@Test
	public void PostRequest() {
		
		JSONObject data=new JSONObject();
		
		
		data.put("first_name", "thiva");
		data.put("last_name", "kar");
		
		System.out.println(data.toString());
		RestAssured.baseURI="https://reqres.in";
		RestAssured
		.given()
		.header("","")
		.body(data.toJSONString())
		.post("/api/users/3")
		.then()
		.statusCode(201);
		
	}

}
