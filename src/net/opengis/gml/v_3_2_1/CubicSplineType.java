//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CubicSplineType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CubicSplineType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice maxOccurs="unbounded" minOccurs="2">
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="vectorAtStart" type="{http://www.opengis.net/gml/3.2}VectorType"/>
 *         &lt;element name="vectorAtEnd" type="{http://www.opengis.net/gml/3.2}VectorType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="cubicSpline" />
 *       &lt;attribute name="degree" type="{http://www.w3.org/2001/XMLSchema}integer" fixed="3" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CubicSplineType", propOrder = {
    "posOrPointPropertyOrPointRep",
    "posList",
    "coordinates",
    "vectorAtStart",
    "vectorAtEnd"
})
public class CubicSplineType
    extends AbstractCurveSegmentType
{

    @XmlElementRefs({
        @XmlElementRef(name = "pointProperty", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pointRep", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pos", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> posOrPointPropertyOrPointRep;
    protected DirectPositionListType posList;
    protected CoordinatesType coordinates;
    @XmlElement(required = true)
    protected VectorType vectorAtStart;
    @XmlElement(required = true)
    protected VectorType vectorAtEnd;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "interpolation")
    public final static CurveInterpolationType INTERPOLATION = CurveInterpolationType.CUBIC_SPLINE;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "degree")
    public final static BigInteger DEGREE = new BigInteger("3");

    /**
     * Gets the value of the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOrPointPropertyOrPointRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosOrPointPropertyOrPointRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPosOrPointPropertyOrPointRep() {
        if (posOrPointPropertyOrPointRep == null) {
            posOrPointPropertyOrPointRep = new ArrayList<JAXBElement<?>>();
        }
        return this.posOrPointPropertyOrPointRep;
    }

    public boolean isSetPosOrPointPropertyOrPointRep() {
        return ((this.posOrPointPropertyOrPointRep!= null)&&(!this.posOrPointPropertyOrPointRep.isEmpty()));
    }

    public void unsetPosOrPointPropertyOrPointRep() {
        this.posOrPointPropertyOrPointRep = null;
    }

    /**
     * posList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * posList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    public boolean isSetPosList() {
        return (this.posList!= null);
    }

    /**
     * coordinates 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * coordinates 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    public boolean isSetCoordinates() {
        return (this.coordinates!= null);
    }

    /**
     * vectorAtStart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getVectorAtStart() {
        return vectorAtStart;
    }

    /**
     * vectorAtStart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setVectorAtStart(VectorType value) {
        this.vectorAtStart = value;
    }

    public boolean isSetVectorAtStart() {
        return (this.vectorAtStart!= null);
    }

    /**
     * vectorAtEnd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getVectorAtEnd() {
        return vectorAtEnd;
    }

    /**
     * vectorAtEnd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setVectorAtEnd(VectorType value) {
        this.vectorAtEnd = value;
    }

    public boolean isSetVectorAtEnd() {
        return (this.vectorAtEnd!= null);
    }

}
