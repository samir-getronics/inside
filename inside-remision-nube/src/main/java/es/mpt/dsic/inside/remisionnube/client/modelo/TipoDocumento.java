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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para TipoDocumento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido}contenido"/>
 *         &lt;element ref="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos}metadatos"/>
 *         &lt;element ref="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma}firmas" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumento", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e", propOrder = {
    "contenido",
    "metadatos",
    "firmas"
})
public class TipoDocumento {

    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido", required = true)
    protected TipoContenido contenido;
    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", required = true)
    protected TipoMetadatos metadatos;
    @XmlElement(namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/firma")
    protected Firmas firmas;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtiene el valor de la propiedad contenido.
     * 
     * @return
     *     possible object is
     *     {@link TipoContenido }
     *     
     */
    public TipoContenido getContenido() {
        return contenido;
    }

    /**
     * Define el valor de la propiedad contenido.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContenido }
     *     
     */
    public void setContenido(TipoContenido value) {
        this.contenido = value;
    }

    /**
     * Obtiene el valor de la propiedad metadatos.
     * 
     * @return
     *     possible object is
     *     {@link TipoMetadatos }
     *     
     */
    public TipoMetadatos getMetadatos() {
        return metadatos;
    }

    /**
     * Define el valor de la propiedad metadatos.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMetadatos }
     *     
     */
    public void setMetadatos(TipoMetadatos value) {
        this.metadatos = value;
    }

    /**
     * La firma es obligatoria para el documento administrativo electrónico y para todo aquel documento electrónico susceptible de ser incorporado en un expediente electrónico.
     * 
     * @return
     *     possible object is
     *     {@link Firmas }
     *     
     */
    public Firmas getFirmas() {
        return firmas;
    }

    /**
     * Define el valor de la propiedad firmas.
     * 
     * @param value
     *     allowed object is
     *     {@link Firmas }
     *     
     */
    public void setFirmas(Firmas value) {
        this.firmas = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
