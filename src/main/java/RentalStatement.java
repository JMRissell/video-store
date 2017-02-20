import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {
	Collection<Rental> rentals = new ArrayList<>();

	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}

	public void print() {
		for (Rental r : rentals) {
			System.out.println("Your rented: " + r.getTitle() + " a " + r.getPriceCode() + " for " + r.days + " days."
					+ " You owe: " + r.calculateFees() + " dollars.");
		}
	}
}
