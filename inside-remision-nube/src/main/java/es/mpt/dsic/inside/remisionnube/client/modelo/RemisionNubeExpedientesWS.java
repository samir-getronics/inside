/* Copyright (C) 2016 MINHAP, Gobierno de España
   This program is licensed and may be used, modified and redistributed under the terms
   of the European Public License (EUPL), either version 1.1 or (at your
   option) any later version as soon as they are approved by the European Commission.
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
   or implied. See the License for the specific language governing permissions and
   more details.
   You should have received a copy of the EUPL1.1 license
   along with this program; if not, you may find it at
   http://joinup.ec.europa.eu/software/page/eupl/licence-eupl */

package es.mpt.dsic.inside.remisionnube.client.modelo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-12-13T12:56:42.382+01:00
 * Generated source version: 3.0.3
 * 
 */
@WebServiceClient(name = "RemisionNubeExpedientesWS", 
                  wsdlLocation = "http://inside.desappjava.seap.minhap.es/inside/ws/InsideRemisionNubeExpedientesWebService?wsdl",
                  targetNamespace = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService") 
public class RemisionNubeExpedientesWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService", "RemisionNubeExpedientesWS");
    public final static QName InsideRemisionNubeExpedientesWSPort = new QName("https://ssweb.seap.minhap.es/Inside/XSD/v1.0/WebService", "InsideRemisionNubeExpedientesWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://inside.desappjava.seap.minhap.es/inside/ws/InsideRemisionNubeExpedientesWebService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RemisionNubeExpedientesWS.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://inside.desappjava.seap.minhap.es/inside/ws/InsideRemisionNubeExpedientesWebService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RemisionNubeExpedientesWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RemisionNubeExpedientesWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RemisionNubeExpedientesWS() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RemisionNubeExpedientesWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RemisionNubeExpedientesWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RemisionNubeExpedientesWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns InsideRemisionNubeExpedientesService
     */
    @WebEndpoint(name = "InsideRemisionNubeExpedientesWSPort")
    public InsideRemisionNubeExpedientesService getInsideRemisionNubeExpedientesWSPort() {
        return super.getPort(InsideRemisionNubeExpedientesWSPort, InsideRemisionNubeExpedientesService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InsideRemisionNubeExpedientesService
     */
    @WebEndpoint(name = "InsideRemisionNubeExpedientesWSPort")
    public InsideRemisionNubeExpedientesService getInsideRemisionNubeExpedientesWSPort(WebServiceFeature... features) {
        return super.getPort(InsideRemisionNubeExpedientesWSPort, InsideRemisionNubeExpedientesService.class, features);
    }

}
