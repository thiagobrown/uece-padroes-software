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
public class LoggerEventViewer implements LoggerStrategy {

    @Override
    public void log(String s) {
        System.out.println("LOG EM EVENTVIEWER :: " + s);
    }
}
