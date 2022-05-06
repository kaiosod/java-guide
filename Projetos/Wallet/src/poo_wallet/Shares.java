package poo_wallet;

import java.time.LocalDate;

public class Shares extends Assets {

	protected Integer amount;
	
	public Shares() {
		super();
	}
	
	public Shares(String name, Double value, Integer amount) {
		super(name,value);
		this.amount = amount;
	}
	
	public Double totalValue() {
		return value * amount;
	}

	@Override
	public String toString() {
		return "Shares [amount=" + amount + ", name=" + name + ", value=" + value + ", totalValue()=" + totalValue()
				+ "]";
	}

	
	
	
}

