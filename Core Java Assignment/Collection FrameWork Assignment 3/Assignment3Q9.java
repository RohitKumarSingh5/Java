  
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class BankAccountList {
    private TreeSet<SavingAccount> savingAccounts = new TreeSet<>();

    public boolean addSavingAccount(SavingAccount savingAccount) {
        return savingAccounts.add(savingAccount);
    }

    public List<Integer> displaySavingAccountIds() {
        List<Integer> ids = new ArrayList<>();
        for(SavingAccount account:savingAccounts){
            ids.add(account.getAcc_ID());
        }
        return ids;
    }
}

class SavingAccount implements Comparable<SavingAccount>{
    private double acc_balance;
    private int acc_ID;
    private String accountHolderName;
    private boolean isSalaryAccount;

    public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_ID = acc_ID;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_ID() {
        return acc_ID;
    }

    public void setAcc_ID(int acc_ID) {
        this.acc_ID = acc_ID;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }



    @Override
    public int compareTo(SavingAccount o) {
        if(o.getAcc_ID() == this.getAcc_ID()){
            return 0;
        }else if(this.getAcc_ID() > o.getAcc_ID()){
            return 1;
        }
        return -1;
    }
}

public class Assignment3Q9 {
    public static void main(String[] args){}

}