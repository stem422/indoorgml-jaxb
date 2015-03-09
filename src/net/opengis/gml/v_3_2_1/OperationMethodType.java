//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OperationMethodType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="OperationMethodType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}formulaCitation"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}formula"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}sourceDimensions" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}targetDimensions" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMethodType", propOrder = {
    "formulaCitation",
    "formula",
    "sourceDimensions",
    "targetDimensions",
    "parameter"
})
public class OperationMethodType
    extends IdentifiedObjectType
{

    protected FormulaCitationElement formulaCitation;
    @XmlElementRef(name = "formula", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeType> formula;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceDimensions;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger targetDimensions;
    @XmlElementRef(name = "parameter", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> parameter;

    /**
     * formulaCitation �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link FormulaCitationElement }
     *     
     */
    public FormulaCitationElement getFormulaCitation() {
        return formulaCitation;
    }

    /**
     * formulaCitation �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaCitationElement }
     *     
     */
    public void setFormulaCitation(FormulaCitationElement value) {
        this.formulaCitation = value;
    }

    public boolean isSetFormulaCitation() {
        return (this.formulaCitation!= null);
    }

    /**
     * formula �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public JAXBElement<CodeType> getFormula() {
        return formula;
    }

    /**
     * formula �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CodeType }{@code >}
     *     
     */
    public void setFormula(JAXBElement<CodeType> value) {
        this.formula = value;
    }

    public boolean isSetFormula() {
        return (this.formula!= null);
    }

    /**
     * sourceDimensions �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceDimensions() {
        return sourceDimensions;
    }

    /**
     * sourceDimensions �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceDimensions(BigInteger value) {
        this.sourceDimensions = value;
    }

    public boolean isSetSourceDimensions() {
        return (this.sourceDimensions!= null);
    }

    /**
     * targetDimensions �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetDimensions() {
        return targetDimensions;
    }

    /**
     * targetDimensions �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetDimensions(BigInteger value) {
        this.targetDimensions = value;
    }

    public boolean isSetTargetDimensions() {
        return (this.targetDimensions!= null);
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralOperationParameterPropertyType>> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<JAXBElement<AbstractGeneralOperationParameterPropertyType>>();
        }
        return this.parameter;
    }

    public boolean isSetParameter() {
        return ((this.parameter!= null)&&(!this.parameter.isEmpty()));
    }

    public void unsetParameter() {
        this.parameter = null;
    }

}
