//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * Identification of, and means of communication with, person(s) and organisations associated with the dataset
 * 
 * <p>CI_ResponsibleParty_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CI_ResponsibleParty_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="individualName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="organisationName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="positionName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.isotc211.org/2005/gmd}CI_Contact_PropertyType" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.isotc211.org/2005/gmd}CI_RoleCode_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_ResponsibleParty_Type", propOrder = {
    "individualName",
    "organisationName",
    "positionName",
    "contactInfo",
    "role"
})
public class CIResponsiblePartyType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType individualName;
    protected CharacterStringPropertyType organisationName;
    protected CharacterStringPropertyType positionName;
    protected CIContactPropertyType contactInfo;
    @XmlElement(required = true)
    protected CIRoleCodePropertyType role;

    /**
     * individualName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getIndividualName() {
        return individualName;
    }

    /**
     * individualName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setIndividualName(CharacterStringPropertyType value) {
        this.individualName = value;
    }

    public boolean isSetIndividualName() {
        return (this.individualName!= null);
    }

    /**
     * organisationName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrganisationName() {
        return organisationName;
    }

    /**
     * organisationName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrganisationName(CharacterStringPropertyType value) {
        this.organisationName = value;
    }

    public boolean isSetOrganisationName() {
        return (this.organisationName!= null);
    }

    /**
     * positionName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPositionName() {
        return positionName;
    }

    /**
     * positionName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPositionName(CharacterStringPropertyType value) {
        this.positionName = value;
    }

    public boolean isSetPositionName() {
        return (this.positionName!= null);
    }

    /**
     * contactInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CIContactPropertyType }
     *     
     */
    public CIContactPropertyType getContactInfo() {
        return contactInfo;
    }

    /**
     * contactInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CIContactPropertyType }
     *     
     */
    public void setContactInfo(CIContactPropertyType value) {
        this.contactInfo = value;
    }

    public boolean isSetContactInfo() {
        return (this.contactInfo!= null);
    }

    /**
     * role 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public CIRoleCodePropertyType getRole() {
        return role;
    }

    /**
     * role 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CIRoleCodePropertyType }
     *     
     */
    public void setRole(CIRoleCodePropertyType value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

}
