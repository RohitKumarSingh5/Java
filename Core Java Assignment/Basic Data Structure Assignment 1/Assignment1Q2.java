import java.util.*;
public class Assignment1Q2
{
  public static void main(String[] args) {
      ArmstrongNumBetweenRange a = new ArmstrongNumBetweenRange();

  int ar[] =  a.armstrongNumbersInRange(100,999);
System.out.println(Arrays.toString(ar));


  }
}
class ArmstrongNumBetweenRange
{
    public int[] armstrongNumbersInRange(int min, int max)
    {
        int num, i, rem, temp, count=0;
        int[] arr = new int[max-min];
       for(i=min+1; i<max; i++)
  {
     temp = i;
     num = 0;
     while(temp != 0)
     {
    rem = temp%10;
    num = num + rem*rem*rem;
    temp = temp/10;
     }
     if(i == num)
     {
    
       arr[count]=i;
       count++;
     }
  }
  int[] array= new int[count];
  for(int j=0;j<count;j++)
  {
      if(arr[j]==0)
      {
          continue;
      }
      else{
   array[j]= arr[j];  
      }
  }
  return array;
}
}