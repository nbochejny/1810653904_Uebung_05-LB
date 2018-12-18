package Aufgabe1;

public class Mensch extends Saeugetier {

    public Mensch(String name,int alter, String geschlecht){
        super(name,alter,geschlecht);
    }
    @Override
    public String printAll(){
        return String.format("%s#%d#%s",getName(), getAlter(), getGeschlecht());
    }
} //%d = for any integer gives decimal integer; %s for any type gives String value
//Ändert Formatierung auf angegebenes
