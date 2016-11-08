package com.edu.abhi.webservice.publish.rpc;

import javax.xml.ws.Endpoint;

import com.edu.abhi.webservice.rpc.impl.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher{
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}
