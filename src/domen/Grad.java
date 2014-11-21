/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;

/**
 *
 * @author Ivana
 */
public class Grad implements Serializable{
    
    private int gradID;
    private String nazivGrada;
    private String drzava;

    public Grad() {
    }

    public Grad(int gradID, String nazivGrada, String drzava) {
        this.gradID = gradID;
        this.nazivGrada = nazivGrada;
        this.drzava = drzava;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getGradID() {
        return gradID;
    }

    public void setGradID(int gradID) {
        this.gradID = gradID;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    @Override
    public String toString() {
        return nazivGrada;
    }
    
    
    
    
}
