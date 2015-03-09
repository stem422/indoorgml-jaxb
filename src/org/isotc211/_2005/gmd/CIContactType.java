//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * Information required enabling contact with the  responsible person and/or organisation
 * 
 * <p>CI_Contact_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CI_Contact_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="phone" type="{http://www.isotc211.org/2005/gmd}CI_Telephone_PropertyType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.isotc211.org/2005/gmd}CI_Address_PropertyType" minOccurs="0"/>
 *         &lt;element name="onlineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/>
 *         &lt;element name="hoursOfService" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="contactInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Contact_Type", propOrder = {
    "phone",
    "address",
    "onlineResource",
    "hoursOfService",
    "contactInstructions"
})
public class CIContactType
    extends AbstractObjectType
{

    protected CITelephonePropertyType phone;
    protected CIAddressPropertyType address;
    protected CIOnlineResourcePropertyType onlineResource;
    protected CharacterStringPropertyType hoursOfService;
    protected CharacterStringPropertyType contactInstructions;

    /**
     * phone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public CITelephonePropertyType getPhone() {
        return phone;
    }

    /**
     * phone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CITelephonePropertyType }
     *     
     */
    public void setPhone(CITelephonePropertyType value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * address 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public CIAddressPropertyType getAddress() {
        return address;
    }

    /**
     * address 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CIAddressPropertyType }
     *     
     */
    public void setAddress(CIAddressPropertyType value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * onlineResource 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getOnlineResource() {
        return onlineResource;
    }

    /**
     * onlineResource 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setOnlineResource(CIOnlineResourcePropertyType value) {
        this.onlineResource = value;
    }

    public boolean isSetOnlineResource() {
        return (this.onlineResource!= null);
    }

    /**
     * hoursOfService 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHoursOfService() {
        return hoursOfService;
    }

    /**
     * hoursOfService 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHoursOfService(CharacterStringPropertyType value) {
        this.hoursOfService = value;
    }

    public boolean isSetHoursOfService() {
        return (this.hoursOfService!= null);
    }

    /**
     * contactInstructions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getContactInstructions() {
        return contactInstructions;
    }

    /**
     * contactInstructions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setContactInstructions(CharacterStringPropertyType value) {
        this.contactInstructions = value;
    }

    public boolean isSetContactInstructions() {
        return (this.contactInstructions!= null);
    }

}
