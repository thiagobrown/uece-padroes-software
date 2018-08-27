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
public class Aplicacao {

    public static void main(String[] args) {
       // Montando yogurt de morango
       Yogurt yogurt =  new YogurtMorango();
       yogurt.getPedido();
       
       // Adicionando frutas cristalizadas
       yogurt = new FrutasCristalizadas(yogurt);
       yogurt.getPedido();
       
       // Adicionando castanha
       yogurt = new Castanha(yogurt);
       yogurt.getPedido();
       
       // Adicionando calda de chocolate
       yogurt = new CaldaChocolate(yogurt);
       yogurt.getPedido();
    }
}
