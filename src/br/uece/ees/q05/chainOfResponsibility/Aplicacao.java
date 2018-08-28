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
public class Aplicacao {

    public static void main(String[] args) {
        MaquivaVenda maquivaVenda = null;

        // Realizando o teste de Refrigerante
        maquivaVenda = new MaquivaVenda(new Refrigerante());

        maquivaVenda.receberMoeda(MoedaEnum.UM_CENTAVO);
        maquivaVenda.receberMoeda(MoedaEnum.CINCO_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum .DEZ_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum.VINTE_E_CINCO_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum.CINQUENTA_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum.UM_REAL);
        
        // Realizando o teste de Refrigerante
        maquivaVenda = new MaquivaVenda(new Chips());

        maquivaVenda.receberMoeda(MoedaEnum.UM_CENTAVO);
        maquivaVenda.receberMoeda(MoedaEnum.CINCO_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum.DEZ_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum.VINTE_E_CINCO_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum.CINQUENTA_CENTAVOS);
        maquivaVenda.receberMoeda(MoedaEnum.UM_REAL);
    }
}
