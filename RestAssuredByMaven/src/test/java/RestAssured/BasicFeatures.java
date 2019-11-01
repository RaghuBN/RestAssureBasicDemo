package RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BasicFeatures {
	@Test
	public void testlogging() {
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		log().all();
		
	}
}
