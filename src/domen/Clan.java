/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivana
 */
public class Clan implements Serializable{
    
    private int clanID;
    private String ime;
    private String prezime;
    private String zanimanje;
    private String email;
    private Date datumRodjenja;
    private Date datumUclanjenja;
    private Organizacija organizacija;
    private Grad drzava;
    private List<Ljubimac> listaLjubimaca;

    public Clan() {
        this.drzava = new Grad();
        this.organizacija = new Organizacija();
        this.listaLjubimaca = new ArrayList<>();
    }

    public Clan(int clanID, String ime, String prezime, String zanimanje, String email, Date datumRodjenja, Date datumUclanjenja, Organizacija organizacija, Grad drzava, List<Ljubimac> listaLjubimaca) {
        this.clanID = clanID;
        this.ime = ime;
        this.prezime = prezime;
        this.zanimanje = zanimanje;
        this.email = email;
        this.datumRodjenja = datumRodjenja;
        this.datumUclanjenja = datumUclanjenja;
        this.organizacija = organizacija;
        this.drzava = drzava;
        this.listaLjubimaca = listaLjubimaca;
    }

    public List<Ljubimac> getListaLjubimaca() {
        return listaLjubimaca;
    }

    public void setListaLjubimaca(List<Ljubimac> listaLjubimaca) {
        this.listaLjubimaca = listaLjubimaca;
    }

    public Organizacija getOrganizacija() {
        return organizacija;
    }

    public void setOrganizacija(Organizacija organizacija) {
        this.organizacija = organizacija;
    }

    public Grad getDrzava() {
        return drzava;
    }

    public void setDrzava(Grad drzava) {
        this.drzava = drzava;
    }

    public int getClanID() {
        return clanID;
    }

    public void setClanID(int clanID) {
        this.clanID = clanID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(String zanimanje) {
        this.zanimanje = zanimanje;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumUclanjenja() {
        return datumUclanjenja;
    }

    public void setDatumUclanjenja(Date datumUclanjenja) {
        this.datumUclanjenja = datumUclanjenja;
    }

    @Override
    public String toString() {
        return ime+prezime;
    }

   
         
    
}
