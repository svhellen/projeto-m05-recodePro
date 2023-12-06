package br.com.vivaviatravel_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nomeCliente;
	private String emailCliente;
	private String senhaCliente;
	private String telefoneCliente;

	/* private Reserva reserva; */

	/* LOMBOK SUBSTITUI GETTERS, SETTERS E CONTRUCTORS */

	public Cliente() {

	}

	public Cliente(String nomeCliente, String emailCliente, String senhaCliente, String telefoneCliente) {
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
		this.telefoneCliente = telefoneCliente;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	/*
	 * public Reserva getReserva() { return reserva; }
	 * 
	 * public void setReserva(Reserva reserva) { this.reserva = reserva; }
	 */

	public void status() { // System.out.println("Dados do cliente: ");
		System.out.println("Id: " + this.getIdCliente());
		System.out.println("Nome: " + this.getNomeCliente());
		System.out.println("Email: " + this.getEmailCliente());
		System.out.println("Senha: " + this.getSenhaCliente());
		System.out.println("Telefone: " + this.getTelefoneCliente());
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente
				+ ", senhaCliente=" + senhaCliente + ", telefoneCliente=" + telefoneCliente
				+ /* ", reserva=" + reserva + */"]";
	}

}
