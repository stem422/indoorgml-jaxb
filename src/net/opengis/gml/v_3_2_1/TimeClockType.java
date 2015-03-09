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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TimeClockType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TimeClockType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;element name="referenceEvent" type="{http://www.opengis.net/gml/3.2}StringOrRefType"/>
 *         &lt;element name="referenceTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="utcReference" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="dateBasis" type="{http://www.opengis.net/gml/3.2}TimeCalendarPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeClockType", propOrder = {
    "referenceEvent",
    "referenceTime",
    "utcReference",
    "dateBasis"
})
public class TimeClockType
    extends TimeReferenceSystemType
{

    @XmlElement(required = true)
    protected StringOrRefType referenceEvent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar referenceTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar utcReference;
    protected List<TimeCalendarPropertyType> dateBasis;

    /**
     * referenceEvent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getReferenceEvent() {
        return referenceEvent;
    }

    /**
     * referenceEvent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setReferenceEvent(StringOrRefType value) {
        this.referenceEvent = value;
    }

    public boolean isSetReferenceEvent() {
        return (this.referenceEvent!= null);
    }

    /**
     * referenceTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferenceTime() {
        return referenceTime;
    }

    /**
     * referenceTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferenceTime(XMLGregorianCalendar value) {
        this.referenceTime = value;
    }

    public boolean isSetReferenceTime() {
        return (this.referenceTime!= null);
    }

    /**
     * utcReference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcReference() {
        return utcReference;
    }

    /**
     * utcReference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcReference(XMLGregorianCalendar value) {
        this.utcReference = value;
    }

    public boolean isSetUtcReference() {
        return (this.utcReference!= null);
    }

    /**
     * Gets the value of the dateBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeCalendarPropertyType }
     * 
     * 
     */
    public List<TimeCalendarPropertyType> getDateBasis() {
        if (dateBasis == null) {
            dateBasis = new ArrayList<TimeCalendarPropertyType>();
        }
        return this.dateBasis;
    }

    public boolean isSetDateBasis() {
        return ((this.dateBasis!= null)&&(!this.dateBasis.isEmpty()));
    }

    public void unsetDateBasis() {
        this.dateBasis = null;
    }

}
