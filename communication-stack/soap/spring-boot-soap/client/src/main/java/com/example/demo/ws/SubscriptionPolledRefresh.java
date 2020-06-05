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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}RequestOptions" minOccurs="0"/&gt;
 *         &lt;element name="ServerSubHandles" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="WaitTime" type="{http://www.w3.org/2001/XMLSchema}int" default="0" /&gt;
 *       &lt;attribute name="ReturnAllItems" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "options",
    "serverSubHandles"
})
@XmlRootElement(name = "SubscriptionPolledRefresh")
public class SubscriptionPolledRefresh {

    @XmlElement(name = "Options")
    protected RequestOptions options;
    @XmlElement(name = "ServerSubHandles")
    protected List<String> serverSubHandles;
    @XmlAttribute(name = "HoldTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar holdTime;
    @XmlAttribute(name = "WaitTime")
    protected Integer waitTime;
    @XmlAttribute(name = "ReturnAllItems")
    protected Boolean returnAllItems;

    /**
     * 获取options属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestOptions }
     *     
     */
    public RequestOptions getOptions() {
        return options;
    }

    /**
     * 设置options属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOptions }
     *     
     */
    public void setOptions(RequestOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the serverSubHandles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serverSubHandles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServerSubHandles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServerSubHandles() {
        if (serverSubHandles == null) {
            serverSubHandles = new ArrayList<String>();
        }
        return this.serverSubHandles;
    }

    /**
     * 获取holdTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldTime() {
        return holdTime;
    }

    /**
     * 设置holdTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldTime(XMLGregorianCalendar value) {
        this.holdTime = value;
    }

    /**
     * 获取waitTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getWaitTime() {
        if (waitTime == null) {
            return  0;
        } else {
            return waitTime;
        }
    }

    /**
     * 设置waitTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaitTime(Integer value) {
        this.waitTime = value;
    }

    /**
     * 获取returnAllItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnAllItems() {
        if (returnAllItems == null) {
            return false;
        } else {
            return returnAllItems;
        }
    }

    /**
     * 设置returnAllItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAllItems(Boolean value) {
        this.returnAllItems = value;
    }

}
