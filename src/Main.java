import java.util.Scanner;
import com.Reserva.Entity.Reserva;

public class Main {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        System.out.println("**********************");
        System.out.println("Sistema de Reserva");
        System.out.println("**********************");
        System.out.println("1 - Nova Reserva");
        System.out.println("2 - Listar Reservas");
        System.out.println("3 - Buscar reserva por nome do hóspede");
        System.out.println("4 - Ordenar reservas por número de dias (decrescente)");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                System.out.println("Saindo...");
                break;
            case 1:
                System.out.println("Criando...");
                System.out.println("Digite o nome do hospede: ");
                String nomeDoHospede = sc.next();
                System.out.println("Digite o tipo de quarto do hospede: ");
                String tipoQuarto = sc.next();
                System.out.println("Digite o numero de dias do hospede: ");
                int numeroDias = sc.nextInt();
                System.out.println("Digite o valor diaria do hospede: ");
                double valorDiaria = sc.nextDouble();

                Reserva novaReserva = new Reserva(nomeDoHospede, tipoQuarto, numeroDias, valorDiaria);

                System.out.println(novaReserva);
                break;


        }
    }
}