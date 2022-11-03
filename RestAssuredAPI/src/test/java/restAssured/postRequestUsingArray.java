package restAssured;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import org.hamcrest.core.Is;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class postRequestUsingArray {

	@Test
	public void postUsingArray() {
		RestAssured.baseURI="http://localhost:3000";
		File postArrayData=new File("postArray.json");
//		Map<String, Object> map=new HashMap<String, Object>();
//		List<String> emailArray=new ArrayList<String>();
//		map.put("first_name", "Ramesh");
//		map.put("last_name", "Dinesh");
//		map.put("email", emailArray);
//		
//
//		
//		emailArray.add("testramesh@qa.com");
//		emailArray.add("testdinesh@qa.com");
//		System.out.println(map);

	String actual=	RestAssured.given()
		.header("Content-Type","application/json")
		.body(postArrayData)
//		.post("/employees").then().statusCode(201).log().all().body("email[0].Primary", equalTo("testrakiii@qa.com")).log().all();
		.post("/employees").then().statusCode(201).log().all().extract().path("email.Primary[0]");
	Assert.assertTrue(actual.equals("testrakiii@qa.com"));
	System.out.println(actual);
	
	}
}
