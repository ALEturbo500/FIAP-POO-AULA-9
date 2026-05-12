package br.com.aula9.model;

public class CarroEletrico implements Recarregavel {
    private String modelo;
    private int carga;

    public CarroEletrico(String modelo) {
        this.modelo = modelo;
        this.carga = 20;
    }

    @Override
    public void recarregar() {
        this.carga = 100;
        System.out.println("Carro " + modelo + " carregado na estação");
    }

    @Override
    public void verificarStatus() {
        System.out.println("Carro " + modelo + " - Carga: " + carga + "%");
    }
}
