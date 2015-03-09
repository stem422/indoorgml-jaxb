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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EngineeringCRSType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EngineeringCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cylindricalCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}linearCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}polarCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}userDefinedCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}engineeringDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
    "affineCS",
    "cartesianCS",
    "cylindricalCS",
    "linearCS",
    "polarCS",
    "sphericalCS",
    "userDefinedCS",
    "coordinateSystem",
    "engineeringDatum"
})
public class EngineeringCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    protected CylindricalCSPropertyType cylindricalCS;
    protected LinearCSPropertyType linearCS;
    protected PolarCSPropertyType polarCS;
    @XmlElementRef(name = "sphericalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SphericalCSPropertyType> sphericalCS;
    protected UserDefinedCSPropertyType userDefinedCS;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;
    @XmlElementRef(name = "engineeringDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EngineeringDatumPropertyType> engineeringDatum;

    /**
     * affineCS 속성의 값을 가져옵니다.
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
     * affineCS 속성의 값을 설정합니다.
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
     * cartesianCS 속성의 값을 가져옵니다.
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
     * cartesianCS 속성의 값을 설정합니다.
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
     * cylindricalCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public CylindricalCSPropertyType getCylindricalCS() {
        return cylindricalCS;
    }

    /**
     * cylindricalCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public void setCylindricalCS(CylindricalCSPropertyType value) {
        this.cylindricalCS = value;
    }

    public boolean isSetCylindricalCS() {
        return (this.cylindricalCS!= null);
    }

    /**
     * linearCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public LinearCSPropertyType getLinearCS() {
        return linearCS;
    }

    /**
     * linearCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public void setLinearCS(LinearCSPropertyType value) {
        this.linearCS = value;
    }

    public boolean isSetLinearCS() {
        return (this.linearCS!= null);
    }

    /**
     * polarCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public PolarCSPropertyType getPolarCS() {
        return polarCS;
    }

    /**
     * polarCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public void setPolarCS(PolarCSPropertyType value) {
        this.polarCS = value;
    }

    public boolean isSetPolarCS() {
        return (this.polarCS!= null);
    }

    /**
     * sphericalCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<SphericalCSPropertyType> getSphericalCS() {
        return sphericalCS;
    }

    /**
     * sphericalCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public void setSphericalCS(JAXBElement<SphericalCSPropertyType> value) {
        this.sphericalCS = value;
    }

    public boolean isSetSphericalCS() {
        return (this.sphericalCS!= null);
    }

    /**
     * userDefinedCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public UserDefinedCSPropertyType getUserDefinedCS() {
        return userDefinedCS;
    }

    /**
     * userDefinedCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public void setUserDefinedCS(UserDefinedCSPropertyType value) {
        this.userDefinedCS = value;
    }

    public boolean isSetUserDefinedCS() {
        return (this.userDefinedCS!= null);
    }

    /**
     * coordinateSystem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<CoordinateSystemPropertyType> getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * coordinateSystem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public void setCoordinateSystem(JAXBElement<CoordinateSystemPropertyType> value) {
        this.coordinateSystem = value;
    }

    public boolean isSetCoordinateSystem() {
        return (this.coordinateSystem!= null);
    }

    /**
     * engineeringDatum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<EngineeringDatumPropertyType> getEngineeringDatum() {
        return engineeringDatum;
    }

    /**
     * engineeringDatum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public void setEngineeringDatum(JAXBElement<EngineeringDatumPropertyType> value) {
        this.engineeringDatum = value;
    }

    public boolean isSetEngineeringDatum() {
        return (this.engineeringDatum!= null);
    }

}
