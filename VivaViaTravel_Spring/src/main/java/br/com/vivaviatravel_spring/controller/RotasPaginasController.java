package br.com.vivaviatravel_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RotasPaginasController {

	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index.html");
		modelAndView.addObject("currentPage", "/home");

		return modelAndView;
	}

	@GetMapping("/hospedagens")
	public ModelAndView hospedagens() {
		ModelAndView modelAndView = new ModelAndView("views/pages/hospedagens.html");
		modelAndView.addObject("currentPage", "/hospedagens");

		return modelAndView;
	}

	@GetMapping("/passagens")
	public ModelAndView passagens() {
		ModelAndView modelAndView = new ModelAndView("views/pages/passagens.html");
		modelAndView.addObject("currentPage", "/passagens");

		return modelAndView;
	}

	@GetMapping("/promocoes")
	public ModelAndView promocoes() {
		ModelAndView modelAndView = new ModelAndView("views/pages/promocoes.html");
		modelAndView.addObject("currentPage", "/promocoes");

		return modelAndView;
	}

	@GetMapping("/destinos")
	public ModelAndView destinos() {
		ModelAndView modelAndView = new ModelAndView("views/pages/destinos.html");
		modelAndView.addObject("currentPage", "/destinos");

		return modelAndView;
	}

	@GetMapping("/contato")
	public ModelAndView contato() {
		ModelAndView modelAndView = new ModelAndView("views/pages/contato.html");
		modelAndView.addObject("currentPage", "/contato");

		return modelAndView;
	}

	@GetMapping("/admin")
	public String admin() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("currentPage", "/admin");

		return "redirect:/clienteCrud";
	}

	/*
	 * @GetMapping("/entrar") public ModelAndView entrar() { ModelAndView
	 * modelAndView = new ModelAndView("/views/pages/entrar.html");
	 * modelAndView.addObject("currentPage", "/entrar");
	 * 
	 * return modelAndView; }
	 * 
	 * @GetMapping("/cadastrar") public ModelAndView cadastrar() { ModelAndView
	 * modelAndView = new ModelAndView("/views/pages/cadastrar.html");
	 * modelAndView.addObject("currentPage", "/cadastrar");
	 * 
	 * return modelAndView; }
	 */
}
