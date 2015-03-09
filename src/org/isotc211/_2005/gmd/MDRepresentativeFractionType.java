//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.IntegerPropertyType;


/**
 * <p>MD_RepresentativeFraction_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MD_RepresentativeFraction_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="denominator" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_RepresentativeFraction_Type", propOrder = {
    "denominator"
})
public class MDRepresentativeFractionType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected IntegerPropertyType denominator;

    /**
     * denominator �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDenominator() {
        return denominator;
    }

    /**
     * denominator �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDenominator(IntegerPropertyType value) {
        this.denominator = value;
    }

    public boolean isSetDenominator() {
        return (this.denominator!= null);
    }

}
