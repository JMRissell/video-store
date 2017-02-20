import java.math.BigDecimal;

public class NewMovie extends Movie {

	public NewMovie(String title) {
		super(title, "New Movie");
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal rentalDays = new BigDecimal(days);
		BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);
		return amount;
	}
}
