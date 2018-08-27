/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q01.singleton;

/**
 *
 * @author thiago
 */
public class Logger {

    private static Logger instance = null;

    private boolean ativo = false;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public void log(String s) {
        if (this.ativo) {
            System.out.println("LOG :: " + s);
        }
    }
}
