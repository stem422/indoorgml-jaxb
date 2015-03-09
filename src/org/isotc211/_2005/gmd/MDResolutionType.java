//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.DistancePropertyType;


/**
 * <p>MD_Resolution_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MD_Resolution_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="equivalentScale" type="{http://www.isotc211.org/2005/gmd}MD_RepresentativeFraction_PropertyType"/>
 *         &lt;element name="distance" type="{http://www.isotc211.org/2005/gco}Distance_PropertyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Resolution_Type", propOrder = {
    "equivalentScale",
    "distance"
})
public class MDResolutionType {

    protected MDRepresentativeFractionPropertyType equivalentScale;
    protected DistancePropertyType distance;

    /**
     * equivalentScale �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getEquivalentScale() {
        return equivalentScale;
    }

    /**
     * equivalentScale �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setEquivalentScale(MDRepresentativeFractionPropertyType value) {
        this.equivalentScale = value;
    }

    public boolean isSetEquivalentScale() {
        return (this.equivalentScale!= null);
    }

    /**
     * distance �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DistancePropertyType }
     *     
     */
    public DistancePropertyType getDistance() {
        return distance;
    }

    /**
     * distance �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DistancePropertyType }
     *     
     */
    public void setDistance(DistancePropertyType value) {
        this.distance = value;
    }

    public boolean isSetDistance() {
        return (this.distance!= null);
    }

}
