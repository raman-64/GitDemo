package com.qa.rest.test;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class GetCallBDD {
	@Test
	public void test_order() {
		given().when().get("https://stage.truebalance.cc/api/v3/v2/order/instead/histories").then().assertThat()
				.statusCode(200).and();
		// .header("Content-Length","99");

	}

}
