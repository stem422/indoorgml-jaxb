//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
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
 * <p>PrimalSpaceFeaturesType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
     * aggregationType 속성의 값을 가져옵니다.
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
     * aggregationType 속성의 값을 설정합니다.
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
