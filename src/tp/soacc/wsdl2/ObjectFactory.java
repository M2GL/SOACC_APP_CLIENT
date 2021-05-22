
package tp.soacc.wsdl2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tp.soacc package. 
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

    private final static QName _GetMoyenBac_QNAME = new QName("http://soacc.tp", "bac");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tp.soacc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMoyenResponse }
     * 
     */
    public GetMoyenResponse createGetMoyenResponse() {
        return new GetMoyenResponse();
    }

    /**
     * Create an instance of {@link GetMoyen }
     * 
     */
    public GetMoyen createGetMoyen() {
        return new GetMoyen();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soacc.tp", name = "bac", scope = GetMoyen.class)
    public JAXBElement<String> createGetMoyenBac(String value) {
        return new JAXBElement<String>(_GetMoyenBac_QNAME, String.class, GetMoyen.class, value);
    }

}
