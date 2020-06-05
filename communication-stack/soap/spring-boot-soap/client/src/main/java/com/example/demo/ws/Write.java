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
 *         &lt;element name="Options" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}RequestOptions" minOccurs="0"/&gt;
 *         &lt;element name="ItemList" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}WriteRequestItemList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnValuesOnReply" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    "itemList"
})
@XmlRootElement(name = "Write")
public class Write {

    @XmlElement(name = "Options")
    protected RequestOptions options;
    @XmlElement(name = "ItemList")
    protected WriteRequestItemList itemList;
    @XmlAttribute(name = "ReturnValuesOnReply", required = true)
    protected boolean returnValuesOnReply;

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
     * 获取itemList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WriteRequestItemList }
     *     
     */
    public WriteRequestItemList getItemList() {
        return itemList;
    }

    /**
     * 设置itemList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WriteRequestItemList }
     *     
     */
    public void setItemList(WriteRequestItemList value) {
        this.itemList = value;
    }

    /**
     * 获取returnValuesOnReply属性的值。
     * 
     */
    public boolean isReturnValuesOnReply() {
        return returnValuesOnReply;
    }

    /**
     * 设置returnValuesOnReply属性的值。
     * 
     */
    public void setReturnValuesOnReply(boolean value) {
        this.returnValuesOnReply = value;
    }

}
