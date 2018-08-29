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
public class Joystick {
    private final Command botaoA;
    private final Command botaoB;

    public Joystick(Command botaoA, Command botaoB) {
        this.botaoA = botaoA;
        this.botaoB = botaoB;
    }
    
    public void pressionarBotaoA() {
        System.out.println("Botao A pressionado!");
        this.botaoA.executar();
    }
    
    public void pressionarBotaoB() {
        System.out.println("Botao B pressionado!");
        this.botaoB.executar();
    }
}
