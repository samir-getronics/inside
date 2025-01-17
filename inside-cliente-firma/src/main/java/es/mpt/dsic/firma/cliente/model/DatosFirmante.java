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


package es.mpt.dsic.firma.cliente.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datosFirmante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datosFirmante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreFirmante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mailFirmante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entidadCertificadora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFirmante", propOrder = {
    "nombreFirmante",
    "numeroIdentificacion",
    "mailFirmante",
    "entidadCertificadora"
})
public class DatosFirmante {

    @XmlElement(required = true)
    protected String nombreFirmante;
    @XmlElement(required = true)
    protected String numeroIdentificacion;
    @XmlElement(required = true)
    protected String mailFirmante;
    @XmlElement(required = true)
    protected String entidadCertificadora;

    /**
     * Gets the value of the nombreFirmante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFirmante() {
        return nombreFirmante;
    }

    /**
     * Sets the value of the nombreFirmante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFirmante(String value) {
        this.nombreFirmante = value;
    }

    /**
     * Gets the value of the numeroIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Sets the value of the numeroIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacion(String value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Gets the value of the mailFirmante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailFirmante() {
        return mailFirmante;
    }

    /**
     * Sets the value of the mailFirmante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailFirmante(String value) {
        this.mailFirmante = value;
    }

    /**
     * Gets the value of the entidadCertificadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadCertificadora() {
        return entidadCertificadora;
    }

    /**
     * Sets the value of the entidadCertificadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadCertificadora(String value) {
        this.entidadCertificadora = value;
    }

}
