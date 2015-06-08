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
import org.isotc211._2005.gco.IntegerPropertyType;
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
 * New metadata element, not found in ISO 19115, which is required to describe geographic data
 * 
 * <p>Java class for MD_ExtendedElementInformation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_ExtendedElementInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="shortName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="domainCode" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="obligation" type="{http://www.isotc211.org/2005/gmd}MD_ObligationCode_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="condition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="dataType" type="{http://www.isotc211.org/2005/gmd}MD_DatatypeCode_PropertyType"/&gt;
 *         &lt;element name="maximumOccurrence" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="domainValue" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="parentEntity" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="rule" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="rationale" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ExtendedElementInformation_Type", propOrder = {
    "name",
    "shortName",
    "domainCode",
    "definition",
    "obligation",
    "condition",
    "dataType",
    "maximumOccurrence",
    "domainValue",
    "parentEntity",
    "rule",
    "rationale",
    "source"
})
public class MDExtendedElementInformationType
    extends AbstractObjectType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType name;
    protected CharacterStringPropertyType shortName;
    protected IntegerPropertyType domainCode;
    @XmlElement(required = true)
    protected CharacterStringPropertyType definition;
    protected MDObligationCodePropertyType obligation;
    protected CharacterStringPropertyType condition;
    @XmlElement(required = true)
    protected MDDatatypeCodePropertyType dataType;
    protected CharacterStringPropertyType maximumOccurrence;
    protected CharacterStringPropertyType domainValue;
    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> parentEntity;
    @XmlElement(required = true)
    protected CharacterStringPropertyType rule;
    protected List<CharacterStringPropertyType> rationale;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> source;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setShortName(CharacterStringPropertyType value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDomainCode(IntegerPropertyType value) {
        this.domainCode = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDefinition(CharacterStringPropertyType value) {
        this.definition = value;
    }

    /**
     * Gets the value of the obligation property.
     * 
     * @return
     *     possible object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public MDObligationCodePropertyType getObligation() {
        return obligation;
    }

    /**
     * Sets the value of the obligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public void setObligation(MDObligationCodePropertyType value) {
        this.obligation = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCondition(CharacterStringPropertyType value) {
        this.condition = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public MDDatatypeCodePropertyType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public void setDataType(MDDatatypeCodePropertyType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the maximumOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMaximumOccurrence() {
        return maximumOccurrence;
    }

    /**
     * Sets the value of the maximumOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMaximumOccurrence(CharacterStringPropertyType value) {
        this.maximumOccurrence = value;
    }

    /**
     * Gets the value of the domainValue property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDomainValue() {
        return domainValue;
    }

    /**
     * Sets the value of the domainValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDomainValue(CharacterStringPropertyType value) {
        this.domainValue = value;
    }

    /**
     * Gets the value of the parentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getParentEntity() {
        if (parentEntity == null) {
            parentEntity = new ArrayList<CharacterStringPropertyType>();
        }
        return this.parentEntity;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setRule(CharacterStringPropertyType value) {
        this.rule = value;
    }

    /**
     * Gets the value of the rationale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rationale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRationale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getRationale() {
        if (rationale == null) {
            rationale = new ArrayList<CharacterStringPropertyType>();
        }
        return this.rationale;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.source;
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
            CharacterStringPropertyType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            CharacterStringPropertyType theShortName;
            theShortName = this.getShortName();
            strategy.appendField(locator, this, "shortName", buffer, theShortName);
        }
        {
            IntegerPropertyType theDomainCode;
            theDomainCode = this.getDomainCode();
            strategy.appendField(locator, this, "domainCode", buffer, theDomainCode);
        }
        {
            CharacterStringPropertyType theDefinition;
            theDefinition = this.getDefinition();
            strategy.appendField(locator, this, "definition", buffer, theDefinition);
        }
        {
            MDObligationCodePropertyType theObligation;
            theObligation = this.getObligation();
            strategy.appendField(locator, this, "obligation", buffer, theObligation);
        }
        {
            CharacterStringPropertyType theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        {
            MDDatatypeCodePropertyType theDataType;
            theDataType = this.getDataType();
            strategy.appendField(locator, this, "dataType", buffer, theDataType);
        }
        {
            CharacterStringPropertyType theMaximumOccurrence;
            theMaximumOccurrence = this.getMaximumOccurrence();
            strategy.appendField(locator, this, "maximumOccurrence", buffer, theMaximumOccurrence);
        }
        {
            CharacterStringPropertyType theDomainValue;
            theDomainValue = this.getDomainValue();
            strategy.appendField(locator, this, "domainValue", buffer, theDomainValue);
        }
        {
            List<CharacterStringPropertyType> theParentEntity;
            theParentEntity = (((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()))?this.getParentEntity():null);
            strategy.appendField(locator, this, "parentEntity", buffer, theParentEntity);
        }
        {
            CharacterStringPropertyType theRule;
            theRule = this.getRule();
            strategy.appendField(locator, this, "rule", buffer, theRule);
        }
        {
            List<CharacterStringPropertyType> theRationale;
            theRationale = (((this.rationale!= null)&&(!this.rationale.isEmpty()))?this.getRationale():null);
            strategy.appendField(locator, this, "rationale", buffer, theRationale);
        }
        {
            List<CIResponsiblePartyPropertyType> theSource;
            theSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MDExtendedElementInformationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MDExtendedElementInformationType that = ((MDExtendedElementInformationType) object);
        {
            CharacterStringPropertyType lhsName;
            lhsName = this.getName();
            CharacterStringPropertyType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsShortName;
            lhsShortName = this.getShortName();
            CharacterStringPropertyType rhsShortName;
            rhsShortName = that.getShortName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortName", lhsShortName), LocatorUtils.property(thatLocator, "shortName", rhsShortName), lhsShortName, rhsShortName)) {
                return false;
            }
        }
        {
            IntegerPropertyType lhsDomainCode;
            lhsDomainCode = this.getDomainCode();
            IntegerPropertyType rhsDomainCode;
            rhsDomainCode = that.getDomainCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domainCode", lhsDomainCode), LocatorUtils.property(thatLocator, "domainCode", rhsDomainCode), lhsDomainCode, rhsDomainCode)) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsDefinition;
            lhsDefinition = this.getDefinition();
            CharacterStringPropertyType rhsDefinition;
            rhsDefinition = that.getDefinition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "definition", lhsDefinition), LocatorUtils.property(thatLocator, "definition", rhsDefinition), lhsDefinition, rhsDefinition)) {
                return false;
            }
        }
        {
            MDObligationCodePropertyType lhsObligation;
            lhsObligation = this.getObligation();
            MDObligationCodePropertyType rhsObligation;
            rhsObligation = that.getObligation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "obligation", lhsObligation), LocatorUtils.property(thatLocator, "obligation", rhsObligation), lhsObligation, rhsObligation)) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsCondition;
            lhsCondition = this.getCondition();
            CharacterStringPropertyType rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition)) {
                return false;
            }
        }
        {
            MDDatatypeCodePropertyType lhsDataType;
            lhsDataType = this.getDataType();
            MDDatatypeCodePropertyType rhsDataType;
            rhsDataType = that.getDataType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataType", lhsDataType), LocatorUtils.property(thatLocator, "dataType", rhsDataType), lhsDataType, rhsDataType)) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsMaximumOccurrence;
            lhsMaximumOccurrence = this.getMaximumOccurrence();
            CharacterStringPropertyType rhsMaximumOccurrence;
            rhsMaximumOccurrence = that.getMaximumOccurrence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumOccurrence", lhsMaximumOccurrence), LocatorUtils.property(thatLocator, "maximumOccurrence", rhsMaximumOccurrence), lhsMaximumOccurrence, rhsMaximumOccurrence)) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsDomainValue;
            lhsDomainValue = this.getDomainValue();
            CharacterStringPropertyType rhsDomainValue;
            rhsDomainValue = that.getDomainValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domainValue", lhsDomainValue), LocatorUtils.property(thatLocator, "domainValue", rhsDomainValue), lhsDomainValue, rhsDomainValue)) {
                return false;
            }
        }
        {
            List<CharacterStringPropertyType> lhsParentEntity;
            lhsParentEntity = (((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()))?this.getParentEntity():null);
            List<CharacterStringPropertyType> rhsParentEntity;
            rhsParentEntity = (((that.parentEntity!= null)&&(!that.parentEntity.isEmpty()))?that.getParentEntity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentEntity", lhsParentEntity), LocatorUtils.property(thatLocator, "parentEntity", rhsParentEntity), lhsParentEntity, rhsParentEntity)) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsRule;
            lhsRule = this.getRule();
            CharacterStringPropertyType rhsRule;
            rhsRule = that.getRule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rule", lhsRule), LocatorUtils.property(thatLocator, "rule", rhsRule), lhsRule, rhsRule)) {
                return false;
            }
        }
        {
            List<CharacterStringPropertyType> lhsRationale;
            lhsRationale = (((this.rationale!= null)&&(!this.rationale.isEmpty()))?this.getRationale():null);
            List<CharacterStringPropertyType> rhsRationale;
            rhsRationale = (((that.rationale!= null)&&(!that.rationale.isEmpty()))?that.getRationale():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rationale", lhsRationale), LocatorUtils.property(thatLocator, "rationale", rhsRationale), lhsRationale, rhsRationale)) {
                return false;
            }
        }
        {
            List<CIResponsiblePartyPropertyType> lhsSource;
            lhsSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            List<CIResponsiblePartyPropertyType> rhsSource;
            rhsSource = (((that.source!= null)&&(!that.source.isEmpty()))?that.getSource():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource)) {
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
            CharacterStringPropertyType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            CharacterStringPropertyType theShortName;
            theShortName = this.getShortName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shortName", theShortName), currentHashCode, theShortName);
        }
        {
            IntegerPropertyType theDomainCode;
            theDomainCode = this.getDomainCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domainCode", theDomainCode), currentHashCode, theDomainCode);
        }
        {
            CharacterStringPropertyType theDefinition;
            theDefinition = this.getDefinition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "definition", theDefinition), currentHashCode, theDefinition);
        }
        {
            MDObligationCodePropertyType theObligation;
            theObligation = this.getObligation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "obligation", theObligation), currentHashCode, theObligation);
        }
        {
            CharacterStringPropertyType theCondition;
            theCondition = this.getCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "condition", theCondition), currentHashCode, theCondition);
        }
        {
            MDDatatypeCodePropertyType theDataType;
            theDataType = this.getDataType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataType", theDataType), currentHashCode, theDataType);
        }
        {
            CharacterStringPropertyType theMaximumOccurrence;
            theMaximumOccurrence = this.getMaximumOccurrence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumOccurrence", theMaximumOccurrence), currentHashCode, theMaximumOccurrence);
        }
        {
            CharacterStringPropertyType theDomainValue;
            theDomainValue = this.getDomainValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domainValue", theDomainValue), currentHashCode, theDomainValue);
        }
        {
            List<CharacterStringPropertyType> theParentEntity;
            theParentEntity = (((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()))?this.getParentEntity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentEntity", theParentEntity), currentHashCode, theParentEntity);
        }
        {
            CharacterStringPropertyType theRule;
            theRule = this.getRule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rule", theRule), currentHashCode, theRule);
        }
        {
            List<CharacterStringPropertyType> theRationale;
            theRationale = (((this.rationale!= null)&&(!this.rationale.isEmpty()))?this.getRationale():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rationale", theRationale), currentHashCode, theRationale);
        }
        {
            List<CIResponsiblePartyPropertyType> theSource;
            theSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource);
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
        if (draftCopy instanceof MDExtendedElementInformationType) {
            final MDExtendedElementInformationType copy = ((MDExtendedElementInformationType) draftCopy);
            if (this.name!= null) {
                CharacterStringPropertyType sourceName;
                sourceName = this.getName();
                CharacterStringPropertyType copyName = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName));
                copy.setName(copyName);
            } else {
                copy.name = null;
            }
            if (this.shortName!= null) {
                CharacterStringPropertyType sourceShortName;
                sourceShortName = this.getShortName();
                CharacterStringPropertyType copyShortName = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "shortName", sourceShortName), sourceShortName));
                copy.setShortName(copyShortName);
            } else {
                copy.shortName = null;
            }
            if (this.domainCode!= null) {
                IntegerPropertyType sourceDomainCode;
                sourceDomainCode = this.getDomainCode();
                IntegerPropertyType copyDomainCode = ((IntegerPropertyType) strategy.copy(LocatorUtils.property(locator, "domainCode", sourceDomainCode), sourceDomainCode));
                copy.setDomainCode(copyDomainCode);
            } else {
                copy.domainCode = null;
            }
            if (this.definition!= null) {
                CharacterStringPropertyType sourceDefinition;
                sourceDefinition = this.getDefinition();
                CharacterStringPropertyType copyDefinition = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "definition", sourceDefinition), sourceDefinition));
                copy.setDefinition(copyDefinition);
            } else {
                copy.definition = null;
            }
            if (this.obligation!= null) {
                MDObligationCodePropertyType sourceObligation;
                sourceObligation = this.getObligation();
                MDObligationCodePropertyType copyObligation = ((MDObligationCodePropertyType) strategy.copy(LocatorUtils.property(locator, "obligation", sourceObligation), sourceObligation));
                copy.setObligation(copyObligation);
            } else {
                copy.obligation = null;
            }
            if (this.condition!= null) {
                CharacterStringPropertyType sourceCondition;
                sourceCondition = this.getCondition();
                CharacterStringPropertyType copyCondition = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition));
                copy.setCondition(copyCondition);
            } else {
                copy.condition = null;
            }
            if (this.dataType!= null) {
                MDDatatypeCodePropertyType sourceDataType;
                sourceDataType = this.getDataType();
                MDDatatypeCodePropertyType copyDataType = ((MDDatatypeCodePropertyType) strategy.copy(LocatorUtils.property(locator, "dataType", sourceDataType), sourceDataType));
                copy.setDataType(copyDataType);
            } else {
                copy.dataType = null;
            }
            if (this.maximumOccurrence!= null) {
                CharacterStringPropertyType sourceMaximumOccurrence;
                sourceMaximumOccurrence = this.getMaximumOccurrence();
                CharacterStringPropertyType copyMaximumOccurrence = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "maximumOccurrence", sourceMaximumOccurrence), sourceMaximumOccurrence));
                copy.setMaximumOccurrence(copyMaximumOccurrence);
            } else {
                copy.maximumOccurrence = null;
            }
            if (this.domainValue!= null) {
                CharacterStringPropertyType sourceDomainValue;
                sourceDomainValue = this.getDomainValue();
                CharacterStringPropertyType copyDomainValue = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "domainValue", sourceDomainValue), sourceDomainValue));
                copy.setDomainValue(copyDomainValue);
            } else {
                copy.domainValue = null;
            }
            if ((this.parentEntity!= null)&&(!this.parentEntity.isEmpty())) {
                List<CharacterStringPropertyType> sourceParentEntity;
                sourceParentEntity = (((this.parentEntity!= null)&&(!this.parentEntity.isEmpty()))?this.getParentEntity():null);
                @SuppressWarnings("unchecked")
                List<CharacterStringPropertyType> copyParentEntity = ((List<CharacterStringPropertyType> ) strategy.copy(LocatorUtils.property(locator, "parentEntity", sourceParentEntity), sourceParentEntity));
                copy.parentEntity = null;
                if (copyParentEntity!= null) {
                    List<CharacterStringPropertyType> uniqueParentEntityl = copy.getParentEntity();
                    uniqueParentEntityl.addAll(copyParentEntity);
                }
            } else {
                copy.parentEntity = null;
            }
            if (this.rule!= null) {
                CharacterStringPropertyType sourceRule;
                sourceRule = this.getRule();
                CharacterStringPropertyType copyRule = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "rule", sourceRule), sourceRule));
                copy.setRule(copyRule);
            } else {
                copy.rule = null;
            }
            if ((this.rationale!= null)&&(!this.rationale.isEmpty())) {
                List<CharacterStringPropertyType> sourceRationale;
                sourceRationale = (((this.rationale!= null)&&(!this.rationale.isEmpty()))?this.getRationale():null);
                @SuppressWarnings("unchecked")
                List<CharacterStringPropertyType> copyRationale = ((List<CharacterStringPropertyType> ) strategy.copy(LocatorUtils.property(locator, "rationale", sourceRationale), sourceRationale));
                copy.rationale = null;
                if (copyRationale!= null) {
                    List<CharacterStringPropertyType> uniqueRationalel = copy.getRationale();
                    uniqueRationalel.addAll(copyRationale);
                }
            } else {
                copy.rationale = null;
            }
            if ((this.source!= null)&&(!this.source.isEmpty())) {
                List<CIResponsiblePartyPropertyType> sourceSource;
                sourceSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
                @SuppressWarnings("unchecked")
                List<CIResponsiblePartyPropertyType> copySource = ((List<CIResponsiblePartyPropertyType> ) strategy.copy(LocatorUtils.property(locator, "source", sourceSource), sourceSource));
                copy.source = null;
                if (copySource!= null) {
                    List<CIResponsiblePartyPropertyType> uniqueSourcel = copy.getSource();
                    uniqueSourcel.addAll(copySource);
                }
            } else {
                copy.source = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDExtendedElementInformationType();
    }

}