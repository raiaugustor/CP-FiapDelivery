package br.com.fiapdelivery.model;

public class Rota {

    private String destino;
    private int tempo;
    private Veiculo veiculo;
    private Pacote pacote;

    public String getDestino() {
        return this.destino;
    }

    private void setDestino(String destino) {
        this.destino = destino;
    }

    public int getTempo() {
        return this.tempo;
    }

    private void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Rota(Veiculo veiculo, Pacote pacote) {
        this.veiculo = veiculo;
        this.pacote = pacote;
    }

    public void vai() {
        System.out.println("---INICIANDO ENTREGA---");
        System.out.println("Veículo: " + this.veiculo.getPlaca());
        System.out.println("Carga: " + this.pacote.getCodigo() + pacote.getPeso() + "kg)");
        System.out.println("Status: " + this.pacote.getStatus());
    }

    public Rota(String destino, int tempo, Veiculo veiculo, Pacote pacote) {
        this.destino = destino;
        this.tempo = tempo;
        this.veiculo = veiculo;
        this.pacote = pacote;
    }
}
