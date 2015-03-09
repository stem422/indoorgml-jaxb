//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.MemberNamePropertyType;


/**
 * Set of adjacent wavelengths in the electro-magnetic spectrum with a common characteristic, such as the visible band
 * 
 * <p>MD_RangeDimension_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MD_RangeDimension_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="sequenceIdentifier" type="{http://www.isotc211.org/2005/gco}MemberName_PropertyType" minOccurs="0"/>
 *         &lt;element name="descriptor" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_RangeDimension_Type", propOrder = {
    "sequenceIdentifier",
    "descriptor"
})
@XmlSeeAlso({
    MDBandType.class
})
public class MDRangeDimensionType
    extends AbstractObjectType
{

    protected MemberNamePropertyType sequenceIdentifier;
    protected CharacterStringPropertyType descriptor;

    /**
     * sequenceIdentifier �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public MemberNamePropertyType getSequenceIdentifier() {
        return sequenceIdentifier;
    }

    /**
     * sequenceIdentifier �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public void setSequenceIdentifier(MemberNamePropertyType value) {
        this.sequenceIdentifier = value;
    }

    public boolean isSetSequenceIdentifier() {
        return (this.sequenceIdentifier!= null);
    }

    /**
     * descriptor �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescriptor() {
        return descriptor;
    }

    /**
     * descriptor �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescriptor(CharacterStringPropertyType value) {
        this.descriptor = value;
    }

    public boolean isSetDescriptor() {
        return (this.descriptor!= null);
    }

}
