package com.edu.abhi.webservice.publish.doc;

import javax.xml.ws.Endpoint;

import com.edu.abhi.webservice.doc.impl.HelloWorldImpl;

//Endpoint publisher
public class HelloWorldPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
  }

}
