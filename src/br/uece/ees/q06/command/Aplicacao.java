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
public class Aplicacao {

    public static void main(String[] args) {
        
        Joystick joystick;
        CommandBotaoA commandBotaoA; 
        CommandBotaoB commandBotaoB; 
        
        // JOGAR FUTEBOL
        System.out.println("Jogando Futebol");
        
        commandBotaoA = new CommandBotaoA(new JogoFutebol());
        commandBotaoB = new CommandBotaoB(new JogoFutebol());
        
        joystick = new Joystick(commandBotaoA, commandBotaoB);
        joystick.pressionarBotaoA();
        joystick.pressionarBotaoB();
        
        System.out.println("Jogando Corrida");
        
        commandBotaoA = new CommandBotaoA(new JogoCorrida());
        commandBotaoB = new CommandBotaoB(new JogoCorrida());
        
        joystick = new Joystick(commandBotaoA, commandBotaoB);
        joystick.pressionarBotaoA();
        joystick.pressionarBotaoB();
        
        
        System.out.println("Jogando Luta");
        
        commandBotaoA = new CommandBotaoA(new JogoLuta());
        commandBotaoB = new CommandBotaoB(new JogoLuta());
        
        joystick = new Joystick(commandBotaoA, commandBotaoB);
        joystick.pressionarBotaoA();
        joystick.pressionarBotaoB();
    }
}
