package exceptions;
@SuppressWarnings("serial")
public class IdNumberException extends Exception{
	private int num;
	public IdNumberException(int num){
		super("You can not entry today, penultimate number is "+num);
		
	}

}