import java.math.BigDecimal;

public abstract class Movie {
	// Attributes
	protected String title;
	protected String priceCode;

	// Constructor
	public Movie(String title, String priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	// Methods
	public String getTitle() {
		return title;
	}

	public String getPriceCode() {
		return priceCode;
	}

	public abstract BigDecimal calculateFees(int days);

}
