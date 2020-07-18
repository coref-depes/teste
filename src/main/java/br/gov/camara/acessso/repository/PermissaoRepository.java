package br.gov.camara.acessso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.gov.camara.acessso.model.SPB_Permissao_Acesso;

@Repository
public interface PermissaoRepository  extends JpaRepository<SPB_Permissao_Acesso, Long>{
	
	
	@Query("select permissao from SPB_Permissao_Acesso permissao where usuario_ide_objeto = ?1 ")
	SPB_Permissao_Acesso findById_Usuario(Long id);	
	
	@Query("select permissao, usuario from SPB_Permissao_Acesso permissao, SPB_Usuario usuario  where usuario.num_ponto_usuario = ?1 ")
	SPB_Permissao_Acesso findByNum_Ponto(int numponto);


}
