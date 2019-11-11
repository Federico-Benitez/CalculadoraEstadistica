import java.util.Scanner;

public class Main{


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int centinela = 1;
        int numeroTotalDeLaPoblacion, numeroTotalDeExitosDeLaPoblacion;
        int numeroDeExitosDeLaMuestra, tamañoDeLaMuestra;

        int result1;

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Distribucion de probabilidad Hipergeométrica");
        System.out.println("--------------------------------------------------------------------");

        do{
            System.out.println("Ingrese el número total de la población: ");
            numeroTotalDeLaPoblacion = s.nextInt();
            System.out.println("Ingrese el número total de éxitos de la población: ");
            numeroTotalDeExitosDeLaPoblacion = s.nextInt();
            System.out.println("Ingrese el número de exitos de la muestra: ");
            numeroDeExitosDeLaMuestra = s.nextInt();
            System.out.println("Ingrese tamaño de la muestra: ");
            tamañoDeLaMuestra = s.nextInt();

            System.out.println(numeroTotalDeLaPoblacion + " " + numeroTotalDeExitosDeLaPoblacion + " " + numeroDeExitosDeLaMuestra + " " + tamañoDeLaMuestra);

            result1 = (((combinatorio(numeroTotalDeExitosDeLaPoblacion, numeroDeExitosDeLaMuestra))*(combinatorio((numeroTotalDeLaPoblacion-numeroTotalDeExitosDeLaPoblacion), (tamañoDeLaMuestra-numeroDeExitosDeLaMuestra)))) / (combinatorio(numeroTotalDeLaPoblacion, tamañoDeLaMuestra)));

            System.out.println("Resultado --> " + result1);


            System.out.println("Si desea ingresar nuevos datos presione 1, para salir 0: ");
            centinela = s.nextInt();

        }while(centinela == 1);
    }


    private static double poisson(int k, double lambda) {
        return (Math.pow(lambda, k) * Math.pow(Math.E, -1 * lambda)) / factorial(k);
    }


    static int factorial (int numero) {
        int result;

        if (numero==0)
            return 1;
        else
            result = (numero * factorial(numero-1));
        return result;
    }

    static int combinatorio (int a, int b){

        int result;

        result = (factorial(a) / ((factorial(b))*(factorial((a-b)))));

        return result;

    }



}
