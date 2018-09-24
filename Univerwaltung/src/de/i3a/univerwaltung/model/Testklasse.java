package de.i3a.univerwaltung.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import de.i3a.univerwaltung.factory.IFactory;
import de.i3a.univerwaltung.factory.PersonFactory;
import de.i3a.univerwaltung.factory.StudentFactory;
import de.i3a.univerwaltung.persistenz.IPersistenzController;
import de.i3a.univerwaltung.persistenz.StudentPersistenzController;

public class Testklasse {
    public static void main(String[] args) {
    	Date date = new Date(1982,3,12);
    	// Notenuebersicht
        
    	
    	// Faecher erzeugen
    	
        
        // Adressen erzeugen
        
        
        // Studenten erzeugen
        
        
        PersonFactory personFactory = new PersonFactory();
        Person studentMichi =  personFactory.withName("Test").withVorname("Michi").build();
        
        IPersistenzController co = new StudentPersistenzController();
        StudentFactory studentFactory = new StudentFactory();
        
        Student student = studentFactory.withMatriklnummer("123458").build();
		co.search(student);
        
        
        // Datumformat
        //String pattern = "dd.MM.yyyy";
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        //try {
		//	simpleDateFormat.parse("02.05.1986");
		//} catch (ParseException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
       
        // Pruefung erzeugen
        System.out.println("****************");
        
        
    }
}
