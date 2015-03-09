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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;


/**
 * <p>DQ_Scope_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="DQ_Scope_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType"/>
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gmd}EX_Extent_PropertyType" minOccurs="0"/>
 *         &lt;element name="levelDescription" type="{http://www.isotc211.org/2005/gmd}MD_ScopeDescription_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_Scope_Type", propOrder = {
    "level",
    "extent",
    "levelDescription"
})
public class DQScopeType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected MDScopeCodePropertyType level;
    protected EXExtentPropertyType extent;
    protected List<MDScopeDescriptionPropertyType> levelDescription;

    /**
     * level 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public MDScopeCodePropertyType getLevel() {
        return level;
    }

    /**
     * level 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDScopeCodePropertyType }
     *     
     */
    public void setLevel(MDScopeCodePropertyType value) {
        this.level = value;
    }

    public boolean isSetLevel() {
        return (this.level!= null);
    }

    /**
     * extent 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public EXExtentPropertyType getExtent() {
        return extent;
    }

    /**
     * extent 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EXExtentPropertyType }
     *     
     */
    public void setExtent(EXExtentPropertyType value) {
        this.extent = value;
    }

    public boolean isSetExtent() {
        return (this.extent!= null);
    }

    /**
     * Gets the value of the levelDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeDescriptionPropertyType }
     * 
     * 
     */
    public List<MDScopeDescriptionPropertyType> getLevelDescription() {
        if (levelDescription == null) {
            levelDescription = new ArrayList<MDScopeDescriptionPropertyType>();
        }
        return this.levelDescription;
    }

    public boolean isSetLevelDescription() {
        return ((this.levelDescription!= null)&&(!this.levelDescription.isEmpty()));
    }

    public void unsetLevelDescription() {
        this.levelDescription = null;
    }

}
