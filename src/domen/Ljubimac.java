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
public class Ljubimac implements Serializable, OpstiDomenskiObjekat {

    private int ljubimacID;
    private Clan vlasnik;
    private String imeLjubimca;
    private Date datumSpasavanja;
    private Zivotinja vrstaZivotinje;

    public Ljubimac() {
        this.vlasnik = new Clan();
        this.vrstaZivotinje = new Zivotinja();
    }

    public Ljubimac(String imeLjubimca) {
        this.imeLjubimca = imeLjubimca;
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

    @Override
    public String vratiNazivTabele() {
        return "Ljubimac";
    }

    @Override
    public String vratiParametreZaInsert() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String datumSpas = sdf.format(datumSpasavanja);
        return "'" + vlasnik.getJmbg() + "', " + ljubimacID + ", '" + imeLjubimca + "', '" + datumSpas + "', " + vrstaZivotinje.getZivotinjaID();
    }

    @Override
    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception {
        List<OpstiDomenskiObjekat> lista = new ArrayList<>();
        while (rs.next()) {
            String maticniBroja = rs.getString(1);
            int id = rs.getInt(2);
            String ime = rs.getString(3);
            Date datum = rs.getDate(4);
            int idZiv = rs.getInt(5);
            Ljubimac ljub = new Ljubimac();
            ljub.setDatumSpasavanja(datum);
            ljub.setImeLjubimca(ime);
            ljub.setLjubimacID(id);
            

            lista.add(ljub);
        }
        return lista;
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
        return " WHERE jmbg = ";
    }

    @Override
    public String uslov2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String uslov3() {
        return "'" + imeLjubimca + "'";
    }

    @Override
    public String vratiNazivTabeleZaBrisanje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
