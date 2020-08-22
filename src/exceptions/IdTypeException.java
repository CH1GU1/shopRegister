package exceptions;
@SuppressWarnings("serial")
public class IdTypeException extends Exception {

	private String type = "";
	public IdTypeException(String type){
		super("The person has "+type+" No valid ID to entry");

	}
	public String getType() {
		return type;
	}
}