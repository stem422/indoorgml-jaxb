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
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;
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
 * Brief description of ways in which the dataset is currently used.
 * 
 * <p>Java class for MD_Usage_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Usage_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specificUsage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="usageDateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="userDeterminedLimitations" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="userContactInfo" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Usage_Type", propOrder = {
    "specificUsage",
    "usageDateTime",
    "userDeterminedLimitations",
    "userContactInfo"
})
public class MDUsageType
    extends AbstractObjectType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType specificUsage;
    protected DateTimePropertyType usageDateTime;
    protected CharacterStringPropertyType userDeterminedLimitations;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> userContactInfo;

    /**
     * Gets the value of the specificUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSpecificUsage() {
        return specificUsage;
    }

    /**
     * Sets the value of the specificUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSpecificUsage(CharacterStringPropertyType value) {
        this.specificUsage = value;
    }

    /**
     * Gets the value of the usageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getUsageDateTime() {
        return usageDateTime;
    }

    /**
     * Sets the value of the usageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setUsageDateTime(DateTimePropertyType value) {
        this.usageDateTime = value;
    }

    /**
     * Gets the value of the userDeterminedLimitations property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserDeterminedLimitations() {
        return userDeterminedLimitations;
    }

    /**
     * Sets the value of the userDeterminedLimitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserDeterminedLimitations(CharacterStringPropertyType value) {
        this.userDeterminedLimitations = value;
    }

    /**
     * Gets the value of the userContactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userContactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getUserContactInfo() {
        if (userContactInfo == null) {
            userContactInfo = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.userContactInfo;
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
            CharacterStringPropertyType theSpecificUsage;
            theSpecificUsage = this.getSpecificUsage();
            strategy.appendField(locator, this, "specificUsage", buffer, theSpecificUsage);
        }
        {
            DateTimePropertyType theUsageDateTime;
            theUsageDateTime = this.getUsageDateTime();
            strategy.appendField(locator, this, "usageDateTime", buffer, theUsageDateTime);
        }
        {
            CharacterStringPropertyType theUserDeterminedLimitations;
            theUserDeterminedLimitations = this.getUserDeterminedLimitations();
            strategy.appendField(locator, this, "userDeterminedLimitations", buffer, theUserDeterminedLimitations);
        }
        {
            List<CIResponsiblePartyPropertyType> theUserContactInfo;
            theUserContactInfo = (((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()))?this.getUserContactInfo():null);
            strategy.appendField(locator, this, "userContactInfo", buffer, theUserContactInfo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDUsageType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDUsageType that = ((MDUsageType) object);
        {
            CharacterStringPropertyType lhsSpecificUsage;
            lhsSpecificUsage = this.getSpecificUsage();
            CharacterStringPropertyType rhsSpecificUsage;
            rhsSpecificUsage = that.getSpecificUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specificUsage", lhsSpecificUsage), LocatorUtils.property(thatLocator, "specificUsage", rhsSpecificUsage), lhsSpecificUsage, rhsSpecificUsage)) {
                return false;
            }
        }
        {
            DateTimePropertyType lhsUsageDateTime;
            lhsUsageDateTime = this.getUsageDateTime();
            DateTimePropertyType rhsUsageDateTime;
            rhsUsageDateTime = that.getUsageDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usageDateTime", lhsUsageDateTime), LocatorUtils.property(thatLocator, "usageDateTime", rhsUsageDateTime), lhsUsageDateTime, rhsUsageDateTime)) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsUserDeterminedLimitations;
            lhsUserDeterminedLimitations = this.getUserDeterminedLimitations();
            CharacterStringPropertyType rhsUserDeterminedLimitations;
            rhsUserDeterminedLimitations = that.getUserDeterminedLimitations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDeterminedLimitations", lhsUserDeterminedLimitations), LocatorUtils.property(thatLocator, "userDeterminedLimitations", rhsUserDeterminedLimitations), lhsUserDeterminedLimitations, rhsUserDeterminedLimitations)) {
                return false;
            }
        }
        {
            List<CIResponsiblePartyPropertyType> lhsUserContactInfo;
            lhsUserContactInfo = (((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()))?this.getUserContactInfo():null);
            List<CIResponsiblePartyPropertyType> rhsUserContactInfo;
            rhsUserContactInfo = (((that.userContactInfo!= null)&&(!that.userContactInfo.isEmpty()))?that.getUserContactInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userContactInfo", lhsUserContactInfo), LocatorUtils.property(thatLocator, "userContactInfo", rhsUserContactInfo), lhsUserContactInfo, rhsUserContactInfo)) {
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
            CharacterStringPropertyType theSpecificUsage;
            theSpecificUsage = this.getSpecificUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specificUsage", theSpecificUsage), currentHashCode, theSpecificUsage);
        }
        {
            DateTimePropertyType theUsageDateTime;
            theUsageDateTime = this.getUsageDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usageDateTime", theUsageDateTime), currentHashCode, theUsageDateTime);
        }
        {
            CharacterStringPropertyType theUserDeterminedLimitations;
            theUserDeterminedLimitations = this.getUserDeterminedLimitations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userDeterminedLimitations", theUserDeterminedLimitations), currentHashCode, theUserDeterminedLimitations);
        }
        {
            List<CIResponsiblePartyPropertyType> theUserContactInfo;
            theUserContactInfo = (((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()))?this.getUserContactInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userContactInfo", theUserContactInfo), currentHashCode, theUserContactInfo);
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
        if (draftCopy instanceof MDUsageType) {
            final MDUsageType copy = ((MDUsageType) draftCopy);
            if (this.specificUsage!= null) {
                CharacterStringPropertyType sourceSpecificUsage;
                sourceSpecificUsage = this.getSpecificUsage();
                CharacterStringPropertyType copySpecificUsage = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "specificUsage", sourceSpecificUsage), sourceSpecificUsage));
                copy.setSpecificUsage(copySpecificUsage);
            } else {
                copy.specificUsage = null;
            }
            if (this.usageDateTime!= null) {
                DateTimePropertyType sourceUsageDateTime;
                sourceUsageDateTime = this.getUsageDateTime();
                DateTimePropertyType copyUsageDateTime = ((DateTimePropertyType) strategy.copy(LocatorUtils.property(locator, "usageDateTime", sourceUsageDateTime), sourceUsageDateTime));
                copy.setUsageDateTime(copyUsageDateTime);
            } else {
                copy.usageDateTime = null;
            }
            if (this.userDeterminedLimitations!= null) {
                CharacterStringPropertyType sourceUserDeterminedLimitations;
                sourceUserDeterminedLimitations = this.getUserDeterminedLimitations();
                CharacterStringPropertyType copyUserDeterminedLimitations = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "userDeterminedLimitations", sourceUserDeterminedLimitations), sourceUserDeterminedLimitations));
                copy.setUserDeterminedLimitations(copyUserDeterminedLimitations);
            } else {
                copy.userDeterminedLimitations = null;
            }
            if ((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty())) {
                List<CIResponsiblePartyPropertyType> sourceUserContactInfo;
                sourceUserContactInfo = (((this.userContactInfo!= null)&&(!this.userContactInfo.isEmpty()))?this.getUserContactInfo():null);
                @SuppressWarnings("unchecked")
                List<CIResponsiblePartyPropertyType> copyUserContactInfo = ((List<CIResponsiblePartyPropertyType> ) strategy.copy(LocatorUtils.property(locator, "userContactInfo", sourceUserContactInfo), sourceUserContactInfo));
                copy.userContactInfo = null;
                if (copyUserContactInfo!= null) {
                    List<CIResponsiblePartyPropertyType> uniqueUserContactInfol = copy.getUserContactInfo();
                    uniqueUserContactInfol.addAll(copyUserContactInfo);
                }
            } else {
                copy.userContactInfo = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDUsageType();
    }

}