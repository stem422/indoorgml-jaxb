//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
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


/**
 * <p>SpaceLayerType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SpaceLayerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="usage" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="function" type="{http://www.opengis.net/gml/3.2}CodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="class" type="{http://www.opengis.net/indoorgml/1.0/core}SpaceLayerClassTypeType" minOccurs="0"/>
 *         &lt;element name="nodes" type="{http://www.opengis.net/indoorgml/1.0/core}NodesType" maxOccurs="unbounded"/>
 *         &lt;element name="edges" type="{http://www.opengis.net/indoorgml/1.0/core}EdgesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

    public boolean isSetUsage() {
        return ((this.usage!= null)&&(!this.usage.isEmpty()));
    }

    public void unsetUsage() {
        this.usage = null;
    }

    /**
     * terminationDate 속성의 값을 가져옵니다.
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
     * terminationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    public boolean isSetTerminationDate() {
        return (this.terminationDate!= null);
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

    public boolean isSetFunction() {
        return ((this.function!= null)&&(!this.function.isEmpty()));
    }

    public void unsetFunction() {
        this.function = null;
    }

    /**
     * creationDate 속성의 값을 가져옵니다.
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
     * creationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    public boolean isSetCreationDate() {
        return (this.creationDate!= null);
    }

    /**
     * clazz 속성의 값을 가져옵니다.
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
     * clazz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SpaceLayerClassTypeType }
     *     
     */
    public void setClazz(SpaceLayerClassTypeType value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
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

    public boolean isSetNodes() {
        return ((this.nodes!= null)&&(!this.nodes.isEmpty()));
    }

    public void unsetNodes() {
        this.nodes = null;
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

    public boolean isSetEdges() {
        return ((this.edges!= null)&&(!this.edges.isEmpty()));
    }

    public void unsetEdges() {
        this.edges = null;
    }

}
