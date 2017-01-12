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


public class DeleteCardsTest extends CardTest {

	
	
	@Test
	public void shouldDeleteGivenCard()
	{

		try {


			// First create one card 
			String key = AuthenticationUtils.APPLICATION_KEY;
			String token = AuthenticationUtils.SERVER_TOKEN; 
			String idList = TrelloCardService.ID_LIST; 

			Card newCard = new Card(key, token, "New Card From JUnit To Delete", idList);
			Response<Card> cardResponse = trelloCardService.createCard(newCard).execute();
			assertTrue(cardResponse.isSuccessful());
			assertEquals(newCard.getName(), cardResponse.body().getName());

			//Now we should delete it 
			Card createdCard = cardResponse.body(); 

			Call<Card> deleletedCardCall = trelloCardService.deleteCard(createdCard.getId(), key, token);
			Response<Card> responseDel = deleletedCardCall.execute(); 
			assertTrue(responseDel.isSuccessful());
			
			//Should not be possible to get it 
			
			Response<Card> cardGetResponse = trelloCardService.getCard(createdCard.getId(), key, token).execute();
			assertFalse(cardGetResponse.isSuccessful());


		} catch (IOException e) {
			fail(e.getMessage());
		} 



	}


}
