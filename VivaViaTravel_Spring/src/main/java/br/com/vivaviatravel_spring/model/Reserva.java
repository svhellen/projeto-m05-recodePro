package br.com.vivaviatravel_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReserva;

	@ManyToOne(fetch = FetchType.LAZY) // cascade = CascadeType.ALL,
	@JoinColumn(name = "fk_passagem_id", nullable = false)
	private Passagem passagem;

	@ManyToOne(fetch = FetchType.LAZY) // cascade = CascadeType.ALL,
	@JoinColumn(name = "fk_cliente_id", nullable = false)
	private Cliente cliente;

	public Reserva() {
		super();
	}

	public Reserva(Long idReserva, Passagem passagem, Cliente cliente) {
		super();
		this.idReserva = idReserva;
		this.passagem = passagem;
		this.cliente = cliente;
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	public Passagem getPassagem() {
		return passagem;
	}

	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", passagem=" + passagem + ", cliente=" + cliente + "]";
	}

}
