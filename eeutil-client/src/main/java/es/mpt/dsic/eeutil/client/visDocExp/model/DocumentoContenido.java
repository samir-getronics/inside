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


package es.mpt.dsic.eeutil.client.visDocExp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para documentoContenido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="documentoContenido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bytesDocumento" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="mimeDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentoContenido", propOrder = {
    "bytesDocumento",
    "mimeDocumento"
})
public class DocumentoContenido {

    @XmlElement(required = true)
    protected byte[] bytesDocumento;
    @XmlElement(required = true)
    protected String mimeDocumento;

    /**
     * Obtiene el valor de la propiedad bytesDocumento.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBytesDocumento() {
        return bytesDocumento;
    }

    /**
     * Define el valor de la propiedad bytesDocumento.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBytesDocumento(byte[] value) {
        this.bytesDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad mimeDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeDocumento() {
        return mimeDocumento;
    }

    /**
     * Define el valor de la propiedad mimeDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeDocumento(String value) {
        this.mimeDocumento = value;
    }

}
