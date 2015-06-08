//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.23 at 04:12:02 PM KST 
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
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Types and numbers of raster spatial objects in the dataset
 * 
 * <p>Java class for MD_GridSpatialRepresentation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_GridSpatialRepresentation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_SpatialRepresentation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfDimensions" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/&gt;
 *         &lt;element name="axisDimensionProperties" type="{http://www.isotc211.org/2005/gmd}MD_Dimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cellGeometry" type="{http://www.isotc211.org/2005/gmd}MD_CellGeometryCode_PropertyType"/&gt;
 *         &lt;element name="transformationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected IntegerPropertyType numberOfDimensions;
    protected List<MDDimensionPropertyType> axisDimensionProperties;
    @XmlElement(required = true)
    protected MDCellGeometryCodePropertyType cellGeometry;
    @XmlElement(required = true)
    protected BooleanPropertyType transformationParameterAvailability;

    /**
     * Gets the value of the numberOfDimensions property.
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
     * Sets the value of the numberOfDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setNumberOfDimensions(IntegerPropertyType value) {
        this.numberOfDimensions = value;
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

    /**
     * Gets the value of the cellGeometry property.
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
     * Sets the value of the cellGeometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCellGeometryCodePropertyType }
     *     
     */
    public void setCellGeometry(MDCellGeometryCodePropertyType value) {
        this.cellGeometry = value;
    }

    /**
     * Gets the value of the transformationParameterAvailability property.
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
     * Sets the value of the transformationParameterAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTransformationParameterAvailability(BooleanPropertyType value) {
        this.transformationParameterAvailability = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            IntegerPropertyType theNumberOfDimensions;
            theNumberOfDimensions = this.getNumberOfDimensions();
            strategy.appendField(locator, this, "numberOfDimensions", buffer, theNumberOfDimensions);
        }
        {
            List<MDDimensionPropertyType> theAxisDimensionProperties;
            theAxisDimensionProperties = (((this.axisDimensionProperties!= null)&&(!this.axisDimensionProperties.isEmpty()))?this.getAxisDimensionProperties():null);
            strategy.appendField(locator, this, "axisDimensionProperties", buffer, theAxisDimensionProperties);
        }
        {
            MDCellGeometryCodePropertyType theCellGeometry;
            theCellGeometry = this.getCellGeometry();
            strategy.appendField(locator, this, "cellGeometry", buffer, theCellGeometry);
        }
        {
            BooleanPropertyType theTransformationParameterAvailability;
            theTransformationParameterAvailability = this.getTransformationParameterAvailability();
            strategy.appendField(locator, this, "transformationParameterAvailability", buffer, theTransformationParameterAvailability);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDGridSpatialRepresentationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDGridSpatialRepresentationType that = ((MDGridSpatialRepresentationType) object);
        {
            IntegerPropertyType lhsNumberOfDimensions;
            lhsNumberOfDimensions = this.getNumberOfDimensions();
            IntegerPropertyType rhsNumberOfDimensions;
            rhsNumberOfDimensions = that.getNumberOfDimensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfDimensions", lhsNumberOfDimensions), LocatorUtils.property(thatLocator, "numberOfDimensions", rhsNumberOfDimensions), lhsNumberOfDimensions, rhsNumberOfDimensions)) {
                return false;
            }
        }
        {
            List<MDDimensionPropertyType> lhsAxisDimensionProperties;
            lhsAxisDimensionProperties = (((this.axisDimensionProperties!= null)&&(!this.axisDimensionProperties.isEmpty()))?this.getAxisDimensionProperties():null);
            List<MDDimensionPropertyType> rhsAxisDimensionProperties;
            rhsAxisDimensionProperties = (((that.axisDimensionProperties!= null)&&(!that.axisDimensionProperties.isEmpty()))?that.getAxisDimensionProperties():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "axisDimensionProperties", lhsAxisDimensionProperties), LocatorUtils.property(thatLocator, "axisDimensionProperties", rhsAxisDimensionProperties), lhsAxisDimensionProperties, rhsAxisDimensionProperties)) {
                return false;
            }
        }
        {
            MDCellGeometryCodePropertyType lhsCellGeometry;
            lhsCellGeometry = this.getCellGeometry();
            MDCellGeometryCodePropertyType rhsCellGeometry;
            rhsCellGeometry = that.getCellGeometry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellGeometry", lhsCellGeometry), LocatorUtils.property(thatLocator, "cellGeometry", rhsCellGeometry), lhsCellGeometry, rhsCellGeometry)) {
                return false;
            }
        }
        {
            BooleanPropertyType lhsTransformationParameterAvailability;
            lhsTransformationParameterAvailability = this.getTransformationParameterAvailability();
            BooleanPropertyType rhsTransformationParameterAvailability;
            rhsTransformationParameterAvailability = that.getTransformationParameterAvailability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transformationParameterAvailability", lhsTransformationParameterAvailability), LocatorUtils.property(thatLocator, "transformationParameterAvailability", rhsTransformationParameterAvailability), lhsTransformationParameterAvailability, rhsTransformationParameterAvailability)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            IntegerPropertyType theNumberOfDimensions;
            theNumberOfDimensions = this.getNumberOfDimensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberOfDimensions", theNumberOfDimensions), currentHashCode, theNumberOfDimensions);
        }
        {
            List<MDDimensionPropertyType> theAxisDimensionProperties;
            theAxisDimensionProperties = (((this.axisDimensionProperties!= null)&&(!this.axisDimensionProperties.isEmpty()))?this.getAxisDimensionProperties():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "axisDimensionProperties", theAxisDimensionProperties), currentHashCode, theAxisDimensionProperties);
        }
        {
            MDCellGeometryCodePropertyType theCellGeometry;
            theCellGeometry = this.getCellGeometry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellGeometry", theCellGeometry), currentHashCode, theCellGeometry);
        }
        {
            BooleanPropertyType theTransformationParameterAvailability;
            theTransformationParameterAvailability = this.getTransformationParameterAvailability();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transformationParameterAvailability", theTransformationParameterAvailability), currentHashCode, theTransformationParameterAvailability);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof MDGridSpatialRepresentationType) {
            final MDGridSpatialRepresentationType copy = ((MDGridSpatialRepresentationType) draftCopy);
            if (this.numberOfDimensions!= null) {
                IntegerPropertyType sourceNumberOfDimensions;
                sourceNumberOfDimensions = this.getNumberOfDimensions();
                IntegerPropertyType copyNumberOfDimensions = ((IntegerPropertyType) strategy.copy(LocatorUtils.property(locator, "numberOfDimensions", sourceNumberOfDimensions), sourceNumberOfDimensions));
                copy.setNumberOfDimensions(copyNumberOfDimensions);
            } else {
                copy.numberOfDimensions = null;
            }
            if ((this.axisDimensionProperties!= null)&&(!this.axisDimensionProperties.isEmpty())) {
                List<MDDimensionPropertyType> sourceAxisDimensionProperties;
                sourceAxisDimensionProperties = (((this.axisDimensionProperties!= null)&&(!this.axisDimensionProperties.isEmpty()))?this.getAxisDimensionProperties():null);
                @SuppressWarnings("unchecked")
                List<MDDimensionPropertyType> copyAxisDimensionProperties = ((List<MDDimensionPropertyType> ) strategy.copy(LocatorUtils.property(locator, "axisDimensionProperties", sourceAxisDimensionProperties), sourceAxisDimensionProperties));
                copy.axisDimensionProperties = null;
                if (copyAxisDimensionProperties!= null) {
                    List<MDDimensionPropertyType> uniqueAxisDimensionPropertiesl = copy.getAxisDimensionProperties();
                    uniqueAxisDimensionPropertiesl.addAll(copyAxisDimensionProperties);
                }
            } else {
                copy.axisDimensionProperties = null;
            }
            if (this.cellGeometry!= null) {
                MDCellGeometryCodePropertyType sourceCellGeometry;
                sourceCellGeometry = this.getCellGeometry();
                MDCellGeometryCodePropertyType copyCellGeometry = ((MDCellGeometryCodePropertyType) strategy.copy(LocatorUtils.property(locator, "cellGeometry", sourceCellGeometry), sourceCellGeometry));
                copy.setCellGeometry(copyCellGeometry);
            } else {
                copy.cellGeometry = null;
            }
            if (this.transformationParameterAvailability!= null) {
                BooleanPropertyType sourceTransformationParameterAvailability;
                sourceTransformationParameterAvailability = this.getTransformationParameterAvailability();
                BooleanPropertyType copyTransformationParameterAvailability = ((BooleanPropertyType) strategy.copy(LocatorUtils.property(locator, "transformationParameterAvailability", sourceTransformationParameterAvailability), sourceTransformationParameterAvailability));
                copy.setTransformationParameterAvailability(copyTransformationParameterAvailability);
            } else {
                copy.transformationParameterAvailability = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDGridSpatialRepresentationType();
    }

}
