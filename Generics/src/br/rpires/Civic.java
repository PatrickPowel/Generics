package br.rpires;

public class Civic extends Honda {
    public Civic(int ano) {
        super("Civic", ano);
    }

    @Override
    public void acelerar() {
        System.out.println("Civic acelerando rápido e silencioso!");
    }
}