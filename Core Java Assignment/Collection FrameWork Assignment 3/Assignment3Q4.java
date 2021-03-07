import java.util.*;

public class Assignment3Q4 {

    public String getEmployee(HashMap<DateClass, String> dob, String employeeName){
 
        List<DateClass> list = new ArrayList<>();
        DateClass neededClass =null;
        for(Map.Entry pairEntry:dob.entrySet()){
            if(pairEntry.getValue().equals(employeeName)){
                DateClass dateClass =(DateClass) pairEntry.getKey();
                neededClass = dateClass;
                continue;
            }

            DateClass dateClass =(DateClass) pairEntry.getKey();
            list.add(dateClass);
            System.out.println(pairEntry.getValue());

        }
        System.out.println(employeeName);


        for(DateClass dateClass:list){
            System.out.println(dateClass);
        }
  
        for(int i=0; i<list.size();i++){
            if(list.get(i).getDate()==neededClass.getDate() && list.get(i).getMonth()==neededClass.getMonth() && list.get(i).getYear() != neededClass.getYear()){
                return "get method fails";
            }
        }

        return employeeName;
    }
    public static void main(String[] args) {}
}
public class DateClass {
    private int date;
    private int month;
    private int year;

    public DateClass(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DateClass{" +
                "date=" + date +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}