/*1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.*/

package tarefa8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número :");

		int numero = sc.nextInt();
		int contadora = 1;
		
		while (contadora <= 10) {
			System.out.println(numero+" x "+contadora+" = "+numero*contadora);
			contadora++;
sc.close();
			
	}

	}
}
