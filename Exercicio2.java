/*1) 2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).*/

package tarefa8;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;

		for (int i=0; i<= 100; i++) {
			soma +=i;
			
			
			System.out.println("Somatoria:" +soma);
			
		}

		sc.close();

	}

}
