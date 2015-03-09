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
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * <p>LI_Source_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="LI_Source_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="scaleDenominator" type="{http://www.isotc211.org/2005/gmd}MD_RepresentativeFraction_PropertyType" minOccurs="0"/>
 *         &lt;element name="sourceReferenceSystem" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" minOccurs="0"/>
 *         &lt;element name="sourceCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="sourceExtent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sourceStep" type="{http://www.isotc211.org/2005/gmd}LI_ProcessStep_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_Source_Type", propOrder = {
    "description",
    "scaleDenominator",
    "sourceReferenceSystem",
    "sourceCitation",
    "sourceExtent",
    "sourceStep"
})
public class LISourceType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType description;
    protected MDRepresentativeFractionPropertyType scaleDenominator;
    protected MDReferenceSystemPropertyType sourceReferenceSystem;
    protected CICitationPropertyType sourceCitation;
    protected List<EXExtentPropertyType> sourceExtent;
    protected List<LIProcessStepPropertyType> sourceStep;

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * scaleDenominator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getScaleDenominator() {
        return scaleDenominator;
    }

    /**
     * scaleDenominator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setScaleDenominator(MDRepresentativeFractionPropertyType value) {
        this.scaleDenominator = value;
    }

    public boolean isSetScaleDenominator() {
        return (this.scaleDenominator!= null);
    }

    /**
     * sourceReferenceSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public MDReferenceSystemPropertyType getSourceReferenceSystem() {
        return sourceReferenceSystem;
    }

    /**
     * sourceReferenceSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDReferenceSystemPropertyType }
     *     
     */
    public void setSourceReferenceSystem(MDReferenceSystemPropertyType value) {
        this.sourceReferenceSystem = value;
    }

    public boolean isSetSourceReferenceSystem() {
        return (this.sourceReferenceSystem!= null);
    }

    /**
     * sourceCitation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getSourceCitation() {
        return sourceCitation;
    }

    /**
     * sourceCitation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setSourceCitation(CICitationPropertyType value) {
        this.sourceCitation = value;
    }

    public boolean isSetSourceCitation() {
        return (this.sourceCitation!= null);
    }

    /**
     * Gets the value of the sourceExtent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceExtent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXExtentPropertyType }
     * 
     * 
     */
    public List<EXExtentPropertyType> getSourceExtent() {
        if (sourceExtent == null) {
            sourceExtent = new ArrayList<EXExtentPropertyType>();
        }
        return this.sourceExtent;
    }

    public boolean isSetSourceExtent() {
        return ((this.sourceExtent!= null)&&(!this.sourceExtent.isEmpty()));
    }

    public void unsetSourceExtent() {
        this.sourceExtent = null;
    }

    /**
     * Gets the value of the sourceStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIProcessStepPropertyType }
     * 
     * 
     */
    public List<LIProcessStepPropertyType> getSourceStep() {
        if (sourceStep == null) {
            sourceStep = new ArrayList<LIProcessStepPropertyType>();
        }
        return this.sourceStep;
    }

    public boolean isSetSourceStep() {
        return ((this.sourceStep!= null)&&(!this.sourceStep.isEmpty()));
    }

    public void unsetSourceStep() {
        this.sourceStep = null;
    }

}
