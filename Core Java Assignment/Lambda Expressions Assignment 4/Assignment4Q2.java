import java.util.ArrayList;

public class Assignment4Q2 {
    private int totalPrice;
    private String status;

    public Assignment4Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Assignment4Q2{" +
                "totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                '}';
    }

    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {
        ArrayList<Assignment4Q2> list = new ArrayList<>();

        for(Assignment4Q2 a:orders){
            if(a.getTotalPrice() > 10000 && a.getStatus().equals("ACCEPTED") || a.getStatus().equals("COMPLETED")){
                list.add(a);
                System.out.println(a);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Assignment4Q2 o1 = new Assignment4Q2(100001,"ACCEPTED");
        Assignment4Q2 o2 = new Assignment4Q2(100002,"COMPLETED");

        ArrayList<Assignment4Q2> l = new ArrayList<>();
        l.add(o1);
        l.add(o2);

        ArrayList<Assignment4Q2> q = listOfOrders(l);

        for(int i=0; i<l.size();i++){
            System.out.println(l.get(i));
            System.out.println(q.get(i));
            System.out.println("new line");
        }


    }
}