//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.indoorgml.navigation.v_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;


/**
 * <p>RouteType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RouteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="startRouteNode" type="{http://www.opengis.net/indoorgml/1.0/navigation}RouteNodePropertyType"/>
 *         &lt;element name="endRouteNode" type="{http://www.opengis.net/indoorgml/1.0/navigation}RouteNodePropertyType"/>
 *         &lt;element name="routeNodes" type="{http://www.opengis.net/indoorgml/1.0/navigation}RouteNodesType"/>
 *         &lt;element name="path" type="{http://www.opengis.net/indoorgml/1.0/navigation}PathType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteType", propOrder = {
    "startRouteNode",
    "endRouteNode",
    "routeNodes",
    "path"
})
public class RouteType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected RouteNodePropertyType startRouteNode;
    @XmlElement(required = true)
    protected RouteNodePropertyType endRouteNode;
    @XmlElement(required = true)
    protected RouteNodesType routeNodes;
    @XmlElement(required = true)
    protected PathType path;

    /**
     * startRouteNode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodePropertyType }
     *     
     */
    public RouteNodePropertyType getStartRouteNode() {
        return startRouteNode;
    }

    /**
     * startRouteNode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodePropertyType }
     *     
     */
    public void setStartRouteNode(RouteNodePropertyType value) {
        this.startRouteNode = value;
    }

    public boolean isSetStartRouteNode() {
        return (this.startRouteNode!= null);
    }

    /**
     * endRouteNode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodePropertyType }
     *     
     */
    public RouteNodePropertyType getEndRouteNode() {
        return endRouteNode;
    }

    /**
     * endRouteNode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodePropertyType }
     *     
     */
    public void setEndRouteNode(RouteNodePropertyType value) {
        this.endRouteNode = value;
    }

    public boolean isSetEndRouteNode() {
        return (this.endRouteNode!= null);
    }

    /**
     * routeNodes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodesType }
     *     
     */
    public RouteNodesType getRouteNodes() {
        return routeNodes;
    }

    /**
     * routeNodes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodesType }
     *     
     */
    public void setRouteNodes(RouteNodesType value) {
        this.routeNodes = value;
    }

    public boolean isSetRouteNodes() {
        return (this.routeNodes!= null);
    }

    /**
     * path 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PathType }
     *     
     */
    public PathType getPath() {
        return path;
    }

    /**
     * path 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PathType }
     *     
     */
    public void setPath(PathType value) {
        this.path = value;
    }

    public boolean isSetPath() {
        return (this.path!= null);
    }

}
