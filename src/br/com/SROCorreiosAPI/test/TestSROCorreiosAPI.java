package br.com.SROCorreiosAPI.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import br.com.SROCorreiosAPI.main.SROCorreiosAPI;


class TestSROCorreiosAPI {

	@Test
	void testSearchObject() {

		SROCorreiosAPI api = new SROCorreiosAPI();
		String searchObject = api.SearchObject("zzz");
		assertNotNull(searchObject);

	}

	@Test
	void testSearchObjectTomlDocument() {
		SROCorreiosAPI api = new SROCorreiosAPI();
		Document searchObjectTomlDocument = api.searchObjectTomlDocument("zzz");
		assertNotNull(searchObjectTomlDocument);
	}

	@Test
	void testMain() {
		assertFalse(false);
	}

}
