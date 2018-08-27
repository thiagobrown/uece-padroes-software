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
public class FrutasCristalizadas extends YogurtDecorator {

    public FrutasCristalizadas(Yogurt yogurt) {
        super(yogurt);
        nome = "Frutas Cristalizadas";
        preco = 1.0;
    }

}
