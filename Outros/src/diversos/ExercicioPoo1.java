package diversos;

import java.util.Scanner;
import entities.ExercicioPooEnt1;

public class ExercicioPoo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Determine as raízes de uma equação de 2º grau: ax2 + bx + c = 0 (recordar que
		 * o discriminante Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculdadora de Bhaskara");
		ExercicioPooEnt1 eq = new ExercicioPooEnt1();

		System.out.println("Digite o valor de A: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Burro! Digite um N Ú M E R O ! ! !:");
			sc.next(); // descarta o valor errado
		}

		eq.a = sc.nextDouble();

		System.out.println("Digite o valor de B: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Burro! Digite um N Ú M E R O ! ! !:");
			sc.next(); // descarta o valor errado
		}
		eq.b = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		while (!sc.hasNextDouble()) {
			System.out.println("Burro! Digite um N Ú M E R O ! ! !:");
			sc.next(); // descarta o valor errado
		}
		eq.c = sc.nextDouble();

		if (eq.delta() < 0) {
			System.out.println("Não existem raízes reais");
		} else {
			System.out.printf("Valor da 1ª raiz: %.3f%n", eq.r1());
			System.out.printf("Valor da 2ª raiz: %.3f%n", eq.r2());
		}
		sc.close();
	}

}
