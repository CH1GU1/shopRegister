package model;

public class Client {

	private String idType;
	private String idNum;

	/**
	 * 
	 * @param idType
	 * @param idNumber
	 */
	public Client(String idType, String idNumber) {
		this.idType = idType;
		this.idNum = idNumber;
	}
	public String getIdType() {
		return this.idType;
	}
	/**
	 * 
	 * @param idType
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNum() {
		return this.idNum;
	}
	/**
	 * 
	 * @param idNum
	 */
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

}