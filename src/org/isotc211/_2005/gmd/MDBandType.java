//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;
import org.isotc211._2005.gco.UomLengthPropertyType;


/**
 * <p>MD_Band_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_Band_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_RangeDimension_Type">
 *       &lt;sequence>
 *         &lt;element name="maxValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.isotc211.org/2005/gco}UomLength_PropertyType" minOccurs="0"/>
 *         &lt;element name="peakResponse" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="bitsPerValue" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="toneGradation" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="scaleFactor" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Band_Type", propOrder = {
    "maxValue",
    "minValue",
    "units",
    "peakResponse",
    "bitsPerValue",
    "toneGradation",
    "scaleFactor",
    "offset"
})
public class MDBandType
    extends MDRangeDimensionType
{

    protected RealPropertyType maxValue;
    protected RealPropertyType minValue;
    protected UomLengthPropertyType units;
    protected RealPropertyType peakResponse;
    protected IntegerPropertyType bitsPerValue;
    protected IntegerPropertyType toneGradation;
    protected RealPropertyType scaleFactor;
    protected RealPropertyType offset;

    /**
     * maxValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaxValue() {
        return maxValue;
    }

    /**
     * maxValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaxValue(RealPropertyType value) {
        this.maxValue = value;
    }

    public boolean isSetMaxValue() {
        return (this.maxValue!= null);
    }

    /**
     * minValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinValue() {
        return minValue;
    }

    /**
     * minValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinValue(RealPropertyType value) {
        this.minValue = value;
    }

    public boolean isSetMinValue() {
        return (this.minValue!= null);
    }

    /**
     * units 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public UomLengthPropertyType getUnits() {
        return units;
    }

    /**
     * units 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public void setUnits(UomLengthPropertyType value) {
        this.units = value;
    }

    public boolean isSetUnits() {
        return (this.units!= null);
    }

    /**
     * peakResponse 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getPeakResponse() {
        return peakResponse;
    }

    /**
     * peakResponse 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setPeakResponse(RealPropertyType value) {
        this.peakResponse = value;
    }

    public boolean isSetPeakResponse() {
        return (this.peakResponse!= null);
    }

    /**
     * bitsPerValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getBitsPerValue() {
        return bitsPerValue;
    }

    /**
     * bitsPerValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setBitsPerValue(IntegerPropertyType value) {
        this.bitsPerValue = value;
    }

    public boolean isSetBitsPerValue() {
        return (this.bitsPerValue!= null);
    }

    /**
     * toneGradation 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getToneGradation() {
        return toneGradation;
    }

    /**
     * toneGradation 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setToneGradation(IntegerPropertyType value) {
        this.toneGradation = value;
    }

    public boolean isSetToneGradation() {
        return (this.toneGradation!= null);
    }

    /**
     * scaleFactor 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getScaleFactor() {
        return scaleFactor;
    }

    /**
     * scaleFactor 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setScaleFactor(RealPropertyType value) {
        this.scaleFactor = value;
    }

    public boolean isSetScaleFactor() {
        return (this.scaleFactor!= null);
    }

    /**
     * offset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getOffset() {
        return offset;
    }

    /**
     * offset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setOffset(RealPropertyType value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
    }

}
