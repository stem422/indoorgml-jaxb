//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfaceInterpolationType�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="SurfaceInterpolationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="planar"/>
 *     &lt;enumeration value="spherical"/>
 *     &lt;enumeration value="elliptical"/>
 *     &lt;enumeration value="conic"/>
 *     &lt;enumeration value="tin"/>
 *     &lt;enumeration value="parametricCurve"/>
 *     &lt;enumeration value="polynomialSpline"/>
 *     &lt;enumeration value="rationalSpline"/>
 *     &lt;enumeration value="triangulatedSpline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurfaceInterpolationType")
@XmlEnum
public enum SurfaceInterpolationType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("planar")
    PLANAR("planar"),
    @XmlEnumValue("spherical")
    SPHERICAL("spherical"),
    @XmlEnumValue("elliptical")
    ELLIPTICAL("elliptical"),
    @XmlEnumValue("conic")
    CONIC("conic"),
    @XmlEnumValue("tin")
    TIN("tin"),
    @XmlEnumValue("parametricCurve")
    PARAMETRIC_CURVE("parametricCurve"),
    @XmlEnumValue("polynomialSpline")
    POLYNOMIAL_SPLINE("polynomialSpline"),
    @XmlEnumValue("rationalSpline")
    RATIONAL_SPLINE("rationalSpline"),
    @XmlEnumValue("triangulatedSpline")
    TRIANGULATED_SPLINE("triangulatedSpline");
    private final String value;

    SurfaceInterpolationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurfaceInterpolationType fromValue(String v) {
        for (SurfaceInterpolationType c: SurfaceInterpolationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
