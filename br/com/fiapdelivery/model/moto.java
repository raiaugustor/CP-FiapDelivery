package br.com.fiapdelivery.model;

public class moto extends Veiculo {
    private boolean bau;

    public moto(String placa, double capacidade, boolean bau) {
        super(placa, capacidade);
        this.setBau(bau);
    }
    public boolean getBau() {
        return this.bau;
    }

    private void setBau(boolean bau) {
        this.bau = bau;
    }
}
