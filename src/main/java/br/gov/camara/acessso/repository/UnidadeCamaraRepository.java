package br.gov.camara.acessso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.camara.acessso.model.SPB_Unidade_Camara_Boletim;

@Repository
public interface UnidadeCamaraRepository  extends JpaRepository<SPB_Unidade_Camara_Boletim, Long>{

}
