
package main.java.com.example.demo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.java.com.example.demo package. 
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

    private final static QName _KmToMiles_QNAME = new QName("http://demo.example.com.java.main/", "kmToMiles");
    private final static QName _KmToMilesResponse_QNAME = new QName("http://demo.example.com.java.main/", "kmToMilesResponse");
    private final static QName _NodesToKmResponse_QNAME = new QName("http://demo.example.com.java.main/", "nodesToKmResponse");
    private final static QName _NodesToKm_QNAME = new QName("http://demo.example.com.java.main/", "nodesToKm");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.com.example.demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NodesToKm }
     * 
     */
    public NodesToKm createNodesToKm() {
        return new NodesToKm();
    }

    /**
     * Create an instance of {@link NodesToKmResponse }
     * 
     */
    public NodesToKmResponse createNodesToKmResponse() {
        return new NodesToKmResponse();
    }

    /**
     * Create an instance of {@link KmToMilesResponse }
     * 
     */
    public KmToMilesResponse createKmToMilesResponse() {
        return new KmToMilesResponse();
    }

    /**
     * Create an instance of {@link KmToMiles }
     * 
     */
    public KmToMiles createKmToMiles() {
        return new KmToMiles();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KmToMiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.example.com.java.main/", name = "kmToMiles")
    public JAXBElement<KmToMiles> createKmToMiles(KmToMiles value) {
        return new JAXBElement<KmToMiles>(_KmToMiles_QNAME, KmToMiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KmToMilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.example.com.java.main/", name = "kmToMilesResponse")
    public JAXBElement<KmToMilesResponse> createKmToMilesResponse(KmToMilesResponse value) {
        return new JAXBElement<KmToMilesResponse>(_KmToMilesResponse_QNAME, KmToMilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodesToKmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.example.com.java.main/", name = "nodesToKmResponse")
    public JAXBElement<NodesToKmResponse> createNodesToKmResponse(NodesToKmResponse value) {
        return new JAXBElement<NodesToKmResponse>(_NodesToKmResponse_QNAME, NodesToKmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodesToKm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.example.com.java.main/", name = "nodesToKm")
    public JAXBElement<NodesToKm> createNodesToKm(NodesToKm value) {
        return new JAXBElement<NodesToKm>(_NodesToKm_QNAME, NodesToKm.class, null, value);
    }

}
