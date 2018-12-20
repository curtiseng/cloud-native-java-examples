package com.example.prometheusdropwizard.curd;

import com.codahale.metrics.annotation.Timed;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangzifeng
 */
@RestController
@RequestMapping("/")
public class Resource {

    @GetMapping
    @Timed
    public ResponseEntity<String> request() throws InterruptedException {
        Thread.sleep((int)((Math.random()*3)+1)*1000);
        return new ResponseEntity<>("Test request for dropwizard met", HttpStatus.OK);
    }
}
