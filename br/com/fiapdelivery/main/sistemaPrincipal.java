package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.*;

public class sistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("--- FIAPDELIVERY --- ");

        Caminhao caminhao1 = new Caminhao("ABC1234", 1500,3);
        Moto moto1 = new Moto("DEF5678", 15, true);
        Moto moto2 = new Moto("GHI676", 5, false);


        Pacote meuPacote = new Pacote("BR2314", 2.5, "Pendente");

        Rota entregaExpressa = new Rota("Mooca - SP", 3,moto1, meuPacote);

        System.out.println("Dados dos veículos em circulação: ");
        System.out.println("Caminhão - Placa: " + caminhao1.getPlaca() + "; Capacidade(em Kg): " + caminhao1.getCapacidade() + "; Possui: " + caminhao1.getEixos() + "eixos.") ;
        System.out.println("Moto 1 - Placa: " + moto1.getPlaca() + "; Capacidade(em Kg): " + moto1.getCapacidade()) ;
        System.out.println("Moto 2 - Placa: " + moto2.getPlaca() + "; Capacidade(em Kg): " + moto2.getCapacidade()) ;
        System.out.println("oi");

        entregaExpressa.vai();

    }
}
