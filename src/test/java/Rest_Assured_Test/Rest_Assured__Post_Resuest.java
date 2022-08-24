package Rest_Assured_Test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Rest_Assured__Post_Resuest {

	public static HashMap map = new HashMap();

	@BeforeClass
	public void postdata() {
		map.put("name", Random_Utils_Class.getname());
		map.put("job", Random_Utils_Class.getjob());
		map.put("id", Random_Utils_Class.getid());

		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api/users";

	}

	@Test
	public void testpost() {
		Response responce =
		given()
		.contentType("application/json; charset=utf-8")
		.body(map)
		.when().
		post()
		.then()
		.statusCode(201)
		.log()
	    .all()
	    .extract().response();
		String resoince= responce.asString();
		System.out.println(resoince);
		
		 

	}

	{
	}
}
