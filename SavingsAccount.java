// SavingsAccount.java
class SavingsAccount extends CheckingAccount{

    double interestRate = .05d;

    public static void main(){
        return void
    } // end main

    public void calcInterestRate(){
        double rate = getInterestRate();
        this.balance += (this.balance * rate);
    }

    void setInterestRate(){
        ;
        this.interestRate = rate;
    }

    double getIntrestRate(){
        return this.interestRate;
    }
}