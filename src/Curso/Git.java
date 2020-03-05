package Curso;

import java.util.Scanner;

public class Git {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int numero;
		 System.out.println("Informe um número: ");
		 numero = sc.nextInt();
		 
		 if(numero % 2 == 0) {
			 System.out.println("O numero é par : "+numero);
		 }else {
			 System.out.println("O numero é impar : "+numero);
			 
		 }
		
		
		sc.close();
	}

}
