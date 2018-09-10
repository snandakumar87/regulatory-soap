package com.javainuse.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javainuse.InputSOATest;
import com.javainuse.ObjectFactory;
import com.javainuse.OutputSOATest;

@Endpoint
public class WebServiceEndpoint {

	private static final String NAMESPACE_URI = "http://javainuse.com";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "inputSOATest")
	@ResponsePayload
	public OutputSOATest hello(@RequestPayload InputSOATest request) {


		ObjectFactory factory = new ObjectFactory();
		OutputSOATest response = factory.createOutputSOATest();
		response.setBankCode(request.getBankCode());
		response.setComplaintsDescription("Incorrect mortgage payment");
		response.setCustomerAddress("snandaku@redhat.com");
		response.setCustomerName("Sadhana");
		response.setCustomerPhone("234-345-4567");



		return response;
	}
}
