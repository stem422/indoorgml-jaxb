//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the vector spatial objects in the dataset
 * 
 * <p>MD_VectorSpatialRepresentation_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MD_VectorSpatialRepresentation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_SpatialRepresentation_Type">
 *       &lt;sequence>
 *         &lt;element name="topologyLevel" type="{http://www.isotc211.org/2005/gmd}MD_TopologyLevelCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="geometricObjects" type="{http://www.isotc211.org/2005/gmd}MD_GeometricObjects_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_VectorSpatialRepresentation_Type", propOrder = {
    "topologyLevel",
    "geometricObjects"
})
public class MDVectorSpatialRepresentationType
    extends AbstractMDSpatialRepresentationType
{

    protected MDTopologyLevelCodePropertyType topologyLevel;
    protected List<MDGeometricObjectsPropertyType> geometricObjects;

    /**
     * topologyLevel �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MDTopologyLevelCodePropertyType }
     *     
     */
    public MDTopologyLevelCodePropertyType getTopologyLevel() {
        return topologyLevel;
    }

    /**
     * topologyLevel �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MDTopologyLevelCodePropertyType }
     *     
     */
    public void setTopologyLevel(MDTopologyLevelCodePropertyType value) {
        this.topologyLevel = value;
    }

    public boolean isSetTopologyLevel() {
        return (this.topologyLevel!= null);
    }

    /**
     * Gets the value of the geometricObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometricObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometricObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDGeometricObjectsPropertyType }
     * 
     * 
     */
    public List<MDGeometricObjectsPropertyType> getGeometricObjects() {
        if (geometricObjects == null) {
            geometricObjects = new ArrayList<MDGeometricObjectsPropertyType>();
        }
        return this.geometricObjects;
    }

    public boolean isSetGeometricObjects() {
        return ((this.geometricObjects!= null)&&(!this.geometricObjects.isEmpty()));
    }

    public void unsetGeometricObjects() {
        this.geometricObjects = null;
    }

}
