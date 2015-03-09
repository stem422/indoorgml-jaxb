//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DatePropertyType;
import org.isotc211._2005.gts.TMPeriodDurationPropertyType;


/**
 * Information about the scope and frequency of updating
 * 
 * <p>MD_MaintenanceInformation_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_MaintenanceInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="maintenanceAndUpdateFrequency" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceFrequencyCode_PropertyType"/>
 *         &lt;element name="dateOfNextUpdate" type="{http://www.isotc211.org/2005/gco}Date_PropertyType" minOccurs="0"/>
 *         &lt;element name="userDefinedMaintenanceFrequency" type="{http://www.isotc211.org/2005/gts}TM_PeriodDuration_PropertyType" minOccurs="0"/>
 *         &lt;element name="updateScope" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="updateScopeDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maintenanceNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MaintenanceInformation_Type", propOrder = {
    "maintenanceAndUpdateFrequency",
    "dateOfNextUpdate",
    "userDefinedMaintenanceFrequency",
    "updateScope",
    "updateScopeDescription",
    "maintenanceNote",
    "contact"
})
public class MDMaintenanceInformationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDMaintenanceFrequencyCodePropertyType maintenanceAndUpdateFrequency;
    protected DatePropertyType dateOfNextUpdate;
    protected TMPeriodDurationPropertyType userDefinedMaintenanceFrequency;
    protected List<MDScopeCodePropertyType> updateScope;
    protected List<MDScopeDescriptionPropertyType> updateScopeDescription;
    protected List<CharacterStringPropertyType> maintenanceNote;
    protected List<CIResponsiblePartyPropertyType> contact;

    /**
     * maintenanceAndUpdateFrequency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency() {
        return maintenanceAndUpdateFrequency;
    }

    /**
     * maintenanceAndUpdateFrequency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceFrequencyCodePropertyType }
     *     
     */
    public void setMaintenanceAndUpdateFrequency(MDMaintenanceFrequencyCodePropertyType value) {
        this.maintenanceAndUpdateFrequency = value;
    }

    public boolean isSetMaintenanceAndUpdateFrequency() {
        return (this.maintenanceAndUpdateFrequency!= null);
    }

    /**
     * dateOfNextUpdate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateOfNextUpdate() {
        return dateOfNextUpdate;
    }

    /**
     * dateOfNextUpdate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateOfNextUpdate(DatePropertyType value) {
        this.dateOfNextUpdate = value;
    }

    public boolean isSetDateOfNextUpdate() {
        return (this.dateOfNextUpdate!= null);
    }

    /**
     * userDefinedMaintenanceFrequency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency() {
        return userDefinedMaintenanceFrequency;
    }

    /**
     * userDefinedMaintenanceFrequency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPeriodDurationPropertyType }
     *     
     */
    public void setUserDefinedMaintenanceFrequency(TMPeriodDurationPropertyType value) {
        this.userDefinedMaintenanceFrequency = value;
    }

    public boolean isSetUserDefinedMaintenanceFrequency() {
        return (this.userDefinedMaintenanceFrequency!= null);
    }

    /**
     * Gets the value of the updateScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getUpdateScope() {
        if (updateScope == null) {
            updateScope = new ArrayList<MDScopeCodePropertyType>();
        }
        return this.updateScope;
    }

    public boolean isSetUpdateScope() {
        return ((this.updateScope!= null)&&(!this.updateScope.isEmpty()));
    }

    public void unsetUpdateScope() {
        this.updateScope = null;
    }

    /**
     * Gets the value of the updateScopeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateScopeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateScopeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getUpdateScopeDescription() {
        if (updateScopeDescription == null) {
            updateScopeDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.updateScopeDescription;
    }

    public boolean isSetUpdateScopeDescription() {
        return ((this.updateScopeDescription!= null)&&(!this.updateScopeDescription.isEmpty()));
    }

    public void unsetUpdateScopeDescription() {
        this.updateScopeDescription = null;
    }

    /**
     * Gets the value of the maintenanceNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getMaintenanceNote() {
        if (maintenanceNote == null) {
            maintenanceNote = new ArrayList<CharacterStringPropertyType>();
        }
        return this.maintenanceNote;
    }

    public boolean isSetMaintenanceNote() {
        return ((this.maintenanceNote!= null)&&(!this.maintenanceNote.isEmpty()));
    }

    public void unsetMaintenanceNote() {
        this.maintenanceNote = null;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.contact;
    }

    public boolean isSetContact() {
        return ((this.contact!= null)&&(!this.contact.isEmpty()));
    }

    public void unsetContact() {
        this.contact = null;
    }

}
