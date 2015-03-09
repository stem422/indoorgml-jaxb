//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package net.opengis.indoorgml.navigation.v_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractFeatureMemberType;


/**
 * <p>RouteSegmentMemberType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RouteSegmentMemberType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureMemberType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/indoorgml/1.0/navigation}RouteSegment"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteSegmentMemberType", propOrder = {
    "routeSegment"
})
public class RouteSegmentMemberType
    extends AbstractFeatureMemberType
{

    @XmlElement(name = "RouteSegment", required = true)
    protected RouteSegmentType routeSegment;

    /**
     * routeSegment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RouteSegmentType }
     *     
     */
    public RouteSegmentType getRouteSegment() {
        return routeSegment;
    }

    /**
     * routeSegment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteSegmentType }
     *     
     */
    public void setRouteSegment(RouteSegmentType value) {
        this.routeSegment = value;
    }

    public boolean isSetRouteSegment() {
        return (this.routeSegment!= null);
    }

}
