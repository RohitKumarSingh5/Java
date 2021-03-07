import java.util.*;
public class Assignment3Q3{
  public static List traverseReverse(ArrayList aList)
  {
  Collections.reverse(aList); 
  return aList;
  }
  public static void main(String[] args)
  {
   Assignment3Q3 a = new Assignment3Q3();
   ArrayList<String> al = new ArrayList<String>();
     al.add("A"); 
        al.add("B"); 
        al.add("C"); 
        al.add("D"); 
  System.out.println(a.traverseReverse(al));
  }
}