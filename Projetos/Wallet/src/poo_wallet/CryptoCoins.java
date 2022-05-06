package poo_wallet;


public class CryptoCoins extends Assets {

	 protected Double pricePerUnit;
	 
	public CryptoCoins() {
		super();
	}
	
	public CryptoCoins(String name, Double value, Double pricePerUnit) {
		super(name,value);
		this.pricePerUnit = pricePerUnit;
	}
	 
	 public Double amount() {
		 return value / pricePerUnit;
	 }
	 
	public Double totalValue() {
		return value * amount();
	}

	@Override
	public String toString() {
		return "CryptoCoins [pricePerUnit=" + pricePerUnit + ", name=" + name + ", value=" + value + ", amount()="
				+ amount() + ", totalValue()=" + totalValue() + "]";
	}
	
	
}
