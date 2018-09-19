package de.i3a.univerwaltung.model;

import java.util.Date;

public class Dozent extends Person{
    private String mitarbeiterNr;
    private Fach fachliste;
    private String grad;

    public Dozent(int ID, String name, String vorname, Date geburtsdatum, Adresse adresse, String titel, String geschlecht, String mitarbeiterNr, Fach fachliste, String grad) {
        super(ID, name, vorname, geburtsdatum, adresse, titel, geschlecht);
        this.mitarbeiterNr = mitarbeiterNr;
        this.fachliste = fachliste;
        this.grad = grad;
    }

    public Dozent(String mitarbeiterNr, Fach fachliste, String grad) {
        this.mitarbeiterNr = mitarbeiterNr;
        this.fachliste = fachliste;
        this.grad = grad;
    }

    public String getMitarbeiterNr() {
        return mitarbeiterNr;
    }

    public void setMitarbeiterNr(String mitarbeiterNr) {
        this.mitarbeiterNr = mitarbeiterNr;
    }

    public Fach getFachliste() {
        return fachliste;
    }

    public void setFachliste(Fach fachliste) {
        this.fachliste = fachliste;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }
}
