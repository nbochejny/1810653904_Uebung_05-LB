package Aufgabe2;

public class Aufruf {
    public static void main(String[]args){
        Mensch nr2 = new Mensch("Jörg","Butler", 33);
        nr2.status();
        nr2 = new Student ("Jörg","Butler",33,1118623357,"SkVM");
        nr2.status();
    }
}
