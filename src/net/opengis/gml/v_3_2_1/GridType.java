//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GridType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GridType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element name="limits" type="{http://www.opengis.net/gml/3.2}GridLimitsType"/>
 *         &lt;choice>
 *           &lt;element name="axisLabels" type="{http://www.opengis.net/gml/3.2}NCNameList"/>
 *           &lt;element name="axisName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="dimension" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridType", propOrder = {
    "rest"
})
@XmlSeeAlso({
    RectifiedGridType.class
})
public class GridType
    extends AbstractGeometryType
{

    @XmlElementRefs({
        @XmlElementRef(name = "axisLabels", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "axisName", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "limits", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    @XmlAttribute(name = "dimension", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dimension;

    /**
     * 나머지 콘텐츠 모델을 가져옵니다. 
     * 
     * <p>
     * 다음 원인으로 인해 이 "catch-all" 속성을 가져오고 있습니다.
     * 필드 이름 "AxisLabels"이(가) 스키마의 다른 두 부분에 사용되었습니다. 참조: 
     * http://schemas.opengis.net/gml/3.2.1/grids.xsd의 29행
     * http://schemas.opengis.net/gml/3.2.1/geometryBasic0d1d.xsd의 47행
     * <p>
     * 이 속성을 제거하려면 다음 선언 중 하나에 
     * 속성 사용자 정의를 적용하여 이름을 변경하십시오. 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link GridLimitsType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    /**
     * dimension 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDimension() {
        return dimension;
    }

    /**
     * dimension 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDimension(BigInteger value) {
        this.dimension = value;
    }

    public boolean isSetDimension() {
        return (this.dimension!= null);
    }

}
