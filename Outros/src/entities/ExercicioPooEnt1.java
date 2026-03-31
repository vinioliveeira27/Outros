package entities;

public class ExercicioPooEnt1 {
	// bhaskara Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).

	public double a, b, c;

	public double delta() {
		return (b * b) - 4 * a * c;
	}

	public double r1() {
		return (-b + Math.sqrt(delta())) / (2 * a);
	}

	public double r2() {
		return (-b - Math.sqrt(delta())) / (2 * a);
	}
}

