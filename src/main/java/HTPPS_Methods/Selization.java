package HTPPS_Methods;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType; 
//import static org.hamcrest.matchers.*;

public class Selization {

	public static void main(String[] args) {
		
		
		Serlialization obj = new Serlialization();
		obj.setName("Rushi");
		obj.setJob("QA");
		
		given().contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log()
		.all();
		
		
		

	}

}
