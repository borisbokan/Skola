package model;

/**
 * Created by borcha on 15.05.17..
 */
public class Ocena {


       public static final String VERONAUKA_ISTICE_SE="istice se";
       public static final String VERONAUKA_DOBAR="dobar";

       private int id;
       private float ocena;
       private Predmet predmet;
       private Ucenik ucenik;


       public Ocena(){}

       public Ocena(int _id,float _ocena,Predmet _predmet,Ucenik _ucenik){

           id=_id;
           ocena=_ocena;
           predmet=_predmet;
           ucenik=_ucenik;
       }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public Ucenik getUcenik() {
        return ucenik;
    }

    public void setUcenik(Ucenik ucenik) {
        this.ucenik = ucenik;
    }


    public String getOcenaVeronauke(Predmet _predmet){

               if(_predmet.getTipOcenjivanja()==Predmet.TIPOCENJIVANJA_VERONAUKA){
                   if(ocena>4 && ocena < 6) return Ocena.VERONAUKA_ISTICE_SE;
                   if(ocena >= 2  && ocena <= 4) return Ocena.VERONAUKA_DOBAR;
               }
        
        return "***";
    }

    public String toString(){
           return "Ocena(" + id  +  " " + String.valueOf(ocena)  + " " + predmet.getNaziv() + " " + ucenik.getPrezime()+ ", " + ucenik.getIme() + ")";
    }
}
