//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.MeasurePropertyType;


/**
 * <p>MD_Dimension_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MD_Dimension_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="dimensionName" type="{http://www.isotc211.org/2005/gmd}MD_DimensionNameTypeCode_PropertyType"/>
 *         &lt;element name="dimensionSize" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/>
 *         &lt;element name="resolution" type="{http://www.isotc211.org/2005/gco}Measure_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Dimension_Type", propOrder = {
    "dimensionName",
    "dimensionSize",
    "resolution"
})
public class MDDimensionType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDDimensionNameTypeCodePropertyType dimensionName;
    @XmlElement(required = true)
    protected IntegerPropertyType dimensionSize;
    protected MeasurePropertyType resolution;

    /**
     * dimensionName �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public MDDimensionNameTypeCodePropertyType getDimensionName() {
        return dimensionName;
    }

    /**
     * dimensionName �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MDDimensionNameTypeCodePropertyType }
     *     
     */
    public void setDimensionName(MDDimensionNameTypeCodePropertyType value) {
        this.dimensionName = value;
    }

    public boolean isSetDimensionName() {
        return (this.dimensionName!= null);
    }

    /**
     * dimensionSize �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDimensionSize() {
        return dimensionSize;
    }

    /**
     * dimensionSize �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDimensionSize(IntegerPropertyType value) {
        this.dimensionSize = value;
    }

    public boolean isSetDimensionSize() {
        return (this.dimensionSize!= null);
    }

    /**
     * resolution �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MeasurePropertyType }
     *     
     */
    public MeasurePropertyType getResolution() {
        return resolution;
    }

    /**
     * resolution �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurePropertyType }
     *     
     */
    public void setResolution(MeasurePropertyType value) {
        this.resolution = value;
    }

    public boolean isSetResolution() {
        return (this.resolution!= null);
    }

}
