package homework6;

public class Person {

	String name;
	String family;
	int age;
	
	protected Person(){
		this.name = "";
		this.family = "";
		this.age = 0;
		
	}
	
	protected Person(String name,String family, int age){
		this.name = name;
		this.family = family;
		this.age = age;
	}
	
	

}
