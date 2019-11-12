import javax.swing.*;
import java.text.DecimalFormat;

public class Binomial {

	public static void calcular() {
		DecimalFormat format = new DecimalFormat("#.##");
		String aux;
		JOptionPane.showMessageDialog(null,"Ingrese los datos a continuacion..");
		aux = JOptionPane.showInputDialog("Valor de 'n' o numero de experimentos:");
		int n = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog("Valor de la probabilidad: ");
		double prob = Double.parseDouble(aux);
		aux = JOptionPane.showInputDialog("Valor de 'r' o valor deseado de 'X':");
		int r = Integer.parseInt(aux);

		double result = calcularProbabilidad(n,prob,r);

		JOptionPane.showMessageDialog(null,"Probabilidad de 'r': "+format.format(result)+" o "+format.format(result * 100)+"%.");
	}

	
	private static double calcularProbabilidad (int experimentos, double probExito, int r) {
		
		double probFracaso = 1 - probExito;
		
		double probabilidadFinal = combinatorio(experimentos, r) * Math.pow(probExito, r) * Math.pow(probFracaso, (experimentos - r));
		
		return probabilidadFinal;
	}

	private static int combinatorio (int n, int r) {
		
		int comb = factorial(n) / (factorial(r) * factorial(n - r));
		
		return comb;
	}
	
	private static int factorial (int n) {

		if (n == 0) return 1;

		int fact = n;
		
		for(int i = n-1; i>=1; i--) {
			fact *= i;
		}
		
		return fact;
	}
}
