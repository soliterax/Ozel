package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

public class ArenaManager {
	//if player is join
	public static Arenas joinedArena;
	//Arena settings
	public static LinkedList<Arenas> arenas = new LinkedList<Arenas>(); 
	public static HashMap<Arenas,Double> arenaMultiplier = new HashMap<Arenas,Double>();
	public static HashMap<Arenas,String> arenaName = new HashMap<Arenas,String>();
	public static HashMap<String,Arenas> arenaRawName = new HashMap<String,Arenas>();
	public static HashMap<Arenas,Integer> arenaEnemyNumber = new HashMap<Arenas,Integer>();
	public static HashMap<Arenas,Integer> arenaMaxBossHealth = new HashMap<Arenas,Integer>();
	//first referensed object
	public ArenaManager() {
		addArena("Işık Odası", Arenas.Light_Room, 1.0);
		addArena("Orman", Arenas.Forest, 2.2);
		addArena("Derin Magra", Arenas.Deep_Mine, 3.5);
		addArena("Çöl", Arenas.Deserts, 5.0);
	}
	//add Arena function
	public static void addArena(String name, Arenas arena, double multiplier) {
		arenas.add(arena);
		arenaMultiplier.put(arena, multiplier);
		arenaName.put(arena, name);
		arenaRawName.put(name, arena);
	}
	//if player join the arena
	public static void joinArena(Arenas arena) {
		
		joinedArena = arena;
		
	}
	//Arenas
	public enum Arenas {
		Light_Room,
		Forest,
		Deep_Mine,
		Deserts
		;
	}
	
}
