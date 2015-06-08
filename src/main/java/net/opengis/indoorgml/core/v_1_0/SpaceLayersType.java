//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.23 at 04:12:02 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AggregationType;
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
 * <p>Java class for SpaceLayersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpaceLayersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spaceLayerMember" type="{http://www.opengis.net/indoorgml/1.0/core}SpaceLayerMemberType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpaceLayersType", propOrder = {
    "spaceLayerMember"
})
public class SpaceLayersType
    extends AbstractFeatureType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<SpaceLayerMemberType> spaceLayerMember;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the spaceLayerMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spaceLayerMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpaceLayerMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceLayerMemberType }
     * 
     * 
     */
    public List<SpaceLayerMemberType> getSpaceLayerMember() {
        if (spaceLayerMember == null) {
            spaceLayerMember = new ArrayList<SpaceLayerMemberType>();
        }
        return this.spaceLayerMember;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
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
            List<SpaceLayerMemberType> theSpaceLayerMember;
            theSpaceLayerMember = (((this.spaceLayerMember!= null)&&(!this.spaceLayerMember.isEmpty()))?this.getSpaceLayerMember():null);
            strategy.appendField(locator, this, "spaceLayerMember", buffer, theSpaceLayerMember);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theAggregationType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SpaceLayersType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SpaceLayersType that = ((SpaceLayersType) object);
        {
            List<SpaceLayerMemberType> lhsSpaceLayerMember;
            lhsSpaceLayerMember = (((this.spaceLayerMember!= null)&&(!this.spaceLayerMember.isEmpty()))?this.getSpaceLayerMember():null);
            List<SpaceLayerMemberType> rhsSpaceLayerMember;
            rhsSpaceLayerMember = (((that.spaceLayerMember!= null)&&(!that.spaceLayerMember.isEmpty()))?that.getSpaceLayerMember():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spaceLayerMember", lhsSpaceLayerMember), LocatorUtils.property(thatLocator, "spaceLayerMember", rhsSpaceLayerMember), lhsSpaceLayerMember, rhsSpaceLayerMember)) {
                return false;
            }
        }
        {
            AggregationType lhsAggregationType;
            lhsAggregationType = this.getAggregationType();
            AggregationType rhsAggregationType;
            rhsAggregationType = that.getAggregationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aggregationType", lhsAggregationType), LocatorUtils.property(thatLocator, "aggregationType", rhsAggregationType), lhsAggregationType, rhsAggregationType)) {
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
            List<SpaceLayerMemberType> theSpaceLayerMember;
            theSpaceLayerMember = (((this.spaceLayerMember!= null)&&(!this.spaceLayerMember.isEmpty()))?this.getSpaceLayerMember():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spaceLayerMember", theSpaceLayerMember), currentHashCode, theSpaceLayerMember);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aggregationType", theAggregationType), currentHashCode, theAggregationType);
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
        if (draftCopy instanceof SpaceLayersType) {
            final SpaceLayersType copy = ((SpaceLayersType) draftCopy);
            if ((this.spaceLayerMember!= null)&&(!this.spaceLayerMember.isEmpty())) {
                List<SpaceLayerMemberType> sourceSpaceLayerMember;
                sourceSpaceLayerMember = (((this.spaceLayerMember!= null)&&(!this.spaceLayerMember.isEmpty()))?this.getSpaceLayerMember():null);
                @SuppressWarnings("unchecked")
                List<SpaceLayerMemberType> copySpaceLayerMember = ((List<SpaceLayerMemberType> ) strategy.copy(LocatorUtils.property(locator, "spaceLayerMember", sourceSpaceLayerMember), sourceSpaceLayerMember));
                copy.spaceLayerMember = null;
                if (copySpaceLayerMember!= null) {
                    List<SpaceLayerMemberType> uniqueSpaceLayerMemberl = copy.getSpaceLayerMember();
                    uniqueSpaceLayerMemberl.addAll(copySpaceLayerMember);
                }
            } else {
                copy.spaceLayerMember = null;
            }
            if (this.aggregationType!= null) {
                AggregationType sourceAggregationType;
                sourceAggregationType = this.getAggregationType();
                AggregationType copyAggregationType = ((AggregationType) strategy.copy(LocatorUtils.property(locator, "aggregationType", sourceAggregationType), sourceAggregationType));
                copy.setAggregationType(copyAggregationType);
            } else {
                copy.aggregationType = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SpaceLayersType();
    }

}
