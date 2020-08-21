package model;

import java.util.*;

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
	public void register(Client client) {

	}
}