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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FileType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeParameters"/>
 *         &lt;choice>
 *           &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="fileReference" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;element name="fileStructure" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="compression" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileType", propOrder = {
    "rangeParameters",
    "fileName",
    "fileReference",
    "fileStructure",
    "mimeType",
    "compression"
})
public class FileType {

    @XmlElement(required = true)
    protected AssociationRoleType rangeParameters;
    @XmlSchemaType(name = "anyURI")
    protected String fileName;
    @XmlSchemaType(name = "anyURI")
    protected String fileReference;
    @XmlElement(required = true)
    protected CodeType fileStructure;
    @XmlSchemaType(name = "anyURI")
    protected String mimeType;
    @XmlSchemaType(name = "anyURI")
    protected String compression;

    /**
     * rangeParameters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AssociationRoleType }
     *     
     */
    public AssociationRoleType getRangeParameters() {
        return rangeParameters;
    }

    /**
     * rangeParameters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationRoleType }
     *     
     */
    public void setRangeParameters(AssociationRoleType value) {
        this.rangeParameters = value;
    }

    public boolean isSetRangeParameters() {
        return (this.rangeParameters!= null);
    }

    /**
     * fileName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * fileName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    public boolean isSetFileName() {
        return (this.fileName!= null);
    }

    /**
     * fileReference 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileReference() {
        return fileReference;
    }

    /**
     * fileReference 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileReference(String value) {
        this.fileReference = value;
    }

    public boolean isSetFileReference() {
        return (this.fileReference!= null);
    }

    /**
     * fileStructure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFileStructure() {
        return fileStructure;
    }

    /**
     * fileStructure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFileStructure(CodeType value) {
        this.fileStructure = value;
    }

    public boolean isSetFileStructure() {
        return (this.fileStructure!= null);
    }

    /**
     * mimeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * mimeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    public boolean isSetMimeType() {
        return (this.mimeType!= null);
    }

    /**
     * compression 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompression() {
        return compression;
    }

    /**
     * compression 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompression(String value) {
        this.compression = value;
    }

    public boolean isSetCompression() {
        return (this.compression!= null);
    }

}
