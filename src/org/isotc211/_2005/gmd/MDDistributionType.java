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


/**
 * Information about the distributor of and options for obtaining the dataset
 * 
 * <p>MD_Distribution_Type complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MD_Distribution_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="distributionFormat" type="{http://www.isotc211.org/2005/gmd}MD_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributor" type="{http://www.isotc211.org/2005/gmd}MD_Distributor_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transferOptions" type="{http://www.isotc211.org/2005/gmd}MD_DigitalTransferOptions_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Distribution_Type", propOrder = {
    "distributionFormat",
    "distributor",
    "transferOptions"
})
public class MDDistributionType
    extends AbstractObjectType
{

    protected List<MDFormatPropertyType> distributionFormat;
    protected List<MDDistributorPropertyType> distributor;
    protected List<MDDigitalTransferOptionsPropertyType> transferOptions;

    /**
     * Gets the value of the distributionFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFormatPropertyType }
     * 
     * 
     */
    public List<MDFormatPropertyType> getDistributionFormat() {
        if (distributionFormat == null) {
            distributionFormat = new ArrayList<MDFormatPropertyType>();
        }
        return this.distributionFormat;
    }

    public boolean isSetDistributionFormat() {
        return ((this.distributionFormat!= null)&&(!this.distributionFormat.isEmpty()));
    }

    public void unsetDistributionFormat() {
        this.distributionFormat = null;
    }

    /**
     * Gets the value of the distributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDistributorPropertyType }
     * 
     * 
     */
    public List<MDDistributorPropertyType> getDistributor() {
        if (distributor == null) {
            distributor = new ArrayList<MDDistributorPropertyType>();
        }
        return this.distributor;
    }

    public boolean isSetDistributor() {
        return ((this.distributor!= null)&&(!this.distributor.isEmpty()));
    }

    public void unsetDistributor() {
        this.distributor = null;
    }

    /**
     * Gets the value of the transferOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDigitalTransferOptionsPropertyType }
     * 
     * 
     */
    public List<MDDigitalTransferOptionsPropertyType> getTransferOptions() {
        if (transferOptions == null) {
            transferOptions = new ArrayList<MDDigitalTransferOptionsPropertyType>();
        }
        return this.transferOptions;
    }

    public boolean isSetTransferOptions() {
        return ((this.transferOptions!= null)&&(!this.transferOptions.isEmpty()));
    }

    public void unsetTransferOptions() {
        this.transferOptions = null;
    }

}
