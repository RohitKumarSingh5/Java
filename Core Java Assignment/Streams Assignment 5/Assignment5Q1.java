  
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5Q1 {
    public static List<String> reverseSort(ArrayList<Fruit> fruits) {
        List<String> f = new ArrayList<>();

        fruits.stream().filter(x->x.getCalories()<100).sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
                .collect(Collectors.toList())
                .forEach(x-> f.add(x.getName()));

        return f;


    }

    public static ArrayList<Fruit> sort(ArrayList<Fruit> Fruits) {

        Fruits = (ArrayList<Fruit>) Fruits.stream().sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toList());
        return Fruits;
    }

    public static ArrayList<Fruit> filterRedSortPrice(ArrayList<Fruit> fruits){
        fruits = (ArrayList<Fruit>) fruits.stream().filter(x-> x.getName().equals("RED"))
                .sorted(Comparator.comparingInt(Fruit::getPrice))
                .collect(Collectors.toList());
        return fruits;
    }


    public static void main(String[] args) {}
}
class Fruit {
    private String name;
    private int calories;
    private int price;
    private String color;

    public Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}