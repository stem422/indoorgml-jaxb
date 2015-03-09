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
 * <p>MD_PixelOrientationCode_Type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_PixelOrientationCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="lowerLeft"/>
 *     &lt;enumeration value="lowerRight"/>
 *     &lt;enumeration value="upperRight"/>
 *     &lt;enumeration value="upperLeft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MD_PixelOrientationCode_Type")
@XmlEnum
public enum MDPixelOrientationCodeType {

    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("lowerLeft")
    LOWER_LEFT("lowerLeft"),
    @XmlEnumValue("lowerRight")
    LOWER_RIGHT("lowerRight"),
    @XmlEnumValue("upperRight")
    UPPER_RIGHT("upperRight"),
    @XmlEnumValue("upperLeft")
    UPPER_LEFT("upperLeft");
    private final String value;

    MDPixelOrientationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDPixelOrientationCodeType fromValue(String v) {
        for (MDPixelOrientationCodeType c: MDPixelOrientationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
