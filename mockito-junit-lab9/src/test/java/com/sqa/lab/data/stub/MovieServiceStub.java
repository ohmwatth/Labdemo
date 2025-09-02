package com.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import com.sqa.lab.api.MovieService;

public class MovieServiceStub implements MovieService {
	
	public List<String> getMovie(String general,String MovieName){
		return Arrays.asList("John Wick","The Matrix");
	}

}
