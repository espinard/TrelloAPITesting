package com.xplusz;

public class Board extends TrelloAuthObject {

	private String id;
	private String name; 
	private String desc;
	
	
	/**
	 *	 * 
	 * @param key The application key
	 * @param token The server token 
	 * @param name The board name
	 * @param desc The description 
	 */
	public Board(String key, String token, String name, String desc) {
		super(key, token);
		this.name = name;
		this.desc = desc;
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
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}


	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}


	
	@Override
	public String toString() {
		return "Board [id= " + id + ", name=" + name + ", desc=" + desc + "]";
	} 
	
	
	
	
}
