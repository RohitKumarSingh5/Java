class ArmstrongOrNot {
public boolean armstrongCheck (int num)
{
	int temp,digit,sum=0;
	temp=num;
	while(num>0)
	{
		digit=num%10;
		num=num/10;
		sum=sum+(digit*digit*digit);
	}
	
	if (temp==sum)
	return true;
	else
	return false;
}
}

public class Assignment1Q1 {

	public static void main(String[] args) {
		
		int num;
		ArmstrongOrNot ob =new ArmstrongOrNot();
		System.out.print(ob.armstrongCheck(371));
	}

}

