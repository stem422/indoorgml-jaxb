//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The method for identifying a temporal position is specific to each temporal reference system.  gml:TimePositionType supports the description of temporal position according to the subtypes described in ISO 19108.
 * Values based on calendars and clocks use lexical formats that are based on ISO 8601, as described in XML Schema Part 2:2001. A decimal value may be used with coordinate systems such as GPS time or UNIX time. A URI may be used to provide a reference to some era in an ordinal reference system . 
 * In common with many of the components modelled as data types in the ISO 19100 series of International Standards, the corresponding GML component has simple content. However, the content model gml:TimePositionType is defined in several steps.
 * Three XML attributes appear on gml:TimePositionType:
 * A time value shall be associated with a temporal reference system through the frame attribute that provides a URI reference that identifies a description of the reference system. Following ISO 19108, the Gregorian calendar with UTC is the default reference system, but others may also be used. Components for describing temporal reference systems are described in 14.4, but it is not required that the reference system be described in this, as the reference may refer to anything that may be indentified with a URI.  
 * For time values using a calendar containing more than one era, the (optional) calendarEraName attribute provides the name of the calendar era.  
 * Inexact temporal positions may be expressed using the optional indeterminatePosition attribute.  This takes a value from an enumeration.
 * 
 * <p>TimePositionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TimePositionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml/3.2>TimePositionUnion">
 *       &lt;attribute name="frame" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="#ISO-8601" />
 *       &lt;attribute name="calendarEraName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="indeterminatePosition" type="{http://www.opengis.net/gml/3.2}TimeIndeterminateValueType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePositionType", propOrder = {
    "value"
})
public class TimePositionType {

    @XmlValue
    protected List<String> value;
    @XmlAttribute(name = "frame")
    @XmlSchemaType(name = "anyURI")
    protected String frame;
    @XmlAttribute(name = "calendarEraName")
    protected String calendarEraName;
    @XmlAttribute(name = "indeterminatePosition")
    protected TimeIndeterminateValueType indeterminatePosition;

    /**
     * The simple type gml:TimePositionUnion is a union of XML Schema simple types which instantiate the subtypes for temporal position described in ISO 19108.
     *  An ordinal era may be referenced via URI.  A decimal value may be used to indicate the distance from the scale origin .  time is used for a position that recurs daily (see ISO 19108:2002 5.4.4.2).
     *  Finally, calendar and clock forms that support the representation of time in systems based on years, months, days, hours, minutes and seconds, in a notation following ISO 8601, are assembled by gml:CalDate Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
    }

    /**
     * frame 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        if (frame == null) {
            return "#ISO-8601";
        } else {
            return frame;
        }
    }

    /**
     * frame 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    public boolean isSetFrame() {
        return (this.frame!= null);
    }

    /**
     * calendarEraName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarEraName() {
        return calendarEraName;
    }

    /**
     * calendarEraName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarEraName(String value) {
        this.calendarEraName = value;
    }

    public boolean isSetCalendarEraName() {
        return (this.calendarEraName!= null);
    }

    /**
     * indeterminatePosition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TimeIndeterminateValueType }
     *     
     */
    public TimeIndeterminateValueType getIndeterminatePosition() {
        return indeterminatePosition;
    }

    /**
     * indeterminatePosition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIndeterminateValueType }
     *     
     */
    public void setIndeterminatePosition(TimeIndeterminateValueType value) {
        this.indeterminatePosition = value;
    }

    public boolean isSetIndeterminatePosition() {
        return (this.indeterminatePosition!= null);
    }

}
