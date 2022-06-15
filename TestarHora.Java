import java.util.Scanner;

public class TestarHora{
    public static void main(String[] args) {
        
        try {

            Scanner scanner = new Scanner(System.in);

            int hora, segundos, minutos;

            System.out.print("------ HORARIO ----\n");

            System.out.print("Digite um valor para hora: ");
            hora = scanner.nextInt();

            System.out.print("Digite um valor para minutos: ");
            minutos = scanner.nextInt();

            System.out.print("Digite um valor para  segundos: ");
            segundos = scanner.nextInt();

            Hora ClasseHora = new Hora(hora, minutos, segundos);

            ClasseHora.ValidarHorario(hora, minutos, segundos);

            System.out.print("HORARIO: " + ClasseHora.getHoraCompleta());
            System.out.print("\nHORARIO: " + ClasseHora.getHoraCompleta(true));

        } catch (Exception e) {
            System.out.print("Erro inesperado!");
        }

    }
}