/**
 * Program ilustruje upotrebu System.out.println()
 * za ispis na standardni izlaz,
 * odredjivanje duzine niza (.length),
 * "sabiranje baba i zaba" (String-a i necega sto nije String). 
 * 
 * Naredba switch sluzi za visestruko grananje i ima istu sintaksu
 * kao i u C-u. 
 * Grananje se moze vrsiti na osnovu vrednosti
 * 	primitivnog tipa: byte, short, char, int, 
 * 	tipa enumeracije,
 * 	klase String, Byte, Short, Character, Integer
 */

/* Obicno pokretanje programa (bez argumenata komandne linije):
 * desni klik na Zdravo.java u Package Explorer-u
 * Run As --> Java Application
 * Trebalo bi da se u dnu prozora otvori konzola (Console)
 * Ukoliko se to ne desi, otvorite je rucno sa:
 * Window --> Show View --> Console
 */

/*
 * Pokretanje programa sa argumentima komandne linije:
 * Desni klik na Zdravo.java u Package Explorer-u
 * Run As --> Run Configurations 
 * preci u tab "(x)=Arguments" (desno od tab-a "Main")
 * i u polju "Program arguments:", razdvojene belinama 
 * (blanko, tabulator, novi red)
 * navesti argumente komandne linije
 * Apply, Run
 */

// klasa se nalazi u paketu Zdravo
package zdravo;

// public - klasa je dostupna i iz drugih paketa
public class Zdravo {

	// static - metod se moze izvrsavati nezavisno od postojanja objekata klase
	public static void main(String[] args) {
		// args je niz String-ova koji predstavlja argumente komandne linije
		
		/*
		 * System.out je objekat koji predstavlja standardni izlaz (ekran).
		 * Metod println() pozvan za ovaj objekat ispisuje
		 * svoj argument na standardni izlaz i prelazi u novi red.
		 */ 
		System.out.println("Zdravo sa 1. casa OOP-a.");
		
		// duzina niza odredjuje se pristupom polju length niza
		int brArg = args.length;
		
		// String-konstante (literali) navode se izmedju dvostrukih navodnika
		String padezArg=""; // "" je prazan string
		
		/*
		 * obicno je broj argumenata komandne linije relativno mali,
		 * ali padez reci "argument" cemo odrediti tako da bude ispravan 
		 * za proizvoljno mnogo njih
		 */
		switch(brArg%10){
		case 0:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			padezArg = "argumenata";
			break;
		case 1:
			if(brArg%100==11)
				padezArg = "argumenata"; // 11, 111, 211, ...
			else
				padezArg = "argumentom";  // 1, 21, 31, 41, ..., 91, 101, 121, ...
			break;
		case 2:
		case 3:
		case 4:
			int mod100 = brArg%100;
			if(mod100 == 12 || mod100 == 13 || mod100 == 14)
				padezArg = "argumenata";
			else
				padezArg = "argumenta";
			break;
		}
		
		/* 
		 * sabiranjem dva String-a vrsi se nadovezivanje drugog na prvi
		 * dok sabiranje String-a i necega sto nije String rezultuje String-om
		 */
		System.out.println("Program je pokrenut sa " + brArg + " " + padezArg + " komandne linije.");
	}
}
