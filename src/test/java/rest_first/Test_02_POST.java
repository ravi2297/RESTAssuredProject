package rest_first;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_02_POST {

	@Test
	public void Test2_POST()
	{
		JSONObject request=new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "leader");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given()
			.body(request.toJSONString())
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.log().all();
			
		
		
	}
}
