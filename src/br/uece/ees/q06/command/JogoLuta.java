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
public class JogoLuta implements Jogo {

    public void chuteAlto() {
        System.out.println("Chute alto!");
    }
    
    @Override
    public void acaoAoPressionarBotaoA() {
        this.chuteAlto();
    }

    @Override
    public void acaoAoPressionarBotaoB() {
        System.out.println("Nenhuma acao!");
    }
}
