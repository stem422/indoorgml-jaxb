//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceBoundaryType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceType;
import net.opengis.indoorgml.core.v_1_0.IndoorFeaturesType;
import net.opengis.indoorgml.core.v_1_0.InterLayerConnectionType;
import net.opengis.indoorgml.core.v_1_0.MultiLayeredGraphType;
import net.opengis.indoorgml.core.v_1_0.PrimalSpaceFeaturesType;
import net.opengis.indoorgml.core.v_1_0.SpaceLayerType;
import net.opengis.indoorgml.core.v_1_0.StateType;
import net.opengis.indoorgml.core.v_1_0.TransitionType;
import net.opengis.indoorgml.navigation.v_1_0.AnchorBoundaryType;
import net.opengis.indoorgml.navigation.v_1_0.AnchorSpaceType;
import net.opengis.indoorgml.navigation.v_1_0.ConnectionBoundaryType;
import net.opengis.indoorgml.navigation.v_1_0.ConnectionSpaceType;
import net.opengis.indoorgml.navigation.v_1_0.GeneralSpaceType;
import net.opengis.indoorgml.navigation.v_1_0.NavigableBoundaryType;
import net.opengis.indoorgml.navigation.v_1_0.NavigableSpaceType;
import net.opengis.indoorgml.navigation.v_1_0.RouteType;
import net.opengis.indoorgml.navigation.v_1_0.TransferBoundaryType;
import net.opengis.indoorgml.navigation.v_1_0.TransferSpaceType;
import net.opengis.indoorgml.navigation.v_1_0.TransitionSpaceType;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;


/**
 * <p>ProcedurePropertyType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProcedurePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractFeature"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcedurePropertyType", propOrder = {
    "abstractFeature"
})
public class ProcedurePropertyType {

    @XmlElementRef(name = "AbstractFeature", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends AbstractFeatureType> abstractFeature;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    /**
     * 
     * 
     */
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    public final static TypeType TYPE = TypeType.SIMPLE;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * abstractFeature 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NavigableSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiLayeredGraphType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceLayerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CellSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CellSpaceBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigableBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnchorSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorFeaturesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimalSpaceFeaturesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterLayerConnectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnchorBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSpaceType }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractFeatureType> getAbstractFeature() {
        return abstractFeature;
    }

    /**
     * abstractFeature 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NavigableSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultiLayeredGraphType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SpaceLayerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CellSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CellSpaceBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NavigableBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnchorSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndoorFeaturesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimalSpaceFeaturesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterLayerConnectionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransferSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AnchorBoundaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConnectionSpaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralSpaceType }{@code >}
     *     
     */
    public void setAbstractFeature(JAXBElement<? extends AbstractFeatureType> value) {
        this.abstractFeature = value;
    }

    public boolean isSetAbstractFeature() {
        return (this.abstractFeature!= null);
    }

    /**
     * owns 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * owns 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    public boolean isSetNilReason() {
        return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
    }

    public void unsetNilReason() {
        this.nilReason = null;
    }

    /**
     * remoteSchema 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * remoteSchema 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * href 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * href 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * role 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * role 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * arcrole 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * arcrole 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * show 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * show 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * actuate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * actuate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

}
