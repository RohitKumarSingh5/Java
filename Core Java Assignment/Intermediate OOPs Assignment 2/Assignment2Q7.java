  
public class Assignment2Q7 {

    public static void main(String[] args) {}
    private void selectRoles(){

    }
    private void roles(String role){

    }
    private void addItems() {

    }
    private void addItemsOperation(int choice) {}
    private void placeOrder() {}
    private void placeOrderOperation(int choice) {}
}
public class Candy extends DesertItem{
    private int candies = 0;
    public int addCandies(int candies){
        this.candies +=candies;
        return this.candies;
    }

    @Override
    public int getCost() {
        return candies*60;
    }
}
public class Cookie extends DesertItem{
    private int cookies=0;

    public int addCookies(int candies){
        this.cookies += candies;
        return cookies;
    }

    @Override
    public int getCost() {
        return cookies*70;
    }
}
public abstract class DesertItem {
    abstract public int getCost();
}
public class IceCream extends DesertItem{
    private int iceCreams=0;

    public int addIceCreams(int candies){
        this.iceCreams += candies;
        return iceCreams;
    }

    @Override
    public int getCost() {
        return iceCreams;
    }
}