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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hisrc.w3c.xlink.v_1_0.ActuateType;
import org.hisrc.w3c.xlink.v_1_0.ShowType;
import org.hisrc.w3c.xlink.v_1_0.TypeType;
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
 * <p>Java class for DS_ProductionSeries_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DS_ProductionSeries_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}DS_ProductionSeries"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.isotc211.org/2005/gco}ObjectReference"/&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DS_ProductionSeries_PropertyType", propOrder = {
    "dsProductionSeries"
})
public class DSProductionSeriesPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "DS_ProductionSeries")
    protected DSProductionSeriesType dsProductionSeries;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;
    @XmlAttribute(name = "uuidref")
    protected String uuidref;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * Gets the value of the dsProductionSeries property.
     * 
     * @return
     *     possible object is
     *     {@link DSProductionSeriesType }
     *     
     */
    public DSProductionSeriesType getDSProductionSeries() {
        return dsProductionSeries;
    }

    /**
     * Sets the value of the dsProductionSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSProductionSeriesType }
     *     
     */
    public void setDSProductionSeries(DSProductionSeriesType value) {
        this.dsProductionSeries = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    /**
     * Gets the value of the uuidref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidref() {
        return uuidref;
    }

    /**
     * Sets the value of the uuidref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidref(String value) {
        this.uuidref = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the arcrole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
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
        {
            DSProductionSeriesType theDSProductionSeries;
            theDSProductionSeries = this.getDSProductionSeries();
            strategy.appendField(locator, this, "dsProductionSeries", buffer, theDSProductionSeries);
        }
        {
            List<String> theNilReason;
            theNilReason = (((this.nilReason!= null)&&(!this.nilReason.isEmpty()))?this.getNilReason():null);
            strategy.appendField(locator, this, "nilReason", buffer, theNilReason);
        }
        {
            String theUuidref;
            theUuidref = this.getUuidref();
            strategy.appendField(locator, this, "uuidref", buffer, theUuidref);
        }
        {
            TypeType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref);
        }
        {
            String theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theArcrole);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            ShowType theShow;
            theShow = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theShow);
        }
        {
            ActuateType theActuate;
            theActuate = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theActuate);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DSProductionSeriesPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DSProductionSeriesPropertyType that = ((DSProductionSeriesPropertyType) object);
        {
            DSProductionSeriesType lhsDSProductionSeries;
            lhsDSProductionSeries = this.getDSProductionSeries();
            DSProductionSeriesType rhsDSProductionSeries;
            rhsDSProductionSeries = that.getDSProductionSeries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dsProductionSeries", lhsDSProductionSeries), LocatorUtils.property(thatLocator, "dsProductionSeries", rhsDSProductionSeries), lhsDSProductionSeries, rhsDSProductionSeries)) {
                return false;
            }
        }
        {
            List<String> lhsNilReason;
            lhsNilReason = (((this.nilReason!= null)&&(!this.nilReason.isEmpty()))?this.getNilReason():null);
            List<String> rhsNilReason;
            rhsNilReason = (((that.nilReason!= null)&&(!that.nilReason.isEmpty()))?that.getNilReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nilReason", lhsNilReason), LocatorUtils.property(thatLocator, "nilReason", rhsNilReason), lhsNilReason, rhsNilReason)) {
                return false;
            }
        }
        {
            String lhsUuidref;
            lhsUuidref = this.getUuidref();
            String rhsUuidref;
            rhsUuidref = that.getUuidref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uuidref", lhsUuidref), LocatorUtils.property(thatLocator, "uuidref", rhsUuidref), lhsUuidref, rhsUuidref)) {
                return false;
            }
        }
        {
            TypeType lhsType;
            lhsType = this.getType();
            TypeType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref)) {
                return false;
            }
        }
        {
            String lhsRole;
            lhsRole = this.getRole();
            String rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            String lhsArcrole;
            lhsArcrole = this.getArcrole();
            String rhsArcrole;
            rhsArcrole = that.getArcrole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arcrole", lhsArcrole), LocatorUtils.property(thatLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole)) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            ShowType lhsShow;
            lhsShow = this.getShow();
            ShowType rhsShow;
            rhsShow = that.getShow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "show", lhsShow), LocatorUtils.property(thatLocator, "show", rhsShow), lhsShow, rhsShow)) {
                return false;
            }
        }
        {
            ActuateType lhsActuate;
            lhsActuate = this.getActuate();
            ActuateType rhsActuate;
            rhsActuate = that.getActuate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actuate", lhsActuate), LocatorUtils.property(thatLocator, "actuate", rhsActuate), lhsActuate, rhsActuate)) {
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
        int currentHashCode = 1;
        {
            DSProductionSeriesType theDSProductionSeries;
            theDSProductionSeries = this.getDSProductionSeries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dsProductionSeries", theDSProductionSeries), currentHashCode, theDSProductionSeries);
        }
        {
            List<String> theNilReason;
            theNilReason = (((this.nilReason!= null)&&(!this.nilReason.isEmpty()))?this.getNilReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nilReason", theNilReason), currentHashCode, theNilReason);
        }
        {
            String theUuidref;
            theUuidref = this.getUuidref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uuidref", theUuidref), currentHashCode, theUuidref);
        }
        {
            TypeType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref);
        }
        {
            String theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arcrole", theArcrole), currentHashCode, theArcrole);
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            ShowType theShow;
            theShow = this.getShow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "show", theShow), currentHashCode, theShow);
        }
        {
            ActuateType theActuate;
            theActuate = this.getActuate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actuate", theActuate), currentHashCode, theActuate);
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
        if (draftCopy instanceof DSProductionSeriesPropertyType) {
            final DSProductionSeriesPropertyType copy = ((DSProductionSeriesPropertyType) draftCopy);
            if (this.dsProductionSeries!= null) {
                DSProductionSeriesType sourceDSProductionSeries;
                sourceDSProductionSeries = this.getDSProductionSeries();
                DSProductionSeriesType copyDSProductionSeries = ((DSProductionSeriesType) strategy.copy(LocatorUtils.property(locator, "dsProductionSeries", sourceDSProductionSeries), sourceDSProductionSeries));
                copy.setDSProductionSeries(copyDSProductionSeries);
            } else {
                copy.dsProductionSeries = null;
            }
            if ((this.nilReason!= null)&&(!this.nilReason.isEmpty())) {
                List<String> sourceNilReason;
                sourceNilReason = (((this.nilReason!= null)&&(!this.nilReason.isEmpty()))?this.getNilReason():null);
                @SuppressWarnings("unchecked")
                List<String> copyNilReason = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "nilReason", sourceNilReason), sourceNilReason));
                copy.nilReason = null;
                if (copyNilReason!= null) {
                    List<String> uniqueNilReasonl = copy.getNilReason();
                    uniqueNilReasonl.addAll(copyNilReason);
                }
            } else {
                copy.nilReason = null;
            }
            if (this.uuidref!= null) {
                String sourceUuidref;
                sourceUuidref = this.getUuidref();
                String copyUuidref = ((String) strategy.copy(LocatorUtils.property(locator, "uuidref", sourceUuidref), sourceUuidref));
                copy.setUuidref(copyUuidref);
            } else {
                copy.uuidref = null;
            }
            if (this.type!= null) {
                TypeType sourceType;
                sourceType = this.getType();
                TypeType copyType = ((TypeType) strategy.copy(LocatorUtils.property(locator, "type", sourceType), sourceType));
                copy.setType(copyType);
            } else {
                copy.type = null;
            }
            if (this.href!= null) {
                String sourceHref;
                sourceHref = this.getHref();
                String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref));
                copy.setHref(copyHref);
            } else {
                copy.href = null;
            }
            if (this.role!= null) {
                String sourceRole;
                sourceRole = this.getRole();
                String copyRole = ((String) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole));
                copy.setRole(copyRole);
            } else {
                copy.role = null;
            }
            if (this.arcrole!= null) {
                String sourceArcrole;
                sourceArcrole = this.getArcrole();
                String copyArcrole = ((String) strategy.copy(LocatorUtils.property(locator, "arcrole", sourceArcrole), sourceArcrole));
                copy.setArcrole(copyArcrole);
            } else {
                copy.arcrole = null;
            }
            if (this.title!= null) {
                String sourceTitle;
                sourceTitle = this.getTitle();
                String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle));
                copy.setTitle(copyTitle);
            } else {
                copy.title = null;
            }
            if (this.show!= null) {
                ShowType sourceShow;
                sourceShow = this.getShow();
                ShowType copyShow = ((ShowType) strategy.copy(LocatorUtils.property(locator, "show", sourceShow), sourceShow));
                copy.setShow(copyShow);
            } else {
                copy.show = null;
            }
            if (this.actuate!= null) {
                ActuateType sourceActuate;
                sourceActuate = this.getActuate();
                ActuateType copyActuate = ((ActuateType) strategy.copy(LocatorUtils.property(locator, "actuate", sourceActuate), sourceActuate));
                copy.setActuate(copyActuate);
            } else {
                copy.actuate = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DSProductionSeriesPropertyType();
    }

}
