package week3._077_LyyraCard;

public class LyyraCard {
	
    private double balance;

    public LyyraCard(double balanceAtStart) {
    	this.balance=balanceAtStart;
    }
    
    public void payEconomical() {
    	if (balance >= 2.50)
        	balance -= 2.50;
    }

    public void payGourmet() {
    	if (balance >= 4.00)
        	balance -= 4.00;
    }
    
    public void loadMoney(double amount) {
    	if (amount >=0)
    		balance += amount;
        if (balance > 150)
        	balance = 150;
    }

    public String toString() {
        return "The card has " + balance + " euros.";
    }
}