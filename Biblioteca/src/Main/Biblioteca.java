package Main;

import java.util.ArrayList;

public class Biblioteca {

	// Attributes

	private ArrayList<Libro> libri = new ArrayList<>();

	// Metodo per aggiungere un libro -> controlla se il codice gia' esiste 
	protected void addLibro(Libro libro) {
		for (Libro libro2: libri) {
			if (libro2.getCodice() == libro.getCodice()) {
				System.out.println("❌ Codice gia esistente ❌");
				System.out.println("**************************");
				return;
			}
		}
		System.out.println("✅ Libro aggiunto! ✅");
		System.out.println("**********************");
		libri.add(libro);
	}

	// Metodo per stampare libri disponibili
	protected void stampaDisponibili() {
		if (libri.isEmpty()) {
			System.out.println("❌ Non ci sono libri, considera aggiungerne uno ❌");
			System.out.println("**************************************************");
			return;
		}
		
		for (Libro libro : libri) {
			if (libro.getDisponibilita()) {
				System.out.println(libro.getTitolo() + " - " + libro.getAutore() + " Disponibile (" + libro.getCodice() + ")");
			}
		}
	}

	// Metodo per stampare libri prestati
	protected void stampaPrestati() {
		if (libri.isEmpty()) {
			System.out.println("❌ Non ci sono libri, considera aggiungerne uno ❌");
			System.out.println("**************************************************");
			return;
		}
		
		for (Libro libro : libri) {
			if (!libro.getDisponibilita()) {
				System.out.println(libro.getTitolo() + " - " + libro.getAutore() + " Prestato");
			}
		}
	}

	// Metodo per stampare i libri
	protected void stampaLibri() {
		if (libri.isEmpty()) {
			System.out.println("❌ Non ci sono libri, considera aggiungerne uno ❌");
			System.out.println("**************************************************");
			return;
		}
		for (Libro libro : libri) {
			System.out.println(libro.getTitolo() + " - " + libro.getAutore() + " " + libro.getCodice());
		}
	}
	
	// Metodo per resituire un libro -> controlla se il codiceIdentificatore esiste e se e' una copia
	protected void restituireLibro(String codice) {
		for (Libro libro : libri) {
			if (libro.getCodice().equals(codice)) {
				if (!libro.getDisponibilita()) {
					libro.setDisponibilita(true);
					System.out.println("✅ Hai restituito il libro ✅");
					System.out.println("*****************************");
				} else {
					System.out.println("❌ Il libro e' una copia ❌");
					System.out.println("***************************");
				}
				return;
			}
		}
		System.out.println("❌ Libro non trovato ❌");
		System.out.println("***********************");
		
	}
	
	// Metodo per prestare un libro -> controlla se il codiceIdentificatore esiste e se e' disponibile
	protected void prestareLibro(String codice) {
		for (Libro libro : libri) {
			if (libro.getCodice().equals(codice)) {
				if (libro.getDisponibilita()) {
					System.out.println("✅ Hai preso un libro ✅");
					System.out.println("************************");
					libro.setDisponibilita(false);
				} else {
					System.out.println("❌ Libro gia' prestato ❌");
					System.out.println("************************");
				}
				return;
			}
		}
		System.out.println("❌ Libro non trovato ❌");
		System.out.println("***********************");
	}
	
	
}
