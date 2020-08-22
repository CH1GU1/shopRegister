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
			do {
				System.out.println("Please select the type of ID\n1.CC\n2.PP\n3.CE\n4.TI\n");
				choice = sc.nextInt();
				sc.nextLine();
			} while(!((choice == 1) || (choice == 2) || (choice == 3) || (choice == 4)));	
			System.out.println("Please enter your ID number\n");
			num = sc.nextLine();
			try {
				shop.register(choice, num);
				System.out.println("\n**Client added!**\n");
			} catch ( IdTypeException e) {

				e.printStackTrace();
			} catch (IdNumberException t) {
				t.printStackTrace();

			} finally {
				shop.setCountP(shop.getCountP()+1);
			}
			break;

		case SHOW_TRY_ENTRY:
			System.out.println(+shop.getCountP()+" clients have visited the shop\n");

			break;

		case EXIT:
			System.out.println("Good bye! :)");
			break;

		default:
			System.out.println("**Please select a correct option**\n");
			break;
		}	
	}	
	public void showMenu() {
		System.out.println("Welcome to "+shop.name+"\n");
		System.out.println("--- Please select an option ---\n"); 
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