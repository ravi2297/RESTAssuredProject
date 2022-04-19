package rest_first;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Test_01_GET {

	@Test
	public void Test_01_Get()
	{
		given()
			.header("Content-Type","application/json")
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data.first_name[2]", equalTo("Tobias"))
			.body("data.id", hasItems(8))
			.log().all();
		
		
	}
}
