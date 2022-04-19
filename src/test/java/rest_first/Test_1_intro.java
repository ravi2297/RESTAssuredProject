package rest_first;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_1_intro {

	@Test
	public void test_1()
	{
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getSessionId());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void test_2()
	{
		get("https://reqres.in/api/users/2").then().statusCode(200);
		get("https://reqres.in/api/unknown/2").then().body("data.id", equalTo(2));
		get("https://reqres.in/api/unknown").then().body("data.id", hasItems(1,2,3));
		get("https://reqres.in/api/unknown").then().body("data.name[2]", is("true red"));
	}
}
