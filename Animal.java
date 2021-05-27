
public class Animal{

	String name;
	int age;
	boolean HasOwnwer;
	
	public Animal(){
		name = "";
		age = 0;
		hasOwnwer = false;
	}
	
	public void setValues(String n, int a, boolean h){
		name = n;
		age = a;
		hasOwnwer = h;
	}
	
	public void display(){
		System.out.println("the name is " + name + "the age is " + age + "has owner status " + hasOwner);
	}











}