package com.example.demo.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ws.WebServiceMessageFactory;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;

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
    public SaajSoapMessageFactory messageFactory() {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.setSoapVersion(SoapVersion.SOAP_12);
        return messageFactory;
    }

    @Bean
    public ReadClient client() {
        ReadClient client = new ReadClient();
        client.setDefaultUri("http://127.0.0.1/soap/Read");
        client.setMarshaller(marshaller());
        client.setUnmarshaller(marshaller());
        client.setMessageFactory(messageFactory());
        return client;
    }

}