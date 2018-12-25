package com.example.demo.config;

import com.example.demo.ws.HelloPortImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author yangzifeng
 */
@Configuration
public class WebServiceConfig {

    private final Bus bus;

    @Autowired
    public WebServiceConfig(Bus bus) {
        this.bus = bus;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloPortImpl());
        endpoint.publish("/Hello");
        return endpoint;
    }
}
