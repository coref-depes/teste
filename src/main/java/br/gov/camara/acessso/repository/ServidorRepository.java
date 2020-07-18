package br.gov.camara.acessso.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.camara.acessso.model.VIW_Servidor;





public interface ServidorRepository  extends JpaRepository<VIW_Servidor, Long>{
	
	
	@Query("select servidor from VIW_Servidor servidor where num_ponto = ?1 ")
	VIW_Servidor findByNum_ponto(int numponto);


}
