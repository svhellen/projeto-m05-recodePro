package br.com.vivaviatravel_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.vivaviatravel_spring.enums.ClassesPassagemAerea;
import br.com.vivaviatravel_spring.model.Passagem;
import br.com.vivaviatravel_spring.repositories.PassagemRepository;

@Controller
@RequestMapping("/passagemCrud")
public class PassagemController {

	@Autowired
	private PassagemRepository passagemRepository;

	@GetMapping
	public ModelAndView passagem() {
		ModelAndView modelAndView = new ModelAndView("views/passagemCrud/index.html");
		modelAndView.addObject("Passagens", passagemRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/{id}")
	public ModelAndView passagemById(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("views/passagemCrud/index.html");
		modelAndView.addObject("passagem", passagemRepository.getReferenceById(id));

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("views/passagemCrud/formulario");
		modelAndView.addObject("passagem", new Passagem());
		modelAndView.addObject("classes", ClassesPassagemAerea.values());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("views/passagemCrud/editar.html");
		modelAndView.addObject("passagem", passagemRepository.getReferenceById(id));
		modelAndView.addObject("classes", ClassesPassagemAerea.values());

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(Passagem passagem) {
		passagemRepository.save(passagem);

		return "redirect:/passagemCrud";
	}

	@GetMapping({ "/excluir/{id}" })
	public String excluir(@PathVariable Long id) {
		passagemRepository.deleteById(id);

		return "redirect:/passagemCrud";
	}

}
