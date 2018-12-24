package com.example.demo.ws.endpoint;

import com.example.demo.ws.Country;
import com.example.demo.ws.Currency;
import com.example.demo.ws.GetCountryRequest;
import com.example.demo.ws.GetCountryResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author yangzifeng
 */
@Endpoint
public class CountryEndpoint {

    private static final String NAMESPACE_URI = "http://demo.example.com/ws";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        Country poland = new Country();
        poland.setName("Poland-" + request.getName());
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);
        response.setCountry(poland);
        return response;
    }
}
