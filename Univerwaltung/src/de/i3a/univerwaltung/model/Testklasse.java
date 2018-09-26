package de.i3a.univerwaltung.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import de.i3a.univerwaltung.database.IPersistenzController;
import de.i3a.univerwaltung.database.StudentPersistenzController;
import de.i3a.univerwaltung.factory.IFactory;
import de.i3a.univerwaltung.factory.PersonFactory;
import de.i3a.univerwaltung.factory.StudentFactory;

public class Testklasse {
    public static void main(String[] args) {
    	// Notenuebersicht
        
    	// Faecher erzeugen
        
        // Adressen erzeugen
        
        // Studenten erzeugen
        
        
    	StudentFactory studentFactory = new StudentFactory();
    	Student student1 = studentFactory.withMatriklnummer("123423").build();
    	student1 = studentFactory.withName("Mueller").build();
        
        
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
