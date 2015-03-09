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
import org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * <p>MD_DataIdentification_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_DataIdentification_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_Identification_Type">
 *       &lt;sequence>
 *         &lt;element name="spatialRepresentationType" type="{http://www.isotc211.org/2005/gmd}MD_SpatialRepresentationTypeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spatialResolution" type="{http://www.isotc211.org/2005/gmd}MD_Resolution_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="characterSet" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="topicCategory" type="{http://www.isotc211.org/2005/gmd}MD_TopicCategoryCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="environmentDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supplementalInformation" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_DataIdentification_Type", propOrder = {
    "spatialRepresentationType",
    "spatialResolution",
    "language",
    "characterSet",
    "topicCategory",
    "environmentDescription",
    "extent",
    "supplementalInformation"
})
public class MDDataIdentificationType
    extends AbstractMDIdentificationType
{

    protected List<MDSpatialRepresentationTypeCodePropertyType> spatialRepresentationType;
    protected List<MDResolutionPropertyType> spatialResolution;
    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> language;
    protected List<MDCharacterSetCodePropertyType> characterSet;
    protected List<MDTopicCategoryCodePropertyType> topicCategory;
    protected CharacterStringPropertyType environmentDescription;
    protected List<EXExtentPropertyType> extent;
    protected CharacterStringPropertyType supplementalInformation;

    /**
     * Gets the value of the spatialRepresentationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialRepresentationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialRepresentationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDSpatialRepresentationTypeCodePropertyType }
     * 
     * 
     */
    public List<MDSpatialRepresentationTypeCodePropertyType> getSpatialRepresentationType() {
        if (spatialRepresentationType == null) {
            spatialRepresentationType = new ArrayList<MDSpatialRepresentationTypeCodePropertyType>();
        }
        return this.spatialRepresentationType;
    }

    public boolean isSetSpatialRepresentationType() {
        return ((this.spatialRepresentationType!= null)&&(!this.spatialRepresentationType.isEmpty()));
    }

    public void unsetSpatialRepresentationType() {
        this.spatialRepresentationType = null;
    }

    /**
     * Gets the value of the spatialResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDResolutionPropertyType }
     * 
     * 
     */
    public List<MDResolutionPropertyType> getSpatialResolution() {
        if (spatialResolution == null) {
            spatialResolution = new ArrayList<MDResolutionPropertyType>();
        }
        return this.spatialResolution;
    }

    public boolean isSetSpatialResolution() {
        return ((this.spatialResolution!= null)&&(!this.spatialResolution.isEmpty()));
    }

    public void unsetSpatialResolution() {
        this.spatialResolution = null;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getLanguage() {
        if (language == null) {
            language = new ArrayList<CharacterStringPropertyType>();
        }
        return this.language;
    }

    public boolean isSetLanguage() {
        return ((this.language!= null)&&(!this.language.isEmpty()));
    }

    public void unsetLanguage() {
        this.language = null;
    }

    /**
     * Gets the value of the characterSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characterSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacterSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDCharacterSetCodePropertyType }
     * 
     * 
     */
    public List<MDCharacterSetCodePropertyType> getCharacterSet() {
        if (characterSet == null) {
            characterSet = new ArrayList<MDCharacterSetCodePropertyType>();
        }
        return this.characterSet;
    }

    public boolean isSetCharacterSet() {
        return ((this.characterSet!= null)&&(!this.characterSet.isEmpty()));
    }

    public void unsetCharacterSet() {
        this.characterSet = null;
    }

    /**
     * Gets the value of the topicCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDTopicCategoryCodePropertyType }
     * 
     * 
     */
    public List<MDTopicCategoryCodePropertyType> getTopicCategory() {
        if (topicCategory == null) {
            topicCategory = new ArrayList<MDTopicCategoryCodePropertyType>();
        }
        return this.topicCategory;
    }

    public boolean isSetTopicCategory() {
        return ((this.topicCategory!= null)&&(!this.topicCategory.isEmpty()));
    }

    public void unsetTopicCategory() {
        this.topicCategory = null;
    }

    /**
     * environmentDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEnvironmentDescription() {
        return environmentDescription;
    }

    /**
     * environmentDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEnvironmentDescription(CharacterStringPropertyType value) {
        this.environmentDescription = value;
    }

    public boolean isSetEnvironmentDescription() {
        return (this.environmentDescription!= null);
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getExtent() {
        if (extent == null) {
            extent = new ArrayList<EXExtentPropertyType>();
        }
        return this.extent;
    }

    public boolean isSetExtent() {
        return ((this.extent!= null)&&(!this.extent.isEmpty()));
    }

    public void unsetExtent() {
        this.extent = null;
    }

    /**
     * supplementalInformation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSupplementalInformation() {
        return supplementalInformation;
    }

    /**
     * supplementalInformation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSupplementalInformation(CharacterStringPropertyType value) {
        this.supplementalInformation = value;
    }

    public boolean isSetSupplementalInformation() {
        return (this.supplementalInformation!= null);
    }

}
