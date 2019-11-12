import java.text.DecimalFormat;
import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Ingrese opcion");
            System.out.println("Ingrese 1 para realizar calculo de Distribucion Binomial");
            System.out.println("Ingrese 2 para realizar calculo de Distribucion Poisson");
            System.out.println("Ingrese 3 para realizar calculo de Distribucion Hipergeométrica");
            opcion = input.nextInt();

            switch(opcion){
                case 1:

                    break;
                case 2:
                    calcularPoisson();
                    break;
                case 3: 
                    calcularHiperGeometrica();
                    break;
                default:
                    break;
            }

            System.out.println("Ingrese <1> si desea volver a ejercutar");
            System.out.println("Ingrese <0> si desea salir");
            opcion = input.nextInt();

        }while(opcion == 1);       
        //Agregar menu para elegir entre Binomial Poisson HiperGeometrica
        

    }

    public static void calcularHiperGeometrica(){
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

    private static void calcularPoisson(){
        Scanner input = new Scanner(System.in);
        System.print.out("Ingrese Lambda");
        double lambda = input.nextDouble();
        System.print.out("Ingrese K");
        int k = input.nextInt();

        System.out.println("El resulado es: "+poisson(k,lambda));

        input.close();
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