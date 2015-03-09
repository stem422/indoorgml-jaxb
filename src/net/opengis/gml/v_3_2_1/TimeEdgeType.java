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
 * <p>TimeEdgeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TimeEdgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeTopologyPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="start" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType"/>
 *         &lt;element name="end" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType"/>
 *         &lt;element name="extent" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeEdgeType", propOrder = {
    "start",
    "end",
    "extent"
})
public class TimeEdgeType
    extends AbstractTimeTopologyPrimitiveType
{

    @XmlElement(required = true)
    protected TimeNodePropertyType start;
    @XmlElement(required = true)
    protected TimeNodePropertyType end;
    protected TimePeriodPropertyType extent;

    /**
     * start 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getStart() {
        return start;
    }

    /**
     * start 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setStart(TimeNodePropertyType value) {
        this.start = value;
    }

    public boolean isSetStart() {
        return (this.start!= null);
    }

    /**
     * end 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getEnd() {
        return end;
    }

    /**
     * end 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setEnd(TimeNodePropertyType value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * extent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getExtent() {
        return extent;
    }

    /**
     * extent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setExtent(TimePeriodPropertyType value) {
        this.extent = value;
    }

    public boolean isSetExtent() {
        return (this.extent!= null);
    }

}
