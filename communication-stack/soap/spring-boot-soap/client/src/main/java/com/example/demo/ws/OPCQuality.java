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


/**
 * <p>OPCQuality complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OPCQuality"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="QualityField" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}qualityBits" default="good" /&gt;
 *       &lt;attribute name="LimitField" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}limitBits" default="none" /&gt;
 *       &lt;attribute name="VendorField" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" default="0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPCQuality")
public class OPCQuality {

    @XmlAttribute(name = "QualityField")
    protected QualityBits qualityField;
    @XmlAttribute(name = "LimitField")
    protected LimitBits limitField;
    @XmlAttribute(name = "VendorField")
    @XmlSchemaType(name = "unsignedByte")
    protected Short vendorField;

    /**
     * 获取qualityField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QualityBits }
     *     
     */
    public QualityBits getQualityField() {
        if (qualityField == null) {
            return QualityBits.GOOD;
        } else {
            return qualityField;
        }
    }

    /**
     * 设置qualityField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QualityBits }
     *     
     */
    public void setQualityField(QualityBits value) {
        this.qualityField = value;
    }

    /**
     * 获取limitField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LimitBits }
     *     
     */
    public LimitBits getLimitField() {
        if (limitField == null) {
            return LimitBits.NONE;
        } else {
            return limitField;
        }
    }

    /**
     * 设置limitField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LimitBits }
     *     
     */
    public void setLimitField(LimitBits value) {
        this.limitField = value;
    }

    /**
     * 获取vendorField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public short getVendorField() {
        if (vendorField == null) {
            return ((short) 0);
        } else {
            return vendorField;
        }
    }

    /**
     * 设置vendorField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVendorField(Short value) {
        this.vendorField = value;
    }

}
