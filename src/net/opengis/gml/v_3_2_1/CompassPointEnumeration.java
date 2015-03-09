//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompassPointEnumeration에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CompassPointEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="NNE"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="ENE"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="ESE"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SSE"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="SSW"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="WSW"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="WNW"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="NNW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompassPointEnumeration")
@XmlEnum
public enum CompassPointEnumeration {

    N,
    NNE,
    NE,
    ENE,
    E,
    ESE,
    SE,
    SSE,
    S,
    SSW,
    SW,
    WSW,
    W,
    WNW,
    NW,
    NNW;

    public String value() {
        return name();
    }

    public static CompassPointEnumeration fromValue(String v) {
        return valueOf(v);
    }

}
