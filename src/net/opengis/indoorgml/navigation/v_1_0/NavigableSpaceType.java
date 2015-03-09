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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.CodeType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceType;


/**
 * <p>NavigableSpaceType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="NavigableSpaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceType">
 *       &lt;sequence>
 *         &lt;element name="class" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="function" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *         &lt;element name="usage" type="{http://www.opengis.net/gml/3.2}CodeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigableSpaceType", propOrder = {
    "clazz",
    "function",
    "usage"
})
@XmlSeeAlso({
    TransferSpaceType.class,
    GeneralSpaceType.class
})
public class NavigableSpaceType
    extends CellSpaceType
{

    @XmlElement(name = "class", required = true)
    protected CodeType clazz;
    @XmlElement(required = true)
    protected CodeType function;
    @XmlElement(required = true)
    protected CodeType usage;

    /**
     * clazz 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getClazz() {
        return clazz;
    }

    /**
     * clazz 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setClazz(CodeType value) {
        this.clazz = value;
    }

    public boolean isSetClazz() {
        return (this.clazz!= null);
    }

    /**
     * function 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFunction() {
        return function;
    }

    /**
     * function 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFunction(CodeType value) {
        this.function = value;
    }

    public boolean isSetFunction() {
        return (this.function!= null);
    }

    /**
     * usage 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getUsage() {
        return usage;
    }

    /**
     * usage 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setUsage(CodeType value) {
        this.usage = value;
    }

    public boolean isSetUsage() {
        return (this.usage!= null);
    }

}
