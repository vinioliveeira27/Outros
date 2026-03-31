package entities;

public class ExercicioPooEnt2 {
	// Calcule a distância entre dois pontos num espaço de 3 dimensões.

	public double x1, x2, y1, y2, z1, z2;

	public double calculo() {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
	}

}
