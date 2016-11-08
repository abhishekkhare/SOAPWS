package com.edu.abhi.webservice.doc.impl;

import javax.jws.WebService;

import com.edu.abhi.webservice.doc.HelloWorld;

//Service Implementation
@WebService(endpointInterface = "com.edu.abhi.webservice.doc.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}
