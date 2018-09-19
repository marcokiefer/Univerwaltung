package de.i3a.univerwaltung.model;

import java.util.List;

public class Notenuebersicht {
    private List<Pruefung> pruefungsliste;

    public Notenuebersicht() {
    }

    public Notenuebersicht(List<Pruefung> pruefungsliste) {
        this.setPruefungsliste(pruefungsliste);
    }

	public List<Pruefung> getPruefungsliste() {
		return pruefungsliste;
	}

	public void setPruefungsliste(List<Pruefung> pruefungsliste) {
		this.pruefungsliste = pruefungsliste;
	}
}
