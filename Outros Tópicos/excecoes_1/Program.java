package excecoes_1;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		

		try {
			System.out.println("Digite o número do quarto");
			Integer roomNumber = sc.nextInt();
			System.out.println("Digite a data de checkin");
			Date checkin = sdf.parse(sc.next());
			System.out.println("Digite a data de checkout");
			Date checkout = sdf.parse(sc.next());
			
			Reservation reserva = new Reservation(roomNumber, checkin, checkout);
			
			System.out.println("\nReserva: \n"+ reserva);
			
			System.out.println("\nDigite valores a serem alterados\n");
			System.out.println("Digite a data de checkin");
			checkin = sdf.parse(sc.next());
			System.out.println("Digite a data de checkout");
			checkout = sdf.parse(sc.next());
			
			reserva.updatesDate(checkin,checkout);
			System.out.println("/nReserva: /n"+ reserva);
		}
		catch (ParseException e) {
			System.out.print("Valor errado");
		}
		catch (DomainException e) {
			System.out.println("Erro " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		

	}

}
