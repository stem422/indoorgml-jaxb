//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CoverageFunctionType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="CoverageFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}MappingRule"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}CoverageMappingRule"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}GridFunction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageFunctionType", propOrder = {
    "mappingRule",
    "coverageMappingRule",
    "gridFunction"
})
public class CoverageFunctionType {

    @XmlElement(name = "MappingRule")
    protected StringOrRefType mappingRule;
    @XmlElement(name = "CoverageMappingRule")
    protected MappingRuleType coverageMappingRule;
    @XmlElement(name = "GridFunction")
    protected GridFunctionType gridFunction;

    /**
     * mappingRule �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getMappingRule() {
        return mappingRule;
    }

    /**
     * mappingRule �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setMappingRule(StringOrRefType value) {
        this.mappingRule = value;
    }

    public boolean isSetMappingRule() {
        return (this.mappingRule!= null);
    }

    /**
     * coverageMappingRule �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MappingRuleType }
     *     
     */
    public MappingRuleType getCoverageMappingRule() {
        return coverageMappingRule;
    }

    /**
     * coverageMappingRule �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingRuleType }
     *     
     */
    public void setCoverageMappingRule(MappingRuleType value) {
        this.coverageMappingRule = value;
    }

    public boolean isSetCoverageMappingRule() {
        return (this.coverageMappingRule!= null);
    }

    /**
     * gridFunction �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link GridFunctionType }
     *     
     */
    public GridFunctionType getGridFunction() {
        return gridFunction;
    }

    /**
     * gridFunction �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link GridFunctionType }
     *     
     */
    public void setGridFunction(GridFunctionType value) {
        this.gridFunction = value;
    }

    public boolean isSetGridFunction() {
        return (this.gridFunction!= null);
    }

}
