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
 * <p>MD_PixelOrientationCode_Type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
