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
import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RecordPropertyType;


/**
 * <p>MD_Georeferenceable_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_Georeferenceable_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type">
 *       &lt;sequence>
 *         &lt;element name="controlPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="orientationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="orientationParameterDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="georeferencedParameters" type="{http://www.isotc211.org/2005/gco}Record_PropertyType"/>
 *         &lt;element name="parameterCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georeferenceable_Type", propOrder = {
    "controlPointAvailability",
    "orientationParameterAvailability",
    "orientationParameterDescription",
    "georeferencedParameters",
    "parameterCitation"
})
public class MDGeoreferenceableType
    extends MDGridSpatialRepresentationType
{

    @XmlElement(required = true)
    protected BooleanPropertyType controlPointAvailability;
    @XmlElement(required = true)
    protected BooleanPropertyType orientationParameterAvailability;
    protected CharacterStringPropertyType orientationParameterDescription;
    @XmlElement(required = true)
    protected RecordPropertyType georeferencedParameters;
    protected List<CICitationPropertyType> parameterCitation;

    /**
     * controlPointAvailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getControlPointAvailability() {
        return controlPointAvailability;
    }

    /**
     * controlPointAvailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setControlPointAvailability(BooleanPropertyType value) {
        this.controlPointAvailability = value;
    }

    public boolean isSetControlPointAvailability() {
        return (this.controlPointAvailability!= null);
    }

    /**
     * orientationParameterAvailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getOrientationParameterAvailability() {
        return orientationParameterAvailability;
    }

    /**
     * orientationParameterAvailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setOrientationParameterAvailability(BooleanPropertyType value) {
        this.orientationParameterAvailability = value;
    }

    public boolean isSetOrientationParameterAvailability() {
        return (this.orientationParameterAvailability!= null);
    }

    /**
     * orientationParameterDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrientationParameterDescription() {
        return orientationParameterDescription;
    }

    /**
     * orientationParameterDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrientationParameterDescription(CharacterStringPropertyType value) {
        this.orientationParameterDescription = value;
    }

    public boolean isSetOrientationParameterDescription() {
        return (this.orientationParameterDescription!= null);
    }

    /**
     * georeferencedParameters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RecordPropertyType }
     *     
     */
    public RecordPropertyType getGeoreferencedParameters() {
        return georeferencedParameters;
    }

    /**
     * georeferencedParameters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordPropertyType }
     *     
     */
    public void setGeoreferencedParameters(RecordPropertyType value) {
        this.georeferencedParameters = value;
    }

    public boolean isSetGeoreferencedParameters() {
        return (this.georeferencedParameters!= null);
    }

    /**
     * Gets the value of the parameterCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getParameterCitation() {
        if (parameterCitation == null) {
            parameterCitation = new ArrayList<CICitationPropertyType>();
        }
        return this.parameterCitation;
    }

    public boolean isSetParameterCitation() {
        return ((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()));
    }

    public void unsetParameterCitation() {
        this.parameterCitation = null;
    }

}
