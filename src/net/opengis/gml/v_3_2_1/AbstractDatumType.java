//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AbstractDatumType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AbstractDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}anchorDefinition" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}realizationEpoch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDatumType", propOrder = {
    "domainOfValidity",
    "scope",
    "anchorDefinition",
    "realizationEpoch"
})
@XmlSeeAlso({
    ImageDatumType.class,
    VerticalDatumType.class,
    GeodeticDatumType.class,
    EngineeringDatumType.class,
    TemporalDatumBaseType.class
})
public abstract class AbstractDatumType
    extends IdentifiedObjectType
{

    protected DomainOfValidityElement domainOfValidity;
    @XmlElement(required = true)
    protected List<String> scope;
    @XmlElementRef(name = "anchorDefinition", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeType> anchorDefinition;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar realizationEpoch;

    /**
     * domainOfValidity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DomainOfValidityElement }
     *     
     */
    public DomainOfValidityElement getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * domainOfValidity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainOfValidityElement }
     *     
     */
    public void setDomainOfValidity(DomainOfValidityElement value) {
        this.domainOfValidity = value;
    }

    public boolean isSetDomainOfValidity() {
        return (this.domainOfValidity!= null);
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScope() {
        if (scope == null) {
            scope = new ArrayList<String>();
        }
        return this.scope;
    }

    public boolean isSetScope() {
        return ((this.scope!= null)&&(!this.scope.isEmpty()));
    }

    public void unsetScope() {
        this.scope = null;
    }

    /**
     * anchorDefinition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getAnchorDefinition() {
        return anchorDefinition;
    }

    /**
     * anchorDefinition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public void setAnchorDefinition(JAXBElement<CodeType> value) {
        this.anchorDefinition = value;
    }

    public boolean isSetAnchorDefinition() {
        return (this.anchorDefinition!= null);
    }

    /**
     * realizationEpoch 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRealizationEpoch() {
        return realizationEpoch;
    }

    /**
     * realizationEpoch 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRealizationEpoch(XMLGregorianCalendar value) {
        this.realizationEpoch = value;
    }

    public boolean isSetRealizationEpoch() {
        return (this.realizationEpoch!= null);
    }

}
