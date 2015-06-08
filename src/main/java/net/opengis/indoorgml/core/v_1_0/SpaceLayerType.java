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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.CodeType;
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
 * <p>Java class for SpaceLayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpaceLayerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usage" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="function" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{http://www.opengis.net/indoorgml/1.0/core}SpaceLayerClassTypeType" minOccurs="0"/&gt;
 *         &lt;element name="nodes" type="{http://www.opengis.net/indoorgml/1.0/core}NodesType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="edges" type="{http://www.opengis.net/indoorgml/1.0/core}EdgesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpaceLayerType", propOrder = {
    "usage",
    "terminationDate",
    "function",
    "creationDate",
    "clazz",
    "nodes",
    "edges"
})
public class SpaceLayerType
    extends AbstractFeatureType
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    protected List<CodeType> usage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar terminationDate;
    protected List<CodeType> function;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "class")
    @XmlSchemaType(name = "string")
    protected SpaceLayerClassTypeType clazz;
    @XmlElement(required = true)
    protected List<NodesType> nodes;
    protected List<EdgesType> edges;

    /**
     * Gets the value of the usage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getUsage() {
        if (usage == null) {
            usage = new ArrayList<CodeType>();
        }
        return this.usage;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the function property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeType }
     * 
     * 
     */
    public List<CodeType> getFunction() {
        if (function == null) {
            function = new ArrayList<CodeType>();
        }
        return this.function;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link SpaceLayerClassTypeType }
     *     
     */
    public SpaceLayerClassTypeType getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpaceLayerClassTypeType }
     *     
     */
    public void setClazz(SpaceLayerClassTypeType value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodesType }
     * 
     * 
     */
    public List<NodesType> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<NodesType>();
        }
        return this.nodes;
    }

    /**
     * Gets the value of the edges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEdges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdgesType }
     * 
     * 
     */
    public List<EdgesType> getEdges() {
        if (edges == null) {
            edges = new ArrayList<EdgesType>();
        }
        return this.edges;
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
            List<CodeType> theUsage;
            theUsage = (((this.usage!= null)&&(!this.usage.isEmpty()))?this.getUsage():null);
            strategy.appendField(locator, this, "usage", buffer, theUsage);
        }
        {
            XMLGregorianCalendar theTerminationDate;
            theTerminationDate = this.getTerminationDate();
            strategy.appendField(locator, this, "terminationDate", buffer, theTerminationDate);
        }
        {
            List<CodeType> theFunction;
            theFunction = (((this.function!= null)&&(!this.function.isEmpty()))?this.getFunction():null);
            strategy.appendField(locator, this, "function", buffer, theFunction);
        }
        {
            XMLGregorianCalendar theCreationDate;
            theCreationDate = this.getCreationDate();
            strategy.appendField(locator, this, "creationDate", buffer, theCreationDate);
        }
        {
            SpaceLayerClassTypeType theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz);
        }
        {
            List<NodesType> theNodes;
            theNodes = (((this.nodes!= null)&&(!this.nodes.isEmpty()))?this.getNodes():null);
            strategy.appendField(locator, this, "nodes", buffer, theNodes);
        }
        {
            List<EdgesType> theEdges;
            theEdges = (((this.edges!= null)&&(!this.edges.isEmpty()))?this.getEdges():null);
            strategy.appendField(locator, this, "edges", buffer, theEdges);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SpaceLayerType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SpaceLayerType that = ((SpaceLayerType) object);
        {
            List<CodeType> lhsUsage;
            lhsUsage = (((this.usage!= null)&&(!this.usage.isEmpty()))?this.getUsage():null);
            List<CodeType> rhsUsage;
            rhsUsage = (((that.usage!= null)&&(!that.usage.isEmpty()))?that.getUsage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usage", lhsUsage), LocatorUtils.property(thatLocator, "usage", rhsUsage), lhsUsage, rhsUsage)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTerminationDate;
            lhsTerminationDate = this.getTerminationDate();
            XMLGregorianCalendar rhsTerminationDate;
            rhsTerminationDate = that.getTerminationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terminationDate", lhsTerminationDate), LocatorUtils.property(thatLocator, "terminationDate", rhsTerminationDate), lhsTerminationDate, rhsTerminationDate)) {
                return false;
            }
        }
        {
            List<CodeType> lhsFunction;
            lhsFunction = (((this.function!= null)&&(!this.function.isEmpty()))?this.getFunction():null);
            List<CodeType> rhsFunction;
            rhsFunction = (((that.function!= null)&&(!that.function.isEmpty()))?that.getFunction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "function", lhsFunction), LocatorUtils.property(thatLocator, "function", rhsFunction), lhsFunction, rhsFunction)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCreationDate;
            lhsCreationDate = this.getCreationDate();
            XMLGregorianCalendar rhsCreationDate;
            rhsCreationDate = that.getCreationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creationDate", lhsCreationDate), LocatorUtils.property(thatLocator, "creationDate", rhsCreationDate), lhsCreationDate, rhsCreationDate)) {
                return false;
            }
        }
        {
            SpaceLayerClassTypeType lhsClazz;
            lhsClazz = this.getClazz();
            SpaceLayerClassTypeType rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz)) {
                return false;
            }
        }
        {
            List<NodesType> lhsNodes;
            lhsNodes = (((this.nodes!= null)&&(!this.nodes.isEmpty()))?this.getNodes():null);
            List<NodesType> rhsNodes;
            rhsNodes = (((that.nodes!= null)&&(!that.nodes.isEmpty()))?that.getNodes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nodes", lhsNodes), LocatorUtils.property(thatLocator, "nodes", rhsNodes), lhsNodes, rhsNodes)) {
                return false;
            }
        }
        {
            List<EdgesType> lhsEdges;
            lhsEdges = (((this.edges!= null)&&(!this.edges.isEmpty()))?this.getEdges():null);
            List<EdgesType> rhsEdges;
            rhsEdges = (((that.edges!= null)&&(!that.edges.isEmpty()))?that.getEdges():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "edges", lhsEdges), LocatorUtils.property(thatLocator, "edges", rhsEdges), lhsEdges, rhsEdges)) {
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
            List<CodeType> theUsage;
            theUsage = (((this.usage!= null)&&(!this.usage.isEmpty()))?this.getUsage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usage", theUsage), currentHashCode, theUsage);
        }
        {
            XMLGregorianCalendar theTerminationDate;
            theTerminationDate = this.getTerminationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "terminationDate", theTerminationDate), currentHashCode, theTerminationDate);
        }
        {
            List<CodeType> theFunction;
            theFunction = (((this.function!= null)&&(!this.function.isEmpty()))?this.getFunction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "function", theFunction), currentHashCode, theFunction);
        }
        {
            XMLGregorianCalendar theCreationDate;
            theCreationDate = this.getCreationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creationDate", theCreationDate), currentHashCode, theCreationDate);
        }
        {
            SpaceLayerClassTypeType theClazz;
            theClazz = this.getClazz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clazz", theClazz), currentHashCode, theClazz);
        }
        {
            List<NodesType> theNodes;
            theNodes = (((this.nodes!= null)&&(!this.nodes.isEmpty()))?this.getNodes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nodes", theNodes), currentHashCode, theNodes);
        }
        {
            List<EdgesType> theEdges;
            theEdges = (((this.edges!= null)&&(!this.edges.isEmpty()))?this.getEdges():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "edges", theEdges), currentHashCode, theEdges);
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
        if (draftCopy instanceof SpaceLayerType) {
            final SpaceLayerType copy = ((SpaceLayerType) draftCopy);
            if ((this.usage!= null)&&(!this.usage.isEmpty())) {
                List<CodeType> sourceUsage;
                sourceUsage = (((this.usage!= null)&&(!this.usage.isEmpty()))?this.getUsage():null);
                @SuppressWarnings("unchecked")
                List<CodeType> copyUsage = ((List<CodeType> ) strategy.copy(LocatorUtils.property(locator, "usage", sourceUsage), sourceUsage));
                copy.usage = null;
                if (copyUsage!= null) {
                    List<CodeType> uniqueUsagel = copy.getUsage();
                    uniqueUsagel.addAll(copyUsage);
                }
            } else {
                copy.usage = null;
            }
            if (this.terminationDate!= null) {
                XMLGregorianCalendar sourceTerminationDate;
                sourceTerminationDate = this.getTerminationDate();
                XMLGregorianCalendar copyTerminationDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "terminationDate", sourceTerminationDate), sourceTerminationDate));
                copy.setTerminationDate(copyTerminationDate);
            } else {
                copy.terminationDate = null;
            }
            if ((this.function!= null)&&(!this.function.isEmpty())) {
                List<CodeType> sourceFunction;
                sourceFunction = (((this.function!= null)&&(!this.function.isEmpty()))?this.getFunction():null);
                @SuppressWarnings("unchecked")
                List<CodeType> copyFunction = ((List<CodeType> ) strategy.copy(LocatorUtils.property(locator, "function", sourceFunction), sourceFunction));
                copy.function = null;
                if (copyFunction!= null) {
                    List<CodeType> uniqueFunctionl = copy.getFunction();
                    uniqueFunctionl.addAll(copyFunction);
                }
            } else {
                copy.function = null;
            }
            if (this.creationDate!= null) {
                XMLGregorianCalendar sourceCreationDate;
                sourceCreationDate = this.getCreationDate();
                XMLGregorianCalendar copyCreationDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "creationDate", sourceCreationDate), sourceCreationDate));
                copy.setCreationDate(copyCreationDate);
            } else {
                copy.creationDate = null;
            }
            if (this.clazz!= null) {
                SpaceLayerClassTypeType sourceClazz;
                sourceClazz = this.getClazz();
                SpaceLayerClassTypeType copyClazz = ((SpaceLayerClassTypeType) strategy.copy(LocatorUtils.property(locator, "clazz", sourceClazz), sourceClazz));
                copy.setClazz(copyClazz);
            } else {
                copy.clazz = null;
            }
            if ((this.nodes!= null)&&(!this.nodes.isEmpty())) {
                List<NodesType> sourceNodes;
                sourceNodes = (((this.nodes!= null)&&(!this.nodes.isEmpty()))?this.getNodes():null);
                @SuppressWarnings("unchecked")
                List<NodesType> copyNodes = ((List<NodesType> ) strategy.copy(LocatorUtils.property(locator, "nodes", sourceNodes), sourceNodes));
                copy.nodes = null;
                if (copyNodes!= null) {
                    List<NodesType> uniqueNodesl = copy.getNodes();
                    uniqueNodesl.addAll(copyNodes);
                }
            } else {
                copy.nodes = null;
            }
            if ((this.edges!= null)&&(!this.edges.isEmpty())) {
                List<EdgesType> sourceEdges;
                sourceEdges = (((this.edges!= null)&&(!this.edges.isEmpty()))?this.getEdges():null);
                @SuppressWarnings("unchecked")
                List<EdgesType> copyEdges = ((List<EdgesType> ) strategy.copy(LocatorUtils.property(locator, "edges", sourceEdges), sourceEdges));
                copy.edges = null;
                if (copyEdges!= null) {
                    List<EdgesType> uniqueEdgesl = copy.getEdges();
                    uniqueEdgesl.addAll(copyEdges);
                }
            } else {
                copy.edges = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SpaceLayerType();
    }

}