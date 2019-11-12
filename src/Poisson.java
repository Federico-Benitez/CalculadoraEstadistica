import javax.swing.*;
import java.text.DecimalFormat;

public class Poisson {

    public static void calcular() {

        int k;
        double lambda;
        String aux;

        aux = JOptionPane.showInputDialog("Ingrese el valor de 'lambda':");
        lambda = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Ingrese el valor de 'k':");
        k = Integer.parseInt(aux);

        double result = poisson(k,lambda);
        DecimalFormat format = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null,"El resultado es: "+format.format(result));

    }

    private static double poisson(int k, double lambda) {
        return (Math.pow(lambda, k) * Math.pow(Math.E, -1 * lambda)) / factorial(k);
    }

    private static double factorial(double numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }
}
