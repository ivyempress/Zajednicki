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
public class Organizacija implements Serializable, OpstiDomenskiObjekat {

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

    public Organizacija(String nazivOrganizacije, String imeOsnivaca) {
        this.nazivOrganizacije = nazivOrganizacije;
        this.imeOsnivaca = imeOsnivaca;
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

    @Override
    public String vratiNazivTabele() {
        return "Organizacija";
    }

    @Override
    public String vratiParametreZaInsert() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String datum = sdf.format(datumOsnivanja);
         return "'"+organizacijaID+"', '"+nazivOrganizacije+"', '"+imeOsnivaca+"', '"+datum+"', '"+opisDelatnosti+"'";
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> lista = new ArrayList<>();
        while (rs.next()) {
            int organizacijaID = rs.getInt(1);
            String nazivOrganizacije = rs.getString(2);
            String imeOsnivaca = rs.getString(3);
            Date datumOsnivanja = rs.getDate(4);
            String opisDelatnosti = rs.getString(5);
            Organizacija org = new Organizacija(organizacijaID, nazivOrganizacije, imeOsnivaca, datumOsnivanja, opisDelatnosti);

            lista.add(org);
        }
        return lista;
    }

    @Override
    public String vratiNazivKolonePrimarnogKljuca() {
        return "organizacijaID";
    }

    @Override
    public String vratiSifru() {
        return String.valueOf(organizacijaID);
    }

    @Override
    public OpstiDomenskiObjekat vratiObjekat(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiParametreZaUpdate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String datum = sdf.format(datumOsnivanja);
        return "nazivOrganizacije = '"+nazivOrganizacije+"', imeOsnivaca = '"+imeOsnivaca+"', datumOsnivanja = '"+datum+"', opisDelatnosti = '"+opisDelatnosti+"'";
    }

    @Override
    public String uslov() {
        return " WHERE nazivOrganizacije LIKE '"+nazivOrganizacije+"%' OR imeOsnivaca LIKE '"+imeOsnivaca+"%'";
    }

    @Override
    public String uslov2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String uslov3() {
        return "";
    }

    @Override
    public String vratiNazivTabeleZaBrisanje() {
        return "Organizacija";
    }

    @Override
    public String vratiNazivTabeleZaInsert() {
        return "Organizacija";
        
    }

    @Override
    public String vratiNazivTabeleZaUpdate() {
        return "Organizacija";
    }

}
