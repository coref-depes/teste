package br.gov.camara.acessso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.camara.acessso.model.SPB_Perfil_Acesso;

@Repository
public interface PerfilRepository  extends JpaRepository<SPB_Perfil_Acesso, Long>{

}
