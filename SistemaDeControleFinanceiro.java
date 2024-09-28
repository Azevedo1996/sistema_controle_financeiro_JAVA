import java.util.Scanner;

public class SistemaDeControleFinanceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FundoComunitario fundo = new FundoComunitario();

        int opcao;
        do {
            System.out.println("\n--- Sistema de Controle Financeiro do Residencial Donana ---");
            System.out.println("1. Registrar entrada de dinheiro");
            System.out.println("2. Registrar saída de dinheiro");
            System.out.println("3. Exibir saldo atual");
            System.out.println("4. Exibir histórico de transações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da entrada: ");
                    scanner.nextLine();  // Consumir nova linha
                    String descricaoEntrada = scanner.nextLine();
                    System.out.print("Valor da entrada: ");
                    double valorEntrada = scanner.nextDouble();
                    fundo.registrarTransacao(new Transacao(descricaoEntrada, valorEntrada, TipoTransacao.ENTRADA));
                    break;

                case 2:
                    System.out.print("Descrição da saída: ");
                    scanner.nextLine();  // Consumir nova linha
                    String descricaoSaida = scanner.nextLine();
                    System.out.print("Valor da saída: ");
                    double valorSaida = scanner.nextDouble();
                    fundo.registrarTransacao(new Transacao(descricaoSaida, valorSaida, TipoTransacao.SAIDA));
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + fundo.getSaldo());
                    break;

                case 4:
                    fundo.exibirTransacoes();
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
