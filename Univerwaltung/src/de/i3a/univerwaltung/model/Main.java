package de.i3a.univerwaltung.model;

import javax.swing.plaf.multi.MultiButtonUI;

import de.i3a.univerwaltung.database.StudentPersistenzController;
import de.i3a.univerwaltung.factory.PersonFactory;
import de.i3a.univerwaltung.factory.StudentFactory;

public class Main {
    public static void main(String[] args) {
  
    	StudentPersistenzController controller = new StudentPersistenzController();
    	    		
    	StudentFactory studentFactory = new StudentFactory();
    	Student stud1 = studentFactory.withName("mueller").withMatrikelnummer("12345").build();
    	
    	
    	
    }


}
