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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ParameterValueType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ParameterValueType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralParameterValueType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}value"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}dmsAngleValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}stringValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}integerValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}booleanValue"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}valueList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}integerValueList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}valueFile"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}operationParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueType", propOrder = {
    "value",
    "dmsAngleValue",
    "stringValue",
    "integerValue",
    "booleanValue",
    "valueList",
    "integerValueList",
    "valueFile",
    "operationParameter"
})
public class ParameterValueType
    extends AbstractGeneralParameterValueType
{

    protected MeasureType value;
    protected DMSAngleType dmsAngleValue;
    protected String stringValue;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger integerValue;
    protected java.lang.Boolean booleanValue;
    protected MeasureListType valueList;
    @XmlList
    @XmlSchemaType(name = "anySimpleType")
    protected List<BigInteger> integerValueList;
    @XmlSchemaType(name = "anyURI")
    protected String valueFile;
    @XmlElementRef(name = "operationParameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<OperationParameterPropertyType> operationParameter;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setValue(MeasureType value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * dmsAngleValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DMSAngleType }
     *     
     */
    public DMSAngleType getDmsAngleValue() {
        return dmsAngleValue;
    }

    /**
     * dmsAngleValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSAngleType }
     *     
     */
    public void setDmsAngleValue(DMSAngleType value) {
        this.dmsAngleValue = value;
    }

    public boolean isSetDmsAngleValue() {
        return (this.dmsAngleValue!= null);
    }

    /**
     * stringValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * stringValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    public boolean isSetStringValue() {
        return (this.stringValue!= null);
    }

    /**
     * integerValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerValue() {
        return integerValue;
    }

    /**
     * integerValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerValue(BigInteger value) {
        this.integerValue = value;
    }

    public boolean isSetIntegerValue() {
        return (this.integerValue!= null);
    }

    /**
     * booleanValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * booleanValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setBooleanValue(java.lang.Boolean value) {
        this.booleanValue = value;
    }

    public boolean isSetBooleanValue() {
        return (this.booleanValue!= null);
    }

    /**
     * valueList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MeasureListType }
     *     
     */
    public MeasureListType getValueList() {
        return valueList;
    }

    /**
     * valueList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureListType }
     *     
     */
    public void setValueList(MeasureListType value) {
        this.valueList = value;
    }

    public boolean isSetValueList() {
        return (this.valueList!= null);
    }

    /**
     * Gets the value of the integerValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getIntegerValueList() {
        if (integerValueList == null) {
            integerValueList = new ArrayList<BigInteger>();
        }
        return this.integerValueList;
    }

    public boolean isSetIntegerValueList() {
        return ((this.integerValueList!= null)&&(!this.integerValueList.isEmpty()));
    }

    public void unsetIntegerValueList() {
        this.integerValueList = null;
    }

    /**
     * valueFile 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFile() {
        return valueFile;
    }

    /**
     * valueFile 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFile(String value) {
        this.valueFile = value;
    }

    public boolean isSetValueFile() {
        return (this.valueFile!= null);
    }

    /**
     * operationParameter 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     
     */
    public JAXBElement<OperationParameterPropertyType> getOperationParameter() {
        return operationParameter;
    }

    /**
     * operationParameter 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}
     *     
     */
    public void setOperationParameter(JAXBElement<OperationParameterPropertyType> value) {
        this.operationParameter = value;
    }

    public boolean isSetOperationParameter() {
        return (this.operationParameter!= null);
    }

}
