//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.SolidPropertyType;
import net.opengis.gml.v_3_2_1.SurfacePropertyType;
import net.opengis.indoorgml.navigation.v_1_0.NavigableSpaceType;


/**
 * <p>CellSpaceType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CellSpaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceGeometry" minOccurs="0"/>
 *         &lt;element name="duality" type="{http://www.opengis.net/indoorgml/1.0/core}StatePropertyType" minOccurs="0"/>
 *         &lt;element name="externalReference" type="{http://www.opengis.net/indoorgml/1.0/core}ExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partialboundedBy" type="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceBoundaryPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellSpaceType", propOrder = {
    "geometry3D",
    "geometry2D",
    "duality",
    "externalReference",
    "partialboundedBy"
})
@XmlSeeAlso({
    NavigableSpaceType.class
})
public class CellSpaceType
    extends AbstractFeatureType
{

    @XmlElement(name = "Geometry3D")
    protected SolidPropertyType geometry3D;
    @XmlElement(name = "Geometry2D")
    protected SurfacePropertyType geometry2D;
    protected StatePropertyType duality;
    protected List<ExternalReferenceType> externalReference;
    protected List<CellSpaceBoundaryPropertyType> partialboundedBy;

    /**
     * geometry3D 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SolidPropertyType }
     *     
     */
    public SolidPropertyType getGeometry3D() {
        return geometry3D;
    }

    /**
     * geometry3D 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidPropertyType }
     *     
     */
    public void setGeometry3D(SolidPropertyType value) {
        this.geometry3D = value;
    }

    public boolean isSetGeometry3D() {
        return (this.geometry3D!= null);
    }

    /**
     * geometry2D 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getGeometry2D() {
        return geometry2D;
    }

    /**
     * geometry2D 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setGeometry2D(SurfacePropertyType value) {
        this.geometry2D = value;
    }

    public boolean isSetGeometry2D() {
        return (this.geometry2D!= null);
    }

    /**
     * duality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link StatePropertyType }
     *     
     */
    public StatePropertyType getDuality() {
        return duality;
    }

    /**
     * duality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link StatePropertyType }
     *     
     */
    public void setDuality(StatePropertyType value) {
        this.duality = value;
    }

    public boolean isSetDuality() {
        return (this.duality!= null);
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReferenceType }
     * 
     * 
     */
    public List<ExternalReferenceType> getExternalReference() {
        if (externalReference == null) {
            externalReference = new ArrayList<ExternalReferenceType>();
        }
        return this.externalReference;
    }

    public boolean isSetExternalReference() {
        return ((this.externalReference!= null)&&(!this.externalReference.isEmpty()));
    }

    public void unsetExternalReference() {
        this.externalReference = null;
    }

    /**
     * Gets the value of the partialboundedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialboundedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartialboundedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellSpaceBoundaryPropertyType }
     * 
     * 
     */
    public List<CellSpaceBoundaryPropertyType> getPartialboundedBy() {
        if (partialboundedBy == null) {
            partialboundedBy = new ArrayList<CellSpaceBoundaryPropertyType>();
        }
        return this.partialboundedBy;
    }

    public boolean isSetPartialboundedBy() {
        return ((this.partialboundedBy!= null)&&(!this.partialboundedBy.isEmpty()));
    }

    public void unsetPartialboundedBy() {
        this.partialboundedBy = null;
    }

}
