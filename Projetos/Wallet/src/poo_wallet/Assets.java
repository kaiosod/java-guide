package poo_wallet;

public abstract class Assets {
	
	protected String name;
	protected Double value;

	
	public Assets() {
		
	}
	
	public Assets(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public String toString() {
		return "Assets [name=" + name + ", value=" + value + "]";
	}
	
	
}
