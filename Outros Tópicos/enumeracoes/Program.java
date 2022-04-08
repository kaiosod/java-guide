package enumeracoes;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		Date data = new Date();
		
		System.out.println(data);
		
		Order order1 = new Order(7089, data,OrderStatus.PEDING_PAYMENT);
		
		System.out.println(order1);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		

	}

}
