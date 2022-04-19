package rest_first;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Test_05_DELETE {

	@Test
	public void Test5_DELETE()
	{
	
		when()
			.delete("https://reqres.in/api/users/2")
		.then()
			.statusCode(204);
		
		//status code for delete request is   204 
	}
}
