package oops;



class Student1 {
	
	String name;
	int age;
	
	public void printInfo() {
		
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	
	// this is a arguments constructors 
	
//	 Student1 (String name, int age){
//		 
//		 this.name=name;
//		 this.age=age;
//		  
//	 }
	 
	
	//this is copy constructors 
	
	 Student1( Student1 s2){
		 this.name=s2.name;
		 this.age=s2.age;
	 }
	 
	 Student1(){
		 
	 }
}
public class Constructors {

	public static void main(String[] args) {
		
Student1 s1= new Student1();

s1.name="aman";
s1.age=23;



Student1 s2=new Student1(s1);



s1.printInfo();
	}

}
