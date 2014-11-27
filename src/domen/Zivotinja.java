/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivana
 */
public class Zivotinja implements Serializable, OpstiDomenskiObjekat {

    private int zivotinjaID;
    private String naziv;
    private String opisVrste;

    public Zivotinja() {
    }

    public Zivotinja(int zivotinjaID, String naziv, String opisVrste) {
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

    @Override
    public String vratiNazivTabele() {

        return "Zivotinja";
    }

    @Override
    public String vratiParametreZaInsert() {
        return "'" + zivotinjaID + "', '" + naziv + "', '" + opisVrste + "'";
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> lista = new ArrayList<>();
        while (rs.next()) {
            int ID = rs.getInt(1);
            String nazivZivotinje = rs.getString(2);
            String opis = rs.getString(3);
            Zivotinja zivotinja = new Zivotinja(ID, nazivZivotinje, opis);
            lista.add(zivotinja);
        }
        return lista;
    }

    @Override
    public String vratiNazivKolonePrimarnogKljuca() {

        return "zivotinjaID";
    }

    @Override
    public String vratiSifru() {
        return String.valueOf(zivotinjaID);
    }

    @Override
    public OpstiDomenskiObjekat vratiObjekat(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiParametreZaUpdate() {
        return "naziv = '" + naziv + "', opisVrste = '" + opisVrste + "'";

    }

    @Override
    public String uslov() {
     return " WHERE naziv LIKE '"+naziv+"%' OR opisVrste LIKE '"+opisVrste+"%'";
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
        return "Zivotinja";
    }

    @Override
    public String vratiNazivTabeleZaInsert() {
        return "Zivotinja";
    }

}
