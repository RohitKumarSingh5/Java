import java.util.Set;
import java.util.TreeSet;

public class Assignment3Q1 {
    public static void main(String[] args){
        Person person1 = new Person("vamsi",160,60);
        Person person2 = new Person("amit",170,55);
        Person person3 = new Person("mohit",165,55);
        Person person4 = new Person("rohit",180,45);

        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);

        for(Person person:treeSet){
            System.out.println(person);
        }
    }
}
class Person implements Comparable<Person>{
    private String name;
    private int height;
    private double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if(this.weight == person.getWeight()){

            if(this.height == person.getHeight()){
                return 0;
            }else if(this.height > person.getHeight()){
                return 1;
            }else{
                return -1;
            }

        }else if(this.weight >person.getWeight()){

            return 1;
        }else{

            return -1;
        }
    }
}