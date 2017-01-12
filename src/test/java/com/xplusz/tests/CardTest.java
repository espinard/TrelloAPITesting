package com.xplusz.tests;

import org.junit.Before;
import org.junit.BeforeClass;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.xplusz.service.AuthenticationUtils;
import com.xplusz.service.TrelloCardService;

/**
 * Abstract Card Test defining what API to use 
 * 
 * @author espoirg
 *
 */
public class CardTest {
	
	private static Retrofit retro; 
	protected TrelloCardService trelloCardService;
	
	
	@BeforeClass
	public static void initRetro(){
		 retro = new Retrofit.Builder()
        .baseUrl(AuthenticationUtils.API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

	}

	@Before
	public void setup(){
			trelloCardService = retro.create(TrelloCardService.class);
	}	
}
