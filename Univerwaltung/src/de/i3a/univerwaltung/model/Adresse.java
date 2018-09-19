package de.i3a.univerwaltung.model;

public class Adresse {
    private int ID;
    private String strasse;
    private int hausnummer;
    private String plz;
    private String ort;

    public Adresse(int ID, String strasse, int hausnummer, String plz, String ort) {
        this.ID = ID;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        String ausgabe =  " aus " + ort;
        return ausgabe;

    }
}
