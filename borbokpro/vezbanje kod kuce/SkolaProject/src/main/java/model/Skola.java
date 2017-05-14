package model;

import java.util.ArrayList;

/**
 * Created by borcha on 14.05.17..
 */
public class Skola {

    private int id;
    private String nazivSkole;
    private String adresaSkole;
    private String maticniBroj;
    private String ziroRacun;
    private String tipSkole;//osnovna, srednja....

    ArrayList<Ucenik> ucenici;
    ArrayList<Razred> razredi;


    public Skola(){
        ucenici=new ArrayList<>();
        razredi=new ArrayList<>();

    }

    public Skola(int _id,String _nazivSkole,String _adresaSkole,String _maticniBroj,String _ziroRacun,String _tipSkole){

        id=_id;
        nazivSkole=_nazivSkole;
        adresaSkole=_adresaSkole;
        maticniBroj=_maticniBroj;
        ziroRacun=_ziroRacun;
        tipSkole=_tipSkole;
        
        ucenici=new ArrayList<>();
        razredi=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivSkole() {
        return nazivSkole;
    }

    public void setNazivSkole(String nazivSkole) {
        this.nazivSkole = nazivSkole;
    }

    public String getAdresaSkole() {
        return adresaSkole;
    }

    public void setAdresaSkole(String adresaSkole) {
        this.adresaSkole = adresaSkole;
    }

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getZiroRacun() {
        return ziroRacun;
    }

    public void setZiroRacun(String ziroRacun) {
        this.ziroRacun = ziroRacun;
    }

    public String getTipSkole() {
        return tipSkole;
    }

    public void setTipSkole(String tipSkole) {
        this.tipSkole = tipSkole;
    }

    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    //Pomocna
    public void addUcenici(Ucenik _ucenik) {
        this.ucenici.add(_ucenik);
    }

    public ArrayList<Razred> getRazredi() {
        return razredi;
    }

    //Pomocna
    public void addRazredi(Razred _razred) {
        razredi.add(_razred);
    }

    public void setRazredi(ArrayList<Razred> razredi) {
        this.razredi = razredi;
    }
}
