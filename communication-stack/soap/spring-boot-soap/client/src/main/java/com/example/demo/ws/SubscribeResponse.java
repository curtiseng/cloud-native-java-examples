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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SubscribeResult" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}ReplyBase" minOccurs="0"/&gt;
 *         &lt;element name="RItemList" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}SubscribeReplyItemList" minOccurs="0"/&gt;
 *         &lt;element name="Errors" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}OPCError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServerSubHandle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "subscribeResult",
    "rItemList",
    "errors"
})
@XmlRootElement(name = "SubscribeResponse")
public class SubscribeResponse {

    @XmlElement(name = "SubscribeResult")
    protected ReplyBase subscribeResult;
    @XmlElement(name = "RItemList")
    protected SubscribeReplyItemList rItemList;
    @XmlElement(name = "Errors")
    protected List<OPCError> errors;
    @XmlAttribute(name = "ServerSubHandle")
    protected String serverSubHandle;

    /**
     * 获取subscribeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReplyBase }
     *     
     */
    public ReplyBase getSubscribeResult() {
        return subscribeResult;
    }

    /**
     * 设置subscribeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyBase }
     *     
     */
    public void setSubscribeResult(ReplyBase value) {
        this.subscribeResult = value;
    }

    /**
     * 获取rItemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubscribeReplyItemList }
     *     
     */
    public SubscribeReplyItemList getRItemList() {
        return rItemList;
    }

    /**
     * 设置rItemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubscribeReplyItemList }
     *     
     */
    public void setRItemList(SubscribeReplyItemList value) {
        this.rItemList = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OPCError }
     * 
     * 
     */
    public List<OPCError> getErrors() {
        if (errors == null) {
            errors = new ArrayList<OPCError>();
        }
        return this.errors;
    }

    /**
     * 获取serverSubHandle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerSubHandle() {
        return serverSubHandle;
    }

    /**
     * 设置serverSubHandle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerSubHandle(String value) {
        this.serverSubHandle = value;
    }

}
