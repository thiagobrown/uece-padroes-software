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
public enum MoedaEnum {

    UM_CENTAVO(new Double("0.01")),
    CINCO_CENTAVOS(new Double("0.05")),
    DEZ_CENTAVOS(new Double("0.10")),
    VINTE_E_CINCO_CENTAVOS(new Double("0.25")),
    CINQUENTA_CENTAVOS(new Double("0.50")),
    UM_REAL(new Double("1.00"));

    private final Double valor;

    private MoedaEnum(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
