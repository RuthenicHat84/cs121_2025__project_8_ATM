// CheckingAccount.java

public class CheckingAccount implements HasMenu {

    CheckingAccount(){
        this.balance = 0;
    }
    CheckingAccount(double balance){
        this.balance = balance;
    }

    public static void main(String[] args){


    }

    String[] menu(){
        HasMenu.menu();
    }

    void start(){
        HasMenu.start();
    }

    double getBalance(){
        return this.balance;
    }

    String[] getBalString(){
        return Str(this.balance);
    }

    void setBalance(double balance){
        this.balance = balance; 
    }

    void checkBalance(){
        return this.getBalString();
    }

    private double getDouble(){
        Scanner input = new Scanner(System.in);
        String sResult = input.nextLine();
        double result = 0d;
        try{
            double.parseDouble(sResult);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void makeDeposit(){
        try{
            this.balance += userIn;
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }

    void makeWithdrawl(){
        try{
            this.balance -= userIn;
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());

        }
    }
}