package com.xplusz.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import retrofit2.Call;
import retrofit2.Response;

import com.xplusz.Card;
import com.xplusz.service.AuthenticationUtils;
import com.xplusz.service.TrelloCardService;

/**
 * 
 * @author espoirg
 *
 */
public class AddCardTest extends CardTest {	

		
	@Test
	public void shouldAddCardToBoard()
	{
		
		String key = AuthenticationUtils.APPLICATION_KEY;
		String token = AuthenticationUtils.SERVER_TOKEN; 
		String idList = TrelloCardService.ID_LIST; 

		Card newCard = new Card(key, token, "New Card From JUnit", idList);
		Call<Card> newCardCall = trelloCardService.createCard(newCard); 

		try {
			Response<Card> cardResponse = newCardCall.execute();
			assertTrue(cardResponse.isSuccessful());
			assertEquals(newCard.getName(), cardResponse.body().getName());
			assertFalse(cardResponse.body().getId().isEmpty());

		
		} catch (IOException e) {
			fail(e.getMessage());
		} 

	}
	


	
}
