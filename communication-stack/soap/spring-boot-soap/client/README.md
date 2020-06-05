## 思路

1. maven插件根据 OpcXML-Da.wsdl 生成 ws对象
2. 使用spring-boot-soap构造一个WS客户端，ReadClient
3. getConfig获取设备信息
4. 用设备信息构造Read对象
5. 使用Read获取ReadResponse
6. 定时任务调用5方法
7. 展示同时存储数据，模型为Data类
```
/**
     * 通道、设备、标记等
     * ItemName = 通道 1.设备 1.标记 2
     * 通道 = 通道 1
     * 设备 = 设备 1
     * 标记 = 标记 2
     */
    private Map<String, String> tags;

    /**
     * 各种随时间变换的字段
     * ClientItemHandle
     * ValueTypeQualifier
     * Quality
     * ValueType
     */
    private Map<String, Object> fields;

    private T value;
    /**
     * 时间
     */
    private long timestamp;
```

