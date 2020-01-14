package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

import com.savas.Managers.ArenaManager.Arenas;

public class BossManager {

	private static Random rand = new Random();
	
	public static LinkedList<Boss> boss = new LinkedList<Boss>();
	public static HashMap<Boss,String> bossName = new HashMap<Boss,String>();
	public static HashMap<String,Boss> bossRawName = new HashMap<String,Boss>();
	public static HashMap<Boss,Integer> bossHealth = new HashMap<Boss,Integer>();
	public static HashMap<Boss,Integer> bossDamage = new HashMap<Boss,Integer>();
	public static HashMap<Boss,Double> bossEnergy = new HashMap<Boss,Double>();
	public BossManager() {
		addBoss("Haxtar", Boss.Haxtar, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Light_Room)), 200, 500);
		addBoss("Derin Orman Ruhu", Boss.Deep_Forest_Soul, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Forest)), 500, 1000);
		addBoss("Madenin Herkürü", Boss.Mine_Hercur_Boss, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Deep_Mine)), 620, 1250);
		addBoss("Çölün Cehennem Ruhu", Boss.Deserts_Hell_King, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Deserts)), 750, 1500);
	}
	
	private static void addBoss(String bossNamea, Boss bossa, int health, int Damage,double energy) {
		
		boss.add(bossa);
		bossName.put(bossa, bossNamea);
		bossRawName.put(bossNamea, bossa);
		bossHealth.put(bossa, health);
		bossDamage.put(bossa, Damage);
		bossEnergy.put(bossa, energy);
		
	}
	
	public enum Boss {
		Haxtar,
		Deep_Forest_Soul,
		Mine_Hercur_Boss,
		Deserts_Hell_King
		;
	}
	
}
