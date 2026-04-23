package br.com.fiapdelivery.model;

public class Veiculo{
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade){
        this.setPlaca(placa);
        this.setCapacidade(capacidade);
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        if (placa != null && placa.length() == 7) {
            this.placa = placa; // Agora sim! 'this.placa' é o atributo da classe.
        } else {
            System.out.println("ERRO: Placa inválida!");
            this.placa = "ERRO-00";
        }
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    private void setCapacidade( double capacidade) {
        this.capacidade = capacidade;
    }

}