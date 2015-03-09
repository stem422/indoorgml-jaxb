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
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;


/**
 * Description of the class of information covered by the information
 * 
 * <p>MD_ScopeDescription_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_ScopeDescription_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="attributes" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="features" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="featureInstances" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="attributeInstances" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="dataset" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="other" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ScopeDescription_Type", propOrder = {
    "attributes",
    "features",
    "featureInstances",
    "attributeInstances",
    "dataset",
    "other"
})
public class MDScopeDescriptionType {

    protected List<ObjectReferencePropertyType> attributes;
    protected List<ObjectReferencePropertyType> features;
    protected List<ObjectReferencePropertyType> featureInstances;
    protected List<ObjectReferencePropertyType> attributeInstances;
    protected CharacterStringPropertyType dataset;
    protected CharacterStringPropertyType other;

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.attributes;
    }

    public boolean isSetAttributes() {
        return ((this.attributes!= null)&&(!this.attributes.isEmpty()));
    }

    public void unsetAttributes() {
        this.attributes = null;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatures() {
        if (features == null) {
            features = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.features;
    }

    public boolean isSetFeatures() {
        return ((this.features!= null)&&(!this.features.isEmpty()));
    }

    public void unsetFeatures() {
        this.features = null;
    }

    /**
     * Gets the value of the featureInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureInstances() {
        if (featureInstances == null) {
            featureInstances = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureInstances;
    }

    public boolean isSetFeatureInstances() {
        return ((this.featureInstances!= null)&&(!this.featureInstances.isEmpty()));
    }

    public void unsetFeatureInstances() {
        this.featureInstances = null;
    }

    /**
     * Gets the value of the attributeInstances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeInstances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getAttributeInstances() {
        if (attributeInstances == null) {
            attributeInstances = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.attributeInstances;
    }

    public boolean isSetAttributeInstances() {
        return ((this.attributeInstances!= null)&&(!this.attributeInstances.isEmpty()));
    }

    public void unsetAttributeInstances() {
        this.attributeInstances = null;
    }

    /**
     * dataset 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataset() {
        return dataset;
    }

    /**
     * dataset 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataset(CharacterStringPropertyType value) {
        this.dataset = value;
    }

    public boolean isSetDataset() {
        return (this.dataset!= null);
    }

    /**
     * other 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOther() {
        return other;
    }

    /**
     * other 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOther(CharacterStringPropertyType value) {
        this.other = value;
    }

    public boolean isSetOther() {
        return (this.other!= null);
    }

}
