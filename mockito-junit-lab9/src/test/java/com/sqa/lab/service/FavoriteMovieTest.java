package com.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.sqa.lab.data.stub.*;
import com.sqa.lab.api.*;

import org.junit.jupiter.api.Test;

class FavoriteMovieTest {

	@Test
	void FavoriteMovietest() {
		
		MovieService movieservice = new MovieServiceStub();
		FavoriteMovie favoritemovie = new FavoriteMovie(movieservice);
		
		List<String> movielist = favoritemovie.getMovie("action", "action");
		
		assertEquals(2, movielist.size());
	}

}
