package br.com.aula9.app;

import br.com.aula9.model.Recarregavel;
import br.com.aula9.model.ControlePS4;
import br.com.aula9.model.CarroEletrico;
import br.com.aula9.model.Celular;

public class Main {
    public static void main(String[] args) {
        Recarregavel[] dispositivos = new Recarregavel[3];
        
        dispositivos[0] = new ControlePS4("Preto");
        dispositivos[1] = new CarroEletrico("Tesla Model 3");
        dispositivos[2] = new Celular("iPhone 15");

        for (Recarregavel d : dispositivos) {
            d.verificarStatus();
            d.recarregar();
            d.verificarStatus();
            System.out.println("---");
        }
    }
}
