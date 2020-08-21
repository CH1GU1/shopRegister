package exceptions;
@SuppressWarnings("serial")
public class IdTypeException extends Exception {
	public IdTypeException(String type){
		super("The person has "+type+" No valid ID to entry");

	}
}
