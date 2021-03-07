import java.util.Scanner;
class SiCi {
 
    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
    	return ((principalAmount * time * interestRate)/100);
    }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
    	return (principalAmount * (Math.pow((1 + interestRate/100), (time))) - principalAmount);
    }
	
}
public class Assignment1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,r;
		int t;
      Scanner sc = new Scanner(System.in);
      p=sc.nextDouble();
      r=sc.nextDouble();
      t=sc.nextInt();
      sc.close();
      SiCi ob = new SiCi();
      System.out.println(ob.simpleInterest(p,t,r));
      System.out.println(ob.compoundInterest(p,t,r));
      
	}

}