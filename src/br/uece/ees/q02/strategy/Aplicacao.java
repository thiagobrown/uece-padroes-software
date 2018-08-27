/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q02.strategy;

/**
 *
 * @author thiago
 */
public class Aplicacao {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setAtivo(true);

        LoggerStrategy loggerStrategy = null;

        loggerStrategy = new LoggerEventViewer();
        logger.log(loggerStrategy, "PRIMEIRA MENSAGEM DE LOG");

        loggerStrategy = new LoggerFile();
        logger.log(loggerStrategy, "SEGUNDA MENSAGEM DE LOG");
        
        loggerStrategy = new LoggerDatabase();
        logger.log(loggerStrategy, "TERCEIRA MENSAGEM DE LOG");       
    }
}
