//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.indoorgml.navigation.v_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.PointPropertyType;
import net.opengis.indoorgml.core.v_1_0.StatePropertyType;


/**
 * <p>RouteNodeType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="RouteNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="referencedState" type="{http://www.opengis.net/indoorgml/1.0/core}StatePropertyType"/>
 *         &lt;element name="geometry" type="{http://www.opengis.net/gml/3.2}PointPropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteNodeType", propOrder = {
    "referencedState",
    "geometry"
})
public class RouteNodeType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected StatePropertyType referencedState;
    @XmlElement(required = true)
    protected PointPropertyType geometry;

    /**
     * referencedState �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link StatePropertyType }
     *     
     */
    public StatePropertyType getReferencedState() {
        return referencedState;
    }

    /**
     * referencedState �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link StatePropertyType }
     *     
     */
    public void setReferencedState(StatePropertyType value) {
        this.referencedState = value;
    }

    public boolean isSetReferencedState() {
        return (this.referencedState!= null);
    }

    /**
     * geometry �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getGeometry() {
        return geometry;
    }

    /**
     * geometry �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setGeometry(PointPropertyType value) {
        this.geometry = value;
    }

    public boolean isSetGeometry() {
        return (this.geometry!= null);
    }

}
