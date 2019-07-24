
package es.justicia.esb.comun.xsd_schemas.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Esquema de Datos de Auditoria para ESB
 * 
 * 
 * <p>
 * Java class for AuditoriaEsbType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditoriaEsbType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Aplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Servicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarcaTiempo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditoriaEsbType",
    propOrder = {"aplicacion", "modulo", "servicio", "marcaTiempo", "id", "destino"})
public class AuditoriaEsbType {

  @XmlElement(name = "Aplicacion", required = true)
  protected String aplicacion;
  @XmlElement(name = "Modulo")
  protected String modulo;
  @XmlElement(name = "Servicio")
  protected String servicio;
  @XmlElement(name = "MarcaTiempo")
  protected String marcaTiempo;
  @XmlElement(name = "Id")
  protected String id;
  @XmlElement(name = "Destino")
  protected String destino;

  /**
   * Gets the value of the aplicacion property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getAplicacion() {
    return aplicacion;
  }

  /**
   * Sets the value of the aplicacion property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setAplicacion(String value) {
    this.aplicacion = value;
  }

  /**
   * Gets the value of the modulo property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getModulo() {
    return modulo;
  }

  /**
   * Sets the value of the modulo property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setModulo(String value) {
    this.modulo = value;
  }

  /**
   * Gets the value of the servicio property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getServicio() {
    return servicio;
  }

  /**
   * Sets the value of the servicio property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setServicio(String value) {
    this.servicio = value;
  }

  /**
   * Gets the value of the marcaTiempo property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMarcaTiempo() {
    return marcaTiempo;
  }

  /**
   * Sets the value of the marcaTiempo property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMarcaTiempo(String value) {
    this.marcaTiempo = value;
  }

  /**
   * Gets the value of the id property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the destino property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDestino() {
    return destino;
  }

  /**
   * Sets the value of the destino property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDestino(String value) {
    this.destino = value;
  }

}
