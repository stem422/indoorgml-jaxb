//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AggregationType;


/**
 * <p>NodesType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="NodesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="stateMember" type="{http://www.opengis.net/indoorgml/1.0/core}StateMemberType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodesType", propOrder = {
    "stateMember"
})
public class NodesType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected List<StateMemberType> stateMember;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the stateMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateMemberType }
     * 
     * 
     */
    public List<StateMemberType> getStateMember() {
        if (stateMember == null) {
            stateMember = new ArrayList<StateMemberType>();
        }
        return this.stateMember;
    }

    public boolean isSetStateMember() {
        return ((this.stateMember!= null)&&(!this.stateMember.isEmpty()));
    }

    public void unsetStateMember() {
        this.stateMember = null;
    }

    /**
     * aggregationType �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * aggregationType �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

    public boolean isSetAggregationType() {
        return (this.aggregationType!= null);
    }

    /**
     * owns �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * owns �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}
