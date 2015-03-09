//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2015.03.03 시간 05:39:41 PM KST 
//


package org.isotc211._2005.gts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.isotc211._2005.gts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TMPeriodDuration_QNAME = new QName("http://www.isotc211.org/2005/gts", "TM_PeriodDuration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.isotc211._2005.gts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMPeriodDurationPropertyType }
     * 
     */
    public TMPeriodDurationPropertyType createTMPeriodDurationPropertyType() {
        return new TMPeriodDurationPropertyType();
    }

    /**
     * Create an instance of {@link TMPrimitivePropertyType }
     * 
     */
    public TMPrimitivePropertyType createTMPrimitivePropertyType() {
        return new TMPrimitivePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gts", name = "TM_PeriodDuration")
    public JAXBElement<Duration> createTMPeriodDuration(Duration value) {
        return new JAXBElement<Duration>(_TMPeriodDuration_QNAME, Duration.class, null, value);
    }

}
