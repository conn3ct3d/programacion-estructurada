import java.util.Scanner;
public class practica10 {
    public static void main(String[] args){
        int nAlumnos;
        double costo;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce numero de alumnos");
        nAlumnos = lector.nextInt();
        if (nAlumnos >= 100) {
            costo=nAlumnos*65;
        } 
        else if (nAlumnos >= 50 && nAlumnos <100) {
            costo=nAlumnos*80;
        }
        else {
            costo = 4000;
        }
        lector.close();
        System.out.println("El costo sera de " + costo);
    }
}
