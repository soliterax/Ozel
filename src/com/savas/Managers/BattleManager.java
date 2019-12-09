package com.savas.Managers;

import java.util.Random;

import com.savas.Entity;

public class BattleManager {
	
	static Random rand = new Random();
	
	public static void startBattle() {
		
		EntityManager.setHealth(Entity.Enemy, rand.nextInt(5000));
		
	}
	
	public static void Battle() {
		
		
		
	}
	

}
