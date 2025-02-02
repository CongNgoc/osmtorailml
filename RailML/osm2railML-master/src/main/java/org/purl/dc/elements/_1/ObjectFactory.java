//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.08.08 at 02:41:02 PM ICT 
//


package org.purl.dc.elements._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.purl.dc.elements._1 package. 
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

    private final static QName _Any_QNAME = new QName("http://purl.org/dc/elements/1.1/", "any");
    private final static QName _Title_QNAME = new QName("http://purl.org/dc/elements/1.1/", "title");
    private final static QName _Creator_QNAME = new QName("http://purl.org/dc/elements/1.1/", "creator");
    private final static QName _Subject_QNAME = new QName("http://purl.org/dc/elements/1.1/", "subject");
    private final static QName _Description_QNAME = new QName("http://purl.org/dc/elements/1.1/", "description");
    private final static QName _Publisher_QNAME = new QName("http://purl.org/dc/elements/1.1/", "publisher");
    private final static QName _Contributor_QNAME = new QName("http://purl.org/dc/elements/1.1/", "contributor");
    private final static QName _Date_QNAME = new QName("http://purl.org/dc/elements/1.1/", "date");
    private final static QName _Type_QNAME = new QName("http://purl.org/dc/elements/1.1/", "type");
    private final static QName _Format_QNAME = new QName("http://purl.org/dc/elements/1.1/", "format");
    private final static QName _Identifier_QNAME = new QName("http://purl.org/dc/elements/1.1/", "identifier");
    private final static QName _Source_QNAME = new QName("http://purl.org/dc/elements/1.1/", "source");
    private final static QName _Language_QNAME = new QName("http://purl.org/dc/elements/1.1/", "language");
    private final static QName _Relation_QNAME = new QName("http://purl.org/dc/elements/1.1/", "relation");
    private final static QName _Coverage_QNAME = new QName("http://purl.org/dc/elements/1.1/", "coverage");
    private final static QName _Rights_QNAME = new QName("http://purl.org/dc/elements/1.1/", "rights");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.purl.dc.elements._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SimpleLiteral }
     * 
     */
    public SimpleLiteral createSimpleLiteral() {
        return new SimpleLiteral();
    }

    /**
     * Create an instance of {@link ElementContainer }
     * 
     */
    public ElementContainer createElementContainer() {
        return new ElementContainer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "any")
    public JAXBElement<SimpleLiteral> createAny(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Any_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "title", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createTitle(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Title_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "creator", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createCreator(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Creator_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "subject", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createSubject(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Subject_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "description", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createDescription(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Description_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "publisher", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createPublisher(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Publisher_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "contributor", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createContributor(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Contributor_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "date", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createDate(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Date_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "type", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createType(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Type_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "format", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createFormat(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Format_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "identifier", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createIdentifier(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Identifier_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "source", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createSource(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Source_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "language", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createLanguage(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Language_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "relation", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createRelation(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Relation_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "coverage", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createCoverage(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Coverage_QNAME, SimpleLiteral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://purl.org/dc/elements/1.1/", name = "rights", substitutionHeadNamespace = "http://purl.org/dc/elements/1.1/", substitutionHeadName = "any")
    public JAXBElement<SimpleLiteral> createRights(SimpleLiteral value) {
        return new JAXBElement<SimpleLiteral>(_Rights_QNAME, SimpleLiteral.class, null, value);
    }

}
