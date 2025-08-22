import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Escreva seu nome e sobrenome para gerar um email ufrn");
        String nomeUser;
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva aqui o seu primeiro nome: ");
        nomeUser = input.nextLine();
        System.out.print("Escreva aqui o seu segundo nome: ");
        nomeUser += input.nextLine();
        Generator emailUm = new Generator(nomeUser);
        emailUm.imprimirEmail();
    }
}
