package de.i3a.univerwaltung.model;

import java.util.Date;

public class Pruefung {
    private int id;
    private Fach fach;
    private Date datum;
    private double Ergebis;
    private Student student;

    public Pruefung(int id, Fach fach, Date datum, double ergebis, Student student) {
        this.id = id;
        this.fach = fach;
        this.datum = datum;
        Ergebis = ergebis;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public Fach getFach() {
        return fach;
    }

    public Date getDatum() {
        return datum;
    }

    public double getErgebis() {
        return Ergebis;
    }

    public void setErgebis(double ergebis) {
        Ergebis = ergebis;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
