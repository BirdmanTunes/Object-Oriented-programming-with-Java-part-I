package week5._086_LyyraCardAndCashRegister;

public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        cashInRegister = 1000;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
    	if (sum > 0) {
    		card.loadMoney(sum);
    		cashInRegister += sum;
    	}
    }

    public double payEconomical(double cashGiven) {
    	if (cashGiven >= 2.50) {
    		economicalSold++;
    		cashInRegister += cashGiven - (cashGiven - 2.50);
    		return cashGiven - 2.50;
    	} else {
    		return 0;
    	}
    }

    public double payGourmet(double cashGiven) {
    	if (cashGiven >= 4.00) {
    		gourmetSold++;
    		cashInRegister += cashGiven - (cashGiven - 4.00);
    		return cashGiven - 4.00;
    	} else {
    		return 0;
    	}
    }
    
    public boolean payEconomical(LyyraCard card) {
    	if (card.pay(2.50)) {
    		economicalSold++;
    		return true;
    	} else {
    		return false;
    	}
    }

    public boolean payGourmet(LyyraCard card) {
    	if (card.pay(4.00)) {
    		gourmetSold++;
    		return true;
    	} else {
    		return false;
    	}
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}