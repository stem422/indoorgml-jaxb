//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MD_ObligationCode_Type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
