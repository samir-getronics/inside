
package es.mpt.dsic.inside.xml.inside.ws.validacion.documento.resultados;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.mpt.dsic.inside.xml.inside.ws.validacion.documento.resultados package. 
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

    private final static QName _TipoResultadoValidacionDocumentoInside_QNAME = new QName("https://ssweb.seap.minhap.es/Inside/XSD/v1.0/validacion/documento-e/resultados", "TipoResultadoValidacionDocumentoInside");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.mpt.dsic.inside.xml.inside.ws.validacion.documento.resultados
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoResultadoValidacionDocumentoInside }
     * 
     */
    public TipoResultadoValidacionDocumentoInside createTipoResultadoValidacionDocumentoInside() {
        return new TipoResultadoValidacionDocumentoInside();
    }

    /**
     * Create an instance of {@link TipoResultadoValidacionDetalleDocumentoInside }
     * 
     */
    public TipoResultadoValidacionDetalleDocumentoInside createTipoResultadoValidacionDetalleDocumentoInside() {
        return new TipoResultadoValidacionDetalleDocumentoInside();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoResultadoValidacionDocumentoInside }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/validacion/documento-e/resultados", name = "TipoResultadoValidacionDocumentoInside")
    public JAXBElement<TipoResultadoValidacionDocumentoInside> createTipoResultadoValidacionDocumentoInside(TipoResultadoValidacionDocumentoInside value) {
        return new JAXBElement<TipoResultadoValidacionDocumentoInside>(_TipoResultadoValidacionDocumentoInside_QNAME, TipoResultadoValidacionDocumentoInside.class, null, value);
    }

}
