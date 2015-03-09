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
 * <p>MovingObjectStatusType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MovingObjectStatusType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="position" type="{http://www.opengis.net/gml/3.2}GeometryPropertyType"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}locationName"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}locationReference"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}location"/>
 *         &lt;/choice>
 *         &lt;element name="speed" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         &lt;element name="bearing" type="{http://www.opengis.net/gml/3.2}DirectionPropertyType" minOccurs="0"/>
 *         &lt;element name="acceleration" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         &lt;element name="elevation" type="{http://www.opengis.net/gml/3.2}MeasureType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}status" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}statusReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovingObjectStatusType", propOrder = {
    "position",
    "pos",
    "locationName",
    "locationReference",
    "location",
    "speed",
    "bearing",
    "acceleration",
    "elevation",
    "status",
    "statusReference"
})
public class MovingObjectStatusType
    extends AbstractTimeSliceType
{

    protected GeometryPropertyType position;
    protected DirectPositionType pos;
    protected CodeType locationName;
    protected ReferenceType locationReference;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocationPropertyType> location;
    protected MeasureType speed;
    protected DirectionPropertyType bearing;
    protected MeasureType acceleration;
    protected MeasureType elevation;
    protected StringOrRefType status;
    protected ReferenceType statusReference;

    /**
     * position �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link GeometryPropertyType }
     *     
     */
    public GeometryPropertyType getPosition() {
        return position;
    }

    /**
     * position �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryPropertyType }
     *     
     */
    public void setPosition(GeometryPropertyType value) {
        this.position = value;
    }

    public boolean isSetPosition() {
        return (this.position!= null);
    }

    /**
     * pos �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * pos �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    public boolean isSetPos() {
        return (this.pos!= null);
    }

    /**
     * locationName �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getLocationName() {
        return locationName;
    }

    /**
     * locationName �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setLocationName(CodeType value) {
        this.locationName = value;
    }

    public boolean isSetLocationName() {
        return (this.locationName!= null);
    }

    /**
     * locationReference �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLocationReference() {
        return locationReference;
    }

    /**
     * locationReference �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLocationReference(ReferenceType value) {
        this.locationReference = value;
    }

    public boolean isSetLocationReference() {
        return (this.locationReference!= null);
    }

    /**
     * location �Ӽ��� ���� �����ɴϴ�.
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
     * location �Ӽ��� ���� �����մϴ�.
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

    /**
     * speed �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSpeed() {
        return speed;
    }

    /**
     * speed �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSpeed(MeasureType value) {
        this.speed = value;
    }

    public boolean isSetSpeed() {
        return (this.speed!= null);
    }

    /**
     * bearing �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DirectionPropertyType }
     *     
     */
    public DirectionPropertyType getBearing() {
        return bearing;
    }

    /**
     * bearing �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionPropertyType }
     *     
     */
    public void setBearing(DirectionPropertyType value) {
        this.bearing = value;
    }

    public boolean isSetBearing() {
        return (this.bearing!= null);
    }

    /**
     * acceleration �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAcceleration() {
        return acceleration;
    }

    /**
     * acceleration �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAcceleration(MeasureType value) {
        this.acceleration = value;
    }

    public boolean isSetAcceleration() {
        return (this.acceleration!= null);
    }

    /**
     * elevation �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getElevation() {
        return elevation;
    }

    /**
     * elevation �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setElevation(MeasureType value) {
        this.elevation = value;
    }

    public boolean isSetElevation() {
        return (this.elevation!= null);
    }

    /**
     * status �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getStatus() {
        return status;
    }

    /**
     * status �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setStatus(StringOrRefType value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * statusReference �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getStatusReference() {
        return statusReference;
    }

    /**
     * statusReference �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setStatusReference(ReferenceType value) {
        this.statusReference = value;
    }

    public boolean isSetStatusReference() {
        return (this.statusReference!= null);
    }

}
