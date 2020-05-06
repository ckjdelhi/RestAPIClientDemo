package com.api.Test;

import java.util.Scanner;

import com.api.client.CountryApiClient;

public class CountryServiceTest {
	
	public static void main(String[] args) {
		String exit="";
		Scanner sc=new Scanner(System.in);
		CountryApiClient apiClient= new CountryApiClient();
		while(!exit.equalsIgnoreCase("n")) {
			System.out.println("Enter CAPITAL CITY Name:");
			String cityName=sc.nextLine();
			System.out.println("Enter expected Country name:");
			String expectedCountryName= sc.nextLine();
			String actualCountryName = apiClient.getCountryName(cityName);
			if(actualCountryName.isEmpty()) {
				System.out.println("Country Not Found, try to enter capital city name");
			}else {
				if(actualCountryName.equalsIgnoreCase(expectedCountryName)) {
					System.out.println("Country Matched: Expected["+expectedCountryName+"] Actual["+actualCountryName+"]");
				}else {
					System.out.println("Country Not Matched: Expected["+expectedCountryName+"] Actual["+actualCountryName+"]");
				}
			}
			
			System.out.println("Do you want to continue press Y or N");
			exit= sc.next();
			
		}	
		sc.close();

	}

}
