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
public class JogoFutebol implements Jogo {

    public void correr() {
        System.out.println("Correr!");
    }
    
    @Override
    public void acaoAoPressionarBotaoA() {
        this.correr();
    }

    @Override
    public void acaoAoPressionarBotaoB() {
        System.out.println("Nenhuma acao!");
    }

}
