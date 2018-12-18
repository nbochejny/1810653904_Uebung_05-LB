package Aufgabe3;
//Auto erbt -> implement um ein Interface hinzuzufügen -> Nun die Methode compareTo() zur verfügung da in Comparable enthalten
public class Auto extends Fahrzeug implements Comparable<Auto>{
    private boolean klimaanlage;
    private short airbags;

    public Auto(short reifen,String farbe,short ps,short tueren,short airbags){
        super(reifen,farbe,ps,tueren);
        this.klimaanlage=false;
        this.airbags=airbags;
    }

    @Override
    public int compareTo(Auto o) {
        if (this.getPs()== o.getPs()){
            return 0;
        }
        if (this.getPs() > o.getPs()){
            return 1; //jede positive Nummer ist möglich
        }
        return -1; //jede negative Nummer ist möglich
    }
        /*
        Wenn das erste Auto mehr PS hat als das zweite Auto soll es "über" den dem anderen Auto stehen und umgekehrt
        Bei gleichvielen PS soll es "gleichgestellt" sein (es wird die Reihenfolge in der Liste verwendet)
        in diesem Fall sind die Autos aufsteigend geordnet - wenn ich sie absteigend geordnet haben will kann ich einfach
        ">" zu "<" umdrehen
         */


    @Override
    public String toString(){
        return "Mein Auto hat "+this.getPs()+" PS und fährt mit "+this.getGeschwindigkeit()+" km/h";
    }

    public void klimaanlageAn(){
        if (getKlimaanlage()==true){
            System.out.println("Klima läuft bereits");
        }
        else {
            setKlimaanlage(true);
        }
    }
    public boolean getKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
}
