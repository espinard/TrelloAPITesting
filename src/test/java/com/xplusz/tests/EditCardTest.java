package com.xplusz.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import retrofit2.Response;

import com.xplusz.Card;
import com.xplusz.service.AuthenticationUtils;
import com.xplusz.service.TrelloCardService;


public class EditCardTest extends CardTest {

	@Test
	public void shouldReplaceNameOfCard()
	{

		try {

			// First create one card 
			String key = AuthenticationUtils.APPLICATION_KEY;
			String token = AuthenticationUtils.SERVER_TOKEN; 
			String idList = TrelloCardService.ID_LIST; 

			Card newCard = new Card(key, token, "Card Name To Replace", idList);
			Response<Card> cardResponse = trelloCardService.createCard(newCard).execute();
			assertTrue(cardResponse.isSuccessful());
			assertEquals(newCard.getName(), cardResponse.body().getName());
			
			// Replace name 
			Card createdCard = cardResponse.body();
			Card replaceCard = new Card(key, token, "CARD NAME REPLACED!", idList);
			Response<Card> cardReplacedResp = trelloCardService.updateCard(createdCard.getId(), replaceCard).execute();
			assertTrue(cardReplacedResp.isSuccessful());
			
			
			//Check if replacement done
			assertEquals(createdCard.getId(), cardReplacedResp.body().getId());
			assertEquals("CARD NAME REPLACED!", cardReplacedResp.body().getName());
	

		} catch (IOException e) {
			fail(e.getMessage());
		} 
		
	}


}
