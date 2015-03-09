//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.DecimalPropertyType;


/**
 * Geographic area of the entire dataset referenced to WGS 84
 * 
 * <p>EX_GeographicBoundingBox_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="EX_GeographicBoundingBox_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type">
 *       &lt;sequence>
 *         &lt;element name="westBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         &lt;element name="eastBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         &lt;element name="southBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         &lt;element name="northBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_GeographicBoundingBox_Type", propOrder = {
    "westBoundLongitude",
    "eastBoundLongitude",
    "southBoundLatitude",
    "northBoundLatitude"
})
public class EXGeographicBoundingBoxType
    extends AbstractEXGeographicExtentType
{

    @XmlElement(required = true)
    protected DecimalPropertyType westBoundLongitude;
    @XmlElement(required = true)
    protected DecimalPropertyType eastBoundLongitude;
    @XmlElement(required = true)
    protected DecimalPropertyType southBoundLatitude;
    @XmlElement(required = true)
    protected DecimalPropertyType northBoundLatitude;

    /**
     * westBoundLongitude 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * westBoundLongitude 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setWestBoundLongitude(DecimalPropertyType value) {
        this.westBoundLongitude = value;
    }

    public boolean isSetWestBoundLongitude() {
        return (this.westBoundLongitude!= null);
    }

    /**
     * eastBoundLongitude 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * eastBoundLongitude 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setEastBoundLongitude(DecimalPropertyType value) {
        this.eastBoundLongitude = value;
    }

    public boolean isSetEastBoundLongitude() {
        return (this.eastBoundLongitude!= null);
    }

    /**
     * southBoundLatitude 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * southBoundLatitude 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setSouthBoundLatitude(DecimalPropertyType value) {
        this.southBoundLatitude = value;
    }

    public boolean isSetSouthBoundLatitude() {
        return (this.southBoundLatitude!= null);
    }

    /**
     * northBoundLatitude 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * northBoundLatitude 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setNorthBoundLatitude(DecimalPropertyType value) {
        this.northBoundLatitude = value;
    }

    public boolean isSetNorthBoundLatitude() {
        return (this.northBoundLatitude!= null);
    }

}
