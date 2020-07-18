package br.gov.camara.acessso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.acessso.model.SPB_Usuario;


@Repository
public interface UsuarioRepository  extends JpaRepository<SPB_Usuario, Long>{
	
	@Query("select usuario from SPB_Usuario usuario where num_ponto_usuario = ?1 ")
	SPB_Usuario findByNum_ponto(int numponto);

}
