package br.com.fiapdelivery.model;

public class caminhao extends Veiculo {
    private String eixos;

    public caminhao(String placa, double capacidade, String eixos) {
        super(placa, capacidade);
        this.setEixos(eixos);
    }

    public String getEixos() {
        return this.eixos;
    }

    private void setEixos(String eixos) {
        this.eixos = eixos;
    }

}
