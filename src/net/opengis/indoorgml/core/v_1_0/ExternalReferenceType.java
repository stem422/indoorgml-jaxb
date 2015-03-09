//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExternalReferenceType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informationSystem" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="externalObject" type="{http://www.opengis.net/indoorgml/1.0/core}externalObjectReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferenceType", propOrder = {
    "informationSystem",
    "externalObject"
})
public class ExternalReferenceType {

    @XmlSchemaType(name = "anyURI")
    protected String informationSystem;
    @XmlElement(required = true)
    protected ExternalObjectReferenceType externalObject;

    /**
     * informationSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationSystem() {
        return informationSystem;
    }

    /**
     * informationSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationSystem(String value) {
        this.informationSystem = value;
    }

    public boolean isSetInformationSystem() {
        return (this.informationSystem!= null);
    }

    /**
     * externalObject 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExternalObjectReferenceType }
     *     
     */
    public ExternalObjectReferenceType getExternalObject() {
        return externalObject;
    }

    /**
     * externalObject 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalObjectReferenceType }
     *     
     */
    public void setExternalObject(ExternalObjectReferenceType value) {
        this.externalObject = value;
    }

    public boolean isSetExternalObject() {
        return (this.externalObject!= null);
    }

}
