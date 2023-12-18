package br.com.vivaviatravel_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		ModelAndView modelAndView = new ModelAndView("views/passagemCrud/formulario.html");
		modelAndView.addObject("passagem", passagemRepository.getReferenceById(id));
		modelAndView.addObject("classes", ClassesPassagemAerea.values());

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(Passagem passagem) {
		passagemRepository.save(passagem);

		return "redirect:/passagemCrud";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id, RedirectAttributes redirectAttributes) {
		Passagem passagem = passagemRepository.getReferenceById(id);

		if (passagem != null && !passagem.possuiReservas()) {
			passagemRepository.delete(passagem);
		} else { // Passagem possui reservas, add mensagem de erro 
			redirectAttributes.addFlashAttribute("error_message",
				"Não é possível excluir a passagem, pois ela possui reservas associadas.");
		}

		return "redirect:/passagemCrud";
	}

}
