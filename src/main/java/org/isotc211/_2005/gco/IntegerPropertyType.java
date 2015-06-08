//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.23 at 04:12:02 PM KST 
//


package org.isotc211._2005.gco;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for Integer_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Integer_PropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{http://www.isotc211.org/2005/gco}Integer"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://www.isotc211.org/2005/gco}nilReason"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Integer_PropertyType", propOrder = {
    "integer"
})
public class IntegerPropertyType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Integer")
    protected BigInteger integer;
    @XmlAttribute(name = "nilReason", namespace = "http://www.isotc211.org/2005/gco")
    protected List<String> nilReason;

    /**
     * Gets the value of the integer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInteger() {
        return integer;
    }

    /**
     * Sets the value of the integer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInteger(BigInteger value) {
        this.integer = value;
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
            BigInteger theInteger;
            theInteger = this.getInteger();
            strategy.appendField(locator, this, "integer", buffer, theInteger);
        }
        {
            List<String> theNilReason;
            theNilReason = (((this.nilReason!= null)&&(!this.nilReason.isEmpty()))?this.getNilReason():null);
            strategy.appendField(locator, this, "nilReason", buffer, theNilReason);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IntegerPropertyType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final IntegerPropertyType that = ((IntegerPropertyType) object);
        {
            BigInteger lhsInteger;
            lhsInteger = this.getInteger();
            BigInteger rhsInteger;
            rhsInteger = that.getInteger();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "integer", lhsInteger), LocatorUtils.property(thatLocator, "integer", rhsInteger), lhsInteger, rhsInteger)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            BigInteger theInteger;
            theInteger = this.getInteger();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "integer", theInteger), currentHashCode, theInteger);
        }
        {
            List<String> theNilReason;
            theNilReason = (((this.nilReason!= null)&&(!this.nilReason.isEmpty()))?this.getNilReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nilReason", theNilReason), currentHashCode, theNilReason);
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
        if (draftCopy instanceof IntegerPropertyType) {
            final IntegerPropertyType copy = ((IntegerPropertyType) draftCopy);
            if (this.integer!= null) {
                BigInteger sourceInteger;
                sourceInteger = this.getInteger();
                BigInteger copyInteger = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "integer", sourceInteger), sourceInteger));
                copy.setInteger(copyInteger);
            } else {
                copy.integer = null;
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
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new IntegerPropertyType();
    }

}
