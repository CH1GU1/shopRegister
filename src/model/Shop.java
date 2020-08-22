package model;

import java.time.LocalDate;
import java.util.*;

import exceptions.IdNumberException;
import exceptions.IdTypeException;

public class Shop {

	public String name = "Mi barrio te quiere";
	public ArrayList<Client> clients;
	private int countP;

	/**
	 * 
	 * @param name
	 * @param countP
	 */
	public Shop(int countP) {
		this.countP = countP;
		clients = new ArrayList<>();

	}
	public String getName() {
		return this.name;
	}
	public int getCountP() {
		return this.countP;
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	/**
	 * 
	 * @param countP
	 */
	public void setCountP(int countP) {
		this.countP = countP;
	}
	/**
	 * 
	 * @param client
	 */
	public String register(int choice, String idNum) throws IdNumberException, IdTypeException{
		String info = "";
		String idType = ""; 
		switch (choice) {
		case 1:
			idType = "CC";
			break;

		case 2:
			idType = "PP";
			break;

		case 3:
			idType = "CE";
			break;

		case 4:
			idType = "TI";
			break;
			
		default:
			info += "Choice not valid";
			break;					
		}
		if (idType.equals("TI")) {
			throw new IdTypeException(idType);
		}
		String posPenul = idNum.charAt(idNum.length()-2)+""; 
		int value = Integer.parseInt(posPenul);
		if(LocalDate.now().getDayOfMonth()%2 != 0 && value%2 !=0) {
			throw new IdNumberException(value);
		}
		if(LocalDate.now().getDayOfMonth()%2 == 0 && value%2 ==0) {
			throw new IdNumberException(value);
		}
		Client c1 = new Client(idType, idNum);
		clients.add(c1);
		return info;
	}
}