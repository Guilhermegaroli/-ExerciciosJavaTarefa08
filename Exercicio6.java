/*6) Elaborar um programa que apresente como resultado o valor de uma potência de uma base
 * qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base 
 * e E o valor do expoente. Observe que neste exercício não pode ser utilizado o 
 * operador de exponenciação do portuguol (^).*/

package tarefa8;

public class Exercicio6 {

	public static void main(String[] args) {

		int numero = 3;
		int expoente = 2;
		int resultado = calculatePower(numero, expoente);
		System.out.println(numero + "^" + expoente + "=" + resultado);
	}

	static int calculatePower(int num, int power) {
		int resposta = 1;
		int expoente = 0;
		int numero = 0;
		if (numero > 0 && expoente == 0) {
			return resposta;
		} else if (num == 0 && power >= 1) {
			return 0;
		} else {
			for (int i = 1; i <= power; i++) {
				resposta = resposta * num;
			}
			return resposta;

		}
	}

}