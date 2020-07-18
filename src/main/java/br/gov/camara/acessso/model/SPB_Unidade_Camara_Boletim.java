package br.gov.camara.acessso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SPB_Unidade_Camara_Boletim implements  Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ide_objeto;
	
	@Column
	private int num_ordem;

	@Column(nullable = false)
	private int cod_unidade_camara;
	
	@Column( nullable = false)
	private String nom_unidade_camara;

	@Column(length = 20, nullable = false)
	private String sig_unidade_camara;
	
	@Column
	private String  nom_departamento;
	
	@Column
	private String  nom_superior;
	
	@Column( nullable = false)
	private String des_titulo_materia;
		
	@Column( nullable = false)
	private String nom_autoridade;
	
	@Column( nullable = false)
	private String des_autoridade;
	
	@Column
	private Character ind_genero;

	public Long getIde_objeto() {
		return ide_objeto;
	}

	public void setIde_objeto(Long ide_objeto) {
		this.ide_objeto = ide_objeto;
	}

	public int getNum_ordem() {
		return num_ordem;
	}

	public void setNum_ordem(int num_ordem) {
		this.num_ordem = num_ordem;
	}

	public int getCod_unidade_camara() {
		return cod_unidade_camara;
	}

	public void setCod_unidade_camara(int cod_unidade_camara) {
		this.cod_unidade_camara = cod_unidade_camara;
	}

	public String getNom_unidade_camara() {
		return nom_unidade_camara;
	}

	public void setNom_unidade_camara(String nom_unidade_camara) {
		this.nom_unidade_camara = nom_unidade_camara;
	}

	public String getSig_unidade_camara() {
		return sig_unidade_camara;
	}

	public void setSig_unidade_camara(String sig_unidade_camara) {
		this.sig_unidade_camara = sig_unidade_camara;
	}

	public String getNom_departamento() {
		return nom_departamento;
	}

	public void setNom_departamento(String nom_departamento) {
		this.nom_departamento = nom_departamento;
	}

	public String getNom_superior() {
		return nom_superior;
	}

	public void setNom_superior(String nom_superior) {
		this.nom_superior = nom_superior;
	}

	public String getDes_titulo_materia() {
		return des_titulo_materia;
	}

	public void setDes_titulo_materia(String des_titulo_materia) {
		this.des_titulo_materia = des_titulo_materia;
	}

	public String getNom_autoridade() {
		return nom_autoridade;
	}

	public void setNom_autoridade(String nom_autoridade) {
		this.nom_autoridade = nom_autoridade;
	}

	public String getDes_autoridade() {
		return des_autoridade;
	}

	public void setDes_autoridade(String des_autoridade) {
		this.des_autoridade = des_autoridade;
	}

	public Character getInd_genero() {
		return ind_genero;
	}

	public void setInd_genero(Character ind_genero) {
		this.ind_genero = ind_genero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SPB_Unidade_Camara_Boletim [ide_objeto=" + ide_objeto + ", num_ordem=" + num_ordem
				+ ", cod_unidade_camara=" + cod_unidade_camara + ", nom_unidade_camara=" + nom_unidade_camara
				+ ", sig_unidade_camara=" + sig_unidade_camara + ", nom_departamento=" + nom_departamento
				+ ", nom_superior=" + nom_superior + ", des_titulo_materia=" + des_titulo_materia + ", nom_autoridade="
				+ nom_autoridade + ", des_autoridade=" + des_autoridade + ", ind_genero=" + ind_genero + "]";
	}
	


	
}