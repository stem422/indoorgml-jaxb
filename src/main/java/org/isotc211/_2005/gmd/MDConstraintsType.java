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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
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
 * Restrictions on the access and use of a dataset or metadata
 * 
 * <p>Java class for MD_Constraints_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Constraints_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="useLimitation" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Constraints_Type", propOrder = {
    "useLimitation"
})
@XmlSeeAlso({
    MDLegalConstraintsType.class,
    MDSecurityConstraintsType.class
})
public class MDConstraintsType
    extends AbstractObjectType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    protected List<CharacterStringPropertyType> useLimitation;

    /**
     * Gets the value of the useLimitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useLimitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseLimitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getUseLimitation() {
        if (useLimitation == null) {
            useLimitation = new ArrayList<CharacterStringPropertyType>();
        }
        return this.useLimitation;
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
            List<CharacterStringPropertyType> theUseLimitation;
            theUseLimitation = (((this.useLimitation!= null)&&(!this.useLimitation.isEmpty()))?this.getUseLimitation():null);
            strategy.appendField(locator, this, "useLimitation", buffer, theUseLimitation);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDConstraintsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDConstraintsType that = ((MDConstraintsType) object);
        {
            List<CharacterStringPropertyType> lhsUseLimitation;
            lhsUseLimitation = (((this.useLimitation!= null)&&(!this.useLimitation.isEmpty()))?this.getUseLimitation():null);
            List<CharacterStringPropertyType> rhsUseLimitation;
            rhsUseLimitation = (((that.useLimitation!= null)&&(!that.useLimitation.isEmpty()))?that.getUseLimitation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useLimitation", lhsUseLimitation), LocatorUtils.property(thatLocator, "useLimitation", rhsUseLimitation), lhsUseLimitation, rhsUseLimitation)) {
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
            List<CharacterStringPropertyType> theUseLimitation;
            theUseLimitation = (((this.useLimitation!= null)&&(!this.useLimitation.isEmpty()))?this.getUseLimitation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useLimitation", theUseLimitation), currentHashCode, theUseLimitation);
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
        if (draftCopy instanceof MDConstraintsType) {
            final MDConstraintsType copy = ((MDConstraintsType) draftCopy);
            if ((this.useLimitation!= null)&&(!this.useLimitation.isEmpty())) {
                List<CharacterStringPropertyType> sourceUseLimitation;
                sourceUseLimitation = (((this.useLimitation!= null)&&(!this.useLimitation.isEmpty()))?this.getUseLimitation():null);
                @SuppressWarnings("unchecked")
                List<CharacterStringPropertyType> copyUseLimitation = ((List<CharacterStringPropertyType> ) strategy.copy(LocatorUtils.property(locator, "useLimitation", sourceUseLimitation), sourceUseLimitation));
                copy.useLimitation = null;
                if (copyUseLimitation!= null) {
                    List<CharacterStringPropertyType> uniqueUseLimitationl = copy.getUseLimitation();
                    uniqueUseLimitationl.addAll(copyUseLimitation);
                }
            } else {
                copy.useLimitation = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDConstraintsType();
    }

}
