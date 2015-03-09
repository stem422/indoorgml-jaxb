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
import net.opengis.gml.v_3_2_1.AbstractFeatureMemberType;


/**
 * <p>RouteNodeMemberType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="RouteNodeMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/indoorgml/1.0/navigation}RouteNode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteNodeMemberType", propOrder = {
    "routeNode"
})
public class RouteNodeMemberType
    extends AbstractFeatureMemberType
{

    @XmlElement(name = "RouteNode", required = true)
    protected RouteNodeType routeNode;

    /**
     * routeNode �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link RouteNodeType }
     *     
     */
    public RouteNodeType getRouteNode() {
        return routeNode;
    }

    /**
     * routeNode �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteNodeType }
     *     
     */
    public void setRouteNode(RouteNodeType value) {
        this.routeNode = value;
    }

    public boolean isSetRouteNode() {
        return (this.routeNode!= null);
    }

}
