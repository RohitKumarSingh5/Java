

import java.util.Scanner;

@FunctionalInterface
interface Arithmetic{
    double operate(int a, int b);
}


public class Assignment4Q1 {

    public double addition(int num1,int num2){
        Arithmetic additionObj = (a, b) -> (a+b);
        return additionObj.operate(num1, num2);
    }

    public double subtraction(int num1,int num2){
        Arithmetic subtractionObj = (a, b) -> (a-b);
        return subtractionObj.operate(num1, num2);
    }

    public double multiplication(int num1,int num2){
        Arithmetic multiplicationObj = (a, b) -> (a*b);
        return multiplicationObj.operate(num1, num2);
    }

    public double division(int num1, int num2){
        Arithmetic divisionObj = (a,b) -> (a/b);
        return divisionObj.operate(num1, num2);
    }
    public static void main(String[] args) {
        int x,y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        Assignment4Q1 assignment4Q1 = new Assignment4Q1();
        System.out.println("Addition = "+assignment4Q1.addition(x, y));
        System.out.println("Subtraction = "+assignment4Q1.subtraction(x, y));
        System.out.println("Multiplication = "+assignment4Q1.multiplication(x, y));
        System.out.println("Division = "+assignment4Q1.division(x, y));


    }
}
