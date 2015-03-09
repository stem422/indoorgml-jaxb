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


/**
 * Restrictions and legal prerequisites for accessing and using the dataset.
 * 
 * <p>MD_LegalConstraints_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_LegalConstraints_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type">
 *       &lt;sequence>
 *         &lt;element name="accessConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherConstraints" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_LegalConstraints_Type", propOrder = {
    "accessConstraints",
    "useConstraints",
    "otherConstraints"
})
public class MDLegalConstraintsType
    extends MDConstraintsType
{

    protected List<MDRestrictionCodePropertyType> accessConstraints;
    protected List<MDRestrictionCodePropertyType> useConstraints;
    protected List<CharacterStringPropertyType> otherConstraints;

    /**
     * Gets the value of the accessConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getAccessConstraints() {
        if (accessConstraints == null) {
            accessConstraints = new ArrayList<MDRestrictionCodePropertyType>();
        }
        return this.accessConstraints;
    }

    public boolean isSetAccessConstraints() {
        return ((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty()));
    }

    public void unsetAccessConstraints() {
        this.accessConstraints = null;
    }

    /**
     * Gets the value of the useConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getUseConstraints() {
        if (useConstraints == null) {
            useConstraints = new ArrayList<MDRestrictionCodePropertyType>();
        }
        return this.useConstraints;
    }

    public boolean isSetUseConstraints() {
        return ((this.useConstraints!= null)&&(!this.useConstraints.isEmpty()));
    }

    public void unsetUseConstraints() {
        this.useConstraints = null;
    }

    /**
     * Gets the value of the otherConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getOtherConstraints() {
        if (otherConstraints == null) {
            otherConstraints = new ArrayList<CharacterStringPropertyType>();
        }
        return this.otherConstraints;
    }

    public boolean isSetOtherConstraints() {
        return ((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty()));
    }

    public void unsetOtherConstraints() {
        this.otherConstraints = null;
    }

}
