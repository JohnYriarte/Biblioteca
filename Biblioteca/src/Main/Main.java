package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// Metodo per creare un oggetto Libro
	public static Libro creazioneLibro(Scanner scanner) {
		System.out.println("Inserire titolo");
		String titolo = scanner.nextLine();
		System.out.println("Inserire autore");
		String autore = scanner.nextLine();
		System.out.println("Inserire Categoria");
		String categoria = scanner.nextLine();
		System.out.println("Inserire Codice");
		String codice = scanner.nextLine().toUpperCase();
		return new Libro (titolo, autore, categoria, codice, true);
	}
	
	// Metodo per stampare il Menu
	public static void stampaMenu() {
		System.out.println("1) Aggiungere un libro");
		System.out.println("2) Prestare un libro");
		System.out.println("3) Restituire un libro");
		System.out.println("4) Visualizzare libri");
		System.out.println("5) Visualizzare libri disponibili");
		System.out.println("6) Visualizzare libri prestati");
		System.out.println("9) Uscire");
	}
	
	public static void main(String[] args) {
		//Variables
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		int scelta = -1;
		int codiceIdentificatore;
		
		
		// LOOP MENU
		while (true) {
			
			// Exit MENU
			if (scelta == 9) {
				System.out.println("Arrivederci");
				break;
			}
			/*
			Aggiungere un libro.
			Prestare un libro.
			Restituire un libro.
			Visualizzare l'elenco dei libri (disponibili e prestati).
			*/
			stampaMenu();
			try {
				scelta = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Inserire solo numeri! ");
				scelta = -1;
			}
			scanner.nextLine();
			switch (scelta) {
			case 1: 
				//Aggiungere
				Libro libro = creazioneLibro(scanner);
				biblioteca.addLibro(libro);
				break;
			case 2:
				//Prestare
				biblioteca.stampaDisponibili();
				System.out.println("Quale libro vuoi prestare? ");
				biblioteca.prestareLibro(scanner.nextLine().toUpperCase());
				break;
			case 3:
				//Resitituire
				System.out.println("Quale libro vuoi restituire? ");
				biblioteca.restituireLibro(scanner.nextLine().toUpperCase());
				break;
			case 4:
				//Stampare libri
				biblioteca.stampaLibri();
				break;
			case 5:
				//Stampare disponibili
				biblioteca.stampaDisponibili();
				break;
			case 6:
				//Stampare prestati
				biblioteca.stampaPrestati();
				break;
			}
			
		}
		scanner.close();
	}

}
