package de.i3a.univerwaltung.database;

public interface IPersistenzController {
	
	void insert(Object obj);
	void delete(Object obj);
	void update(Object obj);
	void search(Object obj);
	
	
}
