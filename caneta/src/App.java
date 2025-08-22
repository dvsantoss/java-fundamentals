public class App {
    public static void main(String[] args) throws Exception {

        // Caneta canetaTadsUm = new Caneta("Bic", "Preta", 0.7f, 4);
        Caneta canetaTadsDois = new Caneta("Compactor", "azul", 0.7f, 10);
        // Caneta canetaTadsTres = new Caneta("Fabercastel", "Vermelha", 0.3f, 2);

        // metodos com caneta dois

        // canetaTadsDois.tamparCaneta();
        // canetaTadsDois.status();
        // canetaTadsDois.destamparCaneta();
        // canetaTadsDois.status();
        // canetaTadsDois.destamparCaneta();
        //canetaTadsDois.tamparCaneta();
        // canetaTadsDois.escrever();

        if (canetaTadsDois.isTampada()) {
            System.out.println("A caneta está tampada!");
        } else {
            System.out.println("A caneta está destampada!");
        }

    }
}
