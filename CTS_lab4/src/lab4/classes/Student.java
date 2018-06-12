package lab4.classes;

public class Student {
	int age;
	String name;
	
	public static final int LOWER_AGE_LIMIT = 10;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws BadAgeException{
		if(age < LOWER_AGE_LIMIT)
			throw new BadAgeException();
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
