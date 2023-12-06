package br.com.vivaviatravel_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Passagem")
@Entity
public class Passagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPassagem;
	private String classePassagem;
	private String origemPassagem;
	private String destinoPassagem;
	private String dataPassagem;
	private Double precoPassagem;

	/* private Reserva reserva; */

	public Passagem() {

	}

	public Passagem(Long idPassagem, String classePassagem, String origemPassagem, String destinoPassagem,
			String dataPassagem, Double precoPassagem, Reserva reserva) {
		this.idPassagem = idPassagem;
		this.classePassagem = classePassagem;
		this.origemPassagem = origemPassagem;
		this.destinoPassagem = destinoPassagem;
		this.dataPassagem = dataPassagem;
		this.precoPassagem = precoPassagem;
		/* this.reserva = reserva; */
	}

	public Long getIdPassagem() {
		return idPassagem;
	}

	public void setIdPassagem(Long idPassagem) {
		this.idPassagem = idPassagem;
	}

	public String getClassePassagem() {
		return classePassagem;
	}

	public void setClassePassagem(String classePassagem) {
		this.classePassagem = classePassagem;
	}

	public String getOrigemPassagem() {
		return origemPassagem;
	}

	public void setOrigemPassagem(String origemPassagem) {
		this.origemPassagem = origemPassagem;
	}

	public String getDestinoPassagem() {
		return destinoPassagem;
	}

	public void setDestinoPassagem(String destinoPassagem) {
		this.destinoPassagem = destinoPassagem;
	}

	public String getDataPassagem() {
		return dataPassagem;
	}

	public void setDataPassagem(String dataPassagem) {
		this.dataPassagem = dataPassagem;
	}

	public Double getPrecoPassagem() {
		return precoPassagem;
	}

	public void setPrecoPassagem(Double precoPassagem) {
		this.precoPassagem = precoPassagem;
	}

	/*
	 * public Reserva getReserva() { return reserva; }
	 * 
	 * public void setReserva(Reserva reserva) { this.reserva = reserva; }
	 */

	public static void status(Passagem p) {
		System.out.println("|   Id: " + p.getIdPassagem() + " | Origem: " + p.getOrigemPassagem() + " | Destino: "
				+ p.getDestinoPassagem() + " | Classe: " + p.getClassePassagem() + " | Data: " + p.getDataPassagem()
				+ " | Preço: " + p.getPrecoPassagem() + "   |");
	}

	@Override
	public String toString() {
		return "Passagem [idPassagem=" + idPassagem + ", classePassagem=" + classePassagem + ", origemPassagem="
				+ origemPassagem + ", destinoPassagem=" + destinoPassagem + ", dataPassagem=" + dataPassagem
				+ ", precoPassagem=" + precoPassagem + /* ", reserva=" + reserva + */ "]";
	}

}
