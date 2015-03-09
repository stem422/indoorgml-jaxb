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
import org.isotc211._2005.gco.RealPropertyType;
import org.isotc211._2005.gsr.SCCRSPropertyType;


/**
 * Vertical domain of dataset
 * 
 * <p>EX_VerticalExtent_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EX_VerticalExtent_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="minimumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/>
 *         &lt;element name="maximumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/>
 *         &lt;element name="verticalCRS" type="{http://www.isotc211.org/2005/gsr}SC_CRS_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_VerticalExtent_Type", propOrder = {
    "minimumValue",
    "maximumValue",
    "verticalCRS"
})
public class EXVerticalExtentType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected RealPropertyType minimumValue;
    @XmlElement(required = true)
    protected RealPropertyType maximumValue;
    @XmlElement(required = true)
    protected SCCRSPropertyType verticalCRS;

    /**
     * minimumValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinimumValue() {
        return minimumValue;
    }

    /**
     * minimumValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinimumValue(RealPropertyType value) {
        this.minimumValue = value;
    }

    public boolean isSetMinimumValue() {
        return (this.minimumValue!= null);
    }

    /**
     * maximumValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaximumValue() {
        return maximumValue;
    }

    /**
     * maximumValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaximumValue(RealPropertyType value) {
        this.maximumValue = value;
    }

    public boolean isSetMaximumValue() {
        return (this.maximumValue!= null);
    }

    /**
     * verticalCRS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public SCCRSPropertyType getVerticalCRS() {
        return verticalCRS;
    }

    /**
     * verticalCRS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public void setVerticalCRS(SCCRSPropertyType value) {
        this.verticalCRS = value;
    }

    public boolean isSetVerticalCRS() {
        return (this.verticalCRS!= null);
    }

}
