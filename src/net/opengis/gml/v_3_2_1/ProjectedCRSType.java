//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProjectedCRSType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="ProjectedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}baseGeodeticCRS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}baseGeographicCRS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectedCRSType", propOrder = {
    "baseGeodeticCRS",
    "baseGeographicCRS",
    "cartesianCS"
})
public class ProjectedCRSType
    extends AbstractGeneralDerivedCRSType
{

    protected GeodeticCRSPropertyType baseGeodeticCRS;
    protected GeographicCRSPropertyType baseGeographicCRS;
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;

    /**
     * baseGeodeticCRS �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link GeodeticCRSPropertyType }
     *     
     */
    public GeodeticCRSPropertyType getBaseGeodeticCRS() {
        return baseGeodeticCRS;
    }

    /**
     * baseGeodeticCRS �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticCRSPropertyType }
     *     
     */
    public void setBaseGeodeticCRS(GeodeticCRSPropertyType value) {
        this.baseGeodeticCRS = value;
    }

    public boolean isSetBaseGeodeticCRS() {
        return (this.baseGeodeticCRS!= null);
    }

    /**
     * baseGeographicCRS �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCRSPropertyType }
     *     
     */
    public GeographicCRSPropertyType getBaseGeographicCRS() {
        return baseGeographicCRS;
    }

    /**
     * baseGeographicCRS �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCRSPropertyType }
     *     
     */
    public void setBaseGeographicCRS(GeographicCRSPropertyType value) {
        this.baseGeographicCRS = value;
    }

    public boolean isSetBaseGeographicCRS() {
        return (this.baseGeographicCRS!= null);
    }

    /**
     * cartesianCS �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<CartesianCSPropertyType> getCartesianCS() {
        return cartesianCS;
    }

    /**
     * cartesianCS �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public void setCartesianCS(JAXBElement<CartesianCSPropertyType> value) {
        this.cartesianCS = value;
    }

    public boolean isSetCartesianCS() {
        return (this.cartesianCS!= null);
    }

}
