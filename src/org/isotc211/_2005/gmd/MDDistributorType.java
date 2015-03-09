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
 * Information about the distributor
 * 
 * <p>MD_Distributor_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_Distributor_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="distributorContact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType"/>
 *         &lt;element name="distributionOrderProcess" type="{http://www.isotc211.org/2005/gmd}MD_StandardOrderProcess_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributorFormat" type="{http://www.isotc211.org/2005/gmd}MD_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributorTransferOptions" type="{http://www.isotc211.org/2005/gmd}MD_DigitalTransferOptions_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Distributor_Type", propOrder = {
    "distributorContact",
    "distributionOrderProcess",
    "distributorFormat",
    "distributorTransferOptions"
})
public class MDDistributorType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CIResponsiblePartyPropertyType distributorContact;
    protected List<MDStandardOrderProcessPropertyType> distributionOrderProcess;
    protected List<MDFormatPropertyType> distributorFormat;
    protected List<MDDigitalTransferOptionsPropertyType> distributorTransferOptions;

    /**
     * distributorContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CIResponsiblePartyPropertyType }
     *     
     */
    public CIResponsiblePartyPropertyType getDistributorContact() {
        return distributorContact;
    }

    /**
     * distributorContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CIResponsiblePartyPropertyType }
     *     
     */
    public void setDistributorContact(CIResponsiblePartyPropertyType value) {
        this.distributorContact = value;
    }

    public boolean isSetDistributorContact() {
        return (this.distributorContact!= null);
    }

    /**
     * Gets the value of the distributionOrderProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionOrderProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionOrderProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDStandardOrderProcessPropertyType }
     * 
     * 
     */
    public List<MDStandardOrderProcessPropertyType> getDistributionOrderProcess() {
        if (distributionOrderProcess == null) {
            distributionOrderProcess = new ArrayList<MDStandardOrderProcessPropertyType>();
        }
        return this.distributionOrderProcess;
    }

    public boolean isSetDistributionOrderProcess() {
        return ((this.distributionOrderProcess!= null)&&(!this.distributionOrderProcess.isEmpty()));
    }

    public void unsetDistributionOrderProcess() {
        this.distributionOrderProcess = null;
    }

    /**
     * Gets the value of the distributorFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFormatPropertyType }
     * 
     * 
     */
    public List<MDFormatPropertyType> getDistributorFormat() {
        if (distributorFormat == null) {
            distributorFormat = new ArrayList<MDFormatPropertyType>();
        }
        return this.distributorFormat;
    }

    public boolean isSetDistributorFormat() {
        return ((this.distributorFormat!= null)&&(!this.distributorFormat.isEmpty()));
    }

    public void unsetDistributorFormat() {
        this.distributorFormat = null;
    }

    /**
     * Gets the value of the distributorTransferOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributorTransferOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributorTransferOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDigitalTransferOptionsPropertyType }
     * 
     * 
     */
    public List<MDDigitalTransferOptionsPropertyType> getDistributorTransferOptions() {
        if (distributorTransferOptions == null) {
            distributorTransferOptions = new ArrayList<MDDigitalTransferOptionsPropertyType>();
        }
        return this.distributorTransferOptions;
    }

    public boolean isSetDistributorTransferOptions() {
        return ((this.distributorTransferOptions!= null)&&(!this.distributorTransferOptions.isEmpty()));
    }

    public void unsetDistributorTransferOptions() {
        this.distributorTransferOptions = null;
    }

}
