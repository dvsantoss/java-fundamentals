// Atributos (Privado para o encapsulamento)
public class Elevator {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    // Construtor (Usado para criar e incializar objetos de uma classe)
    public Elevator(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // térreo = 0
        this.pessoasPresentes = 0; // começa vazio
    }

    // Métodos (Público para acesso externo)
    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        System.out.println("Iniciando.. Total de andares: " + totalAndares + " Capacidade: " + capacidade);
    }

    public void entra(int pessoasPresentes) {
        if (this.pessoasPresentes + pessoasPresentes <= this.capacidade) {
            this.pessoasPresentes += pessoasPresentes;
        } else {
            System.out.println("Capacidade excedida! Não é possível entrar.");
        }
    }

    public void sai(int pessoasPresentes) {
        if (this.pessoasPresentes - pessoasPresentes >= 0) {
            this.pessoasPresentes -= pessoasPresentes;
        } else {
            System.out.println("Não há pessoas suficientes para sair.");
        }
    }

    public int pessoasPresentes() {
        return this.pessoasPresentes;
    }

    public String elevatorStatus() {
        return "Pessoas presentes: " + this.pessoasPresentes + ", Andar atual: " + this.andarAtual + ", Capacidade: "
                + this.capacidade;
    }

    public int deslocar(int destino) {
        if (destino < 0 || destino >= totalAndares) { // exceção
            System.out.println("Andar inválido! Deve ser entre 0 e " + (totalAndares - 1));
            return this.andarAtual;
        } else {
            if (destino < this.andarAtual) { //descendo
                System.out.println("Descendo para o andar " + destino);
                try {
                    for (int i = this.andarAtual; i >= destino; i--) {
                        System.out.println("Descendo... Andar " + i);
                        Thread.sleep(1000); // pausa por 1 segundo (1000 ms)
                    }
                } catch (InterruptedException e) {
                    System.out.println("Erro ao esperar: " + e.getMessage());
                }
            } else if (destino > this.andarAtual) { //subindo
                System.out.println("Subindo para o andar " + destino);
                try {
                    for (int i = this.andarAtual + 1; i <= destino; i++) {
                        System.out.println("Subindo... Andar " + i);
                        Thread.sleep(1000); // pausa por 1 segundo (1000 ms)
                    }
                } catch (InterruptedException e) {
                    System.out.println("Erro ao esperar: " + e.getMessage());
                }
            } else {
                System.out.println("Já está no andar " + destino);
            }
            this.andarAtual = destino;
            return this.andarAtual;
        }
    }
}