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
import org.isotc211._2005.gco.ObjectReferencePropertyType;


/**
 * Information about the metadata
 * 
 * <p>MD_Metadata_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_Metadata_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="fileIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="characterSet" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="parentIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="hierarchyLevel" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hierarchyLevelName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="dateStamp" type="{http://www.isotc211.org/2005/gco}Date_PropertyType"/>
 *         &lt;element name="metadataStandardName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="metadataStandardVersion" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="dataSetURI" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.isotc211.org/2005/gmd}PT_Locale_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spatialRepresentationInfo" type="{http://www.isotc211.org/2005/gmd}MD_SpatialRepresentation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceSystemInfo" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadataExtensionInfo" type="{http://www.isotc211.org/2005/gmd}MD_MetadataExtensionInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identificationInfo" type="{http://www.isotc211.org/2005/gmd}MD_Identification_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="contentInfo" type="{http://www.isotc211.org/2005/gmd}MD_ContentInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributionInfo" type="{http://www.isotc211.org/2005/gmd}MD_Distribution_PropertyType" minOccurs="0"/>
 *         &lt;element name="dataQualityInfo" type="{http://www.isotc211.org/2005/gmd}DQ_DataQuality_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portrayalCatalogueInfo" type="{http://www.isotc211.org/2005/gmd}MD_PortrayalCatalogueReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadataConstraints" type="{http://www.isotc211.org/2005/gmd}MD_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicationSchemaInfo" type="{http://www.isotc211.org/2005/gmd}MD_ApplicationSchemaInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadataMaintenance" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceInformation_PropertyType" minOccurs="0"/>
 *         &lt;element name="series" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="describes" type="{http://www.isotc211.org/2005/gmd}DS_DataSet_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="featureType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="featureAttribute" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Metadata_Type", propOrder = {
    "fileIdentifier",
    "language",
    "characterSet",
    "parentIdentifier",
    "hierarchyLevel",
    "hierarchyLevelName",
    "contact",
    "dateStamp",
    "metadataStandardName",
    "metadataStandardVersion",
    "dataSetURI",
    "locale",
    "spatialRepresentationInfo",
    "referenceSystemInfo",
    "metadataExtensionInfo",
    "identificationInfo",
    "contentInfo",
    "distributionInfo",
    "dataQualityInfo",
    "portrayalCatalogueInfo",
    "metadataConstraints",
    "applicationSchemaInfo",
    "metadataMaintenance",
    "series",
    "describes",
    "propertyType",
    "featureType",
    "featureAttribute"
})
public class MDMetadataType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fileIdentifier;
    protected CharacterStringPropertyType language;
    protected MDCharacterSetCodePropertyType characterSet;
    protected CharacterStringPropertyType parentIdentifier;
    protected List<MDScopeCodePropertyType> hierarchyLevel;
    protected List<CharacterStringPropertyType> hierarchyLevelName;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> contact;
    @XmlElement(required = true)
    protected DatePropertyType dateStamp;
    protected CharacterStringPropertyType metadataStandardName;
    protected CharacterStringPropertyType metadataStandardVersion;
    protected CharacterStringPropertyType dataSetURI;
    protected List<PTLocalePropertyType> locale;
    protected List<MDSpatialRepresentationPropertyType> spatialRepresentationInfo;
    protected List<MDReferenceSystemPropertyType> referenceSystemInfo;
    protected List<MDMetadataExtensionInformationPropertyType> metadataExtensionInfo;
    @XmlElement(required = true)
    protected List<MDIdentificationPropertyType> identificationInfo;
    protected List<MDContentInformationPropertyType> contentInfo;
    protected MDDistributionPropertyType distributionInfo;
    protected List<DQDataQualityPropertyType> dataQualityInfo;
    protected List<MDPortrayalCatalogueReferencePropertyType> portrayalCatalogueInfo;
    protected List<MDConstraintsPropertyType> metadataConstraints;
    protected List<MDApplicationSchemaInformationPropertyType> applicationSchemaInfo;
    protected MDMaintenanceInformationPropertyType metadataMaintenance;
    protected List<DSAggregatePropertyType> series;
    protected List<DSDataSetPropertyType> describes;
    protected List<ObjectReferencePropertyType> propertyType;
    protected List<ObjectReferencePropertyType> featureType;
    protected List<ObjectReferencePropertyType> featureAttribute;

    /**
     * fileIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileIdentifier() {
        return fileIdentifier;
    }

    /**
     * fileIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileIdentifier(CharacterStringPropertyType value) {
        this.fileIdentifier = value;
    }

    public boolean isSetFileIdentifier() {
        return (this.fileIdentifier!= null);
    }

    /**
     * language 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getLanguage() {
        return language;
    }

    /**
     * language 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setLanguage(CharacterStringPropertyType value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * characterSet 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterSet() {
        return characterSet;
    }

    /**
     * characterSet 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterSet(MDCharacterSetCodePropertyType value) {
        this.characterSet = value;
    }

    public boolean isSetCharacterSet() {
        return (this.characterSet!= null);
    }

    /**
     * parentIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getParentIdentifier() {
        return parentIdentifier;
    }

    /**
     * parentIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setParentIdentifier(CharacterStringPropertyType value) {
        this.parentIdentifier = value;
    }

    public boolean isSetParentIdentifier() {
        return (this.parentIdentifier!= null);
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getHierarchyLevel() {
        if (hierarchyLevel == null) {
            hierarchyLevel = new ArrayList<MDScopeCodePropertyType>();
        }
        return this.hierarchyLevel;
    }

    public boolean isSetHierarchyLevel() {
        return ((this.hierarchyLevel!= null)&&(!this.hierarchyLevel.isEmpty()));
    }

    public void unsetHierarchyLevel() {
        this.hierarchyLevel = null;
    }

    /**
     * Gets the value of the hierarchyLevelName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevelName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevelName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getHierarchyLevelName() {
        if (hierarchyLevelName == null) {
            hierarchyLevelName = new ArrayList<CharacterStringPropertyType>();
        }
        return this.hierarchyLevelName;
    }

    public boolean isSetHierarchyLevelName() {
        return ((this.hierarchyLevelName!= null)&&(!this.hierarchyLevelName.isEmpty()));
    }

    public void unsetHierarchyLevelName() {
        this.hierarchyLevelName = null;
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

    /**
     * dateStamp 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateStamp() {
        return dateStamp;
    }

    /**
     * dateStamp 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateStamp(DatePropertyType value) {
        this.dateStamp = value;
    }

    public boolean isSetDateStamp() {
        return (this.dateStamp!= null);
    }

    /**
     * metadataStandardName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardName() {
        return metadataStandardName;
    }

    /**
     * metadataStandardName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardName(CharacterStringPropertyType value) {
        this.metadataStandardName = value;
    }

    public boolean isSetMetadataStandardName() {
        return (this.metadataStandardName!= null);
    }

    /**
     * metadataStandardVersion 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardVersion() {
        return metadataStandardVersion;
    }

    /**
     * metadataStandardVersion 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardVersion(CharacterStringPropertyType value) {
        this.metadataStandardVersion = value;
    }

    public boolean isSetMetadataStandardVersion() {
        return (this.metadataStandardVersion!= null);
    }

    /**
     * dataSetURI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataSetURI() {
        return dataSetURI;
    }

    /**
     * dataSetURI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataSetURI(CharacterStringPropertyType value) {
        this.dataSetURI = value;
    }

    public boolean isSetDataSetURI() {
        return (this.dataSetURI!= null);
    }

    /**
     * Gets the value of the locale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTLocalePropertyType }
     * 
     * 
     */
    public List<PTLocalePropertyType> getLocale() {
        if (locale == null) {
            locale = new ArrayList<PTLocalePropertyType>();
        }
        return this.locale;
    }

    public boolean isSetLocale() {
        return ((this.locale!= null)&&(!this.locale.isEmpty()));
    }

    public void unsetLocale() {
        this.locale = null;
    }

    /**
     * Gets the value of the spatialRepresentationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialRepresentationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialRepresentationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDSpatialRepresentationPropertyType }
     * 
     * 
     */
    public List<MDSpatialRepresentationPropertyType> getSpatialRepresentationInfo() {
        if (spatialRepresentationInfo == null) {
            spatialRepresentationInfo = new ArrayList<MDSpatialRepresentationPropertyType>();
        }
        return this.spatialRepresentationInfo;
    }

    public boolean isSetSpatialRepresentationInfo() {
        return ((this.spatialRepresentationInfo!= null)&&(!this.spatialRepresentationInfo.isEmpty()));
    }

    public void unsetSpatialRepresentationInfo() {
        this.spatialRepresentationInfo = null;
    }

    /**
     * Gets the value of the referenceSystemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceSystemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceSystemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDReferenceSystemPropertyType }
     * 
     * 
     */
    public List<MDReferenceSystemPropertyType> getReferenceSystemInfo() {
        if (referenceSystemInfo == null) {
            referenceSystemInfo = new ArrayList<MDReferenceSystemPropertyType>();
        }
        return this.referenceSystemInfo;
    }

    public boolean isSetReferenceSystemInfo() {
        return ((this.referenceSystemInfo!= null)&&(!this.referenceSystemInfo.isEmpty()));
    }

    public void unsetReferenceSystemInfo() {
        this.referenceSystemInfo = null;
    }

    /**
     * Gets the value of the metadataExtensionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataExtensionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataExtensionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataExtensionInformationPropertyType }
     * 
     * 
     */
    public List<MDMetadataExtensionInformationPropertyType> getMetadataExtensionInfo() {
        if (metadataExtensionInfo == null) {
            metadataExtensionInfo = new ArrayList<MDMetadataExtensionInformationPropertyType>();
        }
        return this.metadataExtensionInfo;
    }

    public boolean isSetMetadataExtensionInfo() {
        return ((this.metadataExtensionInfo!= null)&&(!this.metadataExtensionInfo.isEmpty()));
    }

    public void unsetMetadataExtensionInfo() {
        this.metadataExtensionInfo = null;
    }

    /**
     * Gets the value of the identificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIdentificationPropertyType }
     * 
     * 
     */
    public List<MDIdentificationPropertyType> getIdentificationInfo() {
        if (identificationInfo == null) {
            identificationInfo = new ArrayList<MDIdentificationPropertyType>();
        }
        return this.identificationInfo;
    }

    public boolean isSetIdentificationInfo() {
        return ((this.identificationInfo!= null)&&(!this.identificationInfo.isEmpty()));
    }

    public void unsetIdentificationInfo() {
        this.identificationInfo = null;
    }

    /**
     * Gets the value of the contentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDContentInformationPropertyType }
     * 
     * 
     */
    public List<MDContentInformationPropertyType> getContentInfo() {
        if (contentInfo == null) {
            contentInfo = new ArrayList<MDContentInformationPropertyType>();
        }
        return this.contentInfo;
    }

    public boolean isSetContentInfo() {
        return ((this.contentInfo!= null)&&(!this.contentInfo.isEmpty()));
    }

    public void unsetContentInfo() {
        this.contentInfo = null;
    }

    /**
     * distributionInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public MDDistributionPropertyType getDistributionInfo() {
        return distributionInfo;
    }

    /**
     * distributionInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public void setDistributionInfo(MDDistributionPropertyType value) {
        this.distributionInfo = value;
    }

    public boolean isSetDistributionInfo() {
        return (this.distributionInfo!= null);
    }

    /**
     * Gets the value of the dataQualityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataQualityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataQualityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQDataQualityPropertyType }
     * 
     * 
     */
    public List<DQDataQualityPropertyType> getDataQualityInfo() {
        if (dataQualityInfo == null) {
            dataQualityInfo = new ArrayList<DQDataQualityPropertyType>();
        }
        return this.dataQualityInfo;
    }

    public boolean isSetDataQualityInfo() {
        return ((this.dataQualityInfo!= null)&&(!this.dataQualityInfo.isEmpty()));
    }

    public void unsetDataQualityInfo() {
        this.dataQualityInfo = null;
    }

    /**
     * Gets the value of the portrayalCatalogueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrayalCatalogueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortrayalCatalogueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDPortrayalCatalogueReferencePropertyType }
     * 
     * 
     */
    public List<MDPortrayalCatalogueReferencePropertyType> getPortrayalCatalogueInfo() {
        if (portrayalCatalogueInfo == null) {
            portrayalCatalogueInfo = new ArrayList<MDPortrayalCatalogueReferencePropertyType>();
        }
        return this.portrayalCatalogueInfo;
    }

    public boolean isSetPortrayalCatalogueInfo() {
        return ((this.portrayalCatalogueInfo!= null)&&(!this.portrayalCatalogueInfo.isEmpty()));
    }

    public void unsetPortrayalCatalogueInfo() {
        this.portrayalCatalogueInfo = null;
    }

    /**
     * Gets the value of the metadataConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDConstraintsPropertyType }
     * 
     * 
     */
    public List<MDConstraintsPropertyType> getMetadataConstraints() {
        if (metadataConstraints == null) {
            metadataConstraints = new ArrayList<MDConstraintsPropertyType>();
        }
        return this.metadataConstraints;
    }

    public boolean isSetMetadataConstraints() {
        return ((this.metadataConstraints!= null)&&(!this.metadataConstraints.isEmpty()));
    }

    public void unsetMetadataConstraints() {
        this.metadataConstraints = null;
    }

    /**
     * Gets the value of the applicationSchemaInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationSchemaInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationSchemaInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDApplicationSchemaInformationPropertyType }
     * 
     * 
     */
    public List<MDApplicationSchemaInformationPropertyType> getApplicationSchemaInfo() {
        if (applicationSchemaInfo == null) {
            applicationSchemaInfo = new ArrayList<MDApplicationSchemaInformationPropertyType>();
        }
        return this.applicationSchemaInfo;
    }

    public boolean isSetApplicationSchemaInfo() {
        return ((this.applicationSchemaInfo!= null)&&(!this.applicationSchemaInfo.isEmpty()));
    }

    public void unsetApplicationSchemaInfo() {
        this.applicationSchemaInfo = null;
    }

    /**
     * metadataMaintenance 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public MDMaintenanceInformationPropertyType getMetadataMaintenance() {
        return metadataMaintenance;
    }

    /**
     * metadataMaintenance 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public void setMetadataMaintenance(MDMaintenanceInformationPropertyType value) {
        this.metadataMaintenance = value;
    }

    public boolean isSetMetadataMaintenance() {
        return (this.metadataMaintenance!= null);
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSeries() {
        if (series == null) {
            series = new ArrayList<DSAggregatePropertyType>();
        }
        return this.series;
    }

    public boolean isSetSeries() {
        return ((this.series!= null)&&(!this.series.isEmpty()));
    }

    public void unsetSeries() {
        this.series = null;
    }

    /**
     * Gets the value of the describes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the describes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescribes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSDataSetPropertyType }
     * 
     * 
     */
    public List<DSDataSetPropertyType> getDescribes() {
        if (describes == null) {
            describes = new ArrayList<DSDataSetPropertyType>();
        }
        return this.describes;
    }

    public boolean isSetDescribes() {
        return ((this.describes!= null)&&(!this.describes.isEmpty()));
    }

    public void unsetDescribes() {
        this.describes = null;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getPropertyType() {
        if (propertyType == null) {
            propertyType = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.propertyType;
    }

    public boolean isSetPropertyType() {
        return ((this.propertyType!= null)&&(!this.propertyType.isEmpty()));
    }

    public void unsetPropertyType() {
        this.propertyType = null;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureType() {
        if (featureType == null) {
            featureType = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureType;
    }

    public boolean isSetFeatureType() {
        return ((this.featureType!= null)&&(!this.featureType.isEmpty()));
    }

    public void unsetFeatureType() {
        this.featureType = null;
    }

    /**
     * Gets the value of the featureAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureAttribute() {
        if (featureAttribute == null) {
            featureAttribute = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureAttribute;
    }

    public boolean isSetFeatureAttribute() {
        return ((this.featureAttribute!= null)&&(!this.featureAttribute.isEmpty()));
    }

    public void unsetFeatureAttribute() {
        this.featureAttribute = null;
    }

}
