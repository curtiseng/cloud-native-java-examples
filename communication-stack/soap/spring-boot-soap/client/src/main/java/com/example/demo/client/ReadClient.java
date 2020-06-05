package com.example.demo.client;

import com.example.demo.ws.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * @author yangzifeng
 */
public class ReadClient extends WebServiceGatewaySupport {
    public ReadResponse read() {
        Read read = new Read();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setReturnItemTime(true);
        requestOptions.setReturnItemTime(true);
        requestOptions.setClientRequestHandle("");
        requestOptions.setLocaleID("en-US");
        read.setOptions(requestOptions);
        ReadRequestItemList readRequestItemList = new ReadRequestItemList();
        ReadRequestItem item1 = new ReadRequestItem();
        item1.setItemName("通道 1.设备 1.标记 2");
        item1.setClientItemHandle("37928256");
        ReadRequestItem item2 = new ReadRequestItem();
        item2.setItemName("通道 1.设备 1.标记 1");
        item1.setClientItemHandle("37928256");
        readRequestItemList.getItems().add(item1);
        readRequestItemList.getItems().add(item2);
        read.setItemList(readRequestItemList);
        return (ReadResponse) getWebServiceTemplate().marshalSendAndReceive("http://192.168.1.11/soap/Read",read);
    }
}
