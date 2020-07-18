package br.gov.camara.acessso.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class VIW_Pessoa_Fisica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ide_objeto;
	

	@Column(length = 100, nullable = false)
	private String nom_pessoa_fisica;
	
	@Column(length = 1)
	private String ind_sexo;
	
	@Column(length = 14)
	private String num_cpf;
	

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "dat_nascimento", columnDefinition = "TIMESTAMP")
	private LocalDate  dat_nascimento;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dat_falecimento;
	
	
	
	@Column(length = 100, nullable = false)
	private String nom_pai;
	
	@Column(length = 100, nullable = false)
	private String nom_mae;

	
	
	
	public Long getIde_objeto() {
		return ide_objeto;
	}




	public void setIde_objeto(Long ide_objeto) {
		this.ide_objeto = ide_objeto;
	}




	public String getNom_pessoa_fisica() {
		return nom_pessoa_fisica;
	}




	public void setNom_pessoa_fisica(String nom_pessoa_fisica) {
		this.nom_pessoa_fisica = nom_pessoa_fisica;
	}




	public String getInd_sexo() {
		return ind_sexo;
	}




	public void setInd_sexo(String ind_sexo) {
		this.ind_sexo = ind_sexo;
	}




	public String getNum_cpf() {
		return num_cpf;
	}




	public void setNum_cpf(String num_cpf) {
		this.num_cpf = num_cpf;
	}




	public LocalDate getDat_nascimento() {
		return dat_nascimento;
	}




	public void setDat_nascimento(LocalDate dat_nascimento) {
		this.dat_nascimento = dat_nascimento;
	}




	public Date getDat_falecimento() {
		return dat_falecimento;
	}




	public void setDat_falecimento(Date dat_falecimento) {
		this.dat_falecimento = dat_falecimento;
	}




	public String getNom_pai() {
		return nom_pai;
	}




	public void setNom_pai(String nom_pai) {
		this.nom_pai = nom_pai;
	}




	public String getNom_mae() {
		return nom_mae;
	}




	public void setNom_mae(String nom_mae) {
		this.nom_mae = nom_mae;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dat_falecimento == null) ? 0 : dat_falecimento.hashCode());
		result = prime * result + ((dat_nascimento == null) ? 0 : dat_nascimento.hashCode());
		result = prime * result + ((ide_objeto == null) ? 0 : ide_objeto.hashCode());
		result = prime * result + ((ind_sexo == null) ? 0 : ind_sexo.hashCode());
		result = prime * result + ((nom_mae == null) ? 0 : nom_mae.hashCode());
		result = prime * result + ((nom_pai == null) ? 0 : nom_pai.hashCode());
		result = prime * result + ((nom_pessoa_fisica == null) ? 0 : nom_pessoa_fisica.hashCode());
		result = prime * result + ((num_cpf == null) ? 0 : num_cpf.hashCode());
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
		VIW_Pessoa_Fisica other = (VIW_Pessoa_Fisica) obj;
		if (dat_falecimento == null) {
			if (other.dat_falecimento != null)
				return false;
		} else if (!dat_falecimento.equals(other.dat_falecimento))
			return false;
		if (dat_nascimento == null) {
			if (other.dat_nascimento != null)
				return false;
		} else if (!dat_nascimento.equals(other.dat_nascimento))
			return false;
		if (ide_objeto == null) {
			if (other.ide_objeto != null)
				return false;
		} else if (!ide_objeto.equals(other.ide_objeto))
			return false;
		if (ind_sexo == null) {
			if (other.ind_sexo != null)
				return false;
		} else if (!ind_sexo.equals(other.ind_sexo))
			return false;
		if (nom_mae == null) {
			if (other.nom_mae != null)
				return false;
		} else if (!nom_mae.equals(other.nom_mae))
			return false;
		if (nom_pai == null) {
			if (other.nom_pai != null)
				return false;
		} else if (!nom_pai.equals(other.nom_pai))
			return false;
		if (nom_pessoa_fisica == null) {
			if (other.nom_pessoa_fisica != null)
				return false;
		} else if (!nom_pessoa_fisica.equals(other.nom_pessoa_fisica))
			return false;
		if (num_cpf == null) {
			if (other.num_cpf != null)
				return false;
		} else if (!num_cpf.equals(other.num_cpf))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "VIW_Pessoa_Fisica [ide_objeto=" + ide_objeto + ", nom_pessoa_fisica=" + nom_pessoa_fisica
				+ ", ind_sexo=" + ind_sexo + ", num_cpf=" + num_cpf + ", dat_nascimento=" + dat_nascimento
				+ ", dat_falecimento=" + dat_falecimento + ", nom_pai=" + nom_pai + ", nom_mae=" + nom_mae + "]";
	}

	
	

}
