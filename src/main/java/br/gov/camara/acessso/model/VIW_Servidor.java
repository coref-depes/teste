package br.gov.camara.acessso.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VIW_Servidor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ide_objeto;
	@Column( nullable = false)
	private int num_ponto;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dat_inicio_historico;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dat_fim_historico;
	
	@Column
	private int lotacao_ide_objeto;
	
	@ManyToOne
	@JoinColumn (nullable = false)
	private VIW_Pessoa_Fisica pessoafisica;

	@ManyToOne
	@JoinColumn (nullable = false)
	private VIW_Grupo grupo;

	public Long getIde_objeto() {
		return ide_objeto;
	}

	public void setIde_objeto(Long ide_objeto) {
		this.ide_objeto = ide_objeto;
	}

	public int getNum_ponto() {
		return num_ponto;
	}

	public void setNum_ponto(int num_ponto) {
		this.num_ponto = num_ponto;
	}

	public Date getDat_inicio_historico() {
		return dat_inicio_historico;
	}

	public void setDat_inicio_historico(Date dat_inicio_historico) {
		this.dat_inicio_historico = dat_inicio_historico;
	}

	public Date getDat_fim_historico() {
		return dat_fim_historico;
	}

	public void setDat_fim_historico(Date dat_fim_historico) {
		this.dat_fim_historico = dat_fim_historico;
	}

	public int getLotacao_ide_objeto() {
		return lotacao_ide_objeto;
	}

	public void setLotacao_ide_objeto(int lotacao_ide_objeto) {
		this.lotacao_ide_objeto = lotacao_ide_objeto;
	}

	public VIW_Pessoa_Fisica getPessoafisica() {
		return pessoafisica;
	}

	public void setPessoafisica(VIW_Pessoa_Fisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

	public VIW_Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(VIW_Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dat_fim_historico == null) ? 0 : dat_fim_historico.hashCode());
		result = prime * result + ((dat_inicio_historico == null) ? 0 : dat_inicio_historico.hashCode());
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + ((ide_objeto == null) ? 0 : ide_objeto.hashCode());
		result = prime * result + lotacao_ide_objeto;
		result = prime * result + num_ponto;
		result = prime * result + ((pessoafisica == null) ? 0 : pessoafisica.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VIW_Servidor other = (VIW_Servidor) obj;
		if (dat_fim_historico == null) {
			if (other.dat_fim_historico != null)
				return false;
		} else if (!dat_fim_historico.equals(other.dat_fim_historico))
			return false;
		if (dat_inicio_historico == null) {
			if (other.dat_inicio_historico != null)
				return false;
		} else if (!dat_inicio_historico.equals(other.dat_inicio_historico))
			return false;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (ide_objeto == null) {
			if (other.ide_objeto != null)
				return false;
		} else if (!ide_objeto.equals(other.ide_objeto))
			return false;
		if (lotacao_ide_objeto != other.lotacao_ide_objeto)
			return false;
		if (num_ponto != other.num_ponto)
			return false;
		if (pessoafisica == null) {
			if (other.pessoafisica != null)
				return false;
		} else if (!pessoafisica.equals(other.pessoafisica))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VIW_Servidor [ide_objeto=" + ide_objeto + ", num_ponto=" + num_ponto + ", dat_inicio_historico="
				+ dat_inicio_historico + ", dat_fim_historico=" + dat_fim_historico + ", lotacao_ide_objeto="
				+ lotacao_ide_objeto + ", pessoafisica=" + pessoafisica + ", grupo=" + grupo + "]";
	}

	
	

}
