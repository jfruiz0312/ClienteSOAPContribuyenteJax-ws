
package org.certificatic.contribuyente.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ContribuyenteService", targetNamespace = "http://service.contribuyente.certificatic.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContribuyenteService {


    /**
     * 
     * @return
     *     returns java.util.List<org.certificatic.contribuyente.service.Contribuyente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerContribuyentes", targetNamespace = "http://service.contribuyente.certificatic.org/", className = "org.certificatic.contribuyente.service.ObtenerContribuyentes")
    @ResponseWrapper(localName = "obtenerContribuyentesResponse", targetNamespace = "http://service.contribuyente.certificatic.org/", className = "org.certificatic.contribuyente.service.ObtenerContribuyentesResponse")
    public List<Contribuyente> obtenerContribuyentes();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.certificatic.contribuyente.service.Contribuyente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearcontribuyente", targetNamespace = "http://service.contribuyente.certificatic.org/", className = "org.certificatic.contribuyente.service.Crearcontribuyente")
    @ResponseWrapper(localName = "crearcontribuyenteResponse", targetNamespace = "http://service.contribuyente.certificatic.org/", className = "org.certificatic.contribuyente.service.CrearcontribuyenteResponse")
    public Contribuyente crearcontribuyente(
        @WebParam(name = "arg0", targetNamespace = "")
        Contribuyente arg0);

}
