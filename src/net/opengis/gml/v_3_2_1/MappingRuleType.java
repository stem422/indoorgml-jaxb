//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MappingRuleType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MappingRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ruleDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleReference" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingRuleType", propOrder = {
    "ruleDefinition",
    "ruleReference"
})
public class MappingRuleType {

    protected String ruleDefinition;
    protected ReferenceType ruleReference;

    /**
     * ruleDefinition �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDefinition() {
        return ruleDefinition;
    }

    /**
     * ruleDefinition �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDefinition(String value) {
        this.ruleDefinition = value;
    }

    public boolean isSetRuleDefinition() {
        return (this.ruleDefinition!= null);
    }

    /**
     * ruleReference �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRuleReference() {
        return ruleReference;
    }

    /**
     * ruleReference �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRuleReference(ReferenceType value) {
        this.ruleReference = value;
    }

    public boolean isSetRuleReference() {
        return (this.ruleReference!= null);
    }

}
