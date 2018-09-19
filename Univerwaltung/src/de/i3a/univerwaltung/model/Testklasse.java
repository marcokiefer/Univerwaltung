package de.i3a.univerwaltung.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import de.i3a.univerwaltung.factory.IFactory;
import de.i3a.univerwaltung.factory.PersonFactory;

public class Testklasse {
    public static void main(String[] args) {
    	Date date = new Date(1982,3,12);
    	// Notenuebersicht
        Notenuebersicht notenuebersicht = new Notenuebersicht();
    	
    	// Faecher erzeugen
    	Fach fachDeutsch = new Fach(1, "Deutsch"); 
        Fach fachMathe = new Fach(23, "Mathe");
        Fach fachInformatik = new Fach(2, "Informatik");
        
        // Adressen erzeugen
        Adresse adresse = new Adresse(23, "Beispielstrasse", 12, "8542", "Muenchen");
        Adresse adresseMax = new Adresse(1, "Beispielstrasse", 12, "8542", "Muenchen");
        Adresse adresseMichi = new Adresse(2, "Hauptstraße", 12, "8542", "Muenchen");
        
        // Studenten erzeugen
        Student student = new Student(23, "Mueller","Thomas", date, adresse,"",null,"C432", fachMathe ,notenuebersicht);
        Student student2 = new Student(1, "Müller", "Max", new Date(1980,2,13), adresseMax , "Dr", "maennlich", "DE-001", fachDeutsch , notenuebersicht);
        Student student3 = new Student(2, "Singeberg", "Michi", new Date(1987,4,1), adresseMichi , "", "maennlich", "DE-002", fachInformatik , notenuebersicht);
        
        PersonFactory personFactory = new PersonFactory();
        Person studentMichi =  personFactory.withName("Test").withVorname("Michi").build();
        
        
        // Datumformat
        String pattern = "dd.MM.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        try {
			simpleDateFormat.parse("01.02.2010");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        // Pruefung erzeugen
        System.out.println("****************");
        System.out.println(student.toString());
        
    }
}
