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
public class Ljubimac implements Serializable{
    
    private int ljubimacID;
    private Clan vlasnik;
    private String imeLjubimca;
    private Date datumSpasavanja;
    private Zivotinja vrstaZivotinje;

    public Ljubimac() {
        this.vlasnik = new Clan();
        this.vrstaZivotinje = new Zivotinja();
    }

    public Ljubimac(int ljubimacID, Clan vlasnik, String imeLjubimca, Date datumSpasavanja, Zivotinja vrstaZivotinje) {
        this.ljubimacID = ljubimacID;
        this.vlasnik = vlasnik;
        this.imeLjubimca = imeLjubimca;
        this.datumSpasavanja = datumSpasavanja;
        this.vrstaZivotinje = vrstaZivotinje;
    }

    public Zivotinja getVrstaZivotinje() {
        return vrstaZivotinje;
    }

    public void setVrstaZivotinje(Zivotinja vrstaZivotinje) {
        this.vrstaZivotinje = vrstaZivotinje;
    }

    public int getLjubimacID() {
        return ljubimacID;
    }

    public void setLjubimacID(int ljubimacID) {
        this.ljubimacID = ljubimacID;
    }

    public Clan getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Clan vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getImeLjubimca() {
        return imeLjubimca;
    }

    public void setImeLjubimca(String imeLjubimca) {
        this.imeLjubimca = imeLjubimca;
    }

    public Date getDatumSpasavanja() {
        return datumSpasavanja;
    }

    public void setDatumSpasavanja(Date datumSpasavanja) {
        this.datumSpasavanja = datumSpasavanja;
    }

    @Override
    public String toString() {
        return imeLjubimca;
    }
    
    
    
    
}