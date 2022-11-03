package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class amilShipperCRMSaveBankInfo {
	
	@Test
	public void getBearer() {
		
		String payLoad="{\r\n"
				+ "  \"BankInfos\": [\r\n"
				+ "    {\r\n"
				+ "      \"BankName\": \"testbankTTeekay\",\r\n"
				+ "      \"Address\": \"900 Thompson plq\",\r\n"
				+ "      \"CityState\": \"Sunnyvale, California(CA), US\",\r\n"
				+ "      \"ZipCode\": \"902839\",\r\n"
				+ "      \"ABANumber\": \"000283917\",\r\n"
				+ "      \"AccountNo\": \"839274371838\",\r\n"
				+ "      \"GranteeName\": \"teekai\",\r\n"
				+ "      \"CityId\": \"2799\",\r\n"
				+ "      \"AccID\": 87184,\r\n"
				+ "      \"IsPrimary\": 1\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		String bearerToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwcmltYXJ5c2lkIjoiNDEyODgiLCJhY3"
				+ "RvcnQiOiJAYW1pbEAxY0p4eWhJUTF3blNDTHBwamVAYW1pbEB6Zz09Iiwicm9sZSI6IkJVZlRjYzdtNFhyUWRQNWZla2tk"
				+ "dE1LamhaTGxncnZFcHRsV1FKZnVybzBlMTNOUnBIS1dFaUEwM0pxZll5YTAiLCJuYmYiOjE2NjY2OTYxNDUsImV4cCI6MTY2Nj"
				+ "cyNDk0NSwiaWF0IjoxNjY2Njk2MTQ1LCJpc3MiOiJodHRwczovL3Rlc3QtYXV0aC5hbWlsZnJlaWdodC5jb20vIiwiYXVkIjoiaHR0c"
				+ "HM6Ly90ZXN0LmFtaWxmcmVpZ2h0LmNvbS8ifQ.qNHGzaEux33zY01tF6f3bf748xpdRivG5qCo4eUJ-Rk";
		
		
		
		RestAssured.baseURI="https://test-portalgateway.amilfreight.com";
		Response res= RestAssured.given()
		 .headers("Authorization","Bearer "+bearerToken)
		 .header("Content-Type","application/json")
		 .body(payLoad)
		 .post("/crmshipper/save-bank-info");
		String prettyPrin= res.jsonPath().prettify();
		System.out.println(prettyPrin);
		 
	}

}
