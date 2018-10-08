package de.i3a.univerwaltung.model;

import java.util.List;

public class Dozent extends Person {
    private int mitarbeiterNummer;
    private List<Fach> unterrichtsFaecher;
    private String grad;

    public Dozent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMitarbeiterNummer() {
		return mitarbeiterNummer;
	}

	public void setMitarbeiterNummer(int mitarbeiterNummer) {
		this.mitarbeiterNummer = mitarbeiterNummer;
	}

	public List<Fach> getUnterrichtsFaecher() {
		return unterrichtsFaecher;
	}

	public void setUnterrichtsFaecher(List<Fach> unterrichtsFaecher) {
		this.unterrichtsFaecher = unterrichtsFaecher;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	

}
