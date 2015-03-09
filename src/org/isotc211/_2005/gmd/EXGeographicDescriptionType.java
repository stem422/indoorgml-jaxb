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


/**
 * <p>EX_GeographicDescription_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="EX_GeographicDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type">
 *       &lt;sequence>
 *         &lt;element name="geographicIdentifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_GeographicDescription_Type", propOrder = {
    "geographicIdentifier"
})
public class EXGeographicDescriptionType
    extends AbstractEXGeographicExtentType
{

    @XmlElement(required = true)
    protected MDIdentifierPropertyType geographicIdentifier;

    /**
     * geographicIdentifier �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getGeographicIdentifier() {
        return geographicIdentifier;
    }

    /**
     * geographicIdentifier �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setGeographicIdentifier(MDIdentifierPropertyType value) {
        this.geographicIdentifier = value;
    }

    public boolean isSetGeographicIdentifier() {
        return (this.geographicIdentifier!= null);
    }

}
