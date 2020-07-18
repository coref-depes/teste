package br.gov.camara.acessso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;



	


@Entity
public class SPB_Usuario  implements  Serializable{
	
private static final long serialVersionUID = 1L;
//	public class SIP_Usuario  extends GenericDomain {	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ide_objeto;


	@Column
	private int num_ponto_usuario;	
	
	@Column(length = 100)
	private String nom_usuario;
	
	@Column(length = 100, nullable = false)
	private String senha;
	
	@Column(length = 20, nullable = false)
	private String login;

	
	@Column
	private Character ind_situacao;


	@Transient 
	String situacao;
	
	
	
	
	public Long getIde_objeto() {
		return ide_objeto;
	}


	public void setIde_objeto(Long ide_objeto) {
		this.ide_objeto = ide_objeto;
	}


	public int getNum_ponto_usuario() {
		return num_ponto_usuario;
	}


	public void setNum_ponto_usuario(int num_ponto_usuario) {
		this.num_ponto_usuario = num_ponto_usuario;
	}


	public String getNom_usuario() {
		return nom_usuario;
	}


	public void setNom_usuario(String nom_usuario) {
		this.nom_usuario = nom_usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public Character getInd_situacao() {
		if (ind_situacao == '1')
			{situacao = "Liberado";}
		else
		{situacao = "Bloqueado";}
		return ind_situacao;
	}


	public void setInd_situacao(Character ind_situacao) {
		this.ind_situacao = ind_situacao;


	}

		

	public String getSituacao() {
		if (ind_situacao == '1')
		{situacao = "Liberado";}
	else
	{situacao = "Bloqueado";}
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "SPB_Usuario [ide_objeto=" + ide_objeto + ", num_ponto_usuario=" + num_ponto_usuario + ", nom_usuario="
				+ nom_usuario + ", senha=" + senha + ", login=" + login + ", ind_situacao=" + ind_situacao
				+ ", situacao=" + situacao + "]";
	}
	


}
