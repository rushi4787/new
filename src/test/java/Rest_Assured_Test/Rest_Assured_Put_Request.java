package Rest_Assured_Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;

public class Rest_Assured_Put_Request {
	public static HashMap map = new HashMap();
	String getname = Random_Utils_Class.getname();
	String getid = Random_Utils_Class.getid();
	String getjob = Random_Utils_Class.getjob();

	@BeforeClass
	public void putdata() {
		map.put("name", getname);
		map.put("job",getjob);
		// RestAssured.baseURI="https://reqres.in";
		// RestAssured.basePath="/api/users/2";
	}

	@Test
	public void testdata() {
		Response responce=
		given().contentType("application/json; charset=utf-8").body(map)

				.when()

				.put("https://reqres.in/api/users/2").then().statusCode(200).log().all().extract().response();
		
		String res= responce.asString();
		System.out.println(res);
	}

}
