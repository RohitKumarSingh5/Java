import java.util.Scanner;

public class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter userId");
	    String user = sc.nextLine();
	    System.out.println("Enter password");
	    String pass = sc.nextLine();
	    sc.close();
	    Login ob =new Login();
	    ob.loginUser(user, pass);

	}

}

class Login {
	
    int count=0;
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) 
    {
    	if(userId == user && password ==pass)
    	{
    		return "Welcome"+userId;
    	}
    	else
    	{ 
    		count++;
    		if(count>=3)
    		{
    			System.out.println("You have entered wrong credentials"+count+"times");
    			System.out.println("Contact Admin");
    		}
    		return ("You have entered wrong credentials ,please enter the right credentials.");
        }
    	
    	
}
}
