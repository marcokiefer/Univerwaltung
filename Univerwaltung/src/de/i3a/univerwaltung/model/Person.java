package de.i3a.univerwaltung.model;

import java.util.Date;
import java.util.Set;

public class Person {
    private int id;
    private String name;
    private String vorname;
    private Date geburtsdatum;
    private Adresse adresse;
    private String titel;
    private String geschlecht;

	public Person() {
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
    
 
    @Override
    public String toString() {
        //String anrede = "weiblich".equalsIgnoreCase(geschlecht)? "Frau ":"Herr ";
        //String ausgabe = "ich bin " + anrede + name + ", " + vorname + adresse;
        String ausgabe = " , "; 			 
    	return ausgabe;
    }
}
