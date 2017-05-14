package test;

import model.*;
import java.util.Date;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;


/**
 * Created by borcha on 14.05.17..
 */
public class Main {


    public static void main(String[] args) {

        Skola skola = new Skola(0, "Os Petar Kocic", "Vladimira Lazora 34/a, Novi Sad", "10986727", "12-7374333-109", "Osnovna skola");


        Razred r5_1 = new Razred(0, 5, 1);
        Razred r6_1 = new Razred(1, 6, 1);
        Razred r7_1 = new Razred(2, 7, 1);
        Razred r8_1 = new Razred(3, 8, 1);


        Predmet matematika = new Predmet(0, "Matematika");
        Predmet ruski = new Predmet(1, "Ruski");
        Predmet biologija = new Predmet(2, "Bioligija");


        Staresina staresina1 = new Staresina(0, "Markovic", "Predrag");
        staresina1.setRazred(r5_1);
        staresina1.setPredmet(matematika);

        Staresina staresina2 = new Staresina(1, "Balj", "Jelena");
        staresina2.setRazred(r6_1);
        staresina2.setPredmet(ruski);


        Staresina staresina3 = new Staresina(2, "Kovacevic", "Ruzica");
        staresina3.setPredmet(ruski);
        staresina3.setRazred(r7_1);


        Staresina staresina4 = new Staresina(3, "Balj", "Jelena");
        staresina4.setRazred(r8_1);
        staresina4.setPredmet(biologija);


        //Povezivanje predmeta sa staresinom
        matematika.addStaresine(staresina1);
        ruski.addStaresine(staresina2);
        ruski.addStaresine(staresina3);
        biologija.addStaresine(staresina4);


        //5-1 -----------------------------------------------------------
        Ucenik uc1 = new Ucenik(0, "Marijanovic", "Dragana", "1029882", "123842478240", null, "Pavle", "Dragica");
        uc1.setSkola(skola);
        uc1.setRazred(r5_1);
        uc1.setStaresina(staresina1);

        Ucenik uc2 = new Ucenik(1, "Katic", "Jovanka", "145342324", "163434675634", null, "Marko", "Jelena");
        uc2.setSkola(skola);
        uc2.setRazred(r5_1);
        uc2.setStaresina(staresina1);

        Ucenik uc3 = new Ucenik(2, "Gaspić", "Milomir", "24342333", "134346354643", null, "Marko", null);
        uc3.setSkola(skola);
        uc3.setRazred(r5_1);
        uc3.setStaresina(staresina1);


        //6-1    ---------------------------------------------
        Ucenik uc4 = new Ucenik(3, "Katic", "Filip", "154635", "123842478240", null, "Pavle", "Dragica");
        uc4.setSkola(skola);
        uc4.setRazred(r6_1);
        uc4.setStaresina(staresina2);

        Ucenik uc5 = new Ucenik(4, "Markovic", "Nevena", "13463214", "7876557232", null, null, "Jelena");
        uc5.setSkola(skola);
        uc5.setRazred(r6_1);
        uc5.setStaresina(staresina2);

        Ucenik uc6 = new Ucenik(5, "Fekete", "Natasa", "13244433", "987727512", null, "Rajko", "Svetlana");
        uc6.setSkola(skola);
        uc6.setRazred(r6_1);
        uc6.setStaresina(staresina2);


        //7-1    ---------------------------------------------
        Ucenik uc7 = new Ucenik(6, "Milicev", "Marina", "454234", "23292492449", null, "Jovan", null);
        uc7.setSkola(skola);
        uc7.setRazred(r7_1);
        uc7.setStaresina(staresina3);

        Ucenik uc8 = new Ucenik(7, "Jelic", "Petar", "13463214", "193347879", null, "Nikola", null);
        uc8.setSkola(skola);
        uc8.setRazred(r7_1);
        uc8.setStaresina(staresina3);

        Ucenik uc9 = new Ucenik(8, "Kulisek", "Darko", "13244433", "193878438", null, "Urosevic", "Ivana");
        uc9.setSkola(skola);
        uc9.setRazred(r7_1);
        uc9.setStaresina(staresina3);

        //8-1    ---------------------------------------------
        Ucenik uc10 = new Ucenik(9, "Perusic", "Ivana", "3456443", "23292492449", null, "Jovan", null);
        uc10.setSkola(skola);
        uc10.setRazred(r8_1);
        uc10.setStaresina(staresina4);

        Ucenik uc11 = new Ucenik(10, "Karic", "Jelena", "13463214", "1347383732", null, "Nikola", null);
        uc11.setSkola(skola);
        uc11.setRazred(r8_1);
        uc11.setStaresina(staresina4);

        Ucenik uc12 = new Ucenik(11, "Petrovic", "Ivan", "13244433", "2183728434", null, "Karlo", "Ivona");
        uc12.setSkola(skola);
        uc12.setRazred(r8_1);
        uc12.setStaresina(staresina4);


        //povezivanje ucenika sa razredom
        r5_1.addUcenici(uc1);
        r5_1.addUcenici(uc2);
        r5_1.addUcenici(uc3);


        r6_1.addUcenici(uc4);
        r6_1.addUcenici(uc5);
        r6_1.addUcenici(uc6);

        //povezivanje ucenika sa razredom
        r7_1.addUcenici(uc7);
        r7_1.addUcenici(uc8);
        r7_1.addUcenici(uc9);

        //povezivanje ucenika sa razredom
        r8_1.addUcenici(uc10);
        r8_1.addUcenici(uc11);
        r8_1.addUcenici(uc12);

        //Prikaz

        for (Ucenik stavka : r5_1.getUcenici() ) {
            System.out.println(stavka.getPrezime() + ", " + stavka.getIme() +  " Raz: " + stavka.getRazred().getRazred() + "/" + stavka.getRazred().getOdeljenje() + "Staresina: (" + stavka.getStaresina().getPrezime() + ", " + stavka.getStaresina().getIme() + ") ");
        }

    }



}
