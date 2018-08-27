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
public class ImagemBMP implements Imagem {

    @Override
    public void carregar() {
        System.out.println("Imagem BMP:");
        System.out.println("Carregando imagem BMP...");
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem por 20 segundos");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando imagem");
    }
}
