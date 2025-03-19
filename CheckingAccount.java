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
        System.out.println("Checking Account\n\
        0) quit\n\
        1) checking balance\n\
        2) make a deposit\n\
        3) make a withdrawl")

        Scanner input = new Scanner(System.in);
        String selection = input.nextLine();

        if(selection = "0"){
            
        }
    }

    void start(){

    }

    double getBalance(){
        return this.balance;
    }

    String[] getBalString(){
        String result = String.format("$%.02f", this.balance);
        return result;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    void checkBalance(){
        return this.getBalString();
    }

    private double getDouble()){
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert amount to deposit/withdrawl: ");
        String sResult = input.nextLine();
        double result = 0d;
        try{
            result.parseDouble(sResult);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    void makeDeposit(){
        double deposit = getDouble();
        this.balance += deposit;
        System.out.println("\nNew Balance: " + getBalString());
    }

    void makeWithdrawl(){
            double withdrawl = getDouble();
            if(this.balance - withdrawl < 0){
                System.out.println("Try not to have a negative balance. not a good practice.");
            }
            else{
                this.balance -= withdrawl;
                System.out.println("\nNew Balance: " + getBalString());
            }

    }
}