package br.gov.camara.acessso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MenuController{
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/sipes")
    public String menu() {
      //  return "home";
      return "home";
    }
}