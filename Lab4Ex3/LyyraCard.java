import java.nio.file.AtomicMoveNotSupportedException;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart ;
    }

    public String toString() {
        // write code here
        ///String poruka = "The card has" X euros" ;
        return "The card has " + String.valueOf(balance) + " euros" ;
    }

    public void payEconomical() {
        // write code here
        if(this.balance < 2.50 ) return ;
        this.balance = this.balance - 2.50 ;
        
        
    }
    
    public void payGourmet() {
        // write code here
        if(this.balance < 4.00) return ;

        this.balance = this.balance  - 4.00 ;
    }
    
    public void loadMoney(double amount) {
        // write code here
        if(amount < 0) return ;
        if(isBalanceOver(amount)) this.balance = 150;
        else this.balance += amount;
    }

    private boolean isBalanceOver(double amount){
        if(this.balance + amount > 150) return true ;
        else return false ;


    }
    
    
}

