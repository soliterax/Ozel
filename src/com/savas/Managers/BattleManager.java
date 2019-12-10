package com.savas.Managers;

import java.util.Random;

import com.savas.Entity;
import com.savas.Managers.ArenaManager.Arenas;

public class BattleManager {
	
	static Random rand = new Random();
	
	public static void startBattle(Arenas arena) {
		
		EntityManager.setHealth(Entity.Enemy, rand.nextInt(5000));
		
	}
	
	public static void Battle() {
		
		
		
	}
	

}
