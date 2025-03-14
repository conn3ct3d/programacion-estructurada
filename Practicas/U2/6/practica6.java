import java.util.Scanner;
public class practica6{
    public static void main (String[] args){
        double velKmh, velMs;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la velocidad en Kilometros por Hora: ");
        velKmh = lector.nextDouble();
        velMs = (velKmh*1000)/3600;
        String resultado = String.format("%.2f", velMs);
        System.err.println("La velocidad en metros por segundo es: " + resultado + "m/s");
        lector.close();
    }
}