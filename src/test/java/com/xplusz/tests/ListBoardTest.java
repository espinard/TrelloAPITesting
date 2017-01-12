package com.xplusz.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import retrofit2.Call;
import retrofit2.Response;

import com.xplusz.Board;
import com.xplusz.service.AuthenticationUtils;

/** 
 * This is what for experimental purposes, but it works !
 * 
 * @author espoirg
 *
 */
public class ListBoardTest extends BoardTest {

	
	@Test
	public void testGetBoards(){
		
		String key = AuthenticationUtils.APPLICATION_KEY; 
		String token = AuthenticationUtils.SERVER_TOKEN;
		Call<List<Board>> boardsCall = trelloBoardService.listBoards("me", key, token);

		try {	
			Response<List<Board>> resp = boardsCall.execute();
			
			assertTrue(resp.isSuccessful());
			assertTrue(resp.code() == 200);
			assertTrue(resp.body().size() >=1); 
			for (Board board : resp.body()) {
				System.out.println(board);
			}

		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

}
