//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DatePropertyType;


/**
 * Standardized resource reference
 * 
 * <p>CI_Citation_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CI_Citation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="alternateTitle" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.isotc211.org/2005/gmd}CI_Date_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="edition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="editionDate" type="{http://www.isotc211.org/2005/gco}Date_PropertyType" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citedResponsibleParty" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="presentationForm" type="{http://www.isotc211.org/2005/gmd}CI_PresentationFormCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="series" type="{http://www.isotc211.org/2005/gmd}CI_Series_PropertyType" minOccurs="0"/>
 *         &lt;element name="otherCitationDetails" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="collectiveTitle" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="ISSN" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Citation_Type", propOrder = {
    "title",
    "alternateTitle",
    "date",
    "edition",
    "editionDate",
    "identifier",
    "citedResponsibleParty",
    "presentationForm",
    "series",
    "otherCitationDetails",
    "collectiveTitle",
    "isbn",
    "issn"
})
public class CICitationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType title;
    protected List<CharacterStringPropertyType> alternateTitle;
    @XmlElement(required = true)
    protected List<CIDatePropertyType> date;
    protected CharacterStringPropertyType edition;
    protected DatePropertyType editionDate;
    protected List<MDIdentifierPropertyType> identifier;
    protected List<CIResponsiblePartyPropertyType> citedResponsibleParty;
    protected List<CIPresentationFormCodePropertyType> presentationForm;
    protected CISeriesPropertyType series;
    protected CharacterStringPropertyType otherCitationDetails;
    protected CharacterStringPropertyType collectiveTitle;
    @XmlElement(name = "ISBN")
    protected CharacterStringPropertyType isbn;
    @XmlElement(name = "ISSN")
    protected CharacterStringPropertyType issn;

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTitle(CharacterStringPropertyType value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * Gets the value of the alternateTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getAlternateTitle() {
        if (alternateTitle == null) {
            alternateTitle = new ArrayList<CharacterStringPropertyType>();
        }
        return this.alternateTitle;
    }

    public boolean isSetAlternateTitle() {
        return ((this.alternateTitle!= null)&&(!this.alternateTitle.isEmpty()));
    }

    public void unsetAlternateTitle() {
        this.alternateTitle = null;
    }

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIDatePropertyType }
     * 
     * 
     */
    public List<CIDatePropertyType> getDate() {
        if (date == null) {
            date = new ArrayList<CIDatePropertyType>();
        }
        return this.date;
    }

    public boolean isSetDate() {
        return ((this.date!= null)&&(!this.date.isEmpty()));
    }

    public void unsetDate() {
        this.date = null;
    }

    /**
     * edition 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEdition() {
        return edition;
    }

    /**
     * edition 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEdition(CharacterStringPropertyType value) {
        this.edition = value;
    }

    public boolean isSetEdition() {
        return (this.edition!= null);
    }

    /**
     * editionDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getEditionDate() {
        return editionDate;
    }

    /**
     * editionDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setEditionDate(DatePropertyType value) {
        this.editionDate = value;
    }

    public boolean isSetEditionDate() {
        return (this.editionDate!= null);
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIdentifierPropertyType }
     * 
     * 
     */
    public List<MDIdentifierPropertyType> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<MDIdentifierPropertyType>();
        }
        return this.identifier;
    }

    public boolean isSetIdentifier() {
        return ((this.identifier!= null)&&(!this.identifier.isEmpty()));
    }

    public void unsetIdentifier() {
        this.identifier = null;
    }

    /**
     * Gets the value of the citedResponsibleParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citedResponsibleParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitedResponsibleParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getCitedResponsibleParty() {
        if (citedResponsibleParty == null) {
            citedResponsibleParty = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.citedResponsibleParty;
    }

    public boolean isSetCitedResponsibleParty() {
        return ((this.citedResponsibleParty!= null)&&(!this.citedResponsibleParty.isEmpty()));
    }

    public void unsetCitedResponsibleParty() {
        this.citedResponsibleParty = null;
    }

    /**
     * Gets the value of the presentationForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentationForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIPresentationFormCodePropertyType }
     * 
     * 
     */
    public List<CIPresentationFormCodePropertyType> getPresentationForm() {
        if (presentationForm == null) {
            presentationForm = new ArrayList<CIPresentationFormCodePropertyType>();
        }
        return this.presentationForm;
    }

    public boolean isSetPresentationForm() {
        return ((this.presentationForm!= null)&&(!this.presentationForm.isEmpty()));
    }

    public void unsetPresentationForm() {
        this.presentationForm = null;
    }

    /**
     * series 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CISeriesPropertyType }
     *     
     */
    public CISeriesPropertyType getSeries() {
        return series;
    }

    /**
     * series 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CISeriesPropertyType }
     *     
     */
    public void setSeries(CISeriesPropertyType value) {
        this.series = value;
    }

    public boolean isSetSeries() {
        return (this.series!= null);
    }

    /**
     * otherCitationDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOtherCitationDetails() {
        return otherCitationDetails;
    }

    /**
     * otherCitationDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOtherCitationDetails(CharacterStringPropertyType value) {
        this.otherCitationDetails = value;
    }

    public boolean isSetOtherCitationDetails() {
        return (this.otherCitationDetails!= null);
    }

    /**
     * collectiveTitle 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCollectiveTitle() {
        return collectiveTitle;
    }

    /**
     * collectiveTitle 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCollectiveTitle(CharacterStringPropertyType value) {
        this.collectiveTitle = value;
    }

    public boolean isSetCollectiveTitle() {
        return (this.collectiveTitle!= null);
    }

    /**
     * isbn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getISBN() {
        return isbn;
    }

    /**
     * isbn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setISBN(CharacterStringPropertyType value) {
        this.isbn = value;
    }

    public boolean isSetISBN() {
        return (this.isbn!= null);
    }

    /**
     * issn 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getISSN() {
        return issn;
    }

    /**
     * issn 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setISSN(CharacterStringPropertyType value) {
        this.issn = value;
    }

    public boolean isSetISSN() {
        return (this.issn!= null);
    }

}
