//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.0 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.06.05 时间 08:37:46 PM CST 
//


package com.example.demo.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>qualityBits的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="qualityBits"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="bad"/&gt;
 *     &lt;enumeration value="badConfigurationError"/&gt;
 *     &lt;enumeration value="badNotConnected"/&gt;
 *     &lt;enumeration value="badDeviceFailure"/&gt;
 *     &lt;enumeration value="badSensorFailure"/&gt;
 *     &lt;enumeration value="badLastKnownValue"/&gt;
 *     &lt;enumeration value="badCommFailure"/&gt;
 *     &lt;enumeration value="badOutOfService"/&gt;
 *     &lt;enumeration value="badWaitingForInitialData"/&gt;
 *     &lt;enumeration value="uncertain"/&gt;
 *     &lt;enumeration value="uncertainLastUsableValue"/&gt;
 *     &lt;enumeration value="uncertainSensorNotAccurate"/&gt;
 *     &lt;enumeration value="uncertainEUExceeded"/&gt;
 *     &lt;enumeration value="uncertainSubNormal"/&gt;
 *     &lt;enumeration value="good"/&gt;
 *     &lt;enumeration value="goodLocalOverride"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "qualityBits")
@XmlEnum
public enum QualityBits {

    @XmlEnumValue("bad")
    BAD("bad"),
    @XmlEnumValue("badConfigurationError")
    BAD_CONFIGURATION_ERROR("badConfigurationError"),
    @XmlEnumValue("badNotConnected")
    BAD_NOT_CONNECTED("badNotConnected"),
    @XmlEnumValue("badDeviceFailure")
    BAD_DEVICE_FAILURE("badDeviceFailure"),
    @XmlEnumValue("badSensorFailure")
    BAD_SENSOR_FAILURE("badSensorFailure"),
    @XmlEnumValue("badLastKnownValue")
    BAD_LAST_KNOWN_VALUE("badLastKnownValue"),
    @XmlEnumValue("badCommFailure")
    BAD_COMM_FAILURE("badCommFailure"),
    @XmlEnumValue("badOutOfService")
    BAD_OUT_OF_SERVICE("badOutOfService"),
    @XmlEnumValue("badWaitingForInitialData")
    BAD_WAITING_FOR_INITIAL_DATA("badWaitingForInitialData"),
    @XmlEnumValue("uncertain")
    UNCERTAIN("uncertain"),
    @XmlEnumValue("uncertainLastUsableValue")
    UNCERTAIN_LAST_USABLE_VALUE("uncertainLastUsableValue"),
    @XmlEnumValue("uncertainSensorNotAccurate")
    UNCERTAIN_SENSOR_NOT_ACCURATE("uncertainSensorNotAccurate"),
    @XmlEnumValue("uncertainEUExceeded")
    UNCERTAIN_EU_EXCEEDED("uncertainEUExceeded"),
    @XmlEnumValue("uncertainSubNormal")
    UNCERTAIN_SUB_NORMAL("uncertainSubNormal"),
    @XmlEnumValue("good")
    GOOD("good"),
    @XmlEnumValue("goodLocalOverride")
    GOOD_LOCAL_OVERRIDE("goodLocalOverride");
    private final String value;

    QualityBits(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityBits fromValue(String v) {
        for (QualityBits c: QualityBits.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
