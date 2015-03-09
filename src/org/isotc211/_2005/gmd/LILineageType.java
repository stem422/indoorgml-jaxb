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
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;


/**
 * <p>LI_Lineage_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="LI_Lineage_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="statement" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="processStep" type="{http://www.isotc211.org/2005/gmd}LI_ProcessStep_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.isotc211.org/2005/gmd}LI_Source_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_Lineage_Type", propOrder = {
    "statement",
    "processStep",
    "source"
})
public class LILineageType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType statement;
    protected List<LIProcessStepPropertyType> processStep;
    protected List<LISourcePropertyType> source;

    /**
     * statement 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getStatement() {
        return statement;
    }

    /**
     * statement 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setStatement(CharacterStringPropertyType value) {
        this.statement = value;
    }

    public boolean isSetStatement() {
        return (this.statement!= null);
    }

    /**
     * Gets the value of the processStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LIProcessStepPropertyType }
     * 
     * 
     */
    public List<LIProcessStepPropertyType> getProcessStep() {
        if (processStep == null) {
            processStep = new ArrayList<LIProcessStepPropertyType>();
        }
        return this.processStep;
    }

    public boolean isSetProcessStep() {
        return ((this.processStep!= null)&&(!this.processStep.isEmpty()));
    }

    public void unsetProcessStep() {
        this.processStep = null;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISourcePropertyType }
     * 
     * 
     */
    public List<LISourcePropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<LISourcePropertyType>();
        }
        return this.source;
    }

    public boolean isSetSource() {
        return ((this.source!= null)&&(!this.source.isEmpty()));
    }

    public void unsetSource() {
        this.source = null;
    }

}
