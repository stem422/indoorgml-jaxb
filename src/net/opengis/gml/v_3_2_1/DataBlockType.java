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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataBlockType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DataBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeParameters"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}tupleList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}doubleOrNilReasonTupleList"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataBlockType", propOrder = {
    "rangeParameters",
    "tupleList",
    "doubleOrNilReasonTupleList"
})
public class DataBlockType {

    @XmlElement(required = true)
    protected AssociationRoleType rangeParameters;
    protected CoordinatesType tupleList;
    @XmlList
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> doubleOrNilReasonTupleList;

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
     * tupleList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getTupleList() {
        return tupleList;
    }

    /**
     * tupleList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setTupleList(CoordinatesType value) {
        this.tupleList = value;
    }

    public boolean isSetTupleList() {
        return (this.tupleList!= null);
    }

    /**
     * Gets the value of the doubleOrNilReasonTupleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doubleOrNilReasonTupleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoubleOrNilReasonTupleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDoubleOrNilReasonTupleList() {
        if (doubleOrNilReasonTupleList == null) {
            doubleOrNilReasonTupleList = new ArrayList<String>();
        }
        return this.doubleOrNilReasonTupleList;
    }

    public boolean isSetDoubleOrNilReasonTupleList() {
        return ((this.doubleOrNilReasonTupleList!= null)&&(!this.doubleOrNilReasonTupleList.isEmpty()));
    }

    public void unsetDoubleOrNilReasonTupleList() {
        this.doubleOrNilReasonTupleList = null;
    }

}
