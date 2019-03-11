package week6._095_Money;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + " €";
    }
    
    public Money plus(Money added) {
    	return added = new Money(euros + added.euros, cents + added.cents);
    }
    
    public Money minus(Money decremented) {
    	if (this.less(decremented))
    		return decremented = new Money(0,0);
    	else
    		return decremented = new Money(euros - decremented.euros, cents - decremented.cents);
    		
    }
    
    public boolean less(Money compared) {
    	if (this.euros < compared.euros) {
    		return true;
    	} else if (this.euros == compared.euros && this.cents < compared.cents) {
    		return true;
    	} else {
			return false;
		}
    }
}
