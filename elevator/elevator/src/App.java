// Scanner para ler entrada do usuário
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner inicializa = new Scanner(System.in); // iniciando o scanner
        System.out.print("Digite a capacidade do elevador: ");
        int capacidade = inicializa.nextInt();
        System.out.print("Digite o total de andares do prédio: ");
        int totalAndares = inicializa.nextInt();
        // inicializa.close(); // fechando o scanner (sempre fechar após abrir)

        // novo elevador
        Elevator elevador1 = new Elevator(capacidade, totalAndares);

        // elevador1.inicializa(capacidade,totalAndares);

        Scanner resposta = new Scanner(System.in);
        int opcao = 0;

        // menu para escolher o método desejado
        do {
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Iniciar elevador");
            System.out.println("2. Entrar no elevador");
            System.out.println("3. Deslocar pessoas do elevador");
            System.out.println("4. Sair do elevador");
            System.out.println("5. Sair do programa");

            opcao = resposta.nextInt();

            switch (opcao) {
                case 1:
                    // System.out.println("Iniciando elevador...");
                    elevador1.inicializa(capacidade, totalAndares);
                    break;
                case 2:
                    System.out.println("Quantas pessoas entrarão no elevador?");
                    int pessoasEntrando = resposta.nextInt();
                    elevador1.entra(pessoasEntrando);
                    System.out.println("Pessoas no elevador: " + elevador1.pessoasPresentes());
                    break;
                case 3:
                    System.out.println("Para qual andar deseja deslocar?");
                    int andarDestino = resposta.nextInt();
                    elevador1.deslocar(andarDestino);
                    break;
                case 4:
                    System.out.println("Quantas pessoas sairão do elevador?");
                    int pessoasSaindo = resposta.nextInt();
                    elevador1.sai(pessoasSaindo);
                    System.out.println("Pessoas no elevador: " + elevador1.pessoasPresentes());
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        resposta.close();

    }
}
