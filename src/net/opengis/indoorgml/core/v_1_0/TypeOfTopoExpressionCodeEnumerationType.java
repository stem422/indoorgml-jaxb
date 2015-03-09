//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeOfTopoExpressionCodeEnumerationType�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfTopoExpressionCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="OVERLAPS"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="WITHIN"/>
 *     &lt;enumeration value="CROSSES"/>
 *     &lt;enumeration value="INTERSECTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOfTopoExpressionCodeEnumerationType")
@XmlEnum
public enum TypeOfTopoExpressionCodeEnumerationType {

    CONTAINS,
    OVERLAPS,
    EQUALS,
    WITHIN,
    CROSSES,
    INTERSECTS;

    public String value() {
        return name();
    }

    public static TypeOfTopoExpressionCodeEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}
