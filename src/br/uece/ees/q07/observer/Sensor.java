/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q07.observer;

/**
 *
 * @author thiago
 */
public class Sensor extends Observavel {

    private String localizacao;

    public Sensor(String localizacao) {
        super();
        
        if (localizacao == null || localizacao.trim().isEmpty()) {
            throw  new IllegalArgumentException("Localização do sensor inválido!");
        }
        
        this.localizacao = localizacao;
    }
    
    public void detectarMovimento() {
        this.notificar("Movimento detectado no sensor localizado no(a) " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
