package com.example.demo.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yangzifeng
 */
@Configuration
@EnableScheduling
public class SoapClientConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the  specified in pom.xml
        marshaller.setContextPath("com.example.demo.ws");

        return marshaller;
    }

    @Bean
    public ReadClient client(Jaxb2Marshaller marshaller) {
        ReadClient client = new ReadClient();
        client.setDefaultUri("http://127.0.0.1/soap/Read");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}