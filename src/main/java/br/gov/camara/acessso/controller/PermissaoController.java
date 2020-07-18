package br.gov.camara.acessso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.gov.camara.acessso.model.SPB_Perfil_Acesso;
import br.gov.camara.acessso.model.SPB_Permissao_Acesso;
import br.gov.camara.acessso.model.SPB_Unidade_Camara_Boletim;
import br.gov.camara.acessso.model.SPB_Usuario;
import br.gov.camara.acessso.model.VIW_Servidor;
import br.gov.camara.acessso.repository.PerfilRepository;
import br.gov.camara.acessso.repository.PermissaoRepository;
import br.gov.camara.acessso.repository.ServidorRepository;
import br.gov.camara.acessso.repository.UnidadeCamaraRepository;
import br.gov.camara.acessso.repository.UsuarioRepository;

@Controller
@RequestMapping("/permissao")
public class PermissaoController {
	

	
	@Autowired
	UsuarioRepository usuariodao;
	
	@Autowired
	PermissaoRepository permissaodao;
	
	@Autowired
	UnidadeCamaraRepository unidadedao;
	
	@Autowired
	PerfilRepository perfildao;
	
	VIW_Servidor  servidor = new VIW_Servidor();
	
	SPB_Usuario usuario = new SPB_Usuario();


	
	@Autowired
	ServidorRepository servidordao;
	
	
	
	SPB_Permissao_Acesso  permissao = new SPB_Permissao_Acesso();
	
	List<SPB_Permissao_Acesso>  permissoes = new ArrayList<SPB_Permissao_Acesso>();
	List<SPB_Perfil_Acesso>  perfis = new ArrayList<SPB_Perfil_Acesso>();
	List<SPB_Unidade_Camara_Boletim>  unidades = new ArrayList<SPB_Unidade_Camara_Boletim>();
	SPB_Unidade_Camara_Boletim  unidade = new SPB_Unidade_Camara_Boletim();
	
	
	int numponto = 0;
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("permissao/lista");
		SPB_Usuario usuario = new SPB_Usuario();

		permissoes = permissaodao.findAll();
		modelAndView.addObject("permissoes", permissoes);
		modelAndView.addObject("usuario", usuario);
		modelAndView.addObject("unidade", unidade);

		return modelAndView;
		
	}

	@GetMapping("/novo/{numponto}")
	public ModelAndView novo(@RequestParam("numponto") int numponto ) {
		ModelAndView modelAndView = new ModelAndView("permissao/inclusao");
		
		servidor = new VIW_Servidor();
		usuario = new SPB_Usuario();
		permissao = new SPB_Permissao_Acesso();
		String msgvalidacao = "nova permissão";
		servidor = servidordao.findByNum_ponto(numponto);
		if (servidor == null) {
			msgvalidacao = "servidor não cadastrado";}			
		usuario = usuariodao.findByNum_ponto(numponto);
			if (usuario == null) {
				msgvalidacao = "usuário não cadastrado";}
			
			
		if (msgvalidacao.equals( "nova permissão")) {
			
		Long id = usuario.getIde_objeto();
		usuario = usuariodao.getOne(id);
		SPB_Permissao_Acesso perm = new SPB_Permissao_Acesso();
		 perm = permissao =permissaodao.findById_Usuario(id);	
		if (perm != null) {
			permissao = perm;

			}


		permissao = new SPB_Permissao_Acesso();
		permissao.setUsuario(usuario);
		
		unidades = unidadedao.findAll();

		perfis = perfildao.findAll();
		
		modelAndView = new ModelAndView("permissao/inclusao");
		modelAndView.addObject("permissao", permissao);
		modelAndView.addObject("usuario", usuario);
		modelAndView.addObject("unidades", unidades);
		modelAndView.addObject("perfis", perfis);

		}
		else
		{
		 modelAndView = new ModelAndView("permissao/lista");
			modelAndView.addObject("permissoes", permissaodao.findAll());
		
			modelAndView.addObject("fail", msgvalidacao);
		}

		return modelAndView;

	}	
	
	@PostMapping("/salvar")
	public String salvar(SPB_Usuario usuario,  SPB_Permissao_Acesso permissao, SPB_Unidade_Camara_Boletim unidade, SPB_Perfil_Acesso perfil, final   BindingResult  bindingResult) {
	

	usuario =usuariodao.findById( permissao.getUsuario().getIde_objeto()).get();
	unidade =unidadedao.findById( permissao.getUnidade().getIde_objeto()).get();
	perfil = perfildao.findById(permissao.getPerfil().getIde_objeto()).get();

		
	permissao.setPerfil(perfil);
	permissao.setUnidade(unidade);	
	permissao.setUsuario(usuario);
	this.permissaodao.save(permissao);

		return "redirect:/permissao/listar";

	}	
	
	@GetMapping("/edicao/{id}")
	public ModelAndView Edicao(@PathVariable("id") Long id) {
		
		ModelAndView modelAndView = new ModelAndView("permissao/alteracao");

		
		permissao = permissaodao.findById(id).get();
		
	
		
		unidades = unidadedao.findAll();

		perfis = perfildao.findAll();
		
	
		modelAndView.addObject("permissao", permissao);
		modelAndView.addObject("unidades", unidades);
		modelAndView.addObject("perfis", perfis);
		
		
		return modelAndView;

	}

	
	
}
