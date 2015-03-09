//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
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
 * <p>RouteSegmentType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
     * weight 속성의 값을 가져옵니다.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * weight 속성의 값을 설정합니다.
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
     * referencedTransition 속성의 값을 가져옵니다.
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
     * referencedTransition 속성의 값을 설정합니다.
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
     * geometry 속성의 값을 가져옵니다.
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
     * geometry 속성의 값을 설정합니다.
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
