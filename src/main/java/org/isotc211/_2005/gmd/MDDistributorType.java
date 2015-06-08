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
 * Information about the distributor
 * 
 * <p>Java class for MD_Distributor_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Distributor_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distributorContact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType"/&gt;
 *         &lt;element name="distributionOrderProcess" type="{http://www.isotc211.org/2005/gmd}MD_StandardOrderProcess_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distributorFormat" type="{http://www.isotc211.org/2005/gmd}MD_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distributorTransferOptions" type="{http://www.isotc211.org/2005/gmd}MD_DigitalTransferOptions_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Distributor_Type", propOrder = {
    "distributorContact",
    "distributionOrderProcess",
    "distributorFormat",
    "distributorTransferOptions"
})
public class MDDistributorType
    extends AbstractObjectType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected CIResponsiblePartyPropertyType distributorContact;
    protected List<MDStandardOrderProcessPropertyType> distributionOrderProcess;
    protected List<MDFormatPropertyType> distributorFormat;
    protected List<MDDigitalTransferOptionsPropertyType> distributorTransferOptions;

    /**
     * Gets the value of the distributorContact property.
     * 
     * @return
     *     possible object is
     *     {@link CIResponsiblePartyPropertyType }
     *     
     */
    public CIResponsiblePartyPropertyType getDistributorContact() {
        return distributorContact;
    }

    /**
     * Sets the value of the distributorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIResponsiblePartyPropertyType }
     *     
     */
    public void setDistributorContact(CIResponsiblePartyPropertyType value) {
        this.distributorContact = value;
    }

    /**
     * Gets the value of the distributionOrderProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionOrderProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionOrderProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDStandardOrderProcessPropertyType }
     * 
     * 
     */
    public List<MDStandardOrderProcessPropertyType> getDistributionOrderProcess() {
        if (distributionOrderProcess == null) {
            distributionOrderProcess = new ArrayList<MDStandardOrderProcessPropertyType>();
        }
        return this.distributionOrderProcess;
    }

    /**
     * Gets the value of the distributorFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFormatPropertyType }
     * 
     * 
     */
    public List<MDFormatPropertyType> getDistributorFormat() {
        if (distributorFormat == null) {
            distributorFormat = new ArrayList<MDFormatPropertyType>();
        }
        return this.distributorFormat;
    }

    /**
     * Gets the value of the distributorTransferOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorTransferOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorTransferOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDigitalTransferOptionsPropertyType }
     * 
     * 
     */
    public List<MDDigitalTransferOptionsPropertyType> getDistributorTransferOptions() {
        if (distributorTransferOptions == null) {
            distributorTransferOptions = new ArrayList<MDDigitalTransferOptionsPropertyType>();
        }
        return this.distributorTransferOptions;
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
            CIResponsiblePartyPropertyType theDistributorContact;
            theDistributorContact = this.getDistributorContact();
            strategy.appendField(locator, this, "distributorContact", buffer, theDistributorContact);
        }
        {
            List<MDStandardOrderProcessPropertyType> theDistributionOrderProcess;
            theDistributionOrderProcess = (((this.distributionOrderProcess!= null)&&(!this.distributionOrderProcess.isEmpty()))?this.getDistributionOrderProcess():null);
            strategy.appendField(locator, this, "distributionOrderProcess", buffer, theDistributionOrderProcess);
        }
        {
            List<MDFormatPropertyType> theDistributorFormat;
            theDistributorFormat = (((this.distributorFormat!= null)&&(!this.distributorFormat.isEmpty()))?this.getDistributorFormat():null);
            strategy.appendField(locator, this, "distributorFormat", buffer, theDistributorFormat);
        }
        {
            List<MDDigitalTransferOptionsPropertyType> theDistributorTransferOptions;
            theDistributorTransferOptions = (((this.distributorTransferOptions!= null)&&(!this.distributorTransferOptions.isEmpty()))?this.getDistributorTransferOptions():null);
            strategy.appendField(locator, this, "distributorTransferOptions", buffer, theDistributorTransferOptions);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDDistributorType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDDistributorType that = ((MDDistributorType) object);
        {
            CIResponsiblePartyPropertyType lhsDistributorContact;
            lhsDistributorContact = this.getDistributorContact();
            CIResponsiblePartyPropertyType rhsDistributorContact;
            rhsDistributorContact = that.getDistributorContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributorContact", lhsDistributorContact), LocatorUtils.property(thatLocator, "distributorContact", rhsDistributorContact), lhsDistributorContact, rhsDistributorContact)) {
                return false;
            }
        }
        {
            List<MDStandardOrderProcessPropertyType> lhsDistributionOrderProcess;
            lhsDistributionOrderProcess = (((this.distributionOrderProcess!= null)&&(!this.distributionOrderProcess.isEmpty()))?this.getDistributionOrderProcess():null);
            List<MDStandardOrderProcessPropertyType> rhsDistributionOrderProcess;
            rhsDistributionOrderProcess = (((that.distributionOrderProcess!= null)&&(!that.distributionOrderProcess.isEmpty()))?that.getDistributionOrderProcess():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributionOrderProcess", lhsDistributionOrderProcess), LocatorUtils.property(thatLocator, "distributionOrderProcess", rhsDistributionOrderProcess), lhsDistributionOrderProcess, rhsDistributionOrderProcess)) {
                return false;
            }
        }
        {
            List<MDFormatPropertyType> lhsDistributorFormat;
            lhsDistributorFormat = (((this.distributorFormat!= null)&&(!this.distributorFormat.isEmpty()))?this.getDistributorFormat():null);
            List<MDFormatPropertyType> rhsDistributorFormat;
            rhsDistributorFormat = (((that.distributorFormat!= null)&&(!that.distributorFormat.isEmpty()))?that.getDistributorFormat():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributorFormat", lhsDistributorFormat), LocatorUtils.property(thatLocator, "distributorFormat", rhsDistributorFormat), lhsDistributorFormat, rhsDistributorFormat)) {
                return false;
            }
        }
        {
            List<MDDigitalTransferOptionsPropertyType> lhsDistributorTransferOptions;
            lhsDistributorTransferOptions = (((this.distributorTransferOptions!= null)&&(!this.distributorTransferOptions.isEmpty()))?this.getDistributorTransferOptions():null);
            List<MDDigitalTransferOptionsPropertyType> rhsDistributorTransferOptions;
            rhsDistributorTransferOptions = (((that.distributorTransferOptions!= null)&&(!that.distributorTransferOptions.isEmpty()))?that.getDistributorTransferOptions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distributorTransferOptions", lhsDistributorTransferOptions), LocatorUtils.property(thatLocator, "distributorTransferOptions", rhsDistributorTransferOptions), lhsDistributorTransferOptions, rhsDistributorTransferOptions)) {
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
            CIResponsiblePartyPropertyType theDistributorContact;
            theDistributorContact = this.getDistributorContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributorContact", theDistributorContact), currentHashCode, theDistributorContact);
        }
        {
            List<MDStandardOrderProcessPropertyType> theDistributionOrderProcess;
            theDistributionOrderProcess = (((this.distributionOrderProcess!= null)&&(!this.distributionOrderProcess.isEmpty()))?this.getDistributionOrderProcess():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributionOrderProcess", theDistributionOrderProcess), currentHashCode, theDistributionOrderProcess);
        }
        {
            List<MDFormatPropertyType> theDistributorFormat;
            theDistributorFormat = (((this.distributorFormat!= null)&&(!this.distributorFormat.isEmpty()))?this.getDistributorFormat():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributorFormat", theDistributorFormat), currentHashCode, theDistributorFormat);
        }
        {
            List<MDDigitalTransferOptionsPropertyType> theDistributorTransferOptions;
            theDistributorTransferOptions = (((this.distributorTransferOptions!= null)&&(!this.distributorTransferOptions.isEmpty()))?this.getDistributorTransferOptions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distributorTransferOptions", theDistributorTransferOptions), currentHashCode, theDistributorTransferOptions);
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
        if (draftCopy instanceof MDDistributorType) {
            final MDDistributorType copy = ((MDDistributorType) draftCopy);
            if (this.distributorContact!= null) {
                CIResponsiblePartyPropertyType sourceDistributorContact;
                sourceDistributorContact = this.getDistributorContact();
                CIResponsiblePartyPropertyType copyDistributorContact = ((CIResponsiblePartyPropertyType) strategy.copy(LocatorUtils.property(locator, "distributorContact", sourceDistributorContact), sourceDistributorContact));
                copy.setDistributorContact(copyDistributorContact);
            } else {
                copy.distributorContact = null;
            }
            if ((this.distributionOrderProcess!= null)&&(!this.distributionOrderProcess.isEmpty())) {
                List<MDStandardOrderProcessPropertyType> sourceDistributionOrderProcess;
                sourceDistributionOrderProcess = (((this.distributionOrderProcess!= null)&&(!this.distributionOrderProcess.isEmpty()))?this.getDistributionOrderProcess():null);
                @SuppressWarnings("unchecked")
                List<MDStandardOrderProcessPropertyType> copyDistributionOrderProcess = ((List<MDStandardOrderProcessPropertyType> ) strategy.copy(LocatorUtils.property(locator, "distributionOrderProcess", sourceDistributionOrderProcess), sourceDistributionOrderProcess));
                copy.distributionOrderProcess = null;
                if (copyDistributionOrderProcess!= null) {
                    List<MDStandardOrderProcessPropertyType> uniqueDistributionOrderProcessl = copy.getDistributionOrderProcess();
                    uniqueDistributionOrderProcessl.addAll(copyDistributionOrderProcess);
                }
            } else {
                copy.distributionOrderProcess = null;
            }
            if ((this.distributorFormat!= null)&&(!this.distributorFormat.isEmpty())) {
                List<MDFormatPropertyType> sourceDistributorFormat;
                sourceDistributorFormat = (((this.distributorFormat!= null)&&(!this.distributorFormat.isEmpty()))?this.getDistributorFormat():null);
                @SuppressWarnings("unchecked")
                List<MDFormatPropertyType> copyDistributorFormat = ((List<MDFormatPropertyType> ) strategy.copy(LocatorUtils.property(locator, "distributorFormat", sourceDistributorFormat), sourceDistributorFormat));
                copy.distributorFormat = null;
                if (copyDistributorFormat!= null) {
                    List<MDFormatPropertyType> uniqueDistributorFormatl = copy.getDistributorFormat();
                    uniqueDistributorFormatl.addAll(copyDistributorFormat);
                }
            } else {
                copy.distributorFormat = null;
            }
            if ((this.distributorTransferOptions!= null)&&(!this.distributorTransferOptions.isEmpty())) {
                List<MDDigitalTransferOptionsPropertyType> sourceDistributorTransferOptions;
                sourceDistributorTransferOptions = (((this.distributorTransferOptions!= null)&&(!this.distributorTransferOptions.isEmpty()))?this.getDistributorTransferOptions():null);
                @SuppressWarnings("unchecked")
                List<MDDigitalTransferOptionsPropertyType> copyDistributorTransferOptions = ((List<MDDigitalTransferOptionsPropertyType> ) strategy.copy(LocatorUtils.property(locator, "distributorTransferOptions", sourceDistributorTransferOptions), sourceDistributorTransferOptions));
                copy.distributorTransferOptions = null;
                if (copyDistributorTransferOptions!= null) {
                    List<MDDigitalTransferOptionsPropertyType> uniqueDistributorTransferOptionsl = copy.getDistributorTransferOptions();
                    uniqueDistributorTransferOptionsl.addAll(copyDistributorTransferOptions);
                }
            } else {
                copy.distributorTransferOptions = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDDistributorType();
    }

}