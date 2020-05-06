package com.api.client;

import com.api.model.Country;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CountryApiClient {
	public String getCountryName(String cityName) {
		try {
			Client client = Client.create();
			WebResource webResource = client
			   .resource("https://restcountries.eu/rest/v2/capital/"+cityName.replace(" ", "%20"));
			ClientResponse response = webResource.accept("application/json")
			           .get(ClientResponse.class);
			if (response.getStatus() != 200) {
			   return "";
			}
			String output = response.getEntity(String.class);
			Gson parser = new Gson();
			Country[] result = parser.fromJson(output, Country[].class);
			return result[0].getName();
		} catch (Exception e) {
			return "";
		}
	}
	
}
