//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;


/**
 * <p>IndoorFeaturesType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="IndoorFeaturesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="primalSpaceFeatures" type="{http://www.opengis.net/indoorgml/1.0/core}PrimalSpaceFeaturesPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/indoorgml/1.0/core}MultiLayeredGraph"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndoorFeaturesType", propOrder = {
    "primalSpaceFeatures",
    "multiLayeredGraph"
})
public class IndoorFeaturesType
    extends AbstractFeatureType
{

    protected PrimalSpaceFeaturesPropertyType primalSpaceFeatures;
    @XmlElement(name = "MultiLayeredGraph", required = true)
    protected MultiLayeredGraphType multiLayeredGraph;

    /**
     * primalSpaceFeatures �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link PrimalSpaceFeaturesPropertyType }
     *     
     */
    public PrimalSpaceFeaturesPropertyType getPrimalSpaceFeatures() {
        return primalSpaceFeatures;
    }

    /**
     * primalSpaceFeatures �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimalSpaceFeaturesPropertyType }
     *     
     */
    public void setPrimalSpaceFeatures(PrimalSpaceFeaturesPropertyType value) {
        this.primalSpaceFeatures = value;
    }

    public boolean isSetPrimalSpaceFeatures() {
        return (this.primalSpaceFeatures!= null);
    }

    /**
     * multiLayeredGraph �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MultiLayeredGraphType }
     *     
     */
    public MultiLayeredGraphType getMultiLayeredGraph() {
        return multiLayeredGraph;
    }

    /**
     * multiLayeredGraph �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLayeredGraphType }
     *     
     */
    public void setMultiLayeredGraph(MultiLayeredGraphType value) {
        this.multiLayeredGraph = value;
    }

    public boolean isSetMultiLayeredGraph() {
        return (this.multiLayeredGraph!= null);
    }

}
