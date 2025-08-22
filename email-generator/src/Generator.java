public class Generator {
    private String nome;

    public Generator(String nome) {
        this.nome = nome;
    }

    public void imprimirEmail() {
        System.out.println(nome.toLowerCase().trim() + "@ufrn.edu.br");
    }

}
