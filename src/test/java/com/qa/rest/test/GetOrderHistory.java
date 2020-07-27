package com.qa.rest.test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.qa.rest.headers.All_header;
import com.qa.rest.httpmethods.GetMethods;

import io.restassured.path.json.JsonPath;

public class GetOrderHistory {
	@Test
	public void getHistory() throws IOException {
		String baseuri = "https://stage.truebalance.cc/api/v3/v2/order/histories/000159435843061102cdc92890802079";
		 

		Map<String, Object> allheader = All_header.recharge_order_headers();
		GetMethods getmethod = new GetMethods();

		List<?> response = getmethod.getMethod_header(baseuri, allheader);
		System.out.println("ponse.get(1)"+response.get(1));
		System.out.println("ponse.get(0)"+response.get(0));
		
		String res=response.get(0).toString();
 
		JsonPath js = new JsonPath(res);
		System.out.println(js.get("data.history.options[2,2,1]"));

		System.out.println(js.get("data.history.orderId"));

	}

}
