import java.util.Scanner;
public class practica3 {

    public static void main(String[] args){
        double num1, num2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primero numero: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        num2 = scanner.nextDouble();
        resultado = num1*num2;
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}