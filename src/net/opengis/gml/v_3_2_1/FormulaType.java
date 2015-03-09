//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FormulaType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FormulaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormulaType", propOrder = {
    "a",
    "b",
    "c",
    "d"
})
public class FormulaType {

    protected Double a;
    protected double b;
    protected double c;
    protected Double d;

    /**
     * a 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getA() {
        return a;
    }

    /**
     * a 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setA(Double value) {
        this.a = value;
    }

    public boolean isSetA() {
        return (this.a!= null);
    }

    /**
     * b 속성의 값을 가져옵니다.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * b 속성의 값을 설정합니다.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

    public boolean isSetB() {
        return true;
    }

    /**
     * c 속성의 값을 가져옵니다.
     * 
     */
    public double getC() {
        return c;
    }

    /**
     * c 속성의 값을 설정합니다.
     * 
     */
    public void setC(double value) {
        this.c = value;
    }

    public boolean isSetC() {
        return true;
    }

    /**
     * d 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getD() {
        return d;
    }

    /**
     * d 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setD(Double value) {
        this.d = value;
    }

    public boolean isSetD() {
        return (this.d!= null);
    }

}
