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


/**
 * Encapsulates the dataset aggregation information
 * 
 * <p>MD_AggregateInformation_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_AggregateInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="aggregateDataSetName" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="aggregateDataSetIdentifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="associationType" type="{http://www.isotc211.org/2005/gmd}DS_AssociationTypeCode_PropertyType"/>
 *         &lt;element name="initiativeType" type="{http://www.isotc211.org/2005/gmd}DS_InitiativeTypeCode_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_AggregateInformation_Type", propOrder = {
    "aggregateDataSetName",
    "aggregateDataSetIdentifier",
    "associationType",
    "initiativeType"
})
public class MDAggregateInformationType
    extends AbstractObjectType
{

    protected CICitationPropertyType aggregateDataSetName;
    protected MDIdentifierPropertyType aggregateDataSetIdentifier;
    @XmlElement(required = true)
    protected DSAssociationTypeCodePropertyType associationType;
    protected DSInitiativeTypeCodePropertyType initiativeType;

    /**
     * aggregateDataSetName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getAggregateDataSetName() {
        return aggregateDataSetName;
    }

    /**
     * aggregateDataSetName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setAggregateDataSetName(CICitationPropertyType value) {
        this.aggregateDataSetName = value;
    }

    public boolean isSetAggregateDataSetName() {
        return (this.aggregateDataSetName!= null);
    }

    /**
     * aggregateDataSetIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getAggregateDataSetIdentifier() {
        return aggregateDataSetIdentifier;
    }

    /**
     * aggregateDataSetIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setAggregateDataSetIdentifier(MDIdentifierPropertyType value) {
        this.aggregateDataSetIdentifier = value;
    }

    public boolean isSetAggregateDataSetIdentifier() {
        return (this.aggregateDataSetIdentifier!= null);
    }

    /**
     * associationType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public DSAssociationTypeCodePropertyType getAssociationType() {
        return associationType;
    }

    /**
     * associationType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public void setAssociationType(DSAssociationTypeCodePropertyType value) {
        this.associationType = value;
    }

    public boolean isSetAssociationType() {
        return (this.associationType!= null);
    }

    /**
     * initiativeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public DSInitiativeTypeCodePropertyType getInitiativeType() {
        return initiativeType;
    }

    /**
     * initiativeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public void setInitiativeType(DSInitiativeTypeCodePropertyType value) {
        this.initiativeType = value;
    }

    public boolean isSetInitiativeType() {
        return (this.initiativeType!= null);
    }

}
