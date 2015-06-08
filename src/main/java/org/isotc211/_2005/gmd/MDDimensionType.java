//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.23 at 04:12:02 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.MeasurePropertyType;
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
 * <p>Java class for MD_Dimension_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Dimension_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dimensionName" type="{http://www.isotc211.org/2005/gmd}MD_DimensionNameTypeCode_PropertyType"/&gt;
 *         &lt;element name="dimensionSize" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/&gt;
 *         &lt;element name="resolution" type="{http://www.isotc211.org/2005/gco}Measure_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Dimension_Type", propOrder = {
    "dimensionName",
    "dimensionSize",
    "resolution"
})
public class MDDimensionType
    extends AbstractObjectType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected MDDimensionNameTypeCodePropertyType dimensionName;
    @XmlElement(required = true)
    protected IntegerPropertyType dimensionSize;
    protected MeasurePropertyType resolution;

    /**
     * Gets the value of the dimensionName property.
     * 
     * @return
     *     possible object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public MDDimensionNameTypeCodePropertyType getDimensionName() {
        return dimensionName;
    }

    /**
     * Sets the value of the dimensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public void setDimensionName(MDDimensionNameTypeCodePropertyType value) {
        this.dimensionName = value;
    }

    /**
     * Gets the value of the dimensionSize property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDimensionSize() {
        return dimensionSize;
    }

    /**
     * Sets the value of the dimensionSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDimensionSize(IntegerPropertyType value) {
        this.dimensionSize = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurePropertyType }
     *     
     */
    public MeasurePropertyType getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurePropertyType }
     *     
     */
    public void setResolution(MeasurePropertyType value) {
        this.resolution = value;
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
            MDDimensionNameTypeCodePropertyType theDimensionName;
            theDimensionName = this.getDimensionName();
            strategy.appendField(locator, this, "dimensionName", buffer, theDimensionName);
        }
        {
            IntegerPropertyType theDimensionSize;
            theDimensionSize = this.getDimensionSize();
            strategy.appendField(locator, this, "dimensionSize", buffer, theDimensionSize);
        }
        {
            MeasurePropertyType theResolution;
            theResolution = this.getResolution();
            strategy.appendField(locator, this, "resolution", buffer, theResolution);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDDimensionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDDimensionType that = ((MDDimensionType) object);
        {
            MDDimensionNameTypeCodePropertyType lhsDimensionName;
            lhsDimensionName = this.getDimensionName();
            MDDimensionNameTypeCodePropertyType rhsDimensionName;
            rhsDimensionName = that.getDimensionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimensionName", lhsDimensionName), LocatorUtils.property(thatLocator, "dimensionName", rhsDimensionName), lhsDimensionName, rhsDimensionName)) {
                return false;
            }
        }
        {
            IntegerPropertyType lhsDimensionSize;
            lhsDimensionSize = this.getDimensionSize();
            IntegerPropertyType rhsDimensionSize;
            rhsDimensionSize = that.getDimensionSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimensionSize", lhsDimensionSize), LocatorUtils.property(thatLocator, "dimensionSize", rhsDimensionSize), lhsDimensionSize, rhsDimensionSize)) {
                return false;
            }
        }
        {
            MeasurePropertyType lhsResolution;
            lhsResolution = this.getResolution();
            MeasurePropertyType rhsResolution;
            rhsResolution = that.getResolution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resolution", lhsResolution), LocatorUtils.property(thatLocator, "resolution", rhsResolution), lhsResolution, rhsResolution)) {
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
            MDDimensionNameTypeCodePropertyType theDimensionName;
            theDimensionName = this.getDimensionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimensionName", theDimensionName), currentHashCode, theDimensionName);
        }
        {
            IntegerPropertyType theDimensionSize;
            theDimensionSize = this.getDimensionSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimensionSize", theDimensionSize), currentHashCode, theDimensionSize);
        }
        {
            MeasurePropertyType theResolution;
            theResolution = this.getResolution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resolution", theResolution), currentHashCode, theResolution);
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
        if (draftCopy instanceof MDDimensionType) {
            final MDDimensionType copy = ((MDDimensionType) draftCopy);
            if (this.dimensionName!= null) {
                MDDimensionNameTypeCodePropertyType sourceDimensionName;
                sourceDimensionName = this.getDimensionName();
                MDDimensionNameTypeCodePropertyType copyDimensionName = ((MDDimensionNameTypeCodePropertyType) strategy.copy(LocatorUtils.property(locator, "dimensionName", sourceDimensionName), sourceDimensionName));
                copy.setDimensionName(copyDimensionName);
            } else {
                copy.dimensionName = null;
            }
            if (this.dimensionSize!= null) {
                IntegerPropertyType sourceDimensionSize;
                sourceDimensionSize = this.getDimensionSize();
                IntegerPropertyType copyDimensionSize = ((IntegerPropertyType) strategy.copy(LocatorUtils.property(locator, "dimensionSize", sourceDimensionSize), sourceDimensionSize));
                copy.setDimensionSize(copyDimensionSize);
            } else {
                copy.dimensionSize = null;
            }
            if (this.resolution!= null) {
                MeasurePropertyType sourceResolution;
                sourceResolution = this.getResolution();
                MeasurePropertyType copyResolution = ((MeasurePropertyType) strategy.copy(LocatorUtils.property(locator, "resolution", sourceResolution), sourceResolution));
                copy.setResolution(copyResolution);
            } else {
                copy.resolution = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDDimensionType();
    }

}
