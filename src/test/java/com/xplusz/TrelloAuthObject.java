package com.xplusz;

public  class TrelloAuthObject {
	
	private String key; 
	private String token;
	
	
	/**
	 * @param key
	 * @param token
	 */
	public TrelloAuthObject(String key, String token) {
		super();
		this.key = key;
		this.token = token;
	}


	/**
	 * @return the application key
	 */
	public String getKey() {
		return key;
	}


	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}


	/**
	 * @return the server token
	 */
	public String getToken() {
		return token;
	}


	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	} 

	
	
}
