import java.util.Scanner;
public class numeroDias {
    public static void main(String[] args) {
        int mes;
        int numeroDias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el mes: ");
        mes = sc.nextInt();
        sc.close();
        switch (mes){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            numeroDias = 31;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            numeroDias = 30;
            break;
        case 2:
            numeroDias = 28;
            break;
        default:
            numeroDias = 0;
            break;

        }
        if (numeroDias == 0){
            System.out.println("Mes invalido");
        } else {
            System.out.println("El mes " + mes + " tiene " + numeroDias + " dias");
        }

    }
}
