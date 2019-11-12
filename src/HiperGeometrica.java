import javax.swing.*;
import java.text.DecimalFormat;

public class HiperGeometrica {

    public static void calcular() {

        double numeroTotalDeLaPoblacion, numeroTotalDeExitosDeLaPoblacion;
        double numeroDeExitosDeLaMuestra, tamañoDeLaMuestra;
        String aux;

        aux = JOptionPane.showInputDialog("Ingrese el número total de la población: ");
        numeroTotalDeLaPoblacion = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Ingrese el número total de éxitos de la población: ");
        numeroTotalDeExitosDeLaPoblacion = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Ingrese el número de exitos de la muestra: ");
        numeroDeExitosDeLaMuestra = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog("Ingrese tamaño de la muestra: ");
        tamañoDeLaMuestra = Double.parseDouble(aux);

        DecimalFormat numberFormat = new DecimalFormat("0.00");
        double result1 = (((combinatorio(numeroTotalDeExitosDeLaPoblacion,numeroDeExitosDeLaMuestra))*combinatorio((numeroTotalDeLaPoblacion-numeroTotalDeExitosDeLaPoblacion),(tamañoDeLaMuestra-numeroDeExitosDeLaMuestra)))/combinatorio(numeroTotalDeLaPoblacion,tamañoDeLaMuestra));
        JOptionPane.showMessageDialog(null,"Resultado --> " + numberFormat.format(result1)+"\nEn Porcentaje --> "+ numberFormat.format(result1*100)+" %");
    }

    private static double factorial (double numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }

    private static double combinatorio (double a, double b){
        return (factorial(a) / ((factorial(b))*(factorial((a-b)))));
    }
}
