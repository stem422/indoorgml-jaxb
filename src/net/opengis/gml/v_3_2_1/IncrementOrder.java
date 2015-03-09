//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IncrementOrder에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="IncrementOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="+x+y"/>
 *     &lt;enumeration value="+y+x"/>
 *     &lt;enumeration value="+x-y"/>
 *     &lt;enumeration value="-x-y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncrementOrder")
@XmlEnum
public enum IncrementOrder {

    @XmlEnumValue("+x+y")
    VALUE_1("+x+y"),
    @XmlEnumValue("+y+x")
    VALUE_2("+y+x"),
    @XmlEnumValue("+x-y")
    VALUE_3("+x-y"),
    @XmlEnumValue("-x-y")
    VALUE_4("-x-y");
    private final String value;

    IncrementOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncrementOrder fromValue(String v) {
        for (IncrementOrder c: IncrementOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
