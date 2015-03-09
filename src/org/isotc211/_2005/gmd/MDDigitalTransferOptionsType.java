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
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RealPropertyType;


/**
 * Technical means and media by which a dataset is obtained from the distributor
 * 
 * <p>MD_DigitalTransferOptions_Type complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="MD_DigitalTransferOptions_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="unitsOfDistribution" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="transferSize" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="onLine" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offLine" type="{http://www.isotc211.org/2005/gmd}MD_Medium_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_DigitalTransferOptions_Type", propOrder = {
    "unitsOfDistribution",
    "transferSize",
    "onLine",
    "offLine"
})
public class MDDigitalTransferOptionsType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType unitsOfDistribution;
    protected RealPropertyType transferSize;
    protected List<CIOnlineResourcePropertyType> onLine;
    protected MDMediumPropertyType offLine;

    /**
     * unitsOfDistribution �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUnitsOfDistribution() {
        return unitsOfDistribution;
    }

    /**
     * unitsOfDistribution �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUnitsOfDistribution(CharacterStringPropertyType value) {
        this.unitsOfDistribution = value;
    }

    public boolean isSetUnitsOfDistribution() {
        return (this.unitsOfDistribution!= null);
    }

    /**
     * transferSize �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getTransferSize() {
        return transferSize;
    }

    /**
     * transferSize �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setTransferSize(RealPropertyType value) {
        this.transferSize = value;
    }

    public boolean isSetTransferSize() {
        return (this.transferSize!= null);
    }

    /**
     * Gets the value of the onLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIOnlineResourcePropertyType }
     * 
     * 
     */
    public List<CIOnlineResourcePropertyType> getOnLine() {
        if (onLine == null) {
            onLine = new ArrayList<CIOnlineResourcePropertyType>();
        }
        return this.onLine;
    }

    public boolean isSetOnLine() {
        return ((this.onLine!= null)&&(!this.onLine.isEmpty()));
    }

    public void unsetOnLine() {
        this.onLine = null;
    }

    /**
     * offLine �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public MDMediumPropertyType getOffLine() {
        return offLine;
    }

    /**
     * offLine �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public void setOffLine(MDMediumPropertyType value) {
        this.offLine = value;
    }

    public boolean isSetOffLine() {
        return (this.offLine!= null);
    }

}
