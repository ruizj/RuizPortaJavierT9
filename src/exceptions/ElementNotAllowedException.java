package exceptions;

@SuppressWarnings("Serial")
public class ElementNotAllowedException extends RuntimeException {

	public ElementNotAllowedException (String msg){
		super(msg);
	}
	
}
