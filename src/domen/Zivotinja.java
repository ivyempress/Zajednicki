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
public class Zivotinja implements Serializable{
    
    private int zivotinjaID;
    private String naziv;
    private String opisVrste;

    public Zivotinja() {
    }

    public Zivotinja(int zivotinjaID, String naziv, String vrstaZivotinje, String opisVrste) {
        this.zivotinjaID = zivotinjaID;
        this.naziv = naziv;
        
        this.opisVrste = opisVrste;
    }

    public String getOpisVrste() {
        return opisVrste;
    }

    public void setOpisVrste(String opisVrste) {
        this.opisVrste = opisVrste;
    }

    public int getZivotinjaID() {
        return zivotinjaID;
    }

    public void setZivotinjaID(int zivotinjaID) {
        this.zivotinjaID = zivotinjaID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }



    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}
