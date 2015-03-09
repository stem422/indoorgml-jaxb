//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gco;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AngleType;
import net.opengis.gml.v_3_2_1.LengthType;
import net.opengis.gml.v_3_2_1.MeasureType;
import net.opengis.gml.v_3_2_1.ScaleType;


/**
 * <p>Measure_PropertyType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Measure_PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gco}Measure"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Measure_PropertyType", propOrder = {
    "measure"
})
public class MeasurePropertyType {

    @XmlElementRef(name = "Measure", namespace = "http://www.isotc211.org/2005/gco", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends MeasureType> measure;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;

    /**
     * measure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScaleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     
     */
    public JAXBElement<? extends MeasureType> getMeasure() {
        return measure;
    }

    /**
     * measure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ScaleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AngleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LengthType }{@code >}
     *     
     */
    public void setMeasure(JAXBElement<? extends MeasureType> value) {
        this.measure = value;
    }

    public boolean isSetMeasure() {
        return (this.measure!= null);
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    public boolean isSetNilReason() {
        return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
    }

    public void unsetNilReason() {
        this.nilReason = null;
    }

}
