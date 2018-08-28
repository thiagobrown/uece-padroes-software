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
public abstract class SlotMoeda {
    
    protected SlotMoeda proximoSlot;
    
    public abstract Double capturar(MoedaEnum moeda);

    public void setProximoSlot(SlotMoeda proximoSlot) {
        this.proximoSlot = proximoSlot;
    }
}
