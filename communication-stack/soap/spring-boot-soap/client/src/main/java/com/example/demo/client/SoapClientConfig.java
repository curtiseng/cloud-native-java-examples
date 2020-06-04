package com.example.demo.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the  specified in
        // pom.xml
        marshaller.setContextPath("com.pay.wsdl");

        return marshaller;
    }

    @Bean
    public Client movieClient(Jaxb2Marshaller marshaller) {
        Client client = new Client();
        client.setDefaultUri("http://localhost:8080/ws/pay.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}