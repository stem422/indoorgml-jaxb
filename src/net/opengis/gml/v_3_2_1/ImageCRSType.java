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
 * <p>ImageCRSType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="ImageCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesObliqueCartesianCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}imageDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCRSType", propOrder = {
    "cartesianCS",
    "affineCS",
    "usesObliqueCartesianCS",
    "imageDatum"
})
public class ImageCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    protected ObliqueCartesianCSPropertyType usesObliqueCartesianCS;
    @XmlElementRef(name = "imageDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<ImageDatumPropertyType> imageDatum;

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

    /**
     * affineCS �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<AffineCSPropertyType> getAffineCS() {
        return affineCS;
    }

    /**
     * affineCS �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public void setAffineCS(JAXBElement<AffineCSPropertyType> value) {
        this.affineCS = value;
    }

    public boolean isSetAffineCS() {
        return (this.affineCS!= null);
    }

    /**
     * usesObliqueCartesianCS �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS() {
        return usesObliqueCartesianCS;
    }

    /**
     * usesObliqueCartesianCS �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType value) {
        this.usesObliqueCartesianCS = value;
    }

    public boolean isSetUsesObliqueCartesianCS() {
        return (this.usesObliqueCartesianCS!= null);
    }

    /**
     * imageDatum �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<ImageDatumPropertyType> getImageDatum() {
        return imageDatum;
    }

    /**
     * imageDatum �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     */
    public void setImageDatum(JAXBElement<ImageDatumPropertyType> value) {
        this.imageDatum = value;
    }

    public boolean isSetImageDatum() {
        return (this.imageDatum!= null);
    }

}
