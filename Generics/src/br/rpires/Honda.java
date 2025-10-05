package br.rpires;

public class Honda extends Carro {
    public Honda(String modelo, int ano) {
        super(modelo, "Honda", ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Honda acelerando suavemente!");
    }
}