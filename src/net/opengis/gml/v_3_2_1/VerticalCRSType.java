//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VerticalCRSType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="VerticalCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}verticalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}verticalDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalCRSType", propOrder = {
    "verticalCS",
    "verticalDatum"
})
public class VerticalCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "verticalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<VerticalCSPropertyType> verticalCS;
    @XmlElementRef(name = "verticalDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<VerticalDatumPropertyType> verticalDatum;

    /**
     * verticalCS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalCSPropertyType> getVerticalCS() {
        return verticalCS;
    }

    /**
     * verticalCS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}
     *     
     */
    public void setVerticalCS(JAXBElement<VerticalCSPropertyType> value) {
        this.verticalCS = value;
    }

    public boolean isSetVerticalCS() {
        return (this.verticalCS!= null);
    }

    /**
     * verticalDatum 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<VerticalDatumPropertyType> getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * verticalDatum 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}
     *     
     */
    public void setVerticalDatum(JAXBElement<VerticalDatumPropertyType> value) {
        this.verticalDatum = value;
    }

    public boolean isSetVerticalDatum() {
        return (this.verticalDatum!= null);
    }

}
