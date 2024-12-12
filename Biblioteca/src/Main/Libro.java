package Main;

public class Libro {
	
	// Attributes
	private String titolo;
	private String autore;
	private String categoria;
	private String codice;
	private boolean disponibilita;
	
	// Constructors
	Libro (String titolo, String autore, String categoria, String codice, boolean disponibilita) {
		this.titolo = titolo;
		this.autore = autore;
		this.categoria = categoria;
		this.codice = codice;
		this.disponibilita = disponibilita;
	}

	// Methods
	
	
	
	// getters and setters
	public String getTitolo() {
		return titolo;
	}

	public String getAutore() {
		return autore;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getCodice() {
		return codice;
	}

	public boolean getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(boolean disponibilita) {
		this.disponibilita = disponibilita;
	}
	
}
