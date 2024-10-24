package oops;



class Student2{
	String name;
	int age;
	public void printInfo(String name) {
		
		System.out.println(name);
	}
	
	public void printInfor(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name +" " +age);
		
	}
}
public class polymorphism {

	public static void main(String[] args) {
		Student2 s1=new Student2();
		s1.name="shahil";
		s1.age=24;
		
//		s1.printInfo(s1.name, s1.age);
		
		s1.printInfo(s1.name, s1.age);

	}

}
