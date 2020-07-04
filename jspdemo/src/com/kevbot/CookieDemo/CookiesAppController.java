package com.kevbot.CookieDemo;

import javax.servlet.http.*;

public class CookiesAppController {
	static String appName = "cookieApp";
	static final int SECONDS_IN_HOUR = 60*60;
	static final int SECONDS_IN_DAY = SECONDS_IN_HOUR*24;

	public static void setCookieExpiration(Cookie cookie, int days) {
		cookie.setMaxAge(SECONDS_IN_DAY*days);
	}
	
	public static String getHeaderHTML(Cookie[] cookies) {
		
		if (cookies == null) {
			return "";
		}
		
		String favoriteStarter = "";
		String ret= "";
		String cookieName = appName + ".favoriteStarter";
		
		// Find starter in cookies
		for (Cookie x : cookies) {
			if (cookieName.equals(x.getName())) {
				favoriteStarter = x.getValue();
			}
		}
		
		// If the cookie value was not found, return
		if (favoriteStarter.isBlank()) {
			System.out.println("Favorite starter was not found in cookies");
			return "";
		}
		
		else {
			ret += "<h3>Favorite Starter: " + favoriteStarter + "</h3>";
			
			// Display dynamic image based on starter
			ret += "<img src=\"images/" + favoriteStarter.toLowerCase() + ".jpg\"" 
					+ " height=\"200\"" 
					+ " width=\"200\"" 
					+ ">"; 
			
			return ret;
		}
	}
	
	public static String getPokemonInfoHTML(Cookie[] cookies) {
		
		if (cookies == null) {
			return "";
		}
		
		String cookieName = appName + ".favoriteStarter";
		String favoriteStarter = "";
		// Find starter in cookies
		for (Cookie x : cookies) {
			if (cookieName.equals(x.getName())) {
				favoriteStarter = x.getValue();
			}
		}
		
		// Get stats for selected pokemon
		Pokemon poke = Pokemon.getPokemon(favoriteStarter);
		
		// If pokemone not found, return
		if (Pokemon.dummyPokemonName.equals(poke.getName())) {
			return "";
		}
		
		String ret = "<br>";
		ret += "<table>";
		
		// Headers
		ret += "<tr>";
		ret += "<th>" + "Base Stat" + "</th>";
		ret += "<th>" + "Value" + "</th>";
		ret += "</tr>";
		
		// Values
		ret += "<tr>";
		ret += "<td>" + "HP" + "</td>";
		ret += "<td>" + poke.getHP() + "</td>";
		ret += "</tr>";
		
		ret += "<tr>";
		ret += "<td>" + "Attack" + "</td>";
		ret += "<td>" + poke.getAttack() + "</td>";
		ret += "</tr>";
		
		ret += "<tr>";
		ret += "<td>" + "Defense" + "</td>";
		ret += "<td>" + poke.getDefense() + "</td>";
		ret += "</tr>";
		
		ret += "<tr>";
		ret += "<td>" + "Special Attack" + "</td>";
		ret += "<td>" + poke.getSpecialAtk() + "</td>";
		ret += "</tr>";
		
		ret += "<tr>";
		ret += "<td>" + "Special Defense" + "</td>";
		ret += "<td>" + poke.getSpecialDef() + "</td>";
		ret += "</tr>";
		
		ret += "<tr>";
		ret += "<td>" + "Speed" + "</td>";
		ret += "<td>" + poke.getSpeed() + "</td>";
		ret += "</tr>";
		
		ret += "</table>";
		return ret;
	}
}
