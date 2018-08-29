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
public class CommandBotaoB implements Command {

    private Jogo jogo;

    public CommandBotaoB(Jogo jogo) {
        this.jogo = jogo;
    }
    
    @Override
    public void executar() {
        this.jogo.acaoAoPressionarBotaoB();
    }

}
