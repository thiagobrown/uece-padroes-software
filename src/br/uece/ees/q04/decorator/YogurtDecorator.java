/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q04.decorator;

/**
 *
 * @author thiago
 */
public abstract class YogurtDecorator extends Yogurt {

    Yogurt yogurt;

    public YogurtDecorator(Yogurt yogurt) {
        this.yogurt = yogurt;
    }

    @Override
    public String getNome() {
        return  this.yogurt.getNome() + " + " + nome;
    }

    @Override
    public double getPreco() {
        return  this.yogurt.getPreco() + preco;
    }
}
