/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domen;


import java.sql.ResultSet;

import java.util.List;

/**
 *
 * @author Ivana
 */
public interface OpstiDomenskiObjekat {

    public String vratiNazivTabele();

    public String vratiParametreZaInsert();

    public List<OpstiDomenskiObjekat> vratiListu(ResultSet rs) throws Exception;

    public String vratiNazivKolonePrimarnogKljuca();

    public String vratiSifru();

    public OpstiDomenskiObjekat vratiObjekat(ResultSet rs);

    public String vratiParametreZaUpdate();
    
    public String vratiNazivTabeleZaBrisanje();
    
    public String vratiNazivTabeleZaInsert();

    public String uslov();

    public String uslov2();

    public String uslov3();

}
