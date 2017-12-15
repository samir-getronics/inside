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

// Generated 28-ago-2012 18:17:29 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ExpedienteInsideInteresado generated by hbm2java
 */
@Entity
@Table(name = "ExpedienteInsideInteresado")
public class ExpedienteInsideInteresado implements java.io.Serializable {

	private Integer id;
	private ExpedienteInside expedienteInside;
	private String interesado;

	public ExpedienteInsideInteresado() {
	}

	public ExpedienteInsideInteresado(ExpedienteInside expedienteInside,
			String interesado) {
		this.expedienteInside = expedienteInside;
		this.interesado = interesado;
	}

	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@TableGenerator(name = "GeneradorPk_ExpedienteInsideInteresado",
    		table = "GeneradorClaves",
    		pkColumnName = "GenName",
    		valueColumnName = "GenValue",
    		pkColumnValue = "GEN_ExpedienteInsideInteresado",
    		allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "GeneradorPk_ExpedienteInsideInteresado")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_expediente", nullable = false)
	public ExpedienteInside getExpedienteInside() {
		return this.expedienteInside;
	}

	public void setExpedienteInside(ExpedienteInside expedienteInside) {
		this.expedienteInside = expedienteInside;
	}

	@Column(name = "interesado", nullable = false)
	public String getInteresado() {
		return this.interesado;
	}

	public void setInteresado(String interesado) {
		this.interesado = interesado;
	}
	
	@Override
	public String toString () {
		StringBuffer sb = new StringBuffer ("Entity ExpedienteInsideInteresado=[");
		String coma = ", ";
		
		sb.append("id=" + id + coma);
		sb.append("interesado=" + interesado);
		
		sb.append("]");
		return sb.toString();
		
	}

}
