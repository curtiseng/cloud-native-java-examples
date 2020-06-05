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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ReplyBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReplyBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="RcvTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ReplyTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ClientRequestHandle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RevisedLocaleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ServerState" use="required" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}serverState" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyBase")
public class ReplyBase {

    @XmlAttribute(name = "RcvTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rcvTime;
    @XmlAttribute(name = "ReplyTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar replyTime;
    @XmlAttribute(name = "ClientRequestHandle")
    protected String clientRequestHandle;
    @XmlAttribute(name = "RevisedLocaleID")
    protected String revisedLocaleID;
    @XmlAttribute(name = "ServerState", required = true)
    protected ServerState serverState;

    /**
     * 获取rcvTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcvTime() {
        return rcvTime;
    }

    /**
     * 设置rcvTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcvTime(XMLGregorianCalendar value) {
        this.rcvTime = value;
    }

    /**
     * 获取replyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReplyTime() {
        return replyTime;
    }

    /**
     * 设置replyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReplyTime(XMLGregorianCalendar value) {
        this.replyTime = value;
    }

    /**
     * 获取clientRequestHandle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRequestHandle() {
        return clientRequestHandle;
    }

    /**
     * 设置clientRequestHandle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRequestHandle(String value) {
        this.clientRequestHandle = value;
    }

    /**
     * 获取revisedLocaleID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisedLocaleID() {
        return revisedLocaleID;
    }

    /**
     * 设置revisedLocaleID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisedLocaleID(String value) {
        this.revisedLocaleID = value;
    }

    /**
     * 获取serverState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServerState }
     *     
     */
    public ServerState getServerState() {
        return serverState;
    }

    /**
     * 设置serverState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServerState }
     *     
     */
    public void setServerState(ServerState value) {
        this.serverState = value;
    }

}
