//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.05 a las 12:04:04 AM CEST 
//


package isdcm.soapserver.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the isdcm.soapserver.ws package. 
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

    private final static QName _VideoResponse_QNAME = new QName("http://ws.soapserver.isdcm", "videoResponse");
    private final static QName _FindVideoByAuthorRequest_QNAME = new QName("http://ws.soapserver.isdcm", "findVideoByAuthorRequest");
    private final static QName _FindVideoByTittleRequest_QNAME = new QName("http://ws.soapserver.isdcm", "findVideoByTittleRequest");
    private final static QName _FindVideoByDateRequest_QNAME = new QName("http://ws.soapserver.isdcm", "findVideoByDateRequest");
    private final static QName _FindAllVideoRequest_QNAME = new QName("http://ws.soapserver.isdcm", "findAllVideoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: isdcm.soapserver.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VideoResponse }
     * 
     */
    public VideoResponse createVideoResponse() {
        return new VideoResponse();
    }

    /**
     * Create an instance of {@link FindVideoByAuthorRequest }
     * 
     */
    public FindVideoByAuthorRequest createFindVideoByAuthorRequest() {
        return new FindVideoByAuthorRequest();
    }

    /**
     * Create an instance of {@link FindVideoByTittleRequest }
     * 
     */
    public FindVideoByTittleRequest createFindVideoByTittleRequest() {
        return new FindVideoByTittleRequest();
    }

    /**
     * Create an instance of {@link FindVideoByDateRequest }
     * 
     */
    public FindVideoByDateRequest createFindVideoByDateRequest() {
        return new FindVideoByDateRequest();
    }

    /**
     * Create an instance of {@link FindAllVideoRequest }
     * 
     */
    public FindAllVideoRequest createFindAllVideoRequest() {
        return new FindAllVideoRequest();
    }

    /**
     * Create an instance of {@link VideoDTO }
     * 
     */
    public VideoDTO createVideoDTO() {
        return new VideoDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapserver.isdcm", name = "videoResponse")
    public JAXBElement<VideoResponse> createVideoResponse(VideoResponse value) {
        return new JAXBElement<VideoResponse>(_VideoResponse_QNAME, VideoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindVideoByAuthorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapserver.isdcm", name = "findVideoByAuthorRequest")
    public JAXBElement<FindVideoByAuthorRequest> createFindVideoByAuthorRequest(FindVideoByAuthorRequest value) {
        return new JAXBElement<FindVideoByAuthorRequest>(_FindVideoByAuthorRequest_QNAME, FindVideoByAuthorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindVideoByTittleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapserver.isdcm", name = "findVideoByTittleRequest")
    public JAXBElement<FindVideoByTittleRequest> createFindVideoByTittleRequest(FindVideoByTittleRequest value) {
        return new JAXBElement<FindVideoByTittleRequest>(_FindVideoByTittleRequest_QNAME, FindVideoByTittleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindVideoByDateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapserver.isdcm", name = "findVideoByDateRequest")
    public JAXBElement<FindVideoByDateRequest> createFindVideoByDateRequest(FindVideoByDateRequest value) {
        return new JAXBElement<FindVideoByDateRequest>(_FindVideoByDateRequest_QNAME, FindVideoByDateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllVideoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soapserver.isdcm", name = "findAllVideoRequest")
    public JAXBElement<FindAllVideoRequest> createFindAllVideoRequest(FindAllVideoRequest value) {
        return new JAXBElement<FindAllVideoRequest>(_FindAllVideoRequest_QNAME, FindAllVideoRequest.class, null, value);
    }

}
