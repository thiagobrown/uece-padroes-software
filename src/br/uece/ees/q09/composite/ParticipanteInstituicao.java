/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q09.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiago
 */
public class ParticipanteInstituicao implements Participante {

    private String nome;
    private List<ParticipanteIndividuo> participantes;

    public ParticipanteInstituicao(String nome) {
        if (nome == null) {
            throw  new IllegalArgumentException("Nome da Instituição inválida!");
        }
        
        this.nome = nome;
        this.participantes = new ArrayList<>();
    }
    
    public void adicionar(ParticipanteIndividuo participante) {
        if (participante == null) {
            throw  new IllegalArgumentException("Participante inválido!");
        }
        
        this.participantes.add(participante);
    }
    
    public void remover(ParticipanteIndividuo participante) {
        if (participante == null) {
            throw new IllegalArgumentException("Participante inválido!");
        }
        
        this.participantes.remove(participante);
    }

    public List<ParticipanteIndividuo> getParticipantes() {
        return participantes;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Integer getAssento() {
        throw new UnsupportedOperationException("Não usado para a Instituição!");
    }
}
