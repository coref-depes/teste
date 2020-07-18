package br.gov.camara.acessso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.gov.camara.acessso.model.SPB_Usuario;
import br.gov.camara.acessso.model.VIW_Servidor;
import br.gov.camara.acessso.repository.ServidorRepository;
import br.gov.camara.acessso.repository.UsuarioRepository;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	
	VIW_Servidor  servidor = new VIW_Servidor();
	
	SPB_Usuario usuario = new SPB_Usuario();
	
	@Autowired
	UsuarioRepository usuariodao;
	
	@Autowired
	ServidorRepository servidordao;
	
	int numponto = 0;
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("usuario/lista");
		modelAndView.addObject("usuarios", usuariodao.findAll());
		return modelAndView;
		
	}
	
	
	

	
	@GetMapping("/novo/{ponto}")
	public ModelAndView novo(@RequestParam("numponto") int numponto) {
		ModelAndView modelAndView;
		
		String msgvalidacao = "";
		servidor = servidordao.findByNum_ponto(numponto);
		

		
		if (servidor != null) {
	
		Long id = servidor.getIde_objeto();
		servidor = servidordao.getOne(id);	
		msgvalidacao = "servidor localizado";
		usuario = new SPB_Usuario();
		usuario.setNum_ponto_usuario(servidor.getNum_ponto());
		usuario.setNom_usuario(servidor.getPessoafisica().getNom_pessoa_fisica());
		usuario.setInd_situacao('1');
		usuario.setLogin("P_"+servidor.getNum_ponto());
		usuario.setSenha("1234");
		SPB_Usuario usr = usuariodao.findByNum_ponto(numponto);
		if (usr != null) {
			usuario = usr;	
		}
		
		modelAndView = new ModelAndView("usuario/inclusao");
		modelAndView.addObject("usuario", usuario);
		modelAndView.addObject("success", msgvalidacao);
		}
		else
		{
			
		
			 modelAndView = new ModelAndView("usuario/lista");
			modelAndView.addObject("usuarios", usuariodao.findAll());
			modelAndView.addObject("fail", "Ponto não cadastrado");
		}
	
		return modelAndView;

	}	
	
	
	@PostMapping("/salvar")
	public String salvar(final SPB_Usuario usuario, final   BindingResult  bindingResult) {
	 
	this.usuariodao.save(usuario);
		
	
	//	attrib.addFlashAttribute("success", "Médico incluido com sucesso.");
		return "redirect:/usuario/listar";

	}	
	
	
	@GetMapping("/edicao/{id}")
	public ModelAndView Edicao(@PathVariable("id") Long id) {
		
		ModelAndView modelAndView = new ModelAndView("usuario/alteracao");
		modelAndView.addObject("usuario", usuariodao.findById(id));
		return modelAndView;

	}

}
