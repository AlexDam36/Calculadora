package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static double sumar(double unNumero, double otroNumero){
        return unNumero + otroNumero;
    }

    public static double restar(double unNumero, double otroNumero){
        return unNumero - otroNumero;
    }

    public static double multiplicar(double unNumero, double otroNumero){
        return unNumero * otroNumero;
    }

    public static double dividir(double unNumero, double otroNumero){
        if (otroNumero == 0){
            System.out.println("No se puede dividir entre 0");
            return Double.NaN; // retorna NaN (Not a Number) para indicar que la operación no es válida
        }
        else {
            return unNumero / otroNumero;
        }
    }

    public static void main(String[] args) {

        Calculadora miCalculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número con el que desea operar: ");
        double unNumero = scanner.nextDouble();
        System.out.println("Ingrese el siguiente número con el que desea operar: ");
        double otroNumero = scanner.nextDouble();
        double resultadoSuma = miCalculadora.sumar(unNumero, otroNumero);
        double resultadoResta = miCalculadora.restar(unNumero, otroNumero);
        double resultadoMultiplicacion = miCalculadora.multiplicar(unNumero, otroNumero);
        double resultadoDivision = miCalculadora.dividir(unNumero, otroNumero);
        System.out.println("Ingrese [1] para Sumar, [2] para restar, [3] para multiplicar, [4] para dividir.");
        int cuenta = scanner.nextInt();
        if (cuenta == 1){
            System.out.println("El resultado de la suma de los números ingresados es de: "+resultadoSuma);
        }
        else if (cuenta == 2){
            System.out.println("El resultado de la resta de los números ingresados es de: "+resultadoResta);
        }
        else if (cuenta == 3){
            System.out.println("El resultado de la multiplicación de los números ingresados es de: "+resultadoMultiplicacion);
        }
        else if (cuenta == 4){
            System.out.println("El resultado de la división de los números ingresados es de: "+resultadoDivision);
        }
        else {
            System.out.println("La opción ingresada no es válida.");
        }
    }
}
    

