package br.com.aula9.model;

public class ControlePS4 implements Recarregavel {
    private String cor;
    private int bateria;

    public ControlePS4(String cor) {
        this.cor = cor;
        this.bateria = 50;
    }

    @Override
    public void recarregar() {
        this.bateria = 100;
        System.out.println("Controle PS4 " + cor + " recarregado para 100%");
    }

    @Override
    public void verificarStatus() {
        System.out.println("Controle PS4 " + cor + " - Bateria: " + bateria + "%");
    }
}
