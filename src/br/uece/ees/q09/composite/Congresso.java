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
public class Congresso {

    private String nome;
    private Integer numeroAssentos;
    private List<Participante> participantes;

    public Congresso(String nome, Integer numeroAssentos) {
        this.nome = nome;
        this.numeroAssentos = numeroAssentos;
        this.participantes = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getNumeroAssentos() {
        return this.numeroAssentos;
    }

    public Integer getTotalParticipantes() {
        Integer total = 0;

        for (Participante participante : this.participantes) {
            if (participante instanceof ParticipanteIndividuo) {
                total++;
            } else if (participante instanceof ParticipanteInstituicao) {
                total += ((ParticipanteInstituicao) participante).getParticipantes().size();
            }
        }

        return total;
    }

    public void adicionarParticipante(ParticipanteIndividuo participante) {
        if (this.numeroAssentos > this.getTotalParticipantes()) {
            this.participantes.add(participante);
            System.out.println("Participante adicionado :: " + participante.getNome());
        } else {
            System.out.println("Não existem mais assentos livres no Congresso!");
        }
    }

    public void adicionarInstituicao(ParticipanteInstituicao instituicao) {
        if (this.numeroAssentos >= (this.getTotalParticipantes() + instituicao.getParticipantes().size())) {
            this.participantes.add(instituicao);
            System.out.println("Instituicao adicionada :: " + instituicao.getNome());
        } else {
            System.out.println("Não existem assentos livres para Instituição no Congresso!");
        }
    }
}
