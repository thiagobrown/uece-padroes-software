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
public class Aplicacao {

    public static void main(String[] args) {
        Visualizador visualizador;
        
        // Visualizando a Imagem BMP
        visualizador = new VisualizadorBMP();
        visualizador.visualizar();
        
        //Visualizando a Imagem JPG
        visualizador = new VisualizadorJPG();
        visualizador.visualizar();
        
    }
}
