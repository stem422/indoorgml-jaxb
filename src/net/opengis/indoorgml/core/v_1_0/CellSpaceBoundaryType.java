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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureType;
import net.opengis.gml.v_3_2_1.CurvePropertyType;
import net.opengis.gml.v_3_2_1.SurfacePropertyType;
import net.opengis.indoorgml.navigation.v_1_0.NavigableBoundaryType;


/**
 * <p>CellSpaceBoundaryType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="CellSpaceBoundaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="duality" type="{http://www.opengis.net/indoorgml/1.0/core}TransitionPropertyType" minOccurs="0"/>
 *         &lt;group ref="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceBoundaryGeometry" minOccurs="0"/>
 *         &lt;element name="externalReference" type="{http://www.opengis.net/indoorgml/1.0/core}ExternalReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellSpaceBoundaryType", propOrder = {
    "duality",
    "geometry3D",
    "geometry2D",
    "externalReference"
})
@XmlSeeAlso({
    NavigableBoundaryType.class
})
public class CellSpaceBoundaryType
    extends AbstractFeatureType
{

    protected TransitionPropertyType duality;
    protected SurfacePropertyType geometry3D;
    protected CurvePropertyType geometry2D;
    protected List<ExternalReferenceType> externalReference;

    /**
     * duality �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link TransitionPropertyType }
     *     
     */
    public TransitionPropertyType getDuality() {
        return duality;
    }

    /**
     * duality �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionPropertyType }
     *     
     */
    public void setDuality(TransitionPropertyType value) {
        this.duality = value;
    }

    public boolean isSetDuality() {
        return (this.duality!= null);
    }

    /**
     * geometry3D �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getGeometry3D() {
        return geometry3D;
    }

    /**
     * geometry3D �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setGeometry3D(SurfacePropertyType value) {
        this.geometry3D = value;
    }

    public boolean isSetGeometry3D() {
        return (this.geometry3D!= null);
    }

    /**
     * geometry2D �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getGeometry2D() {
        return geometry2D;
    }

    /**
     * geometry2D �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setGeometry2D(CurvePropertyType value) {
        this.geometry2D = value;
    }

    public boolean isSetGeometry2D() {
        return (this.geometry2D!= null);
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReferenceType }
     * 
     * 
     */
    public List<ExternalReferenceType> getExternalReference() {
        if (externalReference == null) {
            externalReference = new ArrayList<ExternalReferenceType>();
        }
        return this.externalReference;
    }

    public boolean isSetExternalReference() {
        return ((this.externalReference!= null)&&(!this.externalReference.isEmpty()));
    }

    public void unsetExternalReference() {
        this.externalReference = null;
    }

}
