/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivana
 */
public class Clan implements Serializable, OpstiDomenskiObjekat {

    private String jmbg;
    private String ime;
    private String prezime;
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

    public Clan(String jmbg, String ime, String prezime, String zanimanje, String email, Date datumRodjenja, Date datumUclanjenja, Organizacija organizacija, Grad drzava, List<Ljubimac> listaLjubimaca) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.datumUclanjenja = datumUclanjenja;
        this.organizacija = organizacija;
        this.drzava = drzava;
        this.listaLjubimaca = listaLjubimaca;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
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
        return ime + prezime;
    }

    @Override
    public String vratiNazivTabele() {
        return "Clan";
    }

    @Override
    public String vratiParametreZaInsert() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String datumRodj = sdf.format(datumRodjenja);
        String datumUcla = sdf.format(datumUclanjenja);
         return "'"+jmbg+"', '"+ime+"', '"+prezime+"', '"+datumRodj+"', '"+datumUcla+"', "+organizacija.getOrganizacijaID()+" , "+ drzava.getGradID();
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiNazivKolonePrimarnogKljuca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiSifru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpstiDomenskiObjekat vratiObjekat(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiParametreZaUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String uslov() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String uslov2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String uslov3() {
        return "";
    }

}
