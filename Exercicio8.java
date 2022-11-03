/*8) Elaborar um programa que apresente os valores de conversão de graus Celsius em 
 * Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e 
 * finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas 
 * temperaturas. A fórmula de conversão é F = (9*C +160) /5, sendo F a temperatura em 
 * Fahrenheit e C a temperatura em Celsius.*/

package tarefa8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Graus Celsius");
		float graus = sc.nextFloat();
		for (float contador = (9 * graus + 160) / 5; contador <= 100; contador += 10) {
			System.out.println(" A temperatura em Graus Fahrenheit é " + contador);

		}
		sc.close();
	}

}
