import java.util.Scanner;

public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        sc.close();
		ResultDeclaration ob= new ResultDeclaration();
		System.out.print(ob.declareResults(a,b,c));
	}

}

class ResultDeclaration {
	  public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
	  {
		 int count=0;
		  if(subject1Marks>60)
		  {
			  count++;
		  }
		  if(subject2Marks>60)
		  {
			  count++;
		  }
		  if(subject3Marks>60)
		  {
			  count++;
		  }
		  if(count==3)
		  {
			  return "passed";
		  }
		  else if(count==2)
		  {
			  return "promoted";
		  }
		  else
		  {
			  return "failed";
		  }

	  }
}

