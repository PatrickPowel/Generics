package br.rpires;

public class Chevrolet extends Carro {
    public Chevrolet(String modelo, int ano) {
        super(modelo, "Chevrolet", ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Chevrolet acelerando com estilo!");
    }
}
