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
import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * quantitative_result from Quality Procedures -  - renamed to remove implied use limitiation.
 * 
 * <p>DQ_ConformanceResult_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DQ_ConformanceResult_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractDQ_Result_Type">
 *       &lt;sequence>
 *         &lt;element name="specification" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType"/>
 *         &lt;element name="explanation" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="pass" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_ConformanceResult_Type", propOrder = {
    "specification",
    "explanation",
    "pass"
})
public class DQConformanceResultType
    extends AbstractDQResultType
{

    @XmlElement(required = true)
    protected CICitationPropertyType specification;
    @XmlElement(required = true)
    protected CharacterStringPropertyType explanation;
    @XmlElement(required = true)
    protected BooleanPropertyType pass;

    /**
     * specification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getSpecification() {
        return specification;
    }

    /**
     * specification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setSpecification(CICitationPropertyType value) {
        this.specification = value;
    }

    public boolean isSetSpecification() {
        return (this.specification!= null);
    }

    /**
     * explanation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getExplanation() {
        return explanation;
    }

    /**
     * explanation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setExplanation(CharacterStringPropertyType value) {
        this.explanation = value;
    }

    public boolean isSetExplanation() {
        return (this.explanation!= null);
    }

    /**
     * pass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getPass() {
        return pass;
    }

    /**
     * pass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setPass(BooleanPropertyType value) {
        this.pass = value;
    }

    public boolean isSetPass() {
        return (this.pass!= null);
    }

}
