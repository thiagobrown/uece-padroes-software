/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q03.factoryMethod;

/**
 *
 * @author thiago
 */
public class VisualizadorJPG implements Visualizador {

    @Override
    public void visualizar() {
        Imagem img = new ImagemJPG();
        img.carregar();
        img.exibir();
        img.fechar();
    }
}
