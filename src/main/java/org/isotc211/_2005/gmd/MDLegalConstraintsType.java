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
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
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
 * Restrictions and legal prerequisites for accessing and using the dataset.
 * 
 * <p>Java class for MD_LegalConstraints_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_LegalConstraints_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="useConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="otherConstraints" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_LegalConstraints_Type", propOrder = {
    "accessConstraints",
    "useConstraints",
    "otherConstraints"
})
public class MDLegalConstraintsType
    extends MDConstraintsType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    protected List<MDRestrictionCodePropertyType> accessConstraints;
    protected List<MDRestrictionCodePropertyType> useConstraints;
    protected List<CharacterStringPropertyType> otherConstraints;

    /**
     * Gets the value of the accessConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getAccessConstraints() {
        if (accessConstraints == null) {
            accessConstraints = new ArrayList<MDRestrictionCodePropertyType>();
        }
        return this.accessConstraints;
    }

    /**
     * Gets the value of the useConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getUseConstraints() {
        if (useConstraints == null) {
            useConstraints = new ArrayList<MDRestrictionCodePropertyType>();
        }
        return this.useConstraints;
    }

    /**
     * Gets the value of the otherConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getOtherConstraints() {
        if (otherConstraints == null) {
            otherConstraints = new ArrayList<CharacterStringPropertyType>();
        }
        return this.otherConstraints;
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
            List<MDRestrictionCodePropertyType> theAccessConstraints;
            theAccessConstraints = (((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty()))?this.getAccessConstraints():null);
            strategy.appendField(locator, this, "accessConstraints", buffer, theAccessConstraints);
        }
        {
            List<MDRestrictionCodePropertyType> theUseConstraints;
            theUseConstraints = (((this.useConstraints!= null)&&(!this.useConstraints.isEmpty()))?this.getUseConstraints():null);
            strategy.appendField(locator, this, "useConstraints", buffer, theUseConstraints);
        }
        {
            List<CharacterStringPropertyType> theOtherConstraints;
            theOtherConstraints = (((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty()))?this.getOtherConstraints():null);
            strategy.appendField(locator, this, "otherConstraints", buffer, theOtherConstraints);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDLegalConstraintsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDLegalConstraintsType that = ((MDLegalConstraintsType) object);
        {
            List<MDRestrictionCodePropertyType> lhsAccessConstraints;
            lhsAccessConstraints = (((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty()))?this.getAccessConstraints():null);
            List<MDRestrictionCodePropertyType> rhsAccessConstraints;
            rhsAccessConstraints = (((that.accessConstraints!= null)&&(!that.accessConstraints.isEmpty()))?that.getAccessConstraints():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessConstraints", lhsAccessConstraints), LocatorUtils.property(thatLocator, "accessConstraints", rhsAccessConstraints), lhsAccessConstraints, rhsAccessConstraints)) {
                return false;
            }
        }
        {
            List<MDRestrictionCodePropertyType> lhsUseConstraints;
            lhsUseConstraints = (((this.useConstraints!= null)&&(!this.useConstraints.isEmpty()))?this.getUseConstraints():null);
            List<MDRestrictionCodePropertyType> rhsUseConstraints;
            rhsUseConstraints = (((that.useConstraints!= null)&&(!that.useConstraints.isEmpty()))?that.getUseConstraints():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useConstraints", lhsUseConstraints), LocatorUtils.property(thatLocator, "useConstraints", rhsUseConstraints), lhsUseConstraints, rhsUseConstraints)) {
                return false;
            }
        }
        {
            List<CharacterStringPropertyType> lhsOtherConstraints;
            lhsOtherConstraints = (((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty()))?this.getOtherConstraints():null);
            List<CharacterStringPropertyType> rhsOtherConstraints;
            rhsOtherConstraints = (((that.otherConstraints!= null)&&(!that.otherConstraints.isEmpty()))?that.getOtherConstraints():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherConstraints", lhsOtherConstraints), LocatorUtils.property(thatLocator, "otherConstraints", rhsOtherConstraints), lhsOtherConstraints, rhsOtherConstraints)) {
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
            List<MDRestrictionCodePropertyType> theAccessConstraints;
            theAccessConstraints = (((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty()))?this.getAccessConstraints():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessConstraints", theAccessConstraints), currentHashCode, theAccessConstraints);
        }
        {
            List<MDRestrictionCodePropertyType> theUseConstraints;
            theUseConstraints = (((this.useConstraints!= null)&&(!this.useConstraints.isEmpty()))?this.getUseConstraints():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useConstraints", theUseConstraints), currentHashCode, theUseConstraints);
        }
        {
            List<CharacterStringPropertyType> theOtherConstraints;
            theOtherConstraints = (((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty()))?this.getOtherConstraints():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherConstraints", theOtherConstraints), currentHashCode, theOtherConstraints);
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
        if (draftCopy instanceof MDLegalConstraintsType) {
            final MDLegalConstraintsType copy = ((MDLegalConstraintsType) draftCopy);
            if ((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty())) {
                List<MDRestrictionCodePropertyType> sourceAccessConstraints;
                sourceAccessConstraints = (((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty()))?this.getAccessConstraints():null);
                @SuppressWarnings("unchecked")
                List<MDRestrictionCodePropertyType> copyAccessConstraints = ((List<MDRestrictionCodePropertyType> ) strategy.copy(LocatorUtils.property(locator, "accessConstraints", sourceAccessConstraints), sourceAccessConstraints));
                copy.accessConstraints = null;
                if (copyAccessConstraints!= null) {
                    List<MDRestrictionCodePropertyType> uniqueAccessConstraintsl = copy.getAccessConstraints();
                    uniqueAccessConstraintsl.addAll(copyAccessConstraints);
                }
            } else {
                copy.accessConstraints = null;
            }
            if ((this.useConstraints!= null)&&(!this.useConstraints.isEmpty())) {
                List<MDRestrictionCodePropertyType> sourceUseConstraints;
                sourceUseConstraints = (((this.useConstraints!= null)&&(!this.useConstraints.isEmpty()))?this.getUseConstraints():null);
                @SuppressWarnings("unchecked")
                List<MDRestrictionCodePropertyType> copyUseConstraints = ((List<MDRestrictionCodePropertyType> ) strategy.copy(LocatorUtils.property(locator, "useConstraints", sourceUseConstraints), sourceUseConstraints));
                copy.useConstraints = null;
                if (copyUseConstraints!= null) {
                    List<MDRestrictionCodePropertyType> uniqueUseConstraintsl = copy.getUseConstraints();
                    uniqueUseConstraintsl.addAll(copyUseConstraints);
                }
            } else {
                copy.useConstraints = null;
            }
            if ((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty())) {
                List<CharacterStringPropertyType> sourceOtherConstraints;
                sourceOtherConstraints = (((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty()))?this.getOtherConstraints():null);
                @SuppressWarnings("unchecked")
                List<CharacterStringPropertyType> copyOtherConstraints = ((List<CharacterStringPropertyType> ) strategy.copy(LocatorUtils.property(locator, "otherConstraints", sourceOtherConstraints), sourceOtherConstraints));
                copy.otherConstraints = null;
                if (copyOtherConstraints!= null) {
                    List<CharacterStringPropertyType> uniqueOtherConstraintsl = copy.getOtherConstraints();
                    uniqueOtherConstraintsl.addAll(copyOtherConstraints);
                }
            } else {
                copy.otherConstraints = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDLegalConstraintsType();
    }

}
