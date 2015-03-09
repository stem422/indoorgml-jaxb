//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.IntegerPropertyType;


/**
 * Types and numbers of raster spatial objects in the dataset
 * 
 * <p>MD_GridSpatialRepresentation_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_GridSpatialRepresentation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_SpatialRepresentation_Type">
 *       &lt;sequence>
 *         &lt;element name="numberOfDimensions" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/>
 *         &lt;element name="axisDimensionProperties" type="{http://www.isotc211.org/2005/gmd}MD_Dimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cellGeometry" type="{http://www.isotc211.org/2005/gmd}MD_CellGeometryCode_PropertyType"/>
 *         &lt;element name="transformationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_GridSpatialRepresentation_Type", propOrder = {
    "numberOfDimensions",
    "axisDimensionProperties",
    "cellGeometry",
    "transformationParameterAvailability"
})
@XmlSeeAlso({
    MDGeoreferenceableType.class,
    MDGeorectifiedType.class
})
public class MDGridSpatialRepresentationType
    extends AbstractMDSpatialRepresentationType
{

    @XmlElement(required = true)
    protected IntegerPropertyType numberOfDimensions;
    protected List<MDDimensionPropertyType> axisDimensionProperties;
    @XmlElement(required = true)
    protected MDCellGeometryCodePropertyType cellGeometry;
    @XmlElement(required = true)
    protected BooleanPropertyType transformationParameterAvailability;

    /**
     * numberOfDimensions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getNumberOfDimensions() {
        return numberOfDimensions;
    }

    /**
     * numberOfDimensions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setNumberOfDimensions(IntegerPropertyType value) {
        this.numberOfDimensions = value;
    }

    public boolean isSetNumberOfDimensions() {
        return (this.numberOfDimensions!= null);
    }

    /**
     * Gets the value of the axisDimensionProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axisDimensionProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxisDimensionProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDimensionPropertyType }
     * 
     * 
     */
    public List<MDDimensionPropertyType> getAxisDimensionProperties() {
        if (axisDimensionProperties == null) {
            axisDimensionProperties = new ArrayList<MDDimensionPropertyType>();
        }
        return this.axisDimensionProperties;
    }

    public boolean isSetAxisDimensionProperties() {
        return ((this.axisDimensionProperties!= null)&&(!this.axisDimensionProperties.isEmpty()));
    }

    public void unsetAxisDimensionProperties() {
        this.axisDimensionProperties = null;
    }

    /**
     * cellGeometry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDCellGeometryCodePropertyType }
     *     
     */
    public MDCellGeometryCodePropertyType getCellGeometry() {
        return cellGeometry;
    }

    /**
     * cellGeometry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCellGeometryCodePropertyType }
     *     
     */
    public void setCellGeometry(MDCellGeometryCodePropertyType value) {
        this.cellGeometry = value;
    }

    public boolean isSetCellGeometry() {
        return (this.cellGeometry!= null);
    }

    /**
     * transformationParameterAvailability 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTransformationParameterAvailability() {
        return transformationParameterAvailability;
    }

    /**
     * transformationParameterAvailability 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTransformationParameterAvailability(BooleanPropertyType value) {
        this.transformationParameterAvailability = value;
    }

    public boolean isSetTransformationParameterAvailability() {
        return (this.transformationParameterAvailability!= null);
    }

}
