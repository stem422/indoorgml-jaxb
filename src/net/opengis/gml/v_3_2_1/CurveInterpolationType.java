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
 * <p>CurveInterpolationType에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="CurveInterpolationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="linear"/>
 *     &lt;enumeration value="geodesic"/>
 *     &lt;enumeration value="circularArc3Points"/>
 *     &lt;enumeration value="circularArc2PointWithBulge"/>
 *     &lt;enumeration value="circularArcCenterPointWithRadius"/>
 *     &lt;enumeration value="elliptical"/>
 *     &lt;enumeration value="clothoid"/>
 *     &lt;enumeration value="conic"/>
 *     &lt;enumeration value="polynomialSpline"/>
 *     &lt;enumeration value="cubicSpline"/>
 *     &lt;enumeration value="rationalSpline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurveInterpolationType")
@XmlEnum
public enum CurveInterpolationType {

    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("geodesic")
    GEODESIC("geodesic"),
    @XmlEnumValue("circularArc3Points")
    CIRCULAR_ARC_3_POINTS("circularArc3Points"),
    @XmlEnumValue("circularArc2PointWithBulge")
    CIRCULAR_ARC_2_POINT_WITH_BULGE("circularArc2PointWithBulge"),
    @XmlEnumValue("circularArcCenterPointWithRadius")
    CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS("circularArcCenterPointWithRadius"),
    @XmlEnumValue("elliptical")
    ELLIPTICAL("elliptical"),
    @XmlEnumValue("clothoid")
    CLOTHOID("clothoid"),
    @XmlEnumValue("conic")
    CONIC("conic"),
    @XmlEnumValue("polynomialSpline")
    POLYNOMIAL_SPLINE("polynomialSpline"),
    @XmlEnumValue("cubicSpline")
    CUBIC_SPLINE("cubicSpline"),
    @XmlEnumValue("rationalSpline")
    RATIONAL_SPLINE("rationalSpline");
    private final String value;

    CurveInterpolationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurveInterpolationType fromValue(String v) {
        for (CurveInterpolationType c: CurveInterpolationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
