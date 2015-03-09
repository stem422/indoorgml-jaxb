//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceBoundaryType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceType;
import net.opengis.indoorgml.core.v_1_0.EdgesType;
import net.opengis.indoorgml.core.v_1_0.IndoorFeaturesType;
import net.opengis.indoorgml.core.v_1_0.InterEdgesType;
import net.opengis.indoorgml.core.v_1_0.InterLayerConnectionType;
import net.opengis.indoorgml.core.v_1_0.MultiLayeredGraphType;
import net.opengis.indoorgml.core.v_1_0.NodesType;
import net.opengis.indoorgml.core.v_1_0.PrimalSpaceFeaturesType;
import net.opengis.indoorgml.core.v_1_0.SpaceLayerType;
import net.opengis.indoorgml.core.v_1_0.SpaceLayersType;
import net.opengis.indoorgml.core.v_1_0.StateType;
import net.opengis.indoorgml.core.v_1_0.TransitionType;
import net.opengis.indoorgml.navigation.v_1_0.PathType;
import net.opengis.indoorgml.navigation.v_1_0.RouteNodeType;
import net.opengis.indoorgml.navigation.v_1_0.RouteNodesType;
import net.opengis.indoorgml.navigation.v_1_0.RouteSegmentType;
import net.opengis.indoorgml.navigation.v_1_0.RouteType;


/**
 * The basic feature model is given by the gml:AbstractFeatureType.
 * The content model for gml:AbstractFeatureType adds two specific properties suitable for geographic features to the content model defined in gml:AbstractGMLType. 
 * The value of the gml:boundedBy property describes an envelope that encloses the entire feature instance, and is primarily useful for supporting rapid searching for features that occur in a particular location. 
 * The value of the gml:location property describes the extent, position or relative location of the feature.
 * 
 * <p>AbstractFeatureType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "boundedBy",
    "location"
})
@XmlSeeAlso({
    RouteNodeType.class,
    CellSpaceBoundaryType.class,
    RouteSegmentType.class,
    RouteType.class,
    CellSpaceType.class,
    RouteNodesType.class,
    PathType.class,
    ObservationType.class,
    DynamicFeatureType.class,
    AbstractCoverageType.class,
    AbstractFeatureCollectionType.class,
    BoundedFeatureType.class,
    IndoorFeaturesType.class,
    StateType.class,
    PrimalSpaceFeaturesType.class,
    TransitionType.class,
    SpaceLayerType.class,
    InterLayerConnectionType.class,
    MultiLayeredGraphType.class,
    InterEdgesType.class,
    EdgesType.class,
    SpaceLayersType.class,
    NodesType.class
})
public abstract class AbstractFeatureType
    extends AbstractGMLType
{

    @XmlElement(nillable = true)
    protected BoundingShapeType boundedBy;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocationPropertyType> location;

    /**
     * boundedBy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BoundingShapeType }
     *     
     */
    public BoundingShapeType getBoundedBy() {
        return boundedBy;
    }

    /**
     * boundedBy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingShapeType }
     *     
     */
    public void setBoundedBy(BoundingShapeType value) {
        this.boundedBy = value;
    }

    public boolean isSetBoundedBy() {
        return (this.boundedBy!= null);
    }

    /**
     * location 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends LocationPropertyType> getLocation() {
        return location;
    }

    /**
     * location 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

}
