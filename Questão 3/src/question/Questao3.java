package question;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		float sal = input.nextFloat();
		float salfin =0;
		float porcen1 = (float) (20.0/100.0);
		float porcen2 = (float) (15.0/100.0);
		float porcen3 = (float) (10.0/100.0);
		float porcen4 = (float) (5.0/100.0);
		
		if (sal<=280) {
			salfin = (sal*porcen1);
		} else if (sal<=700) {
			salfin = (sal*porcen2);
		} else if (sal<=1500) {
			salfin = (sal*porcen3);
		} else {
			salfin = (sal*porcen4);
		}
		System.out.println("Your inicial salary was: "+sal);
		
		if (sal<=280) {
			System.out.println("Your salary was raised in 20%");
		} else if (sal<=700) {
			System.out.println("Your salary was raised in 15%");
		} else if (sal<=1500) {
			System.out.println("Your salary was raised in 10%");
		} else {
			System.out.println("Your salary was raised in 5%");
		}
		
		if (sal<=280) {
			System.out.printf("The raise in your salary was: %.2f", salfin );
		} else if (sal<=700) {
			System.out.printf("The raise in your salary was: %.2f", salfin);
		} else if (sal<=1500) {
			System.out.printf("The raise in your salary was: %.2f", salfin);
		} else {
			System.out.printf("The raise in your salary was: %.2f", salfin);
		}
		
		System.out.println("\nYour new salary is: "+ (salfin+sal));
		}
}