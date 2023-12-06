package br.com.vivaviatravel_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.vivaviatravel_spring.model.Reserva;
import br.com.vivaviatravel_spring.repositories.ClienteRepository;
import br.com.vivaviatravel_spring.repositories.PassagemRepository;
import br.com.vivaviatravel_spring.repositories.ReservaRepository;

@Controller
@RequestMapping("/reservaCrud")
public class ReservaController {

	@Autowired
	private ReservaRepository reservaRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private PassagemRepository passagemRepository;

	@GetMapping
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("views/reservaCrud/index");
		modelAndView.addObject("Reservas", reservaRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/{id}")
	public ModelAndView detalhes(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("views/reservaCrud/detalhes");
		modelAndView.addObject("reserva", reservaRepository.getReferenceById(id));

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("views/reservaCrud/formulario");
		modelAndView.addObject("reserva", new Reserva());
		modelAndView.addObject("clientes", clienteRepository.findAll());
		modelAndView.addObject("passagens", passagemRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("views/reservaCrud/formulario");
		modelAndView.addObject("reserva", reservaRepository.getReferenceById(id));
		modelAndView.addObject("clientes", clienteRepository.findAll());
		modelAndView.addObject("passagens", passagemRepository.findAll());

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(Reserva reserva) {
		reservaRepository.save(reserva);

		return "redirect:/reservaCrud";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable Long id) {
		reservaRepository.deleteById(id);

		return "redirect:/reservaCrud";
	}
}
