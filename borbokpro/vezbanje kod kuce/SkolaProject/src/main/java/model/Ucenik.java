package model;

import java.sql.Date;

/**
 * Created by borcha on 14.05.17..
 */
public class Ucenik {


    private int id;
    private String prezime;
    private String ime;
    private String maticniBroj;
    private String jmbg;
    private Date datumRodjenja;
    private String imeOca;
    private String imeMajke;

    private Razred razred;
    private Staresina staresina;
    private Skola skola;


    public Ucenik(){

    }

    public Ucenik(int _id,String _prezime,String _ime,String _maticniBroj,String _jmbg,Date _datumRodjenja,String _imeOca,String _imeMajke){
        id=_id;
        prezime=_prezime;
        ime=_ime;
        maticniBroj=_maticniBroj;
        jmbg=_jmbg;
        datumRodjenja=_datumRodjenja;
        imeOca=_imeOca;
        imeMajke=_imeMajke;

    }


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

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getImeOca() {
        return imeOca;
    }

    public void setImeOca(String imeOca) {
        this.imeOca = imeOca;
    }

    public String getImeMajke() {
        return imeMajke;
    }

    public void setImeMajke(String imeMajke) {
        this.imeMajke = imeMajke;
    }

    public Razred getRazred() {
        return razred;
    }

    public void setRazred(Razred razred) {
        this.razred = razred;
    }

    public Staresina getStaresina() {
        return staresina;
    }

    public void setStaresina(Staresina staresina) {
        this.staresina = staresina;
    }

    public Skola getSkola() {
        return skola;
    }

    public void setSkola(Skola skola) {
        this.skola = skola;
    }

    

}