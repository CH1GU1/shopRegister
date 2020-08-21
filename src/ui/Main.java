package ui;
import model.Shop;
import java.util.*;

import exceptions.IdNumberException;
import exceptions.IdTypeException;

public class Main {
	public final static int REGISTER_NEW = 1;
	public final static int SHOW_TRY_ENTRY = 2;
	public final static int EXIT = 3;
	Scanner sc = new Scanner(System.in);
	private Shop shop = new Shop(0);
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Main m;
		m = new Main();
		m.startProgram();
	}
	public void operation(int choice) {
		String num;
		switch (choice) {
		case REGISTER_NEW:
			System.out.println("Please select the type of ID");
			choice = sc.nextInt();
			sc.nextLine();
			num = sc.nextLine();
			try {
				shop.register(choice, num);
			} catch ( IdTypeException e) {
	
				e.printStackTrace();
			} catch (IdNumberException t) {
				
			}
			break;

		case SHOW_TRY_ENTRY:

			break;

		case EXIT:

			break;

		default:
			break;
		}	
	}	
	public void showMenu() {
		System.out.println("Welcome to "+shop.name+"\n"+shop.getCountP()+" clients have visited the shop\n");
		System.out.println("***Please select an option***"); 
		System.out.println("1.REGISTER A NEW CLIENT\n2.SHOW THE QUANTITY OF PEOPLE TRY TO ENTRY\n3.EXIT PROGRAM");	
	}
	public int readOption() {
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println();
		return choice;
	}
	public void startProgram() {
		int option;
		do {
			showMenu();
			option = readOption();
			operation(option);
		} while(option!=EXIT);
	}
}
