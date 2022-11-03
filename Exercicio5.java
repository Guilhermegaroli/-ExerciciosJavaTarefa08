/*5) Apresentar os resultados das potências de 3, variando do expoente 0 até o 
 * expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e 
 * elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado o 
 * operador de exponenciação do portuguol (^).*/

package tarefa8;

public class Exercicio5 {

	public static void main(String[] args) {

		String total = "";
		int i;

		int numero = 3;

		for (i = 1; i <= 15; i++) {
			if (i == 1) {
				total += "3 elevado a " + i + " é " + numero + "\n";
				i++;
			}
			numero *= 3;
			total += "3 elevado a " + i + " é " + numero + "\n";
		}
		System.out.println(total);

	}

}
