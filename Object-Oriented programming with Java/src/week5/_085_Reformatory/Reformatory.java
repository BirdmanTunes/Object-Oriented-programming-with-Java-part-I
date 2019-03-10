package week5._085_Reformatory;

public class Reformatory {
	
	private int amountWeighted;

    public int weight(Person person) {
    	amountWeighted++;
       return person.getWeight();
    }
    
    public void feed(Person person) {
    	person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
    	return amountWeighted;
    }
}
