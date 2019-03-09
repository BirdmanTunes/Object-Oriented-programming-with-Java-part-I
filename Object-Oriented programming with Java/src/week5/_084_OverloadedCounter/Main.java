package week5._084_OverloadedCounter;

public class Main {

	public static void main(String[] args) {
        Counter a = new Counter(1, true);

        a.decrease();
        System.out.println("Value of a after decrease: " + a.value());
        
        a.decrease();
        System.out.println("Value of a after decrease: " + a.value());
        
        a.decrease(3);
        System.out.println("Value of a after decrease: " + a.value());
        
        Counter b = new Counter(1);
        
        b.decrease();
        System.out.println("Value of b after decrease: " + b.value());
        
        b.decrease();
        System.out.println("Value of b after decrease: " + b.value());
        
        b.decrease(3);
        System.out.println("Value of b after decrease: " + b.value());
	}
}
