//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.22 at 10:03:02 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfTopoExpressionCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOfTopoExpressionCodeEnumerationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTAINS"/&gt;
 *     &lt;enumeration value="OVERLAPS"/&gt;
 *     &lt;enumeration value="EQUALS"/&gt;
 *     &lt;enumeration value="WITHIN"/&gt;
 *     &lt;enumeration value="CROSSES"/&gt;
 *     &lt;enumeration value="INTERSECTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
