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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="inverseFlattening" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="semiMinorAxis" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="isSphere" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inverseFlattening",
    "semiMinorAxis",
    "isSphere"
})
@XmlRootElement(name = "SecondDefiningParameter")
public class SecondDefiningParameterElement {

    protected MeasureType inverseFlattening;
    protected LengthType semiMinorAxis;
    @XmlElement(defaultValue = "true")
    protected java.lang.Boolean isSphere;

    /**
     * inverseFlattening 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getInverseFlattening() {
        return inverseFlattening;
    }

    /**
     * inverseFlattening 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setInverseFlattening(MeasureType value) {
        this.inverseFlattening = value;
    }

    public boolean isSetInverseFlattening() {
        return (this.inverseFlattening!= null);
    }

    /**
     * semiMinorAxis 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSemiMinorAxis() {
        return semiMinorAxis;
    }

    /**
     * semiMinorAxis 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSemiMinorAxis(LengthType value) {
        this.semiMinorAxis = value;
    }

    public boolean isSetSemiMinorAxis() {
        return (this.semiMinorAxis!= null);
    }

    /**
     * isSphere 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isIsSphere() {
        return isSphere;
    }

    /**
     * isSphere 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setIsSphere(java.lang.Boolean value) {
        this.isSphere = value;
    }

    public boolean isSetIsSphere() {
        return (this.isSphere!= null);
    }

}
