import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        System.out.println("Ingrese opcion");
        //Agregar menu para elegir entre Binomial Poisson HiperGeometrica
        hiperGeometrica();

    }

    public static void hiperGeometrica(){
        Scanner s = new Scanner(System.in);
        int centinela;
        double numeroTotalDeLaPoblacion, numeroTotalDeExitosDeLaPoblacion;
        double numeroDeExitosDeLaMuestra, tamañoDeLaMuestra;

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Distribucion de probabilidad Hipergeométrica");
        System.out.println("--------------------------------------------------------------------");

        do{
            System.out.println("Ingrese el número total de la población: ");
            numeroTotalDeLaPoblacion = s.nextDouble();
            System.out.println("Ingrese el número total de éxitos de la población: ");
            numeroTotalDeExitosDeLaPoblacion = s.nextDouble();
            System.out.println("Ingrese el número de exitos de la muestra: ");
            numeroDeExitosDeLaMuestra = s.nextDouble();
            System.out.println("Ingrese tamaño de la muestra: ");
            tamañoDeLaMuestra = s.nextDouble();

            double result1 = (((combinatorio(numeroTotalDeExitosDeLaPoblacion,numeroDeExitosDeLaMuestra))*combinatorio((numeroTotalDeLaPoblacion-numeroTotalDeExitosDeLaPoblacion),(tamañoDeLaMuestra-numeroDeExitosDeLaMuestra)))/combinatorio(numeroTotalDeLaPoblacion,tamañoDeLaMuestra));
            System.out.println("Resultado --> " + result1);
            DecimalFormat numberFormat = new DecimalFormat("#.00");//para solo mostrar dos digitos despues de la coma
            System.out.println("En Porcentaje --> "+ numberFormat.format(result1*100)+" %");

            System.out.println("Si desea ingresar nuevos datos presione 1, para salir 0: ");
            centinela = s.nextInt();
        }while(centinela == 1);
        s.close();
    }


    private static double poisson(int k, double lambda) {
        return (Math.pow(lambda, k) * Math.pow(Math.E, -1 * lambda)) / factorial(k);
    }


    public static double factorial (double numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }

    public static double combinatorio (double a, double b){
        return (factorial(a) / ((factorial(b))*(factorial((a-b)))));
    }



}