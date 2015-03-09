//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeOrdinalEraType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="TimeOrdinalEraType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       &lt;sequence>
 *         &lt;element name="relatedTime" type="{http://www.opengis.net/gml/3.2}RelatedTimeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.opengis.net/gml/3.2}TimeNodePropertyType" minOccurs="0"/>
 *         &lt;element name="extent" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *         &lt;element name="member" type="{http://www.opengis.net/gml/3.2}TimeOrdinalEraPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeOrdinalEraType", propOrder = {
    "relatedTime",
    "start",
    "end",
    "extent",
    "member",
    "group"
})
public class TimeOrdinalEraType
    extends DefinitionType
{

    protected List<RelatedTimeType> relatedTime;
    protected TimeNodePropertyType start;
    protected TimeNodePropertyType end;
    protected TimePeriodPropertyType extent;
    protected List<TimeOrdinalEraPropertyType> member;
    protected ReferenceType group;

    /**
     * Gets the value of the relatedTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedTimeType }
     * 
     * 
     */
    public List<RelatedTimeType> getRelatedTime() {
        if (relatedTime == null) {
            relatedTime = new ArrayList<RelatedTimeType>();
        }
        return this.relatedTime;
    }

    public boolean isSetRelatedTime() {
        return ((this.relatedTime!= null)&&(!this.relatedTime.isEmpty()));
    }

    public void unsetRelatedTime() {
        this.relatedTime = null;
    }

    /**
     * start �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getStart() {
        return start;
    }

    /**
     * start �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setStart(TimeNodePropertyType value) {
        this.start = value;
    }

    public boolean isSetStart() {
        return (this.start!= null);
    }

    /**
     * end �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public TimeNodePropertyType getEnd() {
        return end;
    }

    /**
     * end �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeNodePropertyType }
     *     
     */
    public void setEnd(TimeNodePropertyType value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * extent �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getExtent() {
        return extent;
    }

    /**
     * extent �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setExtent(TimePeriodPropertyType value) {
        this.extent = value;
    }

    public boolean isSetExtent() {
        return (this.extent!= null);
    }

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeOrdinalEraPropertyType }
     * 
     * 
     */
    public List<TimeOrdinalEraPropertyType> getMember() {
        if (member == null) {
            member = new ArrayList<TimeOrdinalEraPropertyType>();
        }
        return this.member;
    }

    public boolean isSetMember() {
        return ((this.member!= null)&&(!this.member.isEmpty()));
    }

    public void unsetMember() {
        this.member = null;
    }

    /**
     * group �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getGroup() {
        return group;
    }

    /**
     * group �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setGroup(ReferenceType value) {
        this.group = value;
    }

    public boolean isSetGroup() {
        return (this.group!= null);
    }

}
