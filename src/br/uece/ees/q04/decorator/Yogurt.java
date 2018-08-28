/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q04.decorator;

import java.text.DecimalFormat;

/**
 *
 * @author thiago
 */
public abstract class Yogurt {
    
    String nome;
    double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public final void getPedido() {
        System.out.println("Yogurt :: " + getNome() + " => Preço :: R$ " + new DecimalFormat("#0.00").format(getPreco()));
    }
}
