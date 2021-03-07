import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        return transactions.stream()
                .filter(x-> x.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        List<Integer> values = new ArrayList<>();

        transactions.stream()
                .filter(x-> x.getTrader().getCity().equals("Delhi"))
                .forEach(x-> values.add(x.getValue()));

        return values;
    }
    public static int highestTransaction(List<Transaction> transactions){
        return transactions.stream().max(Comparator.comparingInt(Transaction::getValue)).get().getValue();
    }

    public static int smallestTransaction(List<Transaction> transactions){
        return transactions.stream().min(Comparator.comparingInt(Transaction::getValue)).get().getValue();
    }

    public static void main(String[] args) {}
}
class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
class Transaction {
    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }
}