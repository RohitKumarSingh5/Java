import java.util.Scanner;
import java.io.*;

public class Assignment1Q5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
TaxAmount ob=new TaxAmount();
int ctc;
Scanner sc= new Scanner(System.in);
ctc=sc.nextInt();
sc.close();
System.out.println(ob.calculateTaxAmount(ctc));
	}

}
class TaxAmount {
	public double calculateTaxAmount(int ctc)
	{
		if(ctc>=0 && ctc<=180000 )
		{
		
		System.out.println("Nil");
		
		}
		if(ctc>=181001 && ctc<=300000)
		{
			return ((ctc*10)/100);
		}
		if(ctc>=300001 && ctc<=500000)
		{
			return ((ctc*20)/100);
		}
		if(ctc>= 500001 && ctc<=1000000)
		{
			return ((ctc*30)/100);
		}
		else
		{
			return 0;
		}
	}
}
