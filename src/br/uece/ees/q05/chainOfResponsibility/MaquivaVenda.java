/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uece.ees.q05.chainOfResponsibility;

import java.text.DecimalFormat;

/**
 *
 * @author thiago
 */
public class MaquivaVenda {
    Produto produto;
    SlotMoeda slot;
    Double total;

    public MaquivaVenda(Produto produto) {
        this.produto = produto;
        this.total = new Double("0.00");
        
        SlotMoedaUmCentavo umCentavo = new SlotMoedaUmCentavo();
        SlotMoedaCincoCentavos cincoCentavos = new SlotMoedaCincoCentavos();
        SlotMoedaDezCentavos dezCentavos = new SlotMoedaDezCentavos();
        SlotMoedaVinteCincoCentavos vinteCincoCentavos = new SlotMoedaVinteCincoCentavos();
        SlotMoedaCinquentaCentavos cinquentaCentavos = new SlotMoedaCinquentaCentavos();
        SlotMoedaUmReal umReal = new SlotMoedaUmReal();
        
        this.slot = umCentavo;
        this.slot.setProximoSlot(cincoCentavos);
        cincoCentavos.setProximoSlot(dezCentavos);
        dezCentavos.setProximoSlot(vinteCincoCentavos);
        vinteCincoCentavos.setProximoSlot(cinquentaCentavos);
        cinquentaCentavos.setProximoSlot(umReal);
        
        System.out.println("Produto :: " + this.produto.getDescricao() + " => Preço :: " + this.formatarValor(this.produto.getValor()));
    }
    
    public void receberMoeda(MoedaEnum moeda) {
        this.total += this.slot.capturar(moeda);
        
        if (this.total < this.produto.getValor()) {
            System.out.println("Produto não liberado! Faltando :: " + this.formatarValor(this.produto.getValor().doubleValue() - this.total.doubleValue()));
        } else if (this.produto.getValor().doubleValue() == this.total.doubleValue()) {
            System.out.println("Produto liberado!");
        } else {
            System.out.println("Produto liberado! Troco :: " + this.formatarValor(this.total.doubleValue() - this.produto.getValor().doubleValue()));
        }
    } 
    
    private String formatarValor(Double valor) {
        return "R$ " + new DecimalFormat("#0.00").format(valor);
    }
}
