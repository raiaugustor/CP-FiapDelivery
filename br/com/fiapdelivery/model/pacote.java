package br.com.fiapdelivery.model;

public class pacote {
    private String codigo;
    private double peso;
    private String status;

    public String getCodigo() {
        return this.codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double setPeso() {
        return this.peso;
    }

    private void getPeso(double peso) {
        this.peso = peso;
    }

    public String getStatus() {
        return this.status;
    }

    private void setStatus(String status) {
        this.status = status;
    }
}
