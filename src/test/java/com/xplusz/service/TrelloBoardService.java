package com.xplusz.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import com.xplusz.Board;

/**
 * For experimental purposes
 * 
 * @author espoirg
 *
 */
public interface TrelloBoardService {
	

	@GET("members/{user}/boards")
	Call<List<Board>> listBoards(@Path("user") String user, @Query("key") String applicationKey, @Query("token") String token);
	
	
}
