/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Enum.enTipVlasnistva;
import Main.VlasnikVozila;

/**
 *
 * @author d.jakas
 */
public interface IVlasnikVozila {
    public enTipVlasnistva getTipVlasnistva();
    public void setTipVlasnistva(enTipVlasnistva TipVlasnistva);
    
    public VlasnikVozila getVlaskikVozila();
    public void setVlaskikVozila(VlasnikVozila vlasnikVozila);
    
}
