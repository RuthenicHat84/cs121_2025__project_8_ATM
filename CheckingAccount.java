// CheckingAccount.java

public class CheckingAccount implements HasMenu {


    CheckingAccount(){
        double balance = 0;
    }
    CheckingAccount(double balance){
        double balance = balance;
    }

    public static void main(String[] args){


    }

    String[] menu(){
        
    }

    void start(){

    }

    double getBalance(){
        return balance;
    }

    String[] getBalString(){
        return Str(balance);
    }

    void setBalance(double balance){
        double balance = balance; 
    }

    void checkBalance(){
        return balance;
    }

    private double getDouble(){
        // fill later
    }

    void makeDeposit(){
        menu();
        try{
            balance += userIn;
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }

    void makeWithdrawl(){
        menu();
        try{
            balance -= userIn;
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());

        }
    }
}