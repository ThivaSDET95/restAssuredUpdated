package restAssured;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class amilShipperCRMGetBankList {
	@Test
	public void getBearer() {
		
		String bearerToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwcmltYXJ5c2lkIjoiNDEyODgiLCJhY3RvcnQiOi"
				+ "JAYW1pbEAxY0p4eWhJUTF3blNDTHBwamVAYW1pbEB6Zz09Iiwicm9sZSI6IkJVZlRjYzdtNFhyUWRQNWZla2tkdE1LamhaTG"
				+ "xncnZFcHRsV1FKZnVybzBlMTNOUnBIS1dFaUEwM0pxZll5YTAiLCJuYmYiOjE2NjY2NzcwMjIsImV4cCI6MTY2NjcwNTgyMiw"
				+ "iaWF0IjoxNjY2Njc3MDIyLCJpc3MiOiJodHRwczovL3Rlc3QtYXV0aC5hbWlsZnJlaWdodC5jb20vIiwiYXVkIjoiaHR0cHM6L"
				+ "y90ZXN0LmFtaWxmcmVpZ2h0LmNvbS8ifQ.mZ8fsinFmbIV9bYRosTMxgAezs9sf-ZTZgKQ2bqqVJo";
		
		JSONObject js =new JSONObject();
		js.put("accountId", "798b170a-a0c1-4e51-941c-92a79b0f03b9");
		RestAssured.baseURI="https://test-portalgateway.amilfreight.com";
		ValidatableResponse actual= RestAssured.given()
		 .headers("Authorization","Bearer "+bearerToken)
		 .header("Content-Type","application/json")
		 .body(js.toJSONString())
		  .post("/crmshipper/get-bank-list-shipper").then().log().all();
		
		String bName= actual.extract().path("Data.BankName[0]");
		 
		Assert.assertTrue(bName.equals("testTeekay Bank"));
		System.out.println(bName);
		
		
		
		
		

	}
}
