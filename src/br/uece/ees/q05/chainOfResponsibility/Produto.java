/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q05.chainOfResponsibility;

/**
 *
 * @author thiago
 */
public abstract class Produto {

    String descricao;
    Double valor;
    
    public Produto(String descricao, Double valor) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição do produto inválida!");
        }
        
        if (valor == null || (valor < 0)) {
            throw new IllegalArgumentException("Valor do produto inválido!");
        }
        
        this.descricao =  descricao;
        this.valor = valor;
    }

    public final String getDescricao() {
        return descricao;
    }
    
    public final Double getValor() {
        return valor;
    }
}
