package model;

import java.util.ArrayList;

/**
 * Created by borcha on 14.05.17..
 */
public class Razred {


    private int id;
    private int razred;
    private int odeljenje;
    private Staresina staresina;
    private Skola skola;

    ArrayList<Ucenik> ucenici;

    public Razred(){
        ucenici=new ArrayList<>();
    }

    public Razred(int _id,int _razred,int _odeljenje){

        id=_id;
        razred=_razred;
        odeljenje=_odeljenje;
        ucenici=new ArrayList<>();
        
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRazred() {
        return razred;
    }

    public void setRazred(int razred) {
        this.razred = razred;
    }

    public int getOdeljenje() {
        return odeljenje;
    }

    public void setOdeljenje(int odeljenje) {
        this.odeljenje = odeljenje;
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


    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    //Pomocna metoda
    public void addUcenici(Ucenik _ucenik) {
        this.ucenici.add(_ucenik);
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    
}
