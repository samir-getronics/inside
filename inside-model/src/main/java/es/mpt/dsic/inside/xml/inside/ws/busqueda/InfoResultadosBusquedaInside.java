
package es.mpt.dsic.inside.xml.inside.ws.busqueda;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Aporta información sobre el número de resultados obtenidos, el número de resultados totales, 
 * 			si el número de resultados excede a los que se pueden devolver en una sola llamada el resultado se "pagina"
 * 			devolviendose el número de "páginas" en las que están divididos los resultados y la "página" actual 
 * 			
 * 
 * <p>Java class for InfoResultadosBusquedaInside complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoResultadosBusquedaInside">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totales" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="devueltos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pagina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paginas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoResultadosBusquedaInside", namespace = "https://ssweb.seap.minhap.es/Inside/XSD/v1.0/busqueda/resultados", propOrder = {
    "totales",
    "devueltos",
    "pagina",
    "paginas"
})
public class InfoResultadosBusquedaInside {

    protected int totales;
    protected int devueltos;
    protected int pagina;
    protected int paginas;

    /**
     * Gets the value of the totales property.
     * 
     */
    public int getTotales() {
        return totales;
    }

    /**
     * Sets the value of the totales property.
     * 
     */
    public void setTotales(int value) {
        this.totales = value;
    }

    /**
     * Gets the value of the devueltos property.
     * 
     */
    public int getDevueltos() {
        return devueltos;
    }

    /**
     * Sets the value of the devueltos property.
     * 
     */
    public void setDevueltos(int value) {
        this.devueltos = value;
    }

    /**
     * Gets the value of the pagina property.
     * 
     */
    public int getPagina() {
        return pagina;
    }

    /**
     * Sets the value of the pagina property.
     * 
     */
    public void setPagina(int value) {
        this.pagina = value;
    }

    /**
     * Gets the value of the paginas property.
     * 
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Sets the value of the paginas property.
     * 
     */
    public void setPaginas(int value) {
        this.paginas = value;
    }

}
