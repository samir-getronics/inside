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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoEstadoElaboracion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoEstadoElaboracion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValorEstadoElaboracion" type="{http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos}enumeracionEstadoElaboracion"/>
 *         &lt;element name="IdentificadorDocumentoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoEstadoElaboracion", namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/metadatos", propOrder = {
    "valorEstadoElaboracion",
    "identificadorDocumentoOrigen"
})
public class TipoEstadoElaboracion {

    @XmlElement(name = "ValorEstadoElaboracion", required = true)
    @XmlSchemaType(name = "string")
    protected EnumeracionEstadoElaboracion valorEstadoElaboracion;
    @XmlElement(name = "IdentificadorDocumentoOrigen")
    protected String identificadorDocumentoOrigen;

    /**
     * Obtiene el valor de la propiedad valorEstadoElaboracion.
     * 
     * @return
     *     possible object is
     *     {@link EnumeracionEstadoElaboracion }
     *     
     */
    public EnumeracionEstadoElaboracion getValorEstadoElaboracion() {
        return valorEstadoElaboracion;
    }

    /**
     * Define el valor de la propiedad valorEstadoElaboracion.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeracionEstadoElaboracion }
     *     
     */
    public void setValorEstadoElaboracion(EnumeracionEstadoElaboracion value) {
        this.valorEstadoElaboracion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorDocumentoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorDocumentoOrigen() {
        return identificadorDocumentoOrigen;
    }

    /**
     * Define el valor de la propiedad identificadorDocumentoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorDocumentoOrigen(String value) {
        this.identificadorDocumentoOrigen = value;
    }

}
