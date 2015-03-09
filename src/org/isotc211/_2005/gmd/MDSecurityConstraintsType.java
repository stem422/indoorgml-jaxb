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
import org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * Handling restrictions imposed on the dataset because of national security, privacy, or other concerns
 * 
 * <p>MD_SecurityConstraints_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_SecurityConstraints_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type">
 *       &lt;sequence>
 *         &lt;element name="classification" type="{http://www.isotc211.org/2005/gmd}MD_ClassificationCode_PropertyType"/>
 *         &lt;element name="userNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="classificationSystem" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="handlingDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_SecurityConstraints_Type", propOrder = {
    "classification",
    "userNote",
    "classificationSystem",
    "handlingDescription"
})
public class MDSecurityConstraintsType
    extends MDConstraintsType
{

    @XmlElement(required = true)
    protected MDClassificationCodePropertyType classification;
    protected CharacterStringPropertyType userNote;
    protected CharacterStringPropertyType classificationSystem;
    protected CharacterStringPropertyType handlingDescription;

    /**
     * classification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public MDClassificationCodePropertyType getClassification() {
        return classification;
    }

    /**
     * classification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public void setClassification(MDClassificationCodePropertyType value) {
        this.classification = value;
    }

    public boolean isSetClassification() {
        return (this.classification!= null);
    }

    /**
     * userNote 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserNote() {
        return userNote;
    }

    /**
     * userNote 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserNote(CharacterStringPropertyType value) {
        this.userNote = value;
    }

    public boolean isSetUserNote() {
        return (this.userNote!= null);
    }

    /**
     * classificationSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getClassificationSystem() {
        return classificationSystem;
    }

    /**
     * classificationSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setClassificationSystem(CharacterStringPropertyType value) {
        this.classificationSystem = value;
    }

    public boolean isSetClassificationSystem() {
        return (this.classificationSystem!= null);
    }

    /**
     * handlingDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHandlingDescription() {
        return handlingDescription;
    }

    /**
     * handlingDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHandlingDescription(CharacterStringPropertyType value) {
        this.handlingDescription = value;
    }

    public boolean isSetHandlingDescription() {
        return (this.handlingDescription!= null);
    }

}
