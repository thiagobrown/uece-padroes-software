/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q09.composite;

/**
 *
 * @author thiago
 */
public class Aplicacao {

    public static void main(String[] args) {
        
        Congresso congresso = new Congresso("Congresso de Padrões de Projeto", 5);
        
        ParticipanteIndividuo pa = new ParticipanteIndividuo("PA", 1);
        ParticipanteIndividuo pb = new ParticipanteIndividuo("PB", 2);
        ParticipanteIndividuo pc = new ParticipanteIndividuo("PC", 3);
        
        congresso.adicionarParticipante(pa);
        congresso.adicionarParticipante(pb);
        congresso.adicionarParticipante(pc);
        
        ParticipanteInstituicao instituicao = new ParticipanteInstituicao("IA");
        ParticipanteIndividuo pia = new ParticipanteIndividuo("PIA", 4);
        ParticipanteIndividuo pib = new ParticipanteIndividuo("PIB", 5);
        ParticipanteIndividuo pic = new ParticipanteIndividuo("PIC", 6);
        
        instituicao.adicionar(pia);
        instituicao.adicionar(pib);
        instituicao.adicionar(pic);
        
        congresso.adicionarInstituicao(instituicao);   
        
        instituicao.remover(pic);
        
        congresso.adicionarInstituicao(instituicao);
    }
}
