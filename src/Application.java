class Brain{
	public Brain(){
		System.out.println("Thinking...");
	}
}


class Person{
	private Brain brain;
	private String name;
	public Person(){
		System.out.println("Contructor running.");
		
	}
	public Person(String name){
		//this.name is the instance variable
		// name is the parameter
		this.name = name;
		brain = new Brain();
		
		
	}
	public void writeName(){
		//note: no 'this' here. 'name' is
		// not ambiguous so we don't need this 
		System.out.println("My name is " + name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Application {

	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Person person = new Person("Topsy");
		String name = person.getName();
		name = name + " Delores";
		person.setName(name);
		
		person.writeName();

	}

}
