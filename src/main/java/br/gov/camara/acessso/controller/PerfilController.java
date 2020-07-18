package br.gov.camara.acessso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.camara.acessso.model.SPB_Perfil_Acesso;
import br.gov.camara.acessso.repository.PerfilRepository;




@Controller
@RequestMapping("/perfil")
public class PerfilController {
	
	SPB_Perfil_Acesso perfil = new SPB_Perfil_Acesso();
	
	@Autowired
	private PerfilRepository perfildao;
	
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("perfil/lista");
		modelAndView.addObject("perfis", perfildao.findAll());
		return modelAndView;
		
	}
	
	
	@GetMapping("/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("perfil/inclusao");	
		perfil = new SPB_Perfil_Acesso();
		modelAndView.addObject("perfil", perfil);
		return modelAndView;

	}	
	
	
	@PostMapping("/salvar")
	public String salvar(final SPB_Perfil_Acesso perfil, final   BindingResult  bindingResult) {
	 
	this.perfildao.save(perfil);
		
	
	//	attrib.addFlashAttribute("success", "Médico incluido com sucesso.");
		return "redirect:/perfil/listar";

	}

	@GetMapping("/edicao/{id}")
	public ModelAndView Edicao(@PathVariable("id") Long id) {
		
		ModelAndView modelAndView = new ModelAndView("perfil/alteracao");
		//SIP_Medico usuario = medicodao.findById(id);
		modelAndView.addObject("perfil", perfildao.findById(id));
		return modelAndView;

	}


}
