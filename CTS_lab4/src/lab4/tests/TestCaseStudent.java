package lab4.tests;

import junit.framework.TestCase;
import lab4.classes.BadAgeException;
import lab4.classes.Student;

public class TestCaseStudent extends TestCase {

	//TestCase fixture 
	Student student;
	public static final int INITIAL_AGE = 21;
	public static final String INITIAL_NAME = "Albert";
	
	public TestCaseStudent(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception{
		super.setUp();
		
		student = new Student(INITIAL_AGE, INITIAL_NAME);
		System.out.println("Student created...");
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
		
		student = null;
		System.out.println("Student destroyed...");
	}
	
	//testing the getter and setter for age
	public void testSetAgeNormalValues() throws BadAgeException{
		int newAge=19;
		student.setAge(newAge);
		
		int actualAge=student.getAge();
		
		assertEquals(newAge, actualAge);
	}
	
	//testing the correct input for age setter
	
	public void testSetAgeLowerLimitValue() {
		int newAge = Student.LOWER_AGE_LIMIT;
		
		try {
			student.setAge(newAge);
			assertEquals("Testing the boundary limits", Student.LOWER_AGE_LIMIT, student.getAge());
		} catch(Exception e) {
			fail("setAge method is throwing an exception for minimum accepted value");
		}
	}
	
	public void testSetAgeBadValues() {
		int newAge=-20;
		
		try {
			student.setAge(newAge);
			fail("setAge does not throw an exception");
		} catch(BadAgeException e) {
			assertTrue(true);
		} catch(Exception e) {
			fail("setAge is throwing a different exception");
		}
	}
	
}
