package Rest_Assured_Test;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

/*
 * given() Set cookies, set auth,set headers,set parameters
 * 
 * when() get ,post, put, patch, delete
 * 
 * then()  validate the test cases, extract  responce, extract cookies...
 *
 */

public class Rest_Assured_Get_Resuest
{
	
	@Test
	public void  getdetails()
	{
		Response res= 
		given()
		.when()
		.get("https://reqres.in/api/unknown")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		
		.header("Content-Type","application/json; charset=utf-8").log()
		.all()
		.extract().response();
		String resp= res.asString();
	System.out.println(resp);
	
		
	}
	
	

}
