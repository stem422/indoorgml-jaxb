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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AggregationType;
import net.opengis.gml.v_3_2_1.FeaturePropertyType;


/**
 * <p>PrimalSpaceFeaturesType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="PrimalSpaceFeaturesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="cellSpaceMember" type="{http://www.opengis.net/gml/3.2}FeaturePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cellSpaceBoundaryMember" type="{http://www.opengis.net/gml/3.2}FeaturePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimalSpaceFeaturesType", propOrder = {
    "cellSpaceMember",
    "cellSpaceBoundaryMember"
})
public class PrimalSpaceFeaturesType
    extends AbstractFeatureType
{

    protected List<FeaturePropertyType> cellSpaceMember;
    protected List<FeaturePropertyType> cellSpaceBoundaryMember;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the cellSpaceMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellSpaceMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellSpaceMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getCellSpaceMember() {
        if (cellSpaceMember == null) {
            cellSpaceMember = new ArrayList<FeaturePropertyType>();
        }
        return this.cellSpaceMember;
    }

    public boolean isSetCellSpaceMember() {
        return ((this.cellSpaceMember!= null)&&(!this.cellSpaceMember.isEmpty()));
    }

    public void unsetCellSpaceMember() {
        this.cellSpaceMember = null;
    }

    /**
     * Gets the value of the cellSpaceBoundaryMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellSpaceBoundaryMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellSpaceBoundaryMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getCellSpaceBoundaryMember() {
        if (cellSpaceBoundaryMember == null) {
            cellSpaceBoundaryMember = new ArrayList<FeaturePropertyType>();
        }
        return this.cellSpaceBoundaryMember;
    }

    public boolean isSetCellSpaceBoundaryMember() {
        return ((this.cellSpaceBoundaryMember!= null)&&(!this.cellSpaceBoundaryMember.isEmpty()));
    }

    public void unsetCellSpaceBoundaryMember() {
        this.cellSpaceBoundaryMember = null;
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

}
