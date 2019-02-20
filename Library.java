import java.util.LinkedList;

/**
 * A library of books
 * @author havak
 *
 */

public class Library {
	
	LinkedList<LibItem>holdings = new LinkedList<LibItem>();
	
	public Library(LinkedList<Book>holdings) {
		this.holdings = new LinkedList<LibItem>();
	}
	
	LibItem findByTitle(String title) {
		for (LibItem anItem : this.holdings) {
			if (anItem.title.equals(title)) {
				return anItem;
			}
		}
		
		return null;
		
	}


}
