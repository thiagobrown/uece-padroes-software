/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q06.command;

/**
 *
 * @author thiago
 */
public class JogoCorrida implements Jogo {

    public void acelerar() {
        System.out.println("Acelerar!");
    }  
    
    @Override
    public void acaoAoPressionarBotaoA() {
        this.acelerar();
    }

    @Override
    public void acaoAoPressionarBotaoB() {
        System.out.println("Nenhuma acao!");
    }
}
