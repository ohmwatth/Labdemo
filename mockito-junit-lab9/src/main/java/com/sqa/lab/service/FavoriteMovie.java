package com.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import com.sqa.lab.api.MovieService;

public class FavoriteMovie {
	
	private MovieService movieservice;
	
	
	public FavoriteMovie(MovieService movieservice) {
		super();
		this.movieservice = movieservice;
	}


	public List<String> getMovie(String general,String MovieName){
		List<String> movielist = new ArrayList<String>();
		List<String> allmovielist = movieservice.getMovie(general,MovieName);
		
		for(String movie: allmovielist) {
			if(movie.contains(MovieName)) {
				movielist.add(MovieName);
			}
		}
		return movielist;
	}

}
