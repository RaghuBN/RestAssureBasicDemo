package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class BasicFeatures {
	@Test
	public void testlogging() {
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		log().all();
		
	}
	
	@Test
	public void testequalToFuntion() {
		given().
		get("https://reqres.in/api/users/2").
		then().
		body("data.id.first_name", equalTO("Janet"));
		
		
	}

	private ResponseAwareMatcher<Response> equalTO(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
