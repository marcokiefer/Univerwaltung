package de.i3a.univerwaltung.model;

import java.util.List;

public class Dozent extends Person{
    private String mitarbeiterNr;
    private List<Fach> fachliste;
    private String grad;

    public Dozent() {
		super();
	}

    public String getMitarbeiterNr() {
        return mitarbeiterNr;
    }

    public void setMitarbeiterNr(String mitarbeiterNr) {
        this.mitarbeiterNr = mitarbeiterNr;
    }

    public List<Fach> getFachliste() {
		return fachliste;
	}

	public void setFachliste(List<Fach> fachliste) {
		this.fachliste = fachliste;
	}

	public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }
}
