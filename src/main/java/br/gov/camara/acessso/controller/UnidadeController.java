package br.gov.camara.acessso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import br.gov.camara.acessso.model.SPB_Unidade_Camara_Boletim;
import br.gov.camara.acessso.repository.UnidadeCamaraRepository;



@Controller
@RequestMapping("/unidade")
public class UnidadeController {
	SPB_Unidade_Camara_Boletim  unidade = new SPB_Unidade_Camara_Boletim();
	
	List<SPB_Unidade_Camara_Boletim>  unidades = new ArrayList<SPB_Unidade_Camara_Boletim>();
	
	@Autowired
	UnidadeCamaraRepository unidadedao;
	
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("unidadecamara/lista");
		unidades = unidadedao.findAll();
		System.out.println("OK");
		modelAndView.addObject("unidades", unidades) ;
		System.out.println("OK - "+unidades.get(0).getDes_autoridade());
		return modelAndView; 
		
	}
	
	
	@GetMapping("/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("unidadecamara/inclusao");	
		unidade = new SPB_Unidade_Camara_Boletim();
		modelAndView.addObject("unidade", unidade);
		return modelAndView;

	}	
	
	@GetMapping("/edicao/{id}")
	public ModelAndView Edicao(@PathVariable("id") Long id) {
		
		ModelAndView modelAndView = new ModelAndView("unidadecamara/alteracao");
		unidade = unidadedao.findById(id).get();
		modelAndView.addObject("unidade", unidade);
		return modelAndView;

	}

}
