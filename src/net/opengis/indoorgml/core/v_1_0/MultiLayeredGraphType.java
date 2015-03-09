//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
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
 * <p>MultiLayeredGraphType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
