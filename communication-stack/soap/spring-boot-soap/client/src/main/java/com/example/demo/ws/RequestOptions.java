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
 * <p>RequestOptions complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="RequestDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ReturnErrorText" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ReturnDiagnosticInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnItemTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnItemPath" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ReturnItemName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ClientRequestHandle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LocaleID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestOptions")
public class RequestOptions {

    @XmlAttribute(name = "RequestDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDeadline;
    @XmlAttribute(name = "ReturnErrorText")
    protected Boolean returnErrorText;
    @XmlAttribute(name = "ReturnDiagnosticInfo")
    protected Boolean returnDiagnosticInfo;
    @XmlAttribute(name = "ReturnItemTime")
    protected Boolean returnItemTime;
    @XmlAttribute(name = "ReturnItemPath")
    protected Boolean returnItemPath;
    @XmlAttribute(name = "ReturnItemName")
    protected Boolean returnItemName;
    @XmlAttribute(name = "ClientRequestHandle")
    protected String clientRequestHandle;
    @XmlAttribute(name = "LocaleID")
    protected String localeID;

    /**
     * 获取requestDeadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDeadline() {
        return requestDeadline;
    }

    /**
     * 设置requestDeadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDeadline(XMLGregorianCalendar value) {
        this.requestDeadline = value;
    }

    /**
     * 获取returnErrorText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnErrorText() {
        if (returnErrorText == null) {
            return true;
        } else {
            return returnErrorText;
        }
    }

    /**
     * 设置returnErrorText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnErrorText(Boolean value) {
        this.returnErrorText = value;
    }

    /**
     * 获取returnDiagnosticInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnDiagnosticInfo() {
        if (returnDiagnosticInfo == null) {
            return false;
        } else {
            return returnDiagnosticInfo;
        }
    }

    /**
     * 设置returnDiagnosticInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnDiagnosticInfo(Boolean value) {
        this.returnDiagnosticInfo = value;
    }

    /**
     * 获取returnItemTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnItemTime() {
        if (returnItemTime == null) {
            return false;
        } else {
            return returnItemTime;
        }
    }

    /**
     * 设置returnItemTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnItemTime(Boolean value) {
        this.returnItemTime = value;
    }

    /**
     * 获取returnItemPath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnItemPath() {
        if (returnItemPath == null) {
            return false;
        } else {
            return returnItemPath;
        }
    }

    /**
     * 设置returnItemPath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnItemPath(Boolean value) {
        this.returnItemPath = value;
    }

    /**
     * 获取returnItemName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReturnItemName() {
        if (returnItemName == null) {
            return false;
        } else {
            return returnItemName;
        }
    }

    /**
     * 设置returnItemName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnItemName(Boolean value) {
        this.returnItemName = value;
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
     * 获取localeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleID() {
        return localeID;
    }

    /**
     * 设置localeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleID(String value) {
        this.localeID = value;
    }

}
