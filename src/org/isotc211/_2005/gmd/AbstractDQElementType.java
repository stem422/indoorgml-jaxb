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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;


/**
 * <p>AbstractDQ_Element_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="AbstractDQ_Element_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="nameOfMeasure" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measureIdentification" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="measureDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationMethodType" type="{http://www.isotc211.org/2005/gmd}DQ_EvaluationMethodTypeCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationMethodDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationProcedure" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.isotc211.org/2005/gmd}DQ_Result_PropertyType" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDQ_Element_Type", propOrder = {
    "nameOfMeasure",
    "measureIdentification",
    "measureDescription",
    "evaluationMethodType",
    "evaluationMethodDescription",
    "evaluationProcedure",
    "dateTime",
    "result"
})
@XmlSeeAlso({
    AbstractDQPositionalAccuracyType.class,
    AbstractDQTemporalAccuracyType.class,
    AbstractDQLogicalConsistencyType.class,
    AbstractDQCompletenessType.class,
    AbstractDQThematicAccuracyType.class
})
public abstract class AbstractDQElementType
    extends AbstractObjectType
{

    protected List<CharacterStringPropertyType> nameOfMeasure;
    protected MDIdentifierPropertyType measureIdentification;
    protected CharacterStringPropertyType measureDescription;
    protected DQEvaluationMethodTypeCodePropertyType evaluationMethodType;
    protected CharacterStringPropertyType evaluationMethodDescription;
    protected CICitationPropertyType evaluationProcedure;
    protected List<DateTimePropertyType> dateTime;
    @XmlElement(required = true)
    protected List<DQResultPropertyType> result;

    /**
     * Gets the value of the nameOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getNameOfMeasure() {
        if (nameOfMeasure == null) {
            nameOfMeasure = new ArrayList<CharacterStringPropertyType>();
        }
        return this.nameOfMeasure;
    }

    public boolean isSetNameOfMeasure() {
        return ((this.nameOfMeasure!= null)&&(!this.nameOfMeasure.isEmpty()));
    }

    public void unsetNameOfMeasure() {
        this.nameOfMeasure = null;
    }

    /**
     * measureIdentification �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getMeasureIdentification() {
        return measureIdentification;
    }

    /**
     * measureIdentification �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setMeasureIdentification(MDIdentifierPropertyType value) {
        this.measureIdentification = value;
    }

    public boolean isSetMeasureIdentification() {
        return (this.measureIdentification!= null);
    }

    /**
     * measureDescription �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMeasureDescription() {
        return measureDescription;
    }

    /**
     * measureDescription �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMeasureDescription(CharacterStringPropertyType value) {
        this.measureDescription = value;
    }

    public boolean isSetMeasureDescription() {
        return (this.measureDescription!= null);
    }

    /**
     * evaluationMethodType �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType() {
        return evaluationMethodType;
    }

    /**
     * evaluationMethodType �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public void setEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType value) {
        this.evaluationMethodType = value;
    }

    public boolean isSetEvaluationMethodType() {
        return (this.evaluationMethodType!= null);
    }

    /**
     * evaluationMethodDescription �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEvaluationMethodDescription() {
        return evaluationMethodDescription;
    }

    /**
     * evaluationMethodDescription �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEvaluationMethodDescription(CharacterStringPropertyType value) {
        this.evaluationMethodDescription = value;
    }

    public boolean isSetEvaluationMethodDescription() {
        return (this.evaluationMethodDescription!= null);
    }

    /**
     * evaluationProcedure �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getEvaluationProcedure() {
        return evaluationProcedure;
    }

    /**
     * evaluationProcedure �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setEvaluationProcedure(CICitationPropertyType value) {
        this.evaluationProcedure = value;
    }

    public boolean isSetEvaluationProcedure() {
        return (this.evaluationProcedure!= null);
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePropertyType }
     * 
     * 
     */
    public List<DateTimePropertyType> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<DateTimePropertyType>();
        }
        return this.dateTime;
    }

    public boolean isSetDateTime() {
        return ((this.dateTime!= null)&&(!this.dateTime.isEmpty()));
    }

    public void unsetDateTime() {
        this.dateTime = null;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQResultPropertyType }
     * 
     * 
     */
    public List<DQResultPropertyType> getResult() {
        if (result == null) {
            result = new ArrayList<DQResultPropertyType>();
        }
        return this.result;
    }

    public boolean isSetResult() {
        return ((this.result!= null)&&(!this.result.isEmpty()));
    }

    public void unsetResult() {
        this.result = null;
    }

}
