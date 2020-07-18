package br.gov.camara.acessso.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class SPB_Permissao_Acesso implements  Serializable{
	
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long ide_objeto;


@JoinColumn (name = "usuario_ide_objeto", nullable = false)
@OneToOne 
private SPB_Usuario usuario;

@ManyToOne
@JoinColumn (name = "perfil_ide_objeto")
private SPB_Perfil_Acesso perfil;


@JoinColumn  (name = "unidadetrabalho_ide_objeto")
@ManyToOne
private SPB_Unidade_Camara_Boletim unidade;


public Long getIde_objeto() {
	return ide_objeto;
}


public void setIde_objeto(Long ide_objeto) {
	this.ide_objeto = ide_objeto;
}


public SPB_Usuario getUsuario() {
	return usuario;
}


public void setUsuario(SPB_Usuario usuario) {
	this.usuario = usuario;
}


public SPB_Perfil_Acesso getPerfil() {
	return perfil;
}


public void setPerfil(SPB_Perfil_Acesso perfil) {
	this.perfil = perfil;
}


public SPB_Unidade_Camara_Boletim getUnidade() {
	return unidade;
}


public void setUnidade(SPB_Unidade_Camara_Boletim unidade) {
	this.unidade = unidade;
}


@Override
public String toString() {
	return "SPB_Permissao_Acesso [ide_objeto=" + ide_objeto + ", usuario=" + usuario + ", perfil=" + perfil
			+ ", unidade=" + unidade + "]";
}




}



