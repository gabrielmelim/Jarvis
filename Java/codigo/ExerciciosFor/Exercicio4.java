import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para ver sua tabuada:");
		int numero = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		scanner.close();
	}
}