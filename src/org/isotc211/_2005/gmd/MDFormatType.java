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
 * Description of the form of the data to be distributed
 * 
 * <p>MD_Format_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_Format_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="version" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="amendmentNumber" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="specification" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="fileDecompressionTechnique" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="formatDistributor" type="{http://www.isotc211.org/2005/gmd}MD_Distributor_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Format_Type", propOrder = {
    "name",
    "version",
    "amendmentNumber",
    "specification",
    "fileDecompressionTechnique",
    "formatDistributor"
})
public class MDFormatType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType name;
    @XmlElement(required = true)
    protected CharacterStringPropertyType version;
    protected CharacterStringPropertyType amendmentNumber;
    protected CharacterStringPropertyType specification;
    protected CharacterStringPropertyType fileDecompressionTechnique;
    protected List<MDDistributorPropertyType> formatDistributor;

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * version 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getVersion() {
        return version;
    }

    /**
     * version 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setVersion(CharacterStringPropertyType value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

    /**
     * amendmentNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAmendmentNumber() {
        return amendmentNumber;
    }

    /**
     * amendmentNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAmendmentNumber(CharacterStringPropertyType value) {
        this.amendmentNumber = value;
    }

    public boolean isSetAmendmentNumber() {
        return (this.amendmentNumber!= null);
    }

    /**
     * specification 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSpecification() {
        return specification;
    }

    /**
     * specification 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSpecification(CharacterStringPropertyType value) {
        this.specification = value;
    }

    public boolean isSetSpecification() {
        return (this.specification!= null);
    }

    /**
     * fileDecompressionTechnique 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileDecompressionTechnique() {
        return fileDecompressionTechnique;
    }

    /**
     * fileDecompressionTechnique 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileDecompressionTechnique(CharacterStringPropertyType value) {
        this.fileDecompressionTechnique = value;
    }

    public boolean isSetFileDecompressionTechnique() {
        return (this.fileDecompressionTechnique!= null);
    }

    /**
     * Gets the value of the formatDistributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatDistributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatDistributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDistributorPropertyType }
     * 
     * 
     */
    public List<MDDistributorPropertyType> getFormatDistributor() {
        if (formatDistributor == null) {
            formatDistributor = new ArrayList<MDDistributorPropertyType>();
        }
        return this.formatDistributor;
    }

    public boolean isSetFormatDistributor() {
        return ((this.formatDistributor!= null)&&(!this.formatDistributor.isEmpty()));
    }

    public void unsetFormatDistributor() {
        this.formatDistributor = null;
    }

}
