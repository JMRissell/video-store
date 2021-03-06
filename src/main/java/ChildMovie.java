import java.math.BigDecimal;

public class ChildMovie extends Movie {

	public ChildMovie(String title) {
		super(title, "Children's Movie");
	}

	@Override
	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("1.50");
		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
		}
		return amount;
	}
}
