package de.i3a.univerwaltung.persistenz;

public interface IPersistenzController {
	
	void insert(Object obj);
	void delete(Object obj);
	void update(Object obj);
	void search(Object obj);
	
	
}
