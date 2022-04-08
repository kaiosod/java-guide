package Polimorfismo;

public class Employee {
	protected String name;
	protected Integer hour;
	protected Double valuePerHour;
	
	
	Employee () {
		
	}
	
	Employee(String name, Integer hour, Double valuePerHour) {
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}
		
	public Double payment() {
		return hour * valuePerHour;
	}
	
	public String toString() {
		return " Nome: " + name + " Horas: "+hour+" Valor por Hora: " + valuePerHour + " Pagamento: R$" + payment();
	}
	
	
	
}
