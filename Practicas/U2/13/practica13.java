import java.util.Scanner;
public class practica13 {
    public static void main (String[] args){
        double numero = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = lector.nextDouble();
        lector.close();
        if (numero > 0){
            System.out.println("El número es positivo");
        } else if (numero < 0){
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
