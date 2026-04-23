package br.com.fiapdelivery.model;

public class Veiculo{
    private String placa;
    private double capacidade;

    public veiculo(String placa, double capacidade) {
        this.setPlaca(placa);

        public String getPlaca() {
            return this.Placa;
        }
    }

    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    private void setCapacidade( double capacidade) {
        this.capacidade = capacidade;
    }
}