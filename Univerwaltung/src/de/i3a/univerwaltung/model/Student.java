package de.i3a.univerwaltung.model;

import java.util.List;

public class Student extends Person {
	private String matrikelnummer;
	private List<Fach> faecher;
	private Notenuebersicht notenuebersicht;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public List<Fach> getFaecher() {
		return faecher;
	}

	public void setFaecher(List<Fach> faecher) {
		this.faecher = faecher;
	}

	public Notenuebersicht getNotenuebersicht() {
		return notenuebersicht;
	}

	public void setNotenuebersicht(Notenuebersicht notenuebersicht) {
		this.notenuebersicht = notenuebersicht;
	}

	
}
