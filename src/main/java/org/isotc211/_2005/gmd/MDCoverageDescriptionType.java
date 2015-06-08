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
import org.isotc211._2005.gco.RecordTypePropertyType;
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
 * Information about the domain of the raster cell
 * 
 * <p>Java class for MD_CoverageDescription_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_CoverageDescription_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_ContentInformation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeDescription" type="{http://www.isotc211.org/2005/gco}RecordType_PropertyType"/&gt;
 *         &lt;element name="contentType" type="{http://www.isotc211.org/2005/gmd}MD_CoverageContentTypeCode_PropertyType"/&gt;
 *         &lt;element name="dimension" type="{http://www.isotc211.org/2005/gmd}MD_RangeDimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_CoverageDescription_Type", propOrder = {
    "attributeDescription",
    "contentType",
    "dimension"
})
@XmlSeeAlso({
    MDImageDescriptionType.class
})
public class MDCoverageDescriptionType
    extends AbstractMDContentInformationType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected RecordTypePropertyType attributeDescription;
    @XmlElement(required = true)
    protected MDCoverageContentTypeCodePropertyType contentType;
    protected List<MDRangeDimensionPropertyType> dimension;

    /**
     * Gets the value of the attributeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public RecordTypePropertyType getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * Sets the value of the attributeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public void setAttributeDescription(RecordTypePropertyType value) {
        this.attributeDescription = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public MDCoverageContentTypeCodePropertyType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public void setContentType(MDCoverageContentTypeCodePropertyType value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRangeDimensionPropertyType }
     * 
     * 
     */
    public List<MDRangeDimensionPropertyType> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<MDRangeDimensionPropertyType>();
        }
        return this.dimension;
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
            RecordTypePropertyType theAttributeDescription;
            theAttributeDescription = this.getAttributeDescription();
            strategy.appendField(locator, this, "attributeDescription", buffer, theAttributeDescription);
        }
        {
            MDCoverageContentTypeCodePropertyType theContentType;
            theContentType = this.getContentType();
            strategy.appendField(locator, this, "contentType", buffer, theContentType);
        }
        {
            List<MDRangeDimensionPropertyType> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            strategy.appendField(locator, this, "dimension", buffer, theDimension);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDCoverageDescriptionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDCoverageDescriptionType that = ((MDCoverageDescriptionType) object);
        {
            RecordTypePropertyType lhsAttributeDescription;
            lhsAttributeDescription = this.getAttributeDescription();
            RecordTypePropertyType rhsAttributeDescription;
            rhsAttributeDescription = that.getAttributeDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeDescription", lhsAttributeDescription), LocatorUtils.property(thatLocator, "attributeDescription", rhsAttributeDescription), lhsAttributeDescription, rhsAttributeDescription)) {
                return false;
            }
        }
        {
            MDCoverageContentTypeCodePropertyType lhsContentType;
            lhsContentType = this.getContentType();
            MDCoverageContentTypeCodePropertyType rhsContentType;
            rhsContentType = that.getContentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentType", lhsContentType), LocatorUtils.property(thatLocator, "contentType", rhsContentType), lhsContentType, rhsContentType)) {
                return false;
            }
        }
        {
            List<MDRangeDimensionPropertyType> lhsDimension;
            lhsDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            List<MDRangeDimensionPropertyType> rhsDimension;
            rhsDimension = (((that.dimension!= null)&&(!that.dimension.isEmpty()))?that.getDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimension", lhsDimension), LocatorUtils.property(thatLocator, "dimension", rhsDimension), lhsDimension, rhsDimension)) {
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
            RecordTypePropertyType theAttributeDescription;
            theAttributeDescription = this.getAttributeDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeDescription", theAttributeDescription), currentHashCode, theAttributeDescription);
        }
        {
            MDCoverageContentTypeCodePropertyType theContentType;
            theContentType = this.getContentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentType", theContentType), currentHashCode, theContentType);
        }
        {
            List<MDRangeDimensionPropertyType> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimension", theDimension), currentHashCode, theDimension);
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
        if (draftCopy instanceof MDCoverageDescriptionType) {
            final MDCoverageDescriptionType copy = ((MDCoverageDescriptionType) draftCopy);
            if (this.attributeDescription!= null) {
                RecordTypePropertyType sourceAttributeDescription;
                sourceAttributeDescription = this.getAttributeDescription();
                RecordTypePropertyType copyAttributeDescription = ((RecordTypePropertyType) strategy.copy(LocatorUtils.property(locator, "attributeDescription", sourceAttributeDescription), sourceAttributeDescription));
                copy.setAttributeDescription(copyAttributeDescription);
            } else {
                copy.attributeDescription = null;
            }
            if (this.contentType!= null) {
                MDCoverageContentTypeCodePropertyType sourceContentType;
                sourceContentType = this.getContentType();
                MDCoverageContentTypeCodePropertyType copyContentType = ((MDCoverageContentTypeCodePropertyType) strategy.copy(LocatorUtils.property(locator, "contentType", sourceContentType), sourceContentType));
                copy.setContentType(copyContentType);
            } else {
                copy.contentType = null;
            }
            if ((this.dimension!= null)&&(!this.dimension.isEmpty())) {
                List<MDRangeDimensionPropertyType> sourceDimension;
                sourceDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
                @SuppressWarnings("unchecked")
                List<MDRangeDimensionPropertyType> copyDimension = ((List<MDRangeDimensionPropertyType> ) strategy.copy(LocatorUtils.property(locator, "dimension", sourceDimension), sourceDimension));
                copy.dimension = null;
                if (copyDimension!= null) {
                    List<MDRangeDimensionPropertyType> uniqueDimensionl = copy.getDimension();
                    uniqueDimensionl.addAll(copyDimension);
                }
            } else {
                copy.dimension = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDCoverageDescriptionType();
    }

}
