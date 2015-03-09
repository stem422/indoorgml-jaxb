//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.indoorgml.navigation.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.CurvePropertyType;
import net.opengis.indoorgml.core.v_1_0.TransitionPropertyType;


/**
 * <p>RouteSegmentType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="RouteSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="connects" type="{http://www.opengis.net/indoorgml/1.0/navigation}RouteNodePropertyType" maxOccurs="2" minOccurs="2"/>
 *         &lt;element name="referencedTransition" type="{http://www.opengis.net/indoorgml/1.0/core}TransitionPropertyType"/>
 *         &lt;element name="geometry" type="{http://www.opengis.net/gml/3.2}CurvePropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteSegmentType", propOrder = {
    "weight",
    "connects",
    "referencedTransition",
    "geometry"
})
public class RouteSegmentType
    extends AbstractFeatureType
{

    protected double weight;
    @XmlElement(required = true)
    protected List<RouteNodePropertyType> connects;
    @XmlElement(required = true)
    protected TransitionPropertyType referencedTransition;
    @XmlElement(required = true)
    protected CurvePropertyType geometry;

    /**
     * weight �Ӽ��� ���� �����ɴϴ�.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * weight �Ӽ��� ���� �����մϴ�.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    public boolean isSetWeight() {
        return true;
    }

    /**
     * Gets the value of the connects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteNodePropertyType }
     * 
     * 
     */
    public List<RouteNodePropertyType> getConnects() {
        if (connects == null) {
            connects = new ArrayList<RouteNodePropertyType>();
        }
        return this.connects;
    }

    public boolean isSetConnects() {
        return ((this.connects!= null)&&(!this.connects.isEmpty()));
    }

    public void unsetConnects() {
        this.connects = null;
    }

    /**
     * referencedTransition �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TransitionPropertyType }
     *     
     */
    public TransitionPropertyType getReferencedTransition() {
        return referencedTransition;
    }

    /**
     * referencedTransition �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionPropertyType }
     *     
     */
    public void setReferencedTransition(TransitionPropertyType value) {
        this.referencedTransition = value;
    }

    public boolean isSetReferencedTransition() {
        return (this.referencedTransition!= null);
    }

    /**
     * geometry �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getGeometry() {
        return geometry;
    }

    /**
     * geometry �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setGeometry(CurvePropertyType value) {
        this.geometry = value;
    }

    public boolean isSetGeometry() {
        return (this.geometry!= null);
    }

}
