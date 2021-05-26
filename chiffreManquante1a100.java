package ChiffreManquante;
/*	F4R3S5 S4D3K
	11 Mai
	Chiffre manquante array */

import java.util.Scanner;

public class chiffreManquante1a100 {
	public static void main(String[]args) {
		
		//variables
		int chiffreManquant = 0;
		int somme = 0;
		int sommeTRUE = 5050;

		//array de 100
		int[]chiffres = new int [100];
		
		//scanner pour inserer les valeurs (en for loop)
		Scanner xray = new Scanner(System.in);
		for(int i=0;i<chiffres.length;i++) {
			System.out.print("Nombre " + (i+1) + " : ");
			chiffres[i]=xray.nextInt();
			}
		
		//Calcule la somme avec les variables presents
		for(int i=0;i<chiffres.length;i++) {
			somme = chiffres[i] + somme;
			}
		//Comparer la somme de l'array avec la somme attendue (vrai somme - somme avec chiffre manquant)
		for(int i=0;i<chiffres.length;i++) {
			chiffreManquant = sommeTRUE - somme;
			}
		//3) Imprimer le chiffre manquant dans la console
		System.out.println("\nLe chiffre manquant est: " +chiffreManquant);
	}
}
