package com.qa.rest.test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.qa.rest.headers.All_header;
import com.qa.rest.httpmethods.GetMethods;

import io.restassured.path.json.JsonPath;

public class GetOrderHistory2 {
	@Test
	public void getHistory() throws IOException {
		String baseuri = "https://stage.truebalance.cc";
		String endpoint="/api/v3/v2/order/histories/000159435843061102cdc92890802079";

		Map<String, Object> allheader = All_header.recharge_order_headers();
		GetMethods getmethod = new GetMethods();

	String response = getmethod.getMethod_header2(baseuri, allheader,endpoint);
	 
	 
		JsonPath js = new JsonPath(response);
		System.out.println(js.get("data.history.options[2,2,1]"));

		System.out.println(js.get("data.history.orderId"));

	}

}
