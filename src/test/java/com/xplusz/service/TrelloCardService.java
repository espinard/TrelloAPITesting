package com.xplusz.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import com.xplusz.Card;

public interface TrelloCardService {
	
	public static final String ID_LIST = System.getProperty("trello.list.id");//"58774a3bd609406d969219bf"

	
	/**
	 * API to create a card
	 * 
	 * @param newCard
	 * @return A Retrofit {@link Call} of newly created card
	 */
	@POST("cards")
	Call<Card> createCard(@Body Card newCard);
	
	/**
	 * API call for getting a card from a board
	 * 
	 * @param cardId The id of the card to get
	 * @return A Retrofit {@link Call}
	 */
	@GET("cards/{id}")
	Call<Card> getCard(@Path("id") String cardId, @Query("key") String key, @Query("token") String token);
	
	/**
	 * 
	 * API  to delete an existing card 
	 * 
	 * @param id The id of the card to delete
	 * @return A Retrofit {@link Call} of deleted card
	 */
	@DELETE("cards/{id}")
	Call<Card> deleteCard(@Path("id") String cardId, @Query("key") String key, @Query("token") String token);
	
	/**
	 * 
	 * API call to update a card 
	 * 
	 * @param newCard The new card to update
	 * @return A Retrofit {@link Call} of updated card
	 */
	@PUT("cards/{id}")
	Call<Card> updateCard(@Path("id") String id, @Body Card newCard); 

	
}
