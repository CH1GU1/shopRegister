package exceptions;
@SuppressWarnings("serial")
public class IdNumberException extends Exception{
	private String num;
	public IdNumberException(String num){
		super("You can not entry today, penultimate number is"+num.charAt(num.length()-1));
		
	}
//	public double getPrice(){
//		return price;
//	}
}