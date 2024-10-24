package bank;

class Account{
	
	public String name;
	protected String email;
	private String password;
	public String setPassword;
	public char[] getPassword;
	
	// getter &setter
	
	public String getPassword() {
		return this.password;
		
	}
	
	public String setPassword(String pass) {
		
		return this.password=pass;
	}
}
 
 
 
 
 
 
public class bank {
	
	public static void main(String args[]) {
		
		Account account1=new Account();
		account1.name="sudhir";
		account1.email="4Achievers";
		account1.setPassword=("abcd");
		
		System.out.println(account1.getPassword);
		
	}

}
