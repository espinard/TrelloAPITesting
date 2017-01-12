package com.xplusz;

public class Card extends TrelloAuthObject {

	private String id;
	private String name;
	private String idList; 
	
	

	/**
	 * @param key The application key
	 * @param token The server token 
	 * @param name The name of the card 
	 * @param idList The id of the List the card belongs to
	 */
	public Card(String key, String token, String name,
			String idList) {
		super(key, token);
		this.name = name;
		this.idList = idList;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the idList
	 */
	public String getIdList() {
		return idList;
	}
	/**
	 * @param idList the idList to set
	 */
	public void setIdList(String idList) {
		this.idList = idList;
	}
	
	

}
