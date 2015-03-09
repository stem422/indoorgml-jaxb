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
import net.opengis.gml.v_3_2_1.AbstractFeatureType;


/**
 * <p>InterLayerConnectionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="InterLayerConnectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="typeOfTopoExpression" type="{http://www.opengis.net/indoorgml/1.0/core}typeOfTopoExpressionCodeType" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interConnects" type="{http://www.opengis.net/indoorgml/1.0/core}StatePropertyType" maxOccurs="2" minOccurs="2"/>
 *         &lt;element name="ConnectedLayers" type="{http://www.opengis.net/indoorgml/1.0/core}SpaceLayerPropertyType" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterLayerConnectionType", propOrder = {
    "typeOfTopoExpression",
    "comment",
    "interConnects",
    "connectedLayers"
})
public class InterLayerConnectionType
    extends AbstractFeatureType
{

    @XmlSchemaType(name = "anySimpleType")
    protected String typeOfTopoExpression;
    protected String comment;
    @XmlElement(required = true)
    protected List<StatePropertyType> interConnects;
    @XmlElement(name = "ConnectedLayers", required = true)
    protected List<SpaceLayerPropertyType> connectedLayers;

    /**
     * typeOfTopoExpression 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfTopoExpression() {
        return typeOfTopoExpression;
    }

    /**
     * typeOfTopoExpression 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfTopoExpression(String value) {
        this.typeOfTopoExpression = value;
    }

    public boolean isSetTypeOfTopoExpression() {
        return (this.typeOfTopoExpression!= null);
    }

    /**
     * comment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * comment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    public boolean isSetComment() {
        return (this.comment!= null);
    }

    /**
     * Gets the value of the interConnects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interConnects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterConnects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatePropertyType }
     * 
     * 
     */
    public List<StatePropertyType> getInterConnects() {
        if (interConnects == null) {
            interConnects = new ArrayList<StatePropertyType>();
        }
        return this.interConnects;
    }

    public boolean isSetInterConnects() {
        return ((this.interConnects!= null)&&(!this.interConnects.isEmpty()));
    }

    public void unsetInterConnects() {
        this.interConnects = null;
    }

    /**
     * Gets the value of the connectedLayers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedLayers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectedLayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceLayerPropertyType }
     * 
     * 
     */
    public List<SpaceLayerPropertyType> getConnectedLayers() {
        if (connectedLayers == null) {
            connectedLayers = new ArrayList<SpaceLayerPropertyType>();
        }
        return this.connectedLayers;
    }

    public boolean isSetConnectedLayers() {
        return ((this.connectedLayers!= null)&&(!this.connectedLayers.isEmpty()));
    }

    public void unsetConnectedLayers() {
        this.connectedLayers = null;
    }

}
