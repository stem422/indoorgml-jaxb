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


/**
 * Keywords, their type and reference source
 * 
 * <p>MD_Keywords_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_Keywords_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="keyword" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="type" type="{http://www.isotc211.org/2005/gmd}MD_KeywordTypeCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="thesaurusName" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Keywords_Type", propOrder = {
    "keyword",
    "type",
    "thesaurusName"
})
public class MDKeywordsType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> keyword;
    protected MDKeywordTypeCodePropertyType type;
    protected CICitationPropertyType thesaurusName;

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<CharacterStringPropertyType>();
        }
        return this.keyword;
    }

    public boolean isSetKeyword() {
        return ((this.keyword!= null)&&(!this.keyword.isEmpty()));
    }

    public void unsetKeyword() {
        this.keyword = null;
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public MDKeywordTypeCodePropertyType getType() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDKeywordTypeCodePropertyType }
     *     
     */
    public void setType(MDKeywordTypeCodePropertyType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * thesaurusName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getThesaurusName() {
        return thesaurusName;
    }

    /**
     * thesaurusName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setThesaurusName(CICitationPropertyType value) {
        this.thesaurusName = value;
    }

    public boolean isSetThesaurusName() {
        return (this.thesaurusName!= null);
    }

}
