package br.rpires;

public class Volkswagen extends Carro {
    public Volkswagen(String modelo, int ano) {
        super(modelo, "Volkswagen", ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Volkswagen acelerando com potência!");
    }
}
