//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.06.05 时间 08:37:46 PM CST 
//


package com.example.demo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SubscribeItemValue complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SubscribeItemValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemValue" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}ItemValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RevisedSamplingRate" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeItemValue", propOrder = {
    "itemValue"
})
public class SubscribeItemValue {

    @XmlElement(name = "ItemValue")
    protected ItemValue itemValue;
    @XmlAttribute(name = "RevisedSamplingRate")
    protected Integer revisedSamplingRate;

    /**
     * 获取itemValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemValue }
     *     
     */
    public ItemValue getItemValue() {
        return itemValue;
    }

    /**
     * 设置itemValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemValue }
     *     
     */
    public void setItemValue(ItemValue value) {
        this.itemValue = value;
    }

    /**
     * 获取revisedSamplingRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRevisedSamplingRate() {
        return revisedSamplingRate;
    }

    /**
     * 设置revisedSamplingRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevisedSamplingRate(Integer value) {
        this.revisedSamplingRate = value;
    }

}
