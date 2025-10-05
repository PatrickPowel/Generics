package br.rpires;

public abstract class Carro {
    private String modelo;
    private String marca;
    private int ano;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public abstract void acelerar();

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + " | Marca: " + marca + " | Ano: " + ano);
    }
}
