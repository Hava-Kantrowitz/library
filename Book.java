import java.util.LinkedList;

public class Book extends AbsItemsCheck{
	
	public Book (String title, String location, int timesOut, boolean isAvailable) {
		super(title, location, timesOut, isAvailable);
	}
	
	LinkedList<AbsItemsCheck>test = new LinkedList<AbsItemsCheck>();
	LinkedList<Double>hi = new LinkedList<Double>();
	
	
	public double lateFee(int numDaysOverdue) {
		return .25 * numDaysOverdue;
	}

}
