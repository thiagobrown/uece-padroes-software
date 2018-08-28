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
public class SlotMoedaDezCentavos extends SlotMoeda {

    @Override
    public Double capturar(MoedaEnum moeda) {
        if (MoedaEnum.DEZ_CENTAVOS.equals(moeda)) {
            System.out.println("Moeda captura :: R$ " + new DecimalFormat("#0.00").format(moeda.getValor()));
            return moeda.getValor();
        }

        return this.proximoSlot == null
                ? new Double("0.00")
                : this.proximoSlot.capturar(moeda);
    }

}
