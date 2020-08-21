package model;

import java.util.*;

public class Shop {

	public String name = "Mi barrio te quiere";
	public ArrayList clients;
	private int countP;

	/**
	 * 
	 * @param name
	 * @param countP
	 */
	public Shop(String name, int countP) {

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

	public String infoClients() {
		return name;

	}

}