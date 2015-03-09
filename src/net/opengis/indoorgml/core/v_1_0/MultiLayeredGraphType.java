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
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;


/**
 * <p>MultiLayeredGraphType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MultiLayeredGraphType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="spaceLayers" type="{http://www.opengis.net/indoorgml/1.0/core}SpaceLayersType" maxOccurs="unbounded"/>
 *         &lt;element name="interEdges" type="{http://www.opengis.net/indoorgml/1.0/core}InterEdgesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiLayeredGraphType", propOrder = {
    "spaceLayers",
    "interEdges"
})
public class MultiLayeredGraphType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected List<SpaceLayersType> spaceLayers;
    protected List<InterEdgesType> interEdges;

    /**
     * Gets the value of the spaceLayers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spaceLayers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpaceLayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpaceLayersType }
     * 
     * 
     */
    public List<SpaceLayersType> getSpaceLayers() {
        if (spaceLayers == null) {
            spaceLayers = new ArrayList<SpaceLayersType>();
        }
        return this.spaceLayers;
    }

    public boolean isSetSpaceLayers() {
        return ((this.spaceLayers!= null)&&(!this.spaceLayers.isEmpty()));
    }

    public void unsetSpaceLayers() {
        this.spaceLayers = null;
    }

    /**
     * Gets the value of the interEdges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interEdges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterEdges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterEdgesType }
     * 
     * 
     */
    public List<InterEdgesType> getInterEdges() {
        if (interEdges == null) {
            interEdges = new ArrayList<InterEdgesType>();
        }
        return this.interEdges;
    }

    public boolean isSetInterEdges() {
        return ((this.interEdges!= null)&&(!this.interEdges.isEmpty()));
    }

    public void unsetInterEdges() {
        this.interEdges = null;
    }

}
