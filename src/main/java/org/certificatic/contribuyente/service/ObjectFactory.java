
package org.certificatic.contribuyente.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.certificatic.contribuyente.service package. 
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

    private final static QName _ObtenerContribuyentes_QNAME = new QName("http://service.contribuyente.certificatic.org/", "obtenerContribuyentes");
    private final static QName _ObtenerContribuyentesResponse_QNAME = new QName("http://service.contribuyente.certificatic.org/", "obtenerContribuyentesResponse");
    private final static QName _Crearcontribuyente_QNAME = new QName("http://service.contribuyente.certificatic.org/", "crearcontribuyente");
    private final static QName _CrearcontribuyenteResponse_QNAME = new QName("http://service.contribuyente.certificatic.org/", "crearcontribuyenteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.certificatic.contribuyente.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Crearcontribuyente }
     * 
     */
    public Crearcontribuyente createCrearcontribuyente() {
        return new Crearcontribuyente();
    }

    /**
     * Create an instance of {@link ObtenerContribuyentesResponse }
     * 
     */
    public ObtenerContribuyentesResponse createObtenerContribuyentesResponse() {
        return new ObtenerContribuyentesResponse();
    }

    /**
     * Create an instance of {@link ObtenerContribuyentes }
     * 
     */
    public ObtenerContribuyentes createObtenerContribuyentes() {
        return new ObtenerContribuyentes();
    }

    /**
     * Create an instance of {@link CrearcontribuyenteResponse }
     * 
     */
    public CrearcontribuyenteResponse createCrearcontribuyenteResponse() {
        return new CrearcontribuyenteResponse();
    }

    /**
     * Create an instance of {@link Contribuyente }
     * 
     */
    public Contribuyente createContribuyente() {
        return new Contribuyente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contribuyente.certificatic.org/", name = "obtenerContribuyentes")
    public JAXBElement<ObtenerContribuyentes> createObtenerContribuyentes(ObtenerContribuyentes value) {
        return new JAXBElement<ObtenerContribuyentes>(_ObtenerContribuyentes_QNAME, ObtenerContribuyentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyentesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contribuyente.certificatic.org/", name = "obtenerContribuyentesResponse")
    public JAXBElement<ObtenerContribuyentesResponse> createObtenerContribuyentesResponse(ObtenerContribuyentesResponse value) {
        return new JAXBElement<ObtenerContribuyentesResponse>(_ObtenerContribuyentesResponse_QNAME, ObtenerContribuyentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Crearcontribuyente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contribuyente.certificatic.org/", name = "crearcontribuyente")
    public JAXBElement<Crearcontribuyente> createCrearcontribuyente(Crearcontribuyente value) {
        return new JAXBElement<Crearcontribuyente>(_Crearcontribuyente_QNAME, Crearcontribuyente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearcontribuyenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contribuyente.certificatic.org/", name = "crearcontribuyenteResponse")
    public JAXBElement<CrearcontribuyenteResponse> createCrearcontribuyenteResponse(CrearcontribuyenteResponse value) {
        return new JAXBElement<CrearcontribuyenteResponse>(_CrearcontribuyenteResponse_QNAME, CrearcontribuyenteResponse.class, null, value);
    }

}
