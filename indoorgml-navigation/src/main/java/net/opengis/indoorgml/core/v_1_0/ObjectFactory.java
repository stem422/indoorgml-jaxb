//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.22 at 10:05:51 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.opengis.indoorgml.core.v_1_0 package. 
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

    private final static QName _CellSpace_QNAME = new QName("http://www.opengis.net/indoorgml/1.0/core", "CellSpace");
    private final static QName _CellSpaceBoundary_QNAME = new QName("http://www.opengis.net/indoorgml/1.0/core", "CellSpaceBoundary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.opengis.indoorgml.core.v_1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellSpaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/indoorgml/1.0/core", name = "CellSpace", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<CellSpaceType> createCellSpace(CellSpaceType value) {
        return new JAXBElement<CellSpaceType>(_CellSpace_QNAME, CellSpaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellSpaceBoundaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/indoorgml/1.0/core", name = "CellSpaceBoundary", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<CellSpaceBoundaryType> createCellSpaceBoundary(CellSpaceBoundaryType value) {
        return new JAXBElement<CellSpaceBoundaryType>(_CellSpaceBoundary_QNAME, CellSpaceBoundaryType.class, null, value);
    }

}
