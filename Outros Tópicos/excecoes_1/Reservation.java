package excecoes_1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout; 
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		
	}
	
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		if (!checkout.after(checkin)) {
			throw new DomainException("O Checkin deve ter data anterior ao Checkout");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
		
	}
	
	public void updatesDate(Date checkin, Date checkout) {
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("As Datas de Checkin e Checkout não podem ser atualizadas para datas anteriores a atual");
		}
		if (!checkout.after(checkin)) {
			throw new DomainException("As Datas de Checkout devem ser posteriores a de Checkin");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public long duration() {
		
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	@Override
	public String toString() {
		return "Número do quarto: " + roomNumber + " Data de CheckIn: "+ sdf.format(checkin)+
				" Data de Checkout: " + sdf.format(checkout) + " Duração: " + duration();
	}
}
