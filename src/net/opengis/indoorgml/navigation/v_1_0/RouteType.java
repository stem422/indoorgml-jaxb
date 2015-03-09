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


/**
 * <p>RouteType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * startRouteNode �Ӽ��� ���� �����ɴϴ�.
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
     * startRouteNode �Ӽ��� ���� �����մϴ�.
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
     * endRouteNode �Ӽ��� ���� �����ɴϴ�.
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
     * endRouteNode �Ӽ��� ���� �����մϴ�.
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
     * routeNodes �Ӽ��� ���� �����ɴϴ�.
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
     * routeNodes �Ӽ��� ���� �����մϴ�.
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
     * path �Ӽ��� ���� �����ɴϴ�.
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
     * path �Ӽ��� ���� �����մϴ�.
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
