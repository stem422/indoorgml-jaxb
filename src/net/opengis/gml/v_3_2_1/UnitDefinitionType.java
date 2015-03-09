//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UnitDefinitionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="UnitDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}quantityType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}quantityTypeReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}catalogSymbol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDefinitionType", propOrder = {
    "quantityType",
    "quantityTypeReference",
    "catalogSymbol"
})
@XmlSeeAlso({
    BaseUnitType.class,
    ConventionalUnitType.class,
    DerivedUnitType.class
})
public class UnitDefinitionType
    extends DefinitionType
{

    protected StringOrRefType quantityType;
    protected ReferenceType quantityTypeReference;
    protected CodeType catalogSymbol;

    /**
     * quantityType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getQuantityType() {
        return quantityType;
    }

    /**
     * quantityType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setQuantityType(StringOrRefType value) {
        this.quantityType = value;
    }

    public boolean isSetQuantityType() {
        return (this.quantityType!= null);
    }

    /**
     * quantityTypeReference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getQuantityTypeReference() {
        return quantityTypeReference;
    }

    /**
     * quantityTypeReference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setQuantityTypeReference(ReferenceType value) {
        this.quantityTypeReference = value;
    }

    public boolean isSetQuantityTypeReference() {
        return (this.quantityTypeReference!= null);
    }

    /**
     * catalogSymbol 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCatalogSymbol() {
        return catalogSymbol;
    }

    /**
     * catalogSymbol 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCatalogSymbol(CodeType value) {
        this.catalogSymbol = value;
    }

    public boolean isSetCatalogSymbol() {
        return (this.catalogSymbol!= null);
    }

}
