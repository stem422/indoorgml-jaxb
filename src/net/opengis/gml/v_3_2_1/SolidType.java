//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SolidType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractSolidType">
 *       &lt;sequence>
 *         &lt;element name="exterior" type="{http://www.opengis.net/gml/3.2}ShellPropertyType" minOccurs="0"/>
 *         &lt;element name="interior" type="{http://www.opengis.net/gml/3.2}ShellPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolidType", propOrder = {
    "exterior",
    "interior"
})
public class SolidType
    extends AbstractSolidType
{

    protected ShellPropertyType exterior;
    protected List<ShellPropertyType> interior;

    /**
     * exterior 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ShellPropertyType }
     *     
     */
    public ShellPropertyType getExterior() {
        return exterior;
    }

    /**
     * exterior 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ShellPropertyType }
     *     
     */
    public void setExterior(ShellPropertyType value) {
        this.exterior = value;
    }

    public boolean isSetExterior() {
        return (this.exterior!= null);
    }

    /**
     * Gets the value of the interior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShellPropertyType }
     * 
     * 
     */
    public List<ShellPropertyType> getInterior() {
        if (interior == null) {
            interior = new ArrayList<ShellPropertyType>();
        }
        return this.interior;
    }

    public boolean isSetInterior() {
        return ((this.interior!= null)&&(!this.interior.isEmpty()));
    }

    public void unsetInterior() {
        this.interior = null;
    }

}
