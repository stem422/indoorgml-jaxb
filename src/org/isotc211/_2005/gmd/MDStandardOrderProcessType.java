//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;


/**
 * Common ways in which the dataset may be obtained or received, and related instructions and fee information
 * 
 * <p>MD_StandardOrderProcess_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_StandardOrderProcess_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="fees" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="plannedAvailableDateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/>
 *         &lt;element name="orderingInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="turnaround" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_StandardOrderProcess_Type", propOrder = {
    "fees",
    "plannedAvailableDateTime",
    "orderingInstructions",
    "turnaround"
})
public class MDStandardOrderProcessType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fees;
    protected DateTimePropertyType plannedAvailableDateTime;
    protected CharacterStringPropertyType orderingInstructions;
    protected CharacterStringPropertyType turnaround;

    /**
     * fees 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFees() {
        return fees;
    }

    /**
     * fees 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFees(CharacterStringPropertyType value) {
        this.fees = value;
    }

    public boolean isSetFees() {
        return (this.fees!= null);
    }

    /**
     * plannedAvailableDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getPlannedAvailableDateTime() {
        return plannedAvailableDateTime;
    }

    /**
     * plannedAvailableDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setPlannedAvailableDateTime(DateTimePropertyType value) {
        this.plannedAvailableDateTime = value;
    }

    public boolean isSetPlannedAvailableDateTime() {
        return (this.plannedAvailableDateTime!= null);
    }

    /**
     * orderingInstructions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrderingInstructions() {
        return orderingInstructions;
    }

    /**
     * orderingInstructions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrderingInstructions(CharacterStringPropertyType value) {
        this.orderingInstructions = value;
    }

    public boolean isSetOrderingInstructions() {
        return (this.orderingInstructions!= null);
    }

    /**
     * turnaround 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTurnaround() {
        return turnaround;
    }

    /**
     * turnaround 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTurnaround(CharacterStringPropertyType value) {
        this.turnaround = value;
    }

    public boolean isSetTurnaround() {
        return (this.turnaround!= null);
    }

}
