//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.22 at 10:03:02 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.AggregationType;
import net.opengis.gml.v_3_2_1.FeaturePropertyType;
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
 * <p>Java class for PrimalSpaceFeaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimalSpaceFeaturesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cellSpaceMember" type="{http://www.opengis.net/gml/3.2}FeaturePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cellSpaceBoundaryMember" type="{http://www.opengis.net/gml/3.2}FeaturePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PrimalSpaceFeaturesType", propOrder = {
    "cellSpaceMember",
    "cellSpaceBoundaryMember"
})
public class PrimalSpaceFeaturesType
    extends AbstractFeatureType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    protected List<FeaturePropertyType> cellSpaceMember;
    protected List<FeaturePropertyType> cellSpaceBoundaryMember;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the cellSpaceMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellSpaceMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellSpaceMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getCellSpaceMember() {
        if (cellSpaceMember == null) {
            cellSpaceMember = new ArrayList<FeaturePropertyType>();
        }
        return this.cellSpaceMember;
    }

    /**
     * Gets the value of the cellSpaceBoundaryMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellSpaceBoundaryMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellSpaceBoundaryMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getCellSpaceBoundaryMember() {
        if (cellSpaceBoundaryMember == null) {
            cellSpaceBoundaryMember = new ArrayList<FeaturePropertyType>();
        }
        return this.cellSpaceBoundaryMember;
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
            List<FeaturePropertyType> theCellSpaceMember;
            theCellSpaceMember = (((this.cellSpaceMember!= null)&&(!this.cellSpaceMember.isEmpty()))?this.getCellSpaceMember():null);
            strategy.appendField(locator, this, "cellSpaceMember", buffer, theCellSpaceMember);
        }
        {
            List<FeaturePropertyType> theCellSpaceBoundaryMember;
            theCellSpaceBoundaryMember = (((this.cellSpaceBoundaryMember!= null)&&(!this.cellSpaceBoundaryMember.isEmpty()))?this.getCellSpaceBoundaryMember():null);
            strategy.appendField(locator, this, "cellSpaceBoundaryMember", buffer, theCellSpaceBoundaryMember);
        }
        {
            AggregationType theAggregationType;
            theAggregationType = this.getAggregationType();
            strategy.appendField(locator, this, "aggregationType", buffer, theAggregationType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PrimalSpaceFeaturesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PrimalSpaceFeaturesType that = ((PrimalSpaceFeaturesType) object);
        {
            List<FeaturePropertyType> lhsCellSpaceMember;
            lhsCellSpaceMember = (((this.cellSpaceMember!= null)&&(!this.cellSpaceMember.isEmpty()))?this.getCellSpaceMember():null);
            List<FeaturePropertyType> rhsCellSpaceMember;
            rhsCellSpaceMember = (((that.cellSpaceMember!= null)&&(!that.cellSpaceMember.isEmpty()))?that.getCellSpaceMember():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellSpaceMember", lhsCellSpaceMember), LocatorUtils.property(thatLocator, "cellSpaceMember", rhsCellSpaceMember), lhsCellSpaceMember, rhsCellSpaceMember)) {
                return false;
            }
        }
        {
            List<FeaturePropertyType> lhsCellSpaceBoundaryMember;
            lhsCellSpaceBoundaryMember = (((this.cellSpaceBoundaryMember!= null)&&(!this.cellSpaceBoundaryMember.isEmpty()))?this.getCellSpaceBoundaryMember():null);
            List<FeaturePropertyType> rhsCellSpaceBoundaryMember;
            rhsCellSpaceBoundaryMember = (((that.cellSpaceBoundaryMember!= null)&&(!that.cellSpaceBoundaryMember.isEmpty()))?that.getCellSpaceBoundaryMember():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellSpaceBoundaryMember", lhsCellSpaceBoundaryMember), LocatorUtils.property(thatLocator, "cellSpaceBoundaryMember", rhsCellSpaceBoundaryMember), lhsCellSpaceBoundaryMember, rhsCellSpaceBoundaryMember)) {
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
            List<FeaturePropertyType> theCellSpaceMember;
            theCellSpaceMember = (((this.cellSpaceMember!= null)&&(!this.cellSpaceMember.isEmpty()))?this.getCellSpaceMember():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellSpaceMember", theCellSpaceMember), currentHashCode, theCellSpaceMember);
        }
        {
            List<FeaturePropertyType> theCellSpaceBoundaryMember;
            theCellSpaceBoundaryMember = (((this.cellSpaceBoundaryMember!= null)&&(!this.cellSpaceBoundaryMember.isEmpty()))?this.getCellSpaceBoundaryMember():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellSpaceBoundaryMember", theCellSpaceBoundaryMember), currentHashCode, theCellSpaceBoundaryMember);
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
        if (draftCopy instanceof PrimalSpaceFeaturesType) {
            final PrimalSpaceFeaturesType copy = ((PrimalSpaceFeaturesType) draftCopy);
            if ((this.cellSpaceMember!= null)&&(!this.cellSpaceMember.isEmpty())) {
                List<FeaturePropertyType> sourceCellSpaceMember;
                sourceCellSpaceMember = (((this.cellSpaceMember!= null)&&(!this.cellSpaceMember.isEmpty()))?this.getCellSpaceMember():null);
                @SuppressWarnings("unchecked")
                List<FeaturePropertyType> copyCellSpaceMember = ((List<FeaturePropertyType> ) strategy.copy(LocatorUtils.property(locator, "cellSpaceMember", sourceCellSpaceMember), sourceCellSpaceMember));
                copy.cellSpaceMember = null;
                if (copyCellSpaceMember!= null) {
                    List<FeaturePropertyType> uniqueCellSpaceMemberl = copy.getCellSpaceMember();
                    uniqueCellSpaceMemberl.addAll(copyCellSpaceMember);
                }
            } else {
                copy.cellSpaceMember = null;
            }
            if ((this.cellSpaceBoundaryMember!= null)&&(!this.cellSpaceBoundaryMember.isEmpty())) {
                List<FeaturePropertyType> sourceCellSpaceBoundaryMember;
                sourceCellSpaceBoundaryMember = (((this.cellSpaceBoundaryMember!= null)&&(!this.cellSpaceBoundaryMember.isEmpty()))?this.getCellSpaceBoundaryMember():null);
                @SuppressWarnings("unchecked")
                List<FeaturePropertyType> copyCellSpaceBoundaryMember = ((List<FeaturePropertyType> ) strategy.copy(LocatorUtils.property(locator, "cellSpaceBoundaryMember", sourceCellSpaceBoundaryMember), sourceCellSpaceBoundaryMember));
                copy.cellSpaceBoundaryMember = null;
                if (copyCellSpaceBoundaryMember!= null) {
                    List<FeaturePropertyType> uniqueCellSpaceBoundaryMemberl = copy.getCellSpaceBoundaryMember();
                    uniqueCellSpaceBoundaryMemberl.addAll(copyCellSpaceBoundaryMember);
                }
            } else {
                copy.cellSpaceBoundaryMember = null;
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
        return new PrimalSpaceFeaturesType();
    }

}
