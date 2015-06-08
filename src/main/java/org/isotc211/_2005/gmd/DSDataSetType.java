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
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
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
 * Identifiable collection of data
 * 
 * <p>Java class for DS_DataSet_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DS_DataSet_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="has" type="{http://www.isotc211.org/2005/gmd}MD_Metadata_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="partOf" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DS_DataSet_Type", propOrder = {
    "has",
    "partOf"
})
public class DSDataSetType
    extends AbstractObjectType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<MDMetadataPropertyType> has;
    protected List<DSAggregatePropertyType> partOf;

    /**
     * Gets the value of the has property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the has property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataPropertyType }
     * 
     * 
     */
    public List<MDMetadataPropertyType> getHas() {
        if (has == null) {
            has = new ArrayList<MDMetadataPropertyType>();
        }
        return this.has;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getPartOf() {
        if (partOf == null) {
            partOf = new ArrayList<DSAggregatePropertyType>();
        }
        return this.partOf;
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
            List<MDMetadataPropertyType> theHas;
            theHas = (((this.has!= null)&&(!this.has.isEmpty()))?this.getHas():null);
            strategy.appendField(locator, this, "has", buffer, theHas);
        }
        {
            List<DSAggregatePropertyType> thePartOf;
            thePartOf = (((this.partOf!= null)&&(!this.partOf.isEmpty()))?this.getPartOf():null);
            strategy.appendField(locator, this, "partOf", buffer, thePartOf);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DSDataSetType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DSDataSetType that = ((DSDataSetType) object);
        {
            List<MDMetadataPropertyType> lhsHas;
            lhsHas = (((this.has!= null)&&(!this.has.isEmpty()))?this.getHas():null);
            List<MDMetadataPropertyType> rhsHas;
            rhsHas = (((that.has!= null)&&(!that.has.isEmpty()))?that.getHas():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "has", lhsHas), LocatorUtils.property(thatLocator, "has", rhsHas), lhsHas, rhsHas)) {
                return false;
            }
        }
        {
            List<DSAggregatePropertyType> lhsPartOf;
            lhsPartOf = (((this.partOf!= null)&&(!this.partOf.isEmpty()))?this.getPartOf():null);
            List<DSAggregatePropertyType> rhsPartOf;
            rhsPartOf = (((that.partOf!= null)&&(!that.partOf.isEmpty()))?that.getPartOf():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partOf", lhsPartOf), LocatorUtils.property(thatLocator, "partOf", rhsPartOf), lhsPartOf, rhsPartOf)) {
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
            List<MDMetadataPropertyType> theHas;
            theHas = (((this.has!= null)&&(!this.has.isEmpty()))?this.getHas():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "has", theHas), currentHashCode, theHas);
        }
        {
            List<DSAggregatePropertyType> thePartOf;
            thePartOf = (((this.partOf!= null)&&(!this.partOf.isEmpty()))?this.getPartOf():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partOf", thePartOf), currentHashCode, thePartOf);
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
        if (draftCopy instanceof DSDataSetType) {
            final DSDataSetType copy = ((DSDataSetType) draftCopy);
            if ((this.has!= null)&&(!this.has.isEmpty())) {
                List<MDMetadataPropertyType> sourceHas;
                sourceHas = (((this.has!= null)&&(!this.has.isEmpty()))?this.getHas():null);
                @SuppressWarnings("unchecked")
                List<MDMetadataPropertyType> copyHas = ((List<MDMetadataPropertyType> ) strategy.copy(LocatorUtils.property(locator, "has", sourceHas), sourceHas));
                copy.has = null;
                if (copyHas!= null) {
                    List<MDMetadataPropertyType> uniqueHasl = copy.getHas();
                    uniqueHasl.addAll(copyHas);
                }
            } else {
                copy.has = null;
            }
            if ((this.partOf!= null)&&(!this.partOf.isEmpty())) {
                List<DSAggregatePropertyType> sourcePartOf;
                sourcePartOf = (((this.partOf!= null)&&(!this.partOf.isEmpty()))?this.getPartOf():null);
                @SuppressWarnings("unchecked")
                List<DSAggregatePropertyType> copyPartOf = ((List<DSAggregatePropertyType> ) strategy.copy(LocatorUtils.property(locator, "partOf", sourcePartOf), sourcePartOf));
                copy.partOf = null;
                if (copyPartOf!= null) {
                    List<DSAggregatePropertyType> uniquePartOfl = copy.getPartOf();
                    uniquePartOfl.addAll(copyPartOf);
                }
            } else {
                copy.partOf = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DSDataSetType();
    }

}