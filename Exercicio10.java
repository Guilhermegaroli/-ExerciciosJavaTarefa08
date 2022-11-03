/*10) Elaborar um programa que apresente os resultados da soma e da média aritmética 
 * dos valores pares situados na faixa numérica de 50 a 70.*/

package tarefa8;

public class Exercicio10 {

	public static void main(String[] args) {
		double soma = 0;
		for (double i = 50; i <= 70; i += 2) {
			soma += i;

		}
		System.out.println("A soma dos valores é : " + soma);
		double media = soma / 10;
		System.out.println("A média dos valores é : " + media);
	}

}
