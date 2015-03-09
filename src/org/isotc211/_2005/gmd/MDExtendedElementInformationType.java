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
import org.isotc211._2005.gco.IntegerPropertyType;


/**
 * New metadata element, not found in ISO 19115, which is required to describe geographic data
 * 
 * <p>MD_ExtendedElementInformation_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_ExtendedElementInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="shortName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="domainCode" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="obligation" type="{http://www.isotc211.org/2005/gmd}MD_ObligationCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.isotc211.org/2005/gmd}MD_DatatypeCode_PropertyType"/>
 *         &lt;element name="maximumOccurrence" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="domainValue" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="parentEntity" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="rule" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="rationale" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ExtendedElementInformation_Type", propOrder = {
    "name",
    "shortName",
    "domainCode",
    "definition",
    "obligation",
    "condition",
    "dataType",
    "maximumOccurrence",
    "domainValue",
    "parentEntity",
    "rule",
    "rationale",
    "source"
})
public class MDExtendedElementInformationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType name;
    protected CharacterStringPropertyType shortName;
    protected IntegerPropertyType domainCode;
    @XmlElement(required = true)
    protected CharacterStringPropertyType definition;
    protected MDObligationCodePropertyType obligation;
    protected CharacterStringPropertyType condition;
    @XmlElement(required = true)
    protected MDDatatypeCodePropertyType dataType;
    protected CharacterStringPropertyType maximumOccurrence;
    protected CharacterStringPropertyType domainValue;
    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> parentEntity;
    @XmlElement(required = true)
    protected CharacterStringPropertyType rule;
    protected List<CharacterStringPropertyType> rationale;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> source;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * shortName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getShortName() {
        return shortName;
    }

    /**
     * shortName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setShortName(CharacterStringPropertyType value) {
        this.shortName = value;
    }

    public boolean isSetShortName() {
        return (this.shortName!= null);
    }

    /**
     * domainCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDomainCode() {
        return domainCode;
    }

    /**
     * domainCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDomainCode(IntegerPropertyType value) {
        this.domainCode = value;
    }

    public boolean isSetDomainCode() {
        return (this.domainCode!= null);
    }

    /**
     * definition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDefinition() {
        return definition;
    }

    /**
     * definition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDefinition(CharacterStringPropertyType value) {
        this.definition = value;
    }

    public boolean isSetDefinition() {
        return (this.definition!= null);
    }

    /**
     * obligation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public MDObligationCodePropertyType getObligation() {
        return obligation;
    }

    /**
     * obligation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public void setObligation(MDObligationCodePropertyType value) {
        this.obligation = value;
    }

    public boolean isSetObligation() {
        return (this.obligation!= null);
    }

    /**
     * condition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCondition() {
        return condition;
    }

    /**
     * condition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCondition(CharacterStringPropertyType value) {
        this.condition = value;
    }

    public boolean isSetCondition() {
        return (this.condition!= null);
    }

    /**
     * dataType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public MDDatatypeCodePropertyType getDataType() {
        return dataType;
    }

    /**
     * dataType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public void setDataType(MDDatatypeCodePropertyType value) {
        this.dataType = value;
    }

    public boolean isSetDataType() {
        return (this.dataType!= null);
    }

    /**
     * maximumOccurrence 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMaximumOccurrence() {
        return maximumOccurrence;
    }

    /**
     * maximumOccurrence 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMaximumOccurrence(CharacterStringPropertyType value) {
        this.maximumOccurrence = value;
    }

    public boolean isSetMaximumOccurrence() {
        return (this.maximumOccurrence!= null);
    }

    /**
     * domainValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDomainValue() {
        return domainValue;
    }

    /**
     * domainValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDomainValue(CharacterStringPropertyType value) {
        this.domainValue = value;
    }

    public boolean isSetDomainValue() {
        return (this.domainValue!= null);
    }

    /**
     * Gets the value of the parentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getParentEntity() {
        if (parentEntity == null) {
            parentEntity = new ArrayList<CharacterStringPropertyType>();
        }
        return this.parentEntity;
    }

    public boolean isSetParentEntity() {
        return ((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()));
    }

    public void unsetParentEntity() {
        this.parentEntity = null;
    }

    /**
     * rule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getRule() {
        return rule;
    }

    /**
     * rule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setRule(CharacterStringPropertyType value) {
        this.rule = value;
    }

    public boolean isSetRule() {
        return (this.rule!= null);
    }

    /**
     * Gets the value of the rationale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rationale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRationale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getRationale() {
        if (rationale == null) {
            rationale = new ArrayList<CharacterStringPropertyType>();
        }
        return this.rationale;
    }

    public boolean isSetRationale() {
        return ((this.rationale!= null)&&(!this.rationale.isEmpty()));
    }

    public void unsetRationale() {
        this.rationale = null;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.source;
    }

    public boolean isSetSource() {
        return ((this.source!= null)&&(!this.source.isEmpty()));
    }

    public void unsetSource() {
        this.source = null;
    }

}
