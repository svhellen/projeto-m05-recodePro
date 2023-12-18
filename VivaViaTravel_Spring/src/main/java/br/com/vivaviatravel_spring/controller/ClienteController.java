package br.com.vivaviatravel_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.vivaviatravel_spring.model.Cliente;
import br.com.vivaviatravel_spring.repositories.ClienteRepository;
import br.com.vivaviatravel_spring.repositories.ReservaRepository;

@Controller
@RequestMapping("/clienteCrud")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ReservaRepository reservaRepository;

	@GetMapping
	public ModelAndView cliente() {
		ModelAndView modelAndView = new ModelAndView("views/clienteCrud/index");
		modelAndView.addObject("Clientes", clienteRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/{id}")
	public ModelAndView clienteById(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("views/clienteCrud/detalhes");
		modelAndView.addObject("cliente", clienteRepository.getReferenceById(id));
		modelAndView.addObject("reservas", reservaRepository.findAll());

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("views/clienteCrud/formulario");
		modelAndView.addObject("cliente", new Cliente());

		return modelAndView;
	}

	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("views/clienteCrud/formulario");
		modelAndView.addObject("cliente", clienteRepository.getReferenceById(id));

		return modelAndView;
	}

	@PostMapping({ "/cadastrar", "/editar/{id}" })
	public String salvar(Cliente cliente) {
		clienteRepository.save(cliente);

		return "redirect:/clienteCrud";
	}

	
	  @GetMapping("/excluir/{id}") public String excluir(@PathVariable Long id) {
	  clienteRepository.deleteById(id);
	  
	  return "redirect:/clienteCrud"; }
	 
}
