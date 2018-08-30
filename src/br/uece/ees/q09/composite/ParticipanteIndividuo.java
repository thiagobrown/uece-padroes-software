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
public class ParticipanteIndividuo implements Participante {

    private final String nome;
    private final Integer assento;

    public ParticipanteIndividuo(String nome, Integer assento) {
        if (nome == null) {
            throw  new IllegalArgumentException("Nome do Participante inválido!");
        }
        
        if (assento == null) {
            throw  new IllegalArgumentException("Assento inválido!");
        }
        
        this.nome = nome;
        this.assento = assento;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Integer getAssento() {
        return this.assento;
    }

}
