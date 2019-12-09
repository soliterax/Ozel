package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

public class ArenaManager {
	
	public static Arenas joinedArena;
	
	public static LinkedList<Arenas> arenas = new LinkedList<Arenas>(); 
	public static HashMap<Arenas,Double> arenaMultiplier = new HashMap<Arenas,Double>();
	public static HashMap<Arenas,String> arenaName = new HashMap<Arenas,String>();
	public static HashMap<String,Arenas> arenaRawName = new HashMap<String,Arenas>();
	
	public ArenaManager() {
		addArena("Orman", Arenas.Forest, 2.2);
	}
	
	public static void addArena(String name, Arenas arena, double multiplier) {
		arenas.add(arena);
		arenaMultiplier.put(arena, multiplier);
		arenaName.put(arena, name);
		arenaRawName.put(name, arena);
	}
	
	public static void joinArena(Arenas arena) {
		
		joinedArena = arena;
		
	}
	
	public enum Arenas {
		Forest;
	}
	
}