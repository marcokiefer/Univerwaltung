package de.i3a.univerwaltung.model;

import java.util.List;
import java.util.Date;

public class Student extends Person{
    private String matrNr;
    private List<Fach> fachliste;
    private Notenuebersicht notenuebersicht;

    public Student() {
    	super();
	}

	public String getMatrNr() {
        return matrNr;
    }

    public void setMatrNr(String matrNr) {
        this.matrNr = matrNr;
    }

    public List<Fach> getFachliste() {
		return fachliste;
	}

	public void setFachliste(List<Fach> fachliste) {
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
    	String ausgabe = " Student: ";
    	//return super.toString();
    	return ausgabe + super.toString();
    }


}
