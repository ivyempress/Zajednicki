/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Ivana
 */
public class Organizacija implements Serializable{
    private int organizacijaID;
    private String nazivOrganizacije;
    private String imeOsnivaca;
    private Date datumOsnivanja;
    private String opisDelatnosti;

    public Organizacija(int organizacijaID, String nazivOrganizacije, String imeOsnivaca, Date datumOsnivanja, String opisDelatnosti) {
        this.organizacijaID = organizacijaID;
        this.nazivOrganizacije = nazivOrganizacije;
        this.imeOsnivaca = imeOsnivaca;
        this.datumOsnivanja = datumOsnivanja;
        this.opisDelatnosti = opisDelatnosti;
    }

    public Organizacija() {
    }
    
    

    public int getOrganizacijaID() {
        return organizacijaID;
    }

    public void setOrganizacijaID(int organizacijaID) {
        this.organizacijaID = organizacijaID;
    }

    public String getNazivOrganizacije() {
        return nazivOrganizacije;
    }

    public void setNazivOrganizacije(String nazivOrganizacije) {
        this.nazivOrganizacije = nazivOrganizacije;
    }

    public String getImeOsnivaca() {
        return imeOsnivaca;
    }

    public void setImeOsnivaca(String imeOsnivaca) {
        this.imeOsnivaca = imeOsnivaca;
    }

    public Date getDatumOsnivanja() {
        return datumOsnivanja;
    }

    public void setDatumOsnivanja(Date datumOsnivanja) {
        this.datumOsnivanja = datumOsnivanja;
    }

    public String getOpisDelatnosti() {
        return opisDelatnosti;
    }

    public void setOpisDelatnosti(String opisDelatnosti) {
        this.opisDelatnosti = opisDelatnosti;
    }

    @Override
    public String toString() {
        return nazivOrganizacije;
    }
    
    
    
    
}
