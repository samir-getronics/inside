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

package es.mpt.dsic.inside.service.validacionENIMtom.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.3
 * 2016-10-25T13:48:35.509+02:00
 * Generated source version: 3.0.3
 * 
 */
@WebServiceClient(name = "EeUtilValidacionENIServiceMtomImplService", 
                  wsdlLocation = "http://eeutil-misc.desappjava.seap.minhap.es/eeutil-misc/ws/EeUtilValidacionENIServiceMtom?wsdl",
                  targetNamespace = "http://impl.service.ws.inside.dsic.mpt.es/") 
public class EeUtilValidacionENIServiceMtomImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.ws.inside.dsic.mpt.es/", "EeUtilValidacionENIServiceMtomImplService");
    public final static QName EeUtilValidacionENIServiceMtomImplPort = new QName("http://impl.service.ws.inside.dsic.mpt.es/", "EeUtilValidacionENIServiceMtomImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://eeutil-misc.desappjava.seap.minhap.es/eeutil-misc/ws/EeUtilValidacionENIServiceMtom?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EeUtilValidacionENIServiceMtomImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://eeutil-misc.desappjava.seap.minhap.es/eeutil-misc/ws/EeUtilValidacionENIServiceMtom?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EeUtilValidacionENIServiceMtomImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EeUtilValidacionENIServiceMtomImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EeUtilValidacionENIServiceMtomImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
   

    /**
     *
     * @return
     *     returns EeUtilValidacionENIServiceMtom
     */
    @WebEndpoint(name = "EeUtilValidacionENIServiceMtomImplPort")
    public EeUtilValidacionENIServiceMtom getEeUtilValidacionENIServiceMtomImplPort() {
        return super.getPort(EeUtilValidacionENIServiceMtomImplPort, EeUtilValidacionENIServiceMtom.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EeUtilValidacionENIServiceMtom
     */
    @WebEndpoint(name = "EeUtilValidacionENIServiceMtomImplPort")
    public EeUtilValidacionENIServiceMtom getEeUtilValidacionENIServiceMtomImplPort(WebServiceFeature... features) {
        return super.getPort(EeUtilValidacionENIServiceMtomImplPort, EeUtilValidacionENIServiceMtom.class, features);
    }

}
