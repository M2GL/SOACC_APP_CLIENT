
package tp.soacc.wsdl2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Eleve",
targetNamespace = "http://soacc.tp", 
wsdlLocation = "http://localhost:8282/TP/services/Eleve?wsdl"
)
public class Eleve
    extends Service
{

    private final static URL ELEVE_WSDL_LOCATION;
    private final static WebServiceException ELEVE_EXCEPTION;
    private final static QName ELEVE_QNAME = new QName("http://soacc.tp", "Eleve");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/TP/services/Eleve?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ELEVE_WSDL_LOCATION = url;
        ELEVE_EXCEPTION = e;
    }

    public Eleve() {
        super(__getWsdlLocation(), ELEVE_QNAME);
    }

    public Eleve(WebServiceFeature... features) {
        super(__getWsdlLocation(), ELEVE_QNAME, features);
    }

    public Eleve(URL wsdlLocation) {
        super(wsdlLocation, ELEVE_QNAME);
    }

    public Eleve(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ELEVE_QNAME, features);
    }

    public Eleve(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Eleve(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ElevePortType
     */
    @WebEndpoint(name = "EleveHttpSoap11Endpoint")
    public ElevePortType getEleveHttpSoap11Endpoint() {
        return super.getPort(new QName("http://soacc.tp", "EleveHttpSoap11Endpoint"), ElevePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ElevePortType
     */
    @WebEndpoint(name = "EleveHttpSoap11Endpoint")
    public ElevePortType getEleveHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://soacc.tp", "EleveHttpSoap11Endpoint"), ElevePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ELEVE_EXCEPTION!= null) {
            throw ELEVE_EXCEPTION;
        }
        return ELEVE_WSDL_LOCATION;
    }

}
