import java.util.Scanner;

public class practica11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double c;

        System.out.println("Ingrese la calificación: ");
        c = lector.nextDouble();

        if (c < 0 || c > 100) {
            System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
        } else if (c < 70) {
            System.out.println("Insuficiente");
        } else if (c < 80) { 
            System.out.println("Suficiente");
        } else if (c < 90) { 
            System.out.println("Bien");
        } else {
            System.out.println("Notable");
        }

        lector.close();
    }
}
