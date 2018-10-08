package de.i3a.univerwaltung.model;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private String vorname;
	private Date gebDatum;
	private Adresse adresse;
	private String titel;
	private String geschlecht;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getGebDatum() {
		return gebDatum;
	}

	public void setGebDatum(Date gebDatum) {
		this.gebDatum = gebDatum;
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
		String anrede = "weiblich".equalsIgnoreCase(geschlecht) ? "Frau" : "Herr";
		return "Ich bin " + anrede + " " + name + ", " + vorname + " aus " + adresse.getOrt();
	}
}
