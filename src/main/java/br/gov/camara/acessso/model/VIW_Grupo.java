package br.gov.camara.acessso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VIW_Grupo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ide_objeto;
	
	@Column(nullable = false)
	private int cod_objeto;
	
	@Column(length = 50, nullable = false)
	private String nom_grupo;

	public Long getIde_objeto() {
		return ide_objeto;
	}

	public void setIde_objeto(Long ide_objeto) {
		this.ide_objeto = ide_objeto;
	}

	public int getCod_objeto() {
		return cod_objeto;
	}

	public void setCod_objeto(int cod_objeto) {
		this.cod_objeto = cod_objeto;
	}

	public String getNom_grupo() {
		return nom_grupo;
	}

	public void setNom_grupo(String nom_grupo) {
		this.nom_grupo = nom_grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod_objeto;
		result = prime * result + ((ide_objeto == null) ? 0 : ide_objeto.hashCode());
		result = prime * result + ((nom_grupo == null) ? 0 : nom_grupo.hashCode());
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
		VIW_Grupo other = (VIW_Grupo) obj;
		if (cod_objeto != other.cod_objeto)
			return false;
		if (ide_objeto == null) {
			if (other.ide_objeto != null)
				return false;
		} else if (!ide_objeto.equals(other.ide_objeto))
			return false;
		if (nom_grupo == null) {
			if (other.nom_grupo != null)
				return false;
		} else if (!nom_grupo.equals(other.nom_grupo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VIW_Grupo [ide_objeto=" + ide_objeto + ", cod_objeto=" + cod_objeto + ", nom_grupo=" + nom_grupo + "]";
	}


}
