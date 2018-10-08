package de.i3a.univerwaltung.database;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import de.i3a.univerwaltung.factory.AdresseFactory;
import de.i3a.univerwaltung.factory.PersonFactory;
import de.i3a.univerwaltung.factory.StudentFactory;
import de.i3a.univerwaltung.model.Adresse;
import de.i3a.univerwaltung.model.Person;
import de.i3a.univerwaltung.model.Student;
import de.i3a.univerwaltung.utils.DateHelper;

public class DummyDb {

	private List<Student> studenten = new ArrayList<>();

	private List<Person> personen = new ArrayList<>();

	private List<Adresse> adressen = new ArrayList<>();

	public void init() {
		String datumsFormatPattern = "dd.MM.yyyy";
		Date geburtsdatum = DateHelper.parseDate("01.01.1993", datumsFormatPattern);

		AdresseFactory adresseFactory = new AdresseFactory();
		Adresse adresse = adresseFactory.withHausnummer("40 a").withStrasse("Muenchner Strasse").withId(1)
				.withOrt("Muenchen").withPlz("80335").build();

		PersonFactory personFactory = new PersonFactory();
		Person person = personFactory.withId(1).withName("Mueller").withVorname("Thomas").withGeburtsdatum(geburtsdatum)
				.withAdresse(adresse).build();

		StudentFactory studentFactory = new StudentFactory();
		addStudent(studentFactory.withId(1).withMatrikelnummer("12345678").build());

		addPerson(person);
		addAdresse(adresse);
	}

	public void addStudent(Student student) {
		this.studenten.add(student);
	}

	public void addPerson(Person person) {
		this.personen.add(person);
	}

	public void addAdresse(Adresse adresse) {
		this.adressen.add(adresse);
	}

	public List<Student> getStudenten() {
		return studenten;
	}

	public List<Person> getPersonen() {
		return personen;
	}

	public List<Adresse> getAdressen() {
		return adressen;
	}

}
