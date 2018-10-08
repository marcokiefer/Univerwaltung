package de.i3a.univerwaltung.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.i3a.univerwaltung.database.IStudentPersistenzController;
import de.i3a.univerwaltung.database.StudentPersistenzController;
import de.i3a.univerwaltung.model.Student;
import org.junit.Assert;
import org.junit.Before;

public class StudentPersistenzControllerTest {
	IStudentPersistenzController underTest;
	
	@Before
	public void setUp() throws Exception{
		underTest = new StudentPersistenzController();
	}
	
	@Test
	public void testSelectByIdWithWrongIdResultIsNull() {
		int id = -1;
		Student result = underTest.selectById(id);
		Assert.assertTrue(result == null);
	}
	
	@Test
	public void testSelectByIdWithWrongIdResultIsNotNull() {
		int id = 1;
		Student result = underTest.selectById(id);
		Assert.assertTrue(result != null);
	}
	

	@Test
	public void testSelectByMatrikelnummer() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectByNameVorname() {
		fail("Not yet implemented");
	}
}
