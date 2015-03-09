//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MD_ObligationCode_Type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_ObligationCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mandatory"/>
 *     &lt;enumeration value="optional"/>
 *     &lt;enumeration value="conditional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MD_ObligationCode_Type")
@XmlEnum
public enum MDObligationCodeType {

    @XmlEnumValue("mandatory")
    MANDATORY("mandatory"),
    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("conditional")
    CONDITIONAL("conditional");
    private final String value;

    MDObligationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDObligationCodeType fromValue(String v) {
        for (MDObligationCodeType c: MDObligationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
