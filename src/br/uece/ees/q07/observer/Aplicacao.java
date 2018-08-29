/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q07.observer;

/**
 *
 * @author thiago
 */
public class Aplicacao {

    public static void main(String[] args) {
        
        Sensor sensorBlocoA = new Sensor("Bloco A");
        Sensor sensorBlocoB = new Sensor("Bloco B");
        SistemaAlarme sistemaAlarme = new SistemaAlarme();
        Delegacia delegacia = new Delegacia();
        CompanhiaSeguros companhiaSeguros = new CompanhiaSeguros();
        
        sensorBlocoA.adicionarObservador(sistemaAlarme);
        sensorBlocoB.adicionarObservador(sistemaAlarme);
        
        sistemaAlarme.adicionarObservador(delegacia);
        sistemaAlarme.adicionarObservador(companhiaSeguros);
        
        sensorBlocoA.detectarMovimento();
        
        sistemaAlarme.removerObservador(companhiaSeguros);
        sensorBlocoB.detectarMovimento();
    }
}
