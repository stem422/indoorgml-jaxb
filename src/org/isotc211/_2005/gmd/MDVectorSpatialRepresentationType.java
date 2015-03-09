//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
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
 * <p>MD_VectorSpatialRepresentation_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
     * topologyLevel 속성의 값을 가져옵니다.
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
     * topologyLevel 속성의 값을 설정합니다.
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
