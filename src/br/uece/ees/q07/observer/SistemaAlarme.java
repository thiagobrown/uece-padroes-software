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
public class SistemaAlarme extends Observavel implements Observador {

    @Override
    public void avisar(String mensagem) {
        System.out.println("Aviso :: Sistema de Alarme :: " + mensagem);
        
        this.notificar("Sistema de Alarme disparado!");
    }
}
