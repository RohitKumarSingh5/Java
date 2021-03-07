import java.util.ArrayList;
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}

public class Assignment2Q2 {
    static int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int sum = 0;
        for(int i : employeeSalaries){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        Labour l = new Labour();
        ArrayList<Integer> salaryList = new ArrayList<Integer>();
        salaryList.add(m.getSalary(salary));
        salaryList.add(l.getSalary(salary));
        System.out.println(totalEmployeesSalary(salaryList));
    }
}