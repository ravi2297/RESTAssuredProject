package rest_first;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Test_04_PATCH {

	@Test
	public void Test_4_PATCH()
	{
		JSONObject request=new JSONObject();
		
		request.put("name", "ravi");
		request.put("job", "qa engineer");
		
		given()
			.body(request.toJSONString())
		.when()
			.patch("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().all();
		
		
	}
}
