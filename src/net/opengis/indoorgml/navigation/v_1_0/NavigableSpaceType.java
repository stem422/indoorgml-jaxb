//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
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
 * <p>NavigableSpaceType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
     * clazz �Ӽ��� ���� �����ɴϴ�.
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
     * clazz �Ӽ��� ���� �����մϴ�.
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
     * function �Ӽ��� ���� �����ɴϴ�.
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
     * function �Ӽ��� ���� �����մϴ�.
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
     * usage �Ӽ��� ���� �����ɴϴ�.
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
     * usage �Ӽ��� ���� �����մϴ�.
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
