package de.i3a.univerwaltung.model;

import java.util.Date;

public class Pruefung {
    private int id;
    private Fach fach;
    private Date datum;
    private double ergebnis;
    private Student student;

    public Pruefung(int id, Fach fach, Date datum, double ergebnis, Student student) {
        this.id = id;
        this.fach = fach;
        this.datum = datum;
        this.ergebnis = ergebnis;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fach getFach() {
        return fach;
    }

    public void setFach(Fach fach) {
        this.fach = fach;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(double ergebnis) {
        this.ergebnis = ergebnis;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
