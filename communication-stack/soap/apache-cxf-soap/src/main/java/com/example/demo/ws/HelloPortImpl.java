package com.example.demo.ws;

/**
 * @author yangzifeng
 */
@javax.jws.WebService(serviceName = "HelloService", portName = "HelloPort",
        targetNamespace = "http://demo.example.com/ws",
        endpointInterface = "com.example.demo.ws.Hello")
public class HelloPortImpl implements Hello {
    @Override
    public String sayHello(String name) {
        try {
            return "Hello, Welcome to CXF Spring boot " + name + "!!!";

        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
