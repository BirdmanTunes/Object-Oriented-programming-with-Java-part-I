package week5._087_ApartmentComparison;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        price = squareMeters * pricePerSquareMeter;
    }
    
	public boolean larger(Apartment otherApartment) {
		return squareMeters > otherApartment.squareMeters;
	}
	
	public int priceDifference(Apartment otherApartment) {
		if (price > otherApartment.price) {
			return price - otherApartment.price;
		} else if (otherApartment.price > price) {
			return otherApartment.price - price;
		} else {
			return 0;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	boolean moreExpensiveThan(Apartment otherApartment) {
		
		if (price > otherApartment.price)
			return true;
		else 
			return false;
	}
}
