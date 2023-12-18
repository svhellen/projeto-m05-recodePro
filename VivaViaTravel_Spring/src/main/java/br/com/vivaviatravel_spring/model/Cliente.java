package br.com.vivaviatravel_spring.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	// private String urlImgPerfil;
	private String nomeCliente;
	private String emailCliente;
	private String senhaCliente;
	private String telefoneCliente;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private List<Reserva> reservas;

	public Cliente() {

	}

	public Cliente(Long idCliente, String nomeCliente, String emailCliente, String senhaCliente, String telefoneCliente,
			List<Reserva> reservas) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
		this.telefoneCliente = telefoneCliente;
		this.reservas = reservas;
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

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public boolean possuiReservas() {
		return reservas != null && !reservas.isEmpty();
	}

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
