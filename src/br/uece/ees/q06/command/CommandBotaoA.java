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
public class CommandBotaoA implements Command {

    private Jogo jogo;

    public CommandBotaoA(Jogo jogo) {
        this.jogo = jogo;
    }
    
    @Override
    public void executar() {
        this.jogo.acaoAoPressionarBotaoA();
    }
}
