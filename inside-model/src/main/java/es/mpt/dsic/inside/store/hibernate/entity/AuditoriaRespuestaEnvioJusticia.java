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

package es.mpt.dsic.inside.store.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * ExpedienteInsideIndice generated by hbm2java
 */
@Entity
@Table(name = "AuditoriaRespuestaEnvioJusticia")
public class AuditoriaRespuestaEnvioJusticia implements java.io.Serializable {

	private Integer id;
	private String identificadorExpediente;
	private UnidadOrganica unidad;
	private NumeroProcedimiento numeroProcedimiento;
	private String auditoriaEsbMarcaTiempo;
	private String codigoEnvio;
	
	

	@Id
	// @GeneratedValue(strategy = IDENTITY)
	@TableGenerator(name = "GeneradorPk_AuditoriaRespuestaEnvioJusticia", table = "GeneradorClaves", pkColumnName = "GenName", valueColumnName = "GenValue", pkColumnValue = "GEN_AuditoriaRespuestaEnvioJusticia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "GeneradorPk_AuditoriaRespuestaEnvioJusticia")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "identificador_expediente")
	public String getIdentificadorExpediente() {
		return identificadorExpediente;
	}

	public void setIdentificadorExpediente(String identificadorExpediente) {
		this.identificadorExpediente = identificadorExpediente;
	}

	@Column(name = "id_unidad")
	public UnidadOrganica getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadOrganica unidad) {
		this.unidad = unidad;
	}

	@Column(name = "id_procedimiento")
	public NumeroProcedimiento getNumeroProcedimiento() {
		return numeroProcedimiento;
	}

	public void setNumeroProcedimiento(NumeroProcedimiento numeroProcedimiento) {
		this.numeroProcedimiento = numeroProcedimiento;
	}

	@Column(name = "auditoriaEsb_marcaTiempo")
	public String getAuditoriaEsbMarcaTiempo() {
		return auditoriaEsbMarcaTiempo;
	}

	public void setAuditoriaEsbMarcaTiempo(String auditoriaEsbMarcaTiempo) {
		this.auditoriaEsbMarcaTiempo = auditoriaEsbMarcaTiempo;
	}
	
	@Column(name = "codigo_envio")
	public String getCodigoEnvio() {
		return codigoEnvio;
	}

	public void setCodigoEnvio(String codigoEnvio) {
		this.codigoEnvio = codigoEnvio;
	}
}
