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
 * <p>GeodeticDatumType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="GeodeticDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractDatumType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}primeMeridian"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}ellipsoid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeodeticDatumType", propOrder = {
    "primeMeridian",
    "ellipsoid"
})
public class GeodeticDatumType
    extends AbstractDatumType
{

    @XmlElementRef(name = "primeMeridian", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<PrimeMeridianPropertyType> primeMeridian;
    @XmlElementRef(name = "ellipsoid", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EllipsoidPropertyType> ellipsoid;

    /**
     * primeMeridian �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     */
    public JAXBElement<PrimeMeridianPropertyType> getPrimeMeridian() {
        return primeMeridian;
    }

    /**
     * primeMeridian �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}
     *     
     */
    public void setPrimeMeridian(JAXBElement<PrimeMeridianPropertyType> value) {
        this.primeMeridian = value;
    }

    public boolean isSetPrimeMeridian() {
        return (this.primeMeridian!= null);
    }

    /**
     * ellipsoid �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     */
    public JAXBElement<EllipsoidPropertyType> getEllipsoid() {
        return ellipsoid;
    }

    /**
     * ellipsoid �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}
     *     
     */
    public void setEllipsoid(JAXBElement<EllipsoidPropertyType> value) {
        this.ellipsoid = value;
    }

    public boolean isSetEllipsoid() {
        return (this.ellipsoid!= null);
    }

}
