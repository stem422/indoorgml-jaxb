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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The gml:SequenceRuleType is derived from the gml:SequenceRuleEnumeration through the addition of an axisOrder attribute.  The gml:SequenceRuleEnumeration is an enumerated type. The rule names are defined in ISO 19123. If no rule name is specified the default is "Linear".
 * 
 * <p>SequenceRuleType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SequenceRuleType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opengis.net/gml/3.2>SequenceRuleEnumeration">
 *       &lt;attribute name="order" type="{http://www.opengis.net/gml/3.2}IncrementOrder" />
 *       &lt;attribute name="axisOrder" type="{http://www.opengis.net/gml/3.2}AxisDirectionList" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRuleType", propOrder = {
    "value"
})
public class SequenceRuleType {

    @XmlValue
    protected SequenceRuleEnumeration value;
    @XmlAttribute(name = "order")
    protected IncrementOrder order;
    @XmlAttribute(name = "axisOrder")
    protected List<String> axisOrder;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRuleEnumeration }
     *     
     */
    public SequenceRuleEnumeration getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRuleEnumeration }
     *     
     */
    public void setValue(SequenceRuleEnumeration value) {
        this.value = value;
    }

    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * order 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IncrementOrder }
     *     
     */
    public IncrementOrder getOrder() {
        return order;
    }

    /**
     * order 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IncrementOrder }
     *     
     */
    public void setOrder(IncrementOrder value) {
        this.order = value;
    }

    public boolean isSetOrder() {
        return (this.order!= null);
    }

    /**
     * Gets the value of the axisOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAxisOrder() {
        if (axisOrder == null) {
            axisOrder = new ArrayList<String>();
        }
        return this.axisOrder;
    }

    public boolean isSetAxisOrder() {
        return ((this.axisOrder!= null)&&(!this.axisOrder.isEmpty()));
    }

    public void unsetAxisOrder() {
        this.axisOrder = null;
    }

}
