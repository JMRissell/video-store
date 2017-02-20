import java.math.BigDecimal;

public class Rental {
	// Attributes
	public Movie rented;
	public int days;

	// Constructor
	public Rental(Movie rented, int days) {
		this.rented = rented;
		this.days = days;
	}

	// Methods
	BigDecimal calculateFees() {
		return rented.calculateFees(days);
	}

	int getDays() {
		return days;
	}

	String getTitle() {
		return rented.title;
	}

	String getPriceCode() {
		return rented.priceCode;
	}
}
