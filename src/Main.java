import java.util.Scanner;
import com.Reserva.Entity.Reserva;
import java.util.ArrayList;

public class Main {
    // Vetor (lista) para armazenar as reservas
    static ArrayList<Reserva> listaReservas = new ArrayList<>();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        int opcao = -1; // inicia com valor diferente de 0

        while (opcao != 0) { // repete até o usuário digitar 0
            System.out.println("\n**********************");
            System.out.println("Sistema de Reserva");
            System.out.println("**********************");
            System.out.println("1 - Nova Reserva");
            System.out.println("2 - Listar Reservas");
            System.out.println("3 - Buscar reserva por nome do hóspede");
            System.out.println("4 - Ordenar reservas por número de dias (decrescente)");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                case 1:
                    System.out.println("\n--- Nova Reserva ---");
                    sc.nextLine(); // limpa o buffer do scanner

                    System.out.print("Digite o nome do hóspede: ");
                    String nomeDoHospede = sc.nextLine();

                    System.out.print("Digite o tipo de quarto: ");
                    String tipoQuarto = sc.nextLine();

                    System.out.print("Digite o número de dias: ");
                    int numeroDias = sc.nextInt();

                    System.out.print("Digite o valor da diária: ");
                    double valorDiaria = sc.nextDouble();

                    Reserva novaReserva = new Reserva(nomeDoHospede, tipoQuarto, numeroDias, valorDiaria);
                    listaReservas.add(novaReserva);

                    System.out.println("✅ Reserva criada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Reservas ---");
                    if (listaReservas.isEmpty()) {
                        System.out.println("Nenhuma reserva cadastrada.");
                    } else {
                        for (Reserva r : listaReservas) {
                            System.out.println(r);
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n--- Buscar Reserva por Nome ---");
                    System.out.print("Digite o nome do hóspede: ");
                    String nomeBusca = sc.nextLine();

                    boolean encontrado = false;

                    for (Reserva r : listaReservas) {
                        if (r.getNomeDoHospede().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Reserva encontrada:");
                            System.out.println(r);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("❌ Nenhuma reserva encontrada para o hóspede \"" + nomeBusca + "\"");
                    }
                    break;
                default:
                    System.out.println("⚠️ Opção inválida, tente novamente.");
            }
        }

        sc.close();
    }
}
