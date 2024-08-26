package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * The simplest Hello service implementation.
 */
@WebService(serviceName = "com.example.HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String text, String name) {
        return "Hello " + text +" "+ name +  "!";
    }

}