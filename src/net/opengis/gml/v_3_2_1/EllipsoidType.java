//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EllipsoidType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EllipsoidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}semiMajorAxis"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}secondDefiningParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EllipsoidType", propOrder = {
    "semiMajorAxis",
    "secondDefiningParameter"
})
public class EllipsoidType
    extends IdentifiedObjectType
{

    @XmlElement(required = true)
    protected MeasureType semiMajorAxis;
    @XmlElement(required = true)
    protected SecondDefiningParameterPropertyElement secondDefiningParameter;

    /**
     * semiMajorAxis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * semiMajorAxis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSemiMajorAxis(MeasureType value) {
        this.semiMajorAxis = value;
    }

    public boolean isSetSemiMajorAxis() {
        return (this.semiMajorAxis!= null);
    }

    /**
     * secondDefiningParameter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameterPropertyElement }
     *     
     */
    public SecondDefiningParameterPropertyElement getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * secondDefiningParameter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameterPropertyElement }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameterPropertyElement value) {
        this.secondDefiningParameter = value;
    }

    public boolean isSetSecondDefiningParameter() {
        return (this.secondDefiningParameter!= null);
    }

}
