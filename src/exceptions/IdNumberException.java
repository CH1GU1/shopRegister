package exceptions;
@SuppressWarnings("serial")
public class IdNumberException extends Exception{
	public IdNumberException(){
		super("You can not entry today, please check your penultimate digit of id and the today's date");
		
	}

}