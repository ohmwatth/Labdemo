package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.BookCatalogueService;

public class BookCatalogueaServiceStub implements BookCatalogueService {

	public List<String> getBookCatalogue(String month, String keyword) {
		return Arrays.asList("Cooking Thai Dish","Cooking made Easy","Cooking with Dog");
	}
}
