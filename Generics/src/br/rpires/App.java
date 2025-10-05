package br.rpires;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Carro> listaDeCarros = new ArrayList<>();

        listaDeCarros.add(new Honda("Fit", 2020));
        listaDeCarros.add(new Volkswagen("Gol", 2018));
        listaDeCarros.add(new Chevrolet("Onix", 2021));
        listaDeCarros.add(new Civic(2023));

        for (Carro carro : listaDeCarros) {
            carro.exibirInfo();
            carro.acelerar();
            System.out.println("----------------------");
        }
    }
}
