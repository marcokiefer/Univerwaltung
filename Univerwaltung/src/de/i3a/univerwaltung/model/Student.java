package de.i3a.univerwaltung.model;

import java.util.Date;

public class Student extends Person{
    private String matrNr;
    private Fach fachliste;
    private Notenuebersicht notenuebersicht;

    public Student(int ID, String name, String vorname, Date geburtsdatum, Adresse adresse, String titel, String geschlecht, String matrNr, Fach fachliste, Notenuebersicht notenuebersicht) {
        super(ID, name, vorname, geburtsdatum, adresse, titel, geschlecht);
        this.matrNr = matrNr;
        this.fachliste = fachliste;
        this.notenuebersicht = notenuebersicht;
    }

    public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(String matrNr) {
        this.matrNr = matrNr;
    }

    public Fach getFachliste() {
        return fachliste;
    }

    public void setFachliste(Fach fachliste) {
        this.fachliste = fachliste;
    }

    public Notenuebersicht getNotenuebersicht() {
        return notenuebersicht;
    }

    public void setNotenuebersicht(Notenuebersicht notenuebersicht) {
        this.notenuebersicht = notenuebersicht;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	String ausgabe = " Student: " + fachliste.getBezeichnung();
    	//return super.toString();
    	return ausgabe + super.toString();
    }


}
