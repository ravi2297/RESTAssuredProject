package rest_first;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Test_03_PUT {

	@Test
	public void Test3_PUT()
	{
		JSONObject request=new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		System.out.println(request.toJSONString());
		
		given()
			.body(request.toJSONString())
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().all();
	}
}
