package com.xplusz.service;

/**
 * Encapsulates Application Key and Server token
 * 
 * @author espoirg
 *
 */
public class AuthenticationUtils {

	public static final String API_BASE_URL = "https://api.trello.com/1/";
	
	public static final String SERVER_TOKEN = System.getProperty("trello.token"); //"e2a5113d39fc99c08330fc99658b7c56691c8534613a4cd503fc1b5d3f160c6a" 
	public  static final String APPLICATION_KEY = System.getProperty("trello.key"); //"d65d7454875d6738007824e0a23311e9"

	
}
