package com.api.model;

import java.net.URL;
public class Country {
	String name, capital;
	String[] topLevelDomain;
	String alpha2Code, alpha3Code;
	int[] callingCodes;
	String[] altSpellings;
	String region, subregion;
	long population;
	String demonym;
	double area;
	String[] timezones;
	String[] borders;
	String nativeName, numericCode;
	Language[] languages;
	Currency[] currencies;
	Neighbour[] neighbours;
	URL flag;
	public String getName() {
		return name;
	}
}
