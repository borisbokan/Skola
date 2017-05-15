package model;

import java.util.Date;

/**
 * Created by borcha on 14.05.17..
 */
public class Staresina{

    private int id;
    private String prezime;
    private String ime;
    private Razred razred;
    private Predmet predmet;



    public Staresina(){
        
    }


    public Staresina(int _id,String _prezime,String _ime){
        id=_id;
        prezime=_prezime;
        ime=_ime;
      
    }

    //Metode klase
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Razred getRazred() {
        return razred;
    }

    public void setRazred(Razred razred) {
        this.razred = razred;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    
}
