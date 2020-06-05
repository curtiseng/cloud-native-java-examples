//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.06.05 时间 08:37:46 PM CST 
//


package com.example.demo.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>SubscribeRequestItemList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SubscribeRequestItemList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}SubscribeRequestItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ItemPath" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ReqType" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="Deadband" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="RequestedSamplingRate" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="EnableBuffering" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscribeRequestItemList", propOrder = {
    "items"
})
public class SubscribeRequestItemList {

    @XmlElement(name = "Items")
    protected List<SubscribeRequestItem> items;
    @XmlAttribute(name = "ItemPath")
    protected String itemPath;
    @XmlAttribute(name = "ReqType")
    protected QName reqType;
    @XmlAttribute(name = "Deadband")
    protected Float deadband;
    @XmlAttribute(name = "RequestedSamplingRate")
    protected Integer requestedSamplingRate;
    @XmlAttribute(name = "EnableBuffering")
    protected Boolean enableBuffering;

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscribeRequestItem }
     * 
     * 
     */
    public List<SubscribeRequestItem> getItems() {
        if (items == null) {
            items = new ArrayList<SubscribeRequestItem>();
        }
        return this.items;
    }

    /**
     * 获取itemPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPath() {
        return itemPath;
    }

    /**
     * 设置itemPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPath(String value) {
        this.itemPath = value;
    }

    /**
     * 获取reqType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getReqType() {
        return reqType;
    }

    /**
     * 设置reqType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setReqType(QName value) {
        this.reqType = value;
    }

    /**
     * 获取deadband属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeadband() {
        return deadband;
    }

    /**
     * 设置deadband属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeadband(Float value) {
        this.deadband = value;
    }

    /**
     * 获取requestedSamplingRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestedSamplingRate() {
        return requestedSamplingRate;
    }

    /**
     * 设置requestedSamplingRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestedSamplingRate(Integer value) {
        this.requestedSamplingRate = value;
    }

    /**
     * 获取enableBuffering属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableBuffering() {
        return enableBuffering;
    }

    /**
     * 设置enableBuffering属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableBuffering(Boolean value) {
        this.enableBuffering = value;
    }

}
