package lab4.tests;

import junit.framework.TestCase;
import lab4.classes.Course;

public class TestCaseCourse extends TestCase {

	//fixture = defining an object of Course type
	Course course;
	
	public TestCaseCourse(String name) {
		super(name);
	}
	
	
	protected void setUp() throws Exception{
		super.setUp();
		
		int[] grades = {6,8,9};
		course = new Course(grades);
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
	}
	
	/*
	 * Testing the getCourseAverage() method from the Course class
	 * In JUnit3, each test method must start with the 'test' key-word
	 */
	public void testCourseAverageInitialValues() {
		float expectedAverage = 23.0f/3;
		
		// 23.0f is a float value. float/int => float, meaning that the average has the expected value (and the expected type).
		
		float actualAverage = course.getCourseAverage();
		
		assertEquals(expectedAverage, actualAverage, 0); 
		
	}
	
}
