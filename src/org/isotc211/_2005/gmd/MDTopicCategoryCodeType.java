//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MD_TopicCategoryCode_Type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_TopicCategoryCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="farming"/>
 *     &lt;enumeration value="biota"/>
 *     &lt;enumeration value="boundaries"/>
 *     &lt;enumeration value="climatologyMeteorologyAtmosphere"/>
 *     &lt;enumeration value="economy"/>
 *     &lt;enumeration value="elevation"/>
 *     &lt;enumeration value="environment"/>
 *     &lt;enumeration value="geoscientificInformation"/>
 *     &lt;enumeration value="health"/>
 *     &lt;enumeration value="imageryBaseMapsEarthCover"/>
 *     &lt;enumeration value="intelligenceMilitary"/>
 *     &lt;enumeration value="inlandWaters"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="oceans"/>
 *     &lt;enumeration value="planningCadastre"/>
 *     &lt;enumeration value="society"/>
 *     &lt;enumeration value="structure"/>
 *     &lt;enumeration value="transportation"/>
 *     &lt;enumeration value="utilitiesCommunication"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MD_TopicCategoryCode_Type")
@XmlEnum
public enum MDTopicCategoryCodeType {

    @XmlEnumValue("farming")
    FARMING("farming"),
    @XmlEnumValue("biota")
    BIOTA("biota"),
    @XmlEnumValue("boundaries")
    BOUNDARIES("boundaries"),
    @XmlEnumValue("climatologyMeteorologyAtmosphere")
    CLIMATOLOGY_METEOROLOGY_ATMOSPHERE("climatologyMeteorologyAtmosphere"),
    @XmlEnumValue("economy")
    ECONOMY("economy"),
    @XmlEnumValue("elevation")
    ELEVATION("elevation"),
    @XmlEnumValue("environment")
    ENVIRONMENT("environment"),
    @XmlEnumValue("geoscientificInformation")
    GEOSCIENTIFIC_INFORMATION("geoscientificInformation"),
    @XmlEnumValue("health")
    HEALTH("health"),
    @XmlEnumValue("imageryBaseMapsEarthCover")
    IMAGERY_BASE_MAPS_EARTH_COVER("imageryBaseMapsEarthCover"),
    @XmlEnumValue("intelligenceMilitary")
    INTELLIGENCE_MILITARY("intelligenceMilitary"),
    @XmlEnumValue("inlandWaters")
    INLAND_WATERS("inlandWaters"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("oceans")
    OCEANS("oceans"),
    @XmlEnumValue("planningCadastre")
    PLANNING_CADASTRE("planningCadastre"),
    @XmlEnumValue("society")
    SOCIETY("society"),
    @XmlEnumValue("structure")
    STRUCTURE("structure"),
    @XmlEnumValue("transportation")
    TRANSPORTATION("transportation"),
    @XmlEnumValue("utilitiesCommunication")
    UTILITIES_COMMUNICATION("utilitiesCommunication");
    private final String value;

    MDTopicCategoryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDTopicCategoryCodeType fromValue(String v) {
        for (MDTopicCategoryCodeType c: MDTopicCategoryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
