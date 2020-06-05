package com.example.demo.service;

import com.example.demo.client.ReadClient;
import com.example.demo.ws.ReadResponse;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author yangzifeng
 */
@Service
public class ReadService {

    private final ReadClient readClient;

    public ReadService(ReadClient readClient) {
        this.readClient = readClient;
    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void read() {
        ReadResponse readResponse = readClient.read();
        System.out.println(readResponse.getRItemList().getItems());
    }
}
