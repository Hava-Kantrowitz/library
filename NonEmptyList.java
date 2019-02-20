
public class NonEmptyList implements IList {
	String first;
	IList rest;
	
	NonEmptyList(String first, IList rest) {
		this.first = first;
		this.rest = rest;
	}
	
	public int countUses(Book ofBooks) {
		return 0;
	}
}
