package br.com.aula9.model;

public class Celular implements Recarregavel {
    private String marca;
    private int nivelBateria;

    public Celular(String marca) {
        this.marca = marca;
        this.nivelBateria = 10;
    }

    @Override
    public void recarregar() {
        this.nivelBateria = 100;
        System.out.println("Celular " + marca + " carregado via USB");
    }

    @Override
    public void verificarStatus() {
        System.out.println("Celular " + marca + " - Bateria: " + nivelBateria + "%");
    }
}
