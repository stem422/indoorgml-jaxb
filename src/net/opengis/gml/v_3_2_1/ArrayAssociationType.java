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


/**
 * <p>ArrayAssociationType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ArrayAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayAssociationType", propOrder = {
    "abstractObject"
})
public class ArrayAssociationType {

    @XmlElementRef(name = "AbstractObject", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> abstractObject;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoordinateSystemAxisType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link RouteType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link IndoorFeaturesType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeNodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConnectionSpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeOrdinalReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link MappingRuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpaceLayerType }{@code >}
     * {@link JAXBElement }{@code <}{@link CellSpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}
     * {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link NodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link CoverageFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnchorSpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link Count }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link ConnectionBoundaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link net.opengis.gml.v_3_2_1.Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigableSpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralDerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link BagType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link SolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeocentricCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link GridType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericMetaDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueGroupType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CellSpaceBoundaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link RingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProjectedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DataBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeTopologyComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EngineeringDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompoundCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationMethodType }{@code >}
     * {@link JAXBElement }{@code <}{@link BezierType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeClockType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeTopologyPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimeGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransitionSpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimalSpaceFeaturesType }{@code >}
     * {@link JAXBElement }{@code <}{@link SphericalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopologyType }{@code >}
     * {@link JAXBElement }{@code <}{@link StateType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeEdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link BSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnchorBoundaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeneralSpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FileType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageDatumType }{@code >}
     * {@link JAXBElement }{@code <}{@link FaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}
     * {@link JAXBElement }{@code <}{@link ShellType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link Quantity }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeReferenceSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcType }{@code >}
     * {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}
     * {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}
     * {@link JAXBElement }{@code <}{@link EdgeType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link TopoComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffinePlacementType }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link TinType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefinitionProxyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransformationType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConventionalUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeographicCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link CartesianCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferSpaceType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrimeMeridianType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}
     * {@link JAXBElement }{@code <}{@link MultiLayeredGraphType }{@code >}
     * {@link JAXBElement }{@code <}{@link TransferBoundaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeInstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link NavigableBoundaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link OperationParameterType }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeCalendarType }{@code >}
     * {@link JAXBElement }{@code <}{@link AffineCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCSType }{@code >}
     * {@link JAXBElement }{@code <}{@link InterLayerConnectionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}
     * {@link JAXBElement }{@code <}{@link UnitDefinitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link DerivedUnitType }{@code >}
     * {@link JAXBElement }{@code <}{@link VerticalCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeodeticCRSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link Category }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractObject() {
        if (abstractObject == null) {
            abstractObject = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractObject;
    }

    public boolean isSetAbstractObject() {
        return ((this.abstractObject!= null)&&(!this.abstractObject.isEmpty()));
    }

    public void unsetAbstractObject() {
        this.abstractObject = null;
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

}
