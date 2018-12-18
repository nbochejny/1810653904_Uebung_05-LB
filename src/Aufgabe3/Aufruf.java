package Aufgabe3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Aufruf {

    public static void main(String[] args) {

        Auto bmw = new Auto ((short)4, "silber", (short)220, (short)5, (short)4);
        Auto audi = new Auto ((short)4, "schwarz", (short)180, (short)3, (short)8);
        Auto vw = new  Auto ((short)4, "rot", (short)120, (short)3, (short)4);
        Auto toyota = new Auto ((short)4, "weiß", (short)230, (short)5, (short)8);
        Auto honda = new Auto ((short)4, "blau", (short)160, (short)5, (short)4);

        List<Auto> liste = new LinkedList<>();
        liste.add(audi);
        liste.add(bmw);
        liste.add(vw);
        liste.add(toyota);
        liste.add(honda);
        Collections.sort(liste);
        //Sortierung
        for (Auto item : liste){
            System.out.println(item);
        }




    }
}