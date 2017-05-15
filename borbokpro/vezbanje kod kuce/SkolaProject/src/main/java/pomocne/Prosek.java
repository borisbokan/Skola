package pomocne;

import model.Ocena;
import model.Predmet;
import java.util.ArrayList;

/**
 * Created by borcha on 15.05.17..
 */
public class Prosek {

        private ArrayList<Ocena> ocene;
        private int brojSvihOcena=0;
        private int brojOcenaProseka=0;//broj ocen koji se racunaju u prosek. Ne racunaju se sve ocene u proseku.
        private float prosek=0.0f;


        public Prosek(ArrayList<Ocena> _ocene){
            ocene=_ocene;
            brojSvihOcena=_ocene.size();
            racunajProsek(_ocene);
            
        }


        private void racunajProsek(ArrayList<Ocena> ocene) {
            float zbirOcenaProseka=0.0f;
            for (Ocena ocena : ocene) {
               if(ocena.getPredmet().getTipOcenjivanja()==Predmet.TIPOCENJIVANJA_NUM && ocena.getPredmet().isUlaziUpresek()){
                     zbirOcenaProseka+=ocena.getOcena();
                     brojOcenaProseka++;
               }
            }

            //Racuna prosek
            prosek=zbirOcenaProseka/brojOcenaProseka;
            

        }


    public float getProsek() {

          return prosek;

    }


    public String toString(){
          return String.valueOf(this.prosek);
    }

}
