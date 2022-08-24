package Rest_Assured_Test;
import static io.restassured.RestAssured.*;


import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Assured__Delete_Request {
	
	
	@Test
	public void deletdata()
	{
		
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users/2";
	
		Response responce =	
		given()
		.when().delete()
		.then().statusCode(204)
		.statusLine("HTTP/1.1 204 No Content")
		.log().all().extract().response();
		
		String str= responce.asString();
		System.out.println(str);
		
		
		
		
	}

}
