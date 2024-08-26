package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

/**
 * The simplest Hello service.
 */
@WebService(name = "com.example.HelloService", serviceName = "com.example.HelloService")
public interface HelloService {

    @WebMethod
    String hello(String text, String name);

}
