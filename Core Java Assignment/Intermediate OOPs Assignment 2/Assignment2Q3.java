import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        return totalDeposits - creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        return totalDeposits + fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public static int totalCashInBank(ArrayList<Integer> cash){
        int sum = 0;
        for(int i: cash){
          sum = sum + i;  
        }
        return sum;
    }
    public int getCash(){
        return 0;
    }
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount();
        SavingsAccount sa = new SavingsAccount();
        ArrayList<Integer> amount = new ArrayList<Integer>();
        amount.add(ca.getCash());
        amount.add(sa.getCash());
        System.out.println(totalCashInBank(amount));
    }
}