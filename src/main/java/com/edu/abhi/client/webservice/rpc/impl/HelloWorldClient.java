package com.edu.abhi.client.webservice.rpc.impl;

import com.edu.abhi.client.wsimport.webservice.rpc.impl.HelloWorld;
import com.edu.abhi.client.wsimport.webservice.rpc.impl.HelloWorldImplService;

public class HelloWorldClient {
	public static void main(String[] args) {
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
		System.out.println(hello.getHelloWorldAsString("Abhishek"));

    }

}
