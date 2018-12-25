package com.example.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @author yangzifeng
 */
@WebService(targetNamespace = "http://demo.example.com/ws", name = "Hello")
public interface Hello {

    /**
     * TODO ...
     * @param name name
     * @return string
     */
    @WebResult(name = "return", targetNamespace = "http://demo.example.com/ws")
    @RequestWrapper(localName = "sayHello",
            targetNamespace = "http://demo.example.com/ws",
            className = "com.example.demo.SayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(localName = "sayHelloResponse",
            targetNamespace = "http://demo.example.com/ws",
            className = "com.example.demo.SayHelloResponse")
    String sayHello(@WebParam(name = "name", targetNamespace = "http://demo.example.com/ws") String name);
}
