package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class oauthAPI {

	@Test
	public void oAuth() {

		Response res= RestAssured.given()
				.formParam("client_id", "ThivakarFarmApp")
				.formParam("client_secret", "f55549da5722c70d7c5859ca0a46d98c")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");


		System.out.println(res.jsonPath().prettify());
		String accessToken=	res.jsonPath().get("access_token");
			

		RestAssured.given()
		.auth()
		.oauth2(accessToken)
		.post("http://coop.apps.symfonycasts.com/api/3840/eggs-collect").then().log().all();
		
		JSONObject js=new JSONObject();
		js.put("message", "this is test message");
		RestAssured.given()
		.body(js.toJSONString()).put("http://coop.apps.symfonycasts.com/api/3840/eggs-collect").then().log().all();
	}
}
