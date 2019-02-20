
public class DVD extends AbsItemsCheck{
	
	public DVD(String title, String location, int timesOut, boolean isAvailable) {
		super(title, location, timesOut, isAvailable);
	}
	
	public double lateFee(int numDaysOverdue) {
		if (numDaysOverdue <= 3) {
			return 5;
		}
		
		return 20;
	}


}
