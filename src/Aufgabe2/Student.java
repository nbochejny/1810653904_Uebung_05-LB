package Aufgabe2;

public class Student extends Mensch {

    private int matrikelnummer;
    private String studiengang;

    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        this.matrikelnummer=matrikelnummer;
        this.studiengang=studiengang;
    }
    @Override
    public void status(){
        System.out.println(getVorname()+" "+getNachname()+" ist Student und "+getAlter()+" Jahre alt und studiert "
                +getStudiengang() + ". Matrikelnummer lautet: "+getMatrikelnummer());
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }
}