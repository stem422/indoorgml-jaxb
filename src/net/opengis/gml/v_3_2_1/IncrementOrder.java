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
 * <p>IncrementOrder�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
