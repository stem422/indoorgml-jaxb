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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EdgeType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EdgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="container" type="{http://www.opengis.net/gml/3.2}TopoSolidPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedNode" maxOccurs="2" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedFace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}curveProperty" minOccurs="0"/>
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
@XmlType(name = "EdgeType", propOrder = {
    "container",
    "directedNode",
    "directedFace",
    "curveProperty"
})
public class EdgeType
    extends AbstractTopoPrimitiveType
{

    protected TopoSolidPropertyType container;
    @XmlElement(required = true)
    protected List<DirectedNodePropertyType> directedNode;
    protected List<DirectedFacePropertyType> directedFace;
    protected CurvePropertyType curveProperty;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * container 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TopoSolidPropertyType }
     *     
     */
    public TopoSolidPropertyType getContainer() {
        return container;
    }

    /**
     * container 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TopoSolidPropertyType }
     *     
     */
    public void setContainer(TopoSolidPropertyType value) {
        this.container = value;
    }

    public boolean isSetContainer() {
        return (this.container!= null);
    }

    /**
     * Gets the value of the directedNode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedNode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedNode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedNodePropertyType }
     * 
     * 
     */
    public List<DirectedNodePropertyType> getDirectedNode() {
        if (directedNode == null) {
            directedNode = new ArrayList<DirectedNodePropertyType>();
        }
        return this.directedNode;
    }

    public boolean isSetDirectedNode() {
        return ((this.directedNode!= null)&&(!this.directedNode.isEmpty()));
    }

    public void unsetDirectedNode() {
        this.directedNode = null;
    }

    /**
     * Gets the value of the directedFace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedFace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedFace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedFacePropertyType }
     * 
     * 
     */
    public List<DirectedFacePropertyType> getDirectedFace() {
        if (directedFace == null) {
            directedFace = new ArrayList<DirectedFacePropertyType>();
        }
        return this.directedFace;
    }

    public boolean isSetDirectedFace() {
        return ((this.directedFace!= null)&&(!this.directedFace.isEmpty()));
    }

    public void unsetDirectedFace() {
        this.directedFace = null;
    }

    /**
     * curveProperty 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getCurveProperty() {
        return curveProperty;
    }

    /**
     * curveProperty 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setCurveProperty(CurvePropertyType value) {
        this.curveProperty = value;
    }

    public boolean isSetCurveProperty() {
        return (this.curveProperty!= null);
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
