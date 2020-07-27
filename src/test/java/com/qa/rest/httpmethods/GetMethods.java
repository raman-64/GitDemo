package com.qa.rest.httpmethods;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethods {
	// @SuppressWarnings("unchecked")
	public List<?> getMethod_header(String base_URI, Map<String, Object> headerMap) throws IOException {

		Response response ;

		RestAssured.baseURI = base_URI;

		response = given().headers(headerMap).get();
		 

		String allresponse = response.asString();
	
		int responseCode = response.getStatusCode();

		return Arrays.asList(allresponse, responseCode);

	}
	public String getMethod_header2(String base_URI, Map<String, Object> headerMap,String endpoint) throws IOException {

		Response response ;

		RestAssured.baseURI = base_URI;

	String	response1 = given().log().all().headers(headerMap).when().get(endpoint).asString();
	return response1;
		 
		 
	}

}
