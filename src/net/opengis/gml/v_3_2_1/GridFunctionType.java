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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GridFunctionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GridFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceRule" type="{http://www.opengis.net/gml/3.2}SequenceRuleType" minOccurs="0"/>
 *         &lt;element name="startPoint" type="{http://www.opengis.net/gml/3.2}integerList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridFunctionType", propOrder = {
    "sequenceRule",
    "startPoint"
})
public class GridFunctionType {

    protected SequenceRuleType sequenceRule;
    @XmlList
    @XmlSchemaType(name = "anySimpleType")
    protected List<BigInteger> startPoint;

    /**
     * sequenceRule 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRuleType }
     *     
     */
    public SequenceRuleType getSequenceRule() {
        return sequenceRule;
    }

    /**
     * sequenceRule 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRuleType }
     *     
     */
    public void setSequenceRule(SequenceRuleType value) {
        this.sequenceRule = value;
    }

    public boolean isSetSequenceRule() {
        return (this.sequenceRule!= null);
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getStartPoint() {
        if (startPoint == null) {
            startPoint = new ArrayList<BigInteger>();
        }
        return this.startPoint;
    }

    public boolean isSetStartPoint() {
        return ((this.startPoint!= null)&&(!this.startPoint.isEmpty()));
    }

    public void unsetStartPoint() {
        this.startPoint = null;
    }

}
