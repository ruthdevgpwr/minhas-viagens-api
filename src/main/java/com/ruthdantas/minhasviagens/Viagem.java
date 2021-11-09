package com.ruthdantas.minhasviagens;

public class Viagem {

    private String origem;
    private String destino;

    public  Viagem () {

    }

    public Viagem(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
