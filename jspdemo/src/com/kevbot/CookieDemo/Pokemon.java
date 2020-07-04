package com.kevbot.CookieDemo;

public class Pokemon {
	 String name;
	 int hp;
	 int attack;
	 int def;
	 int spAtk;
	 int spDef;
	 int speed;
	
	static final String dummyPokemonName = "Dummy";
	static final Pokemon charmander = new Pokemon("Charmander", 39, 52, 43, 60, 50, 65);
	static final Pokemon bulbasaur = new Pokemon("Bulbasaur", 45, 49, 49, 65, 65, 45);
	static final Pokemon squirtle = new Pokemon("Squirtle", 44, 48, 65, 50, 64, 43);
	static final Pokemon pikachu = new Pokemon("Pikachu", 35, 55, 40, 50, 50, 90);
	static final Pokemon dummyPokemon = new Pokemon(dummyPokemonName, 0, 0, 0, 0, 0, 0);
	
	
	public Pokemon(String name, int hp, int attack, int def, int spAtk, int spDef, int speed) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.spAtk = spAtk;
		this.spDef = spDef;
		this.speed = speed;
	}
	
	public static Pokemon getPokemon(String name) {
		switch(name.toLowerCase()) {
		case "charmander":
			return charmander;
		case "bulbasaur":
			return bulbasaur;
		case "squirtle":
			return squirtle;
		case "pikachu":
			return pikachu;
		default:
			return dummyPokemon;
		}
	}
	
	String getName() { return name; }	
	int getHP() { return hp; }
	int getAttack() { return attack; }
	int getDefense() { return def; }
	int getSpecialAtk() { return spAtk; }
	int getSpecialDef() { return spDef; }
	int getSpeed() { return speed; }
	
	

}
