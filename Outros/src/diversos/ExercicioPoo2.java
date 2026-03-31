package diversos;

import java.util.Scanner;

import entities.ExercicioPooEnt2;

public class ExercicioPoo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Calcule a distância entre dois pontos num espaço de 3 dimensões. */

		Scanner sc = new Scanner(System.in);
		ExercicioPooEnt2 eq = new ExercicioPooEnt2();

		System.out.println("Calculadora de dois pontos em um plano tridimensional");
		System.out.println("Digite a unidade de medida: ");
		System.out.println("MM,CM,DM,M,DAM,HM,KM");
		String unidade = sc.next();
		if (!unidade.equalsIgnoreCase("milímetros") && !unidade.equalsIgnoreCase("centímetros")
				&& !unidade.equalsIgnoreCase("decímetros") && !unidade.equalsIgnoreCase("metros")
				&& !unidade.equalsIgnoreCase("decâmetros") && !unidade.equalsIgnoreCase("hectometros")
				&& !unidade.equalsIgnoreCase("quilometros")) {
			System.out.println("Unidade inválida.");
		}
		System.out.println("Digite o valor do Eixo X do ponto A: ");
		eq.x1 = sc.nextDouble();
		System.out.println("Digite o valor do Eixo Y do ponto A: ");
		eq.y1 = sc.nextDouble();
		System.out.println("Digite o valor do Eixo Z do ponto A: ");
		eq.z1 = sc.nextDouble();
		System.out.println("Digite o valor do Eixo X do ponto B: ");
		eq.x2 = sc.nextDouble();
		System.out.println("Digite o valor do Eixo Y do ponto B: ");
		eq.y2 = sc.nextDouble();
		System.out.println("Digite o valor do Eixo Z do ponto B: ");
		eq.z2 = sc.nextDouble();

		System.out.printf("%.3f %s", eq.calculo(), unidade);
		sc.close();
	}

}
