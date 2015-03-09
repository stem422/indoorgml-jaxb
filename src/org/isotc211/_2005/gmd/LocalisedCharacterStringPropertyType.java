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
import org.isotc211._2005.gco.ObjectReferencePropertyType;


/**
 * <p>LocalisedCharacterString_PropertyType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="LocalisedCharacterString_PropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalisedCharacterString_PropertyType", propOrder = {
    "localisedCharacterString"
})
public class LocalisedCharacterStringPropertyType
    extends ObjectReferencePropertyType
{

    @XmlElement(name = "LocalisedCharacterString")
    protected LocalisedCharacterStringType localisedCharacterString;

    /**
     * localisedCharacterString �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public LocalisedCharacterStringType getLocalisedCharacterString() {
        return localisedCharacterString;
    }

    /**
     * localisedCharacterString �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public void setLocalisedCharacterString(LocalisedCharacterStringType value) {
        this.localisedCharacterString = value;
    }

    public boolean isSetLocalisedCharacterString() {
        return (this.localisedCharacterString!= null);
    }

}
