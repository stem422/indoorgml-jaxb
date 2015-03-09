//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.w3._1999.xlink;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>showType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="showType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="embed"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "showType")
@XmlEnum
public enum ShowType {

    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("embed")
    EMBED("embed"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    ShowType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShowType fromValue(String v) {
        for (ShowType c: ShowType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
