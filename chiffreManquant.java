package ChiffreManquante;
/*	F4R3S5 S4D3K
	11 Mai
	Chiffre manquante array */

import java.util.Scanner;

public class chiffreManquant {
	public static void main(String[]args) {
		
		//variables
		int chiffreManquant = 0;
		int somme = 0;
		int sommeTRUE = 55;
	
		//array de 10
		int[]chiffres = new int [10];
		
		//scanner pour inserer les valeurs (en for loop)
		Scanner input = new Scanner(System.in);
		for(int i=0;i<chiffres.length;i++) {
			System.out.print("Nombre " + (i+1) + " : ");
			chiffres[i]=input.nextInt();
			}
		
		//Calcule la somme avec les variables presents
		for(int i=0;i<chiffres.length;i++) {
			somme = chiffres[i] + somme;
			}
		
		//Compare la somme de l'array avec la somme attendue (vrai somme - somme avec chiffre manquant)
		for(int i=0;i<chiffres.length;i++) {
			chiffreManquant = sommeTRUE - somme;
			}
		
		//Imprime le chiffre manquant dans la console
		System.out.println("\nLe chiffre manquant est: " +chiffreManquant);
	}
}
