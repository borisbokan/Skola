package model;

import java.util.ArrayList;

/**
 * Created by borcha on 14.05.17..
 */
public class Predmet {

    private int id;
    private String naziv;
    private ArrayList<Staresina> staresine;


    public Predmet(){
        staresine=new ArrayList<>();
    }


    public Predmet(int _id,String _naziv){

        id=_id;
        naziv=_naziv;
        staresine=new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Staresina> getStaresine() {
        return staresine;
    }

    public void setStaresine(ArrayList<Staresina> staresine) {
        this.staresine = staresine;
    }

    public void addStaresine(Staresina _staresina) {
        this.staresine.add(_staresina);
    }
    
}
