// classe e atributos (privado para o encapsulamento)

import java.util.Scanner;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    // construtor (publico para conseguir usar na classe principal)
    public Caneta(String modelo, String cor, float ponta, int carga) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Cor = " + this.cor);
        System.out.println("Ponta = " + this.ponta);
        System.out.println("Carga = " + this.carga);
        System.out.println("Tampada = " + this.tampada);
    }

    public void tamparCaneta() {
        if (this.tampada) {
            System.out.println("Caneta já está tampada");
        } else {
            this.tampada = true;
            System.out.println("Caneta tampada!");
        }
    }

    public void escrever() {
        Scanner c = new Scanner(System.in);
        System.out.print("Escreva o que quiser: ");
        String escrita = c.nextLine();
        System.out.print("Resultado: " + escrita);
    }

    public void destamparCaneta() {
        if (this.tampada) {
            System.out.println("Caneta destampada");
            this.tampada = false;
        } else {
            System.out.println("Caneta já está destampada!");
        }
    }

    public boolean isTampada() {
        if (this.tampada) {
            return this.tampada;
        } else {
            return false;
        }
    }
}
