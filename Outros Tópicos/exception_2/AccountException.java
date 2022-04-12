package excecoes_2;

public class AccountException extends Exception{
	public static final long serialVersionUID = 1L;
	
	public AccountException(String msg) {
		super(msg);
	}
}
