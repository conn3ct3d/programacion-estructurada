import java.util.Scanner;
public class diaSemana {
    public static void main(String[] args) {
        int dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        dia = sc.nextInt();
        sc.close();
        String diaSemana;
        switch (dia){
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Dia invalido";
                break;
        }
        System.out.println(diaSemana);
    }
}