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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.CurvePropertyType;
import net.opengis.gml.v_3_2_1.SurfacePropertyType;
import net.opengis.indoorgml.navigation.v_1_0.NavigableBoundaryType;


/**
 * <p>CellSpaceBoundaryType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CellSpaceBoundaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="duality" type="{http://www.opengis.net/indoorgml/1.0/core}TransitionPropertyType" minOccurs="0"/>
 *         &lt;group ref="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceBoundaryGeometry" minOccurs="0"/>
 *         &lt;element name="externalReference" type="{http://www.opengis.net/indoorgml/1.0/core}ExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellSpaceBoundaryType", propOrder = {
    "duality",
    "geometry3D",
    "geometry2D",
    "externalReference"
})
@XmlSeeAlso({
    NavigableBoundaryType.class
})
public class CellSpaceBoundaryType
    extends AbstractFeatureType
{

    protected TransitionPropertyType duality;
    protected SurfacePropertyType geometry3D;
    protected CurvePropertyType geometry2D;
    protected List<ExternalReferenceType> externalReference;

    /**
     * duality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TransitionPropertyType }
     *     
     */
    public TransitionPropertyType getDuality() {
        return duality;
    }

    /**
     * duality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionPropertyType }
     *     
     */
    public void setDuality(TransitionPropertyType value) {
        this.duality = value;
    }

    public boolean isSetDuality() {
        return (this.duality!= null);
    }

    /**
     * geometry3D 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getGeometry3D() {
        return geometry3D;
    }

    /**
     * geometry3D 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setGeometry3D(SurfacePropertyType value) {
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
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getGeometry2D() {
        return geometry2D;
    }

    /**
     * geometry2D 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setGeometry2D(CurvePropertyType value) {
        this.geometry2D = value;
    }

    public boolean isSetGeometry2D() {
        return (this.geometry2D!= null);
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

}
