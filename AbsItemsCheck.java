
public abstract class AbsItemsCheck extends LibItem implements ILibrary {

	int timesOut;
	boolean isAvailable;
	
	public AbsItemsCheck(String title, String location, int timesOut, boolean isAvailable) {
		super(title, location);
		this.timesOut = timesOut;
		this.isAvailable = isAvailable;
	}
	
	public ILibrary checkIn() {
		this.isAvailable = true;
		return this;
	}
	
	public ILibrary checkOut() {
		this.isAvailable = false;
		this.timesOut++;
		return this;
	}
}
