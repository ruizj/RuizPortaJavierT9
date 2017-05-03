package exceptions;
@SuppressWarnings("Serial")
public class ListSizeOverflownException extends RuntimeException {

	public ListSizeOverflownException (String msg){
		super(msg);
	}
}
