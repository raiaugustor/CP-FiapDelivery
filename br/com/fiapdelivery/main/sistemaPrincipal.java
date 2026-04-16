package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.moto;
import br.com.fiapdelivery.model.caminhao;

public class sistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- FIAPDELIVERY --- ");

        caminhao caminhao1 = new caminhao("ABC-1234", 500, "tem");
        moto moto1 = new moto("DEF-5678", 15, true);

        System.out.println("Veículo de entrega: Caminhão placa " + caminhao1.getPlaca() + "| e capacidade de " + caminhao1.getCapacidade() + "Kg");


    }
}
