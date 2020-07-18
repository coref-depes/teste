package br.gov.camara.acessso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
@Entity
public class SPB_Perfil_Acesso  implements  Serializable{
	
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long ide_objeto;

@Column
private int cod_perfil;

@Column(length = 100)
private String nom_perfil;

public Long getIde_objeto() {
	return ide_objeto;
}

public void setIde_objeto(Long ide_objeto) {
	this.ide_objeto = ide_objeto;
}

public int getCod_perfil() {
	return cod_perfil;
}

public void setCod_perfil(int cod_perfil) {
	this.cod_perfil = cod_perfil;
}

public String getNom_perfil() {
	return nom_perfil;
}

public void setNom_perfil(String nom_perfil) {
	this.nom_perfil = nom_perfil;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

@Override
public String toString() {
	return "SPB_Perfil_Acesso [ide_objeto=" + ide_objeto + ", cod_perfil=" + cod_perfil + ", nom_perfil=" + nom_perfil
			+ "]";
}



}
