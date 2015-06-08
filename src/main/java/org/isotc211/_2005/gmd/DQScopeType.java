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
 * <p>Java class for DQ_Scope_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DQ_Scope_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="level" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType"/&gt;
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="levelDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Scope_Type", propOrder = {
    "level",
    "extent",
    "levelDescription"
})
public class DQScopeType
    extends AbstractObjectType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected MDScopeCodePropertyType level;
    protected EXExtentPropertyType extent;
    protected List<MDScopeDescriptionPropertyType> levelDescription;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public MDScopeCodePropertyType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public void setLevel(MDScopeCodePropertyType value) {
        this.level = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public EXExtentPropertyType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public void setExtent(EXExtentPropertyType value) {
        this.extent = value;
    }

    /**
     * Gets the value of the levelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getLevelDescription() {
        if (levelDescription == null) {
            levelDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.levelDescription;
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
            MDScopeCodePropertyType theLevel;
            theLevel = this.getLevel();
            strategy.appendField(locator, this, "level", buffer, theLevel);
        }
        {
            EXExtentPropertyType theExtent;
            theExtent = this.getExtent();
            strategy.appendField(locator, this, "extent", buffer, theExtent);
        }
        {
            List<MDScopeDescriptionPropertyType> theLevelDescription;
            theLevelDescription = (((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()))?this.getLevelDescription():null);
            strategy.appendField(locator, this, "levelDescription", buffer, theLevelDescription);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DQScopeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DQScopeType that = ((DQScopeType) object);
        {
            MDScopeCodePropertyType lhsLevel;
            lhsLevel = this.getLevel();
            MDScopeCodePropertyType rhsLevel;
            rhsLevel = that.getLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "level", lhsLevel), LocatorUtils.property(thatLocator, "level", rhsLevel), lhsLevel, rhsLevel)) {
                return false;
            }
        }
        {
            EXExtentPropertyType lhsExtent;
            lhsExtent = this.getExtent();
            EXExtentPropertyType rhsExtent;
            rhsExtent = that.getExtent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extent", lhsExtent), LocatorUtils.property(thatLocator, "extent", rhsExtent), lhsExtent, rhsExtent)) {
                return false;
            }
        }
        {
            List<MDScopeDescriptionPropertyType> lhsLevelDescription;
            lhsLevelDescription = (((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()))?this.getLevelDescription():null);
            List<MDScopeDescriptionPropertyType> rhsLevelDescription;
            rhsLevelDescription = (((that.levelDescription!= null)&&(!that.levelDescription.isEmpty()))?that.getLevelDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "levelDescription", lhsLevelDescription), LocatorUtils.property(thatLocator, "levelDescription", rhsLevelDescription), lhsLevelDescription, rhsLevelDescription)) {
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
            MDScopeCodePropertyType theLevel;
            theLevel = this.getLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "level", theLevel), currentHashCode, theLevel);
        }
        {
            EXExtentPropertyType theExtent;
            theExtent = this.getExtent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extent", theExtent), currentHashCode, theExtent);
        }
        {
            List<MDScopeDescriptionPropertyType> theLevelDescription;
            theLevelDescription = (((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()))?this.getLevelDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "levelDescription", theLevelDescription), currentHashCode, theLevelDescription);
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
        if (draftCopy instanceof DQScopeType) {
            final DQScopeType copy = ((DQScopeType) draftCopy);
            if (this.level!= null) {
                MDScopeCodePropertyType sourceLevel;
                sourceLevel = this.getLevel();
                MDScopeCodePropertyType copyLevel = ((MDScopeCodePropertyType) strategy.copy(LocatorUtils.property(locator, "level", sourceLevel), sourceLevel));
                copy.setLevel(copyLevel);
            } else {
                copy.level = null;
            }
            if (this.extent!= null) {
                EXExtentPropertyType sourceExtent;
                sourceExtent = this.getExtent();
                EXExtentPropertyType copyExtent = ((EXExtentPropertyType) strategy.copy(LocatorUtils.property(locator, "extent", sourceExtent), sourceExtent));
                copy.setExtent(copyExtent);
            } else {
                copy.extent = null;
            }
            if ((this.levelDescription!= null)&&(!this.levelDescription.isEmpty())) {
                List<MDScopeDescriptionPropertyType> sourceLevelDescription;
                sourceLevelDescription = (((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()))?this.getLevelDescription():null);
                @SuppressWarnings("unchecked")
                List<MDScopeDescriptionPropertyType> copyLevelDescription = ((List<MDScopeDescriptionPropertyType> ) strategy.copy(LocatorUtils.property(locator, "levelDescription", sourceLevelDescription), sourceLevelDescription));
                copy.levelDescription = null;
                if (copyLevelDescription!= null) {
                    List<MDScopeDescriptionPropertyType> uniqueLevelDescriptionl = copy.getLevelDescription();
                    uniqueLevelDescriptionl.addAll(copyLevelDescription);
                }
            } else {
                copy.levelDescription = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DQScopeType();
    }

}