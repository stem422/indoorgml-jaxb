//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AffinePlacementType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AffinePlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.opengis.net/gml/3.2}DirectPositionType"/>
 *         &lt;element name="refDirection" type="{http://www.opengis.net/gml/3.2}VectorType" maxOccurs="unbounded"/>
 *         &lt;element name="inDimension" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="outDimension" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinePlacementType", propOrder = {
    "location",
    "refDirection",
    "inDimension",
    "outDimension"
})
public class AffinePlacementType {

    @XmlElement(required = true)
    protected DirectPositionType location;
    @XmlElement(required = true)
    protected List<VectorType> refDirection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger inDimension;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger outDimension;

    /**
     * location 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setLocation(DirectPositionType value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the refDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VectorType }
     * 
     * 
     */
    public List<VectorType> getRefDirection() {
        if (refDirection == null) {
            refDirection = new ArrayList<VectorType>();
        }
        return this.refDirection;
    }

    public boolean isSetRefDirection() {
        return ((this.refDirection!= null)&&(!this.refDirection.isEmpty()));
    }

    public void unsetRefDirection() {
        this.refDirection = null;
    }

    /**
     * inDimension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInDimension() {
        return inDimension;
    }

    /**
     * inDimension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInDimension(BigInteger value) {
        this.inDimension = value;
    }

    public boolean isSetInDimension() {
        return (this.inDimension!= null);
    }

    /**
     * outDimension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutDimension() {
        return outDimension;
    }

    /**
     * outDimension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutDimension(BigInteger value) {
        this.outDimension = value;
    }

    public boolean isSetOutDimension() {
        return (this.outDimension!= null);
    }

}
