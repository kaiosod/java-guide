package Polimorfismo;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
	
	OutsourcedEmployee(){
		
	}
	
	OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge){
		super(name,hour,valuePerHour);
		this.additionalCharge = additionalCharge;
		
	}
	
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

}
