/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q07.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiago
 */
public class Observavel {
    
    private final List<Observador> observadores;

    public Observavel() {
        this.observadores = new ArrayList<>();
    }
    
    public void adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }
    
    public void removerObservador(Observador observador) {
        this.observadores.remove(observador);
    }
    
    public void notificar(String mensagem) {
        this.observadores.forEach((observador) -> {
            observador.avisar(mensagem);
        });
    }
}
