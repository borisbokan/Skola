package model;

import javax.print.DocFlavor;
import java.util.ArrayList;

/**
 * Created by borcha on 14.05.17..
 */
public class Predmet {

    public static final int TIPOCENJIVANJA_NUM=0;
    public static final int TIPOCENJIVANJA_OPISNO=1;
    public static final int TIPOCENJIVANJA_ABECD=3;
    public static final int TIPOCENJIVANJA_VERONAUKA=4;

    private int id;
    private String naziv;
    private ArrayList<Staresina> staresine;
    
    private boolean ulaziUpresek=true;
    private int tipOcenjivanja=0;


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


    public boolean isUlaziUpresek() {
        return ulaziUpresek;
    }

    /**
     * Predmet ulazi u prosek. Proverava se u kalkulaciji da li je predmet markiran
     * Default true
     * @param ulaziUpresek
     */
    public void setUlaziUpresek(boolean ulaziUpresek) {
        this.ulaziUpresek = ulaziUpresek;
    }

    public int getTipOcenjivanja() {
        return tipOcenjivanja;
    }

    /**
     * Tris vrste:  <br>
     *  TIPOCENJIVANJA_NUM=0;   <br>
     *   TIPOCENJIVANJA_OPISNO=1;  <br>
     *   TIPOCENJIVANJA_SLOCNO=3; <br>
     * @param tipOcenjivanja
     */
    public void setTipOcenjivanja(int tipOcenjivanja) {
        this.tipOcenjivanja = tipOcenjivanja;
    }

    public String toString(){
         return "Predmet (" + id + " " + naziv + ")";
    }
    
}
