package com.example.demo.model;

import java.util.Map;

/**
 * @author yangzifeng
 */
public class Data<T> {

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
}
