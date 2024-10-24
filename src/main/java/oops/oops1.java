package oops;



class pen{
	
	String color;
	public String type;
	
	
	public void write() {
		
		System.out.println("write somethings");
	}
	
	public void printColor() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
	
}

//2nd example 
	
	class Student{
		
		String name;
		int age;
	
		
		public void printInfo() {
			
			System.out.println(this.name);
			System.out.println(this.age);
		}
		
		
	}
	
	

public class oops1 {

	public static void main(String[] args) {
		
 pen pen1= new pen();
 
 pen1.color="blue";
 pen1.type="gel";
 
 pen pen2=new pen();
 pen2.color="black";
 pen2.type="ballpoin";
 
 pen1.printColor();
 pen2.printColor();
 

 Student s1= new Student();
 
 s1.name="sudhir";
 s1.age=21;
 
 s1.printInfo();
 
	}

}
