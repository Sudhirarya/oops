package oops;


 abstract class Animal{
	 
	 abstract void walk();
	
 }
 
 
 class Horse extends Animal{

	
	void walk() {
		// TODO Auto-generated method stub
		
		System.out.println("walk on 4 legs");
	
		
	}
 }
 
 
 class Chicken extends Animal{
	 public void walk() {
		 System.out.println("walk on 2 legs");
	 }
 }
public class abstr {

	public static void main(String[] args) {
		
 Horse horse=new Horse();
 horse.walk();
	}

}
