//
// �� ������ JAXB(JavaTM Architecture for XML Binding) ���� ���� 2.2.8-b130911.1802 ������ ���� �����Ǿ����ϴ�. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>�� �����Ͻʽÿ�. 
// �� ������ �����ϸ� �ҽ� ��Ű���� ���������� �� ���� ������ �սǵ˴ϴ�. 
// ���� ��¥: 2015.03.03 �ð� 05:39:41 PM KST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CircleByCenterPointType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="CircleByCenterPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}ArcByCenterPointType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointRep"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinates"/>
 *         &lt;/choice>
 *         &lt;element name="radius" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircleByCenterPointType")
public class CircleByCenterPointType
    extends ArcByCenterPointType
{


}
