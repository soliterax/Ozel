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
	public static HashMap<Boss,WarningLevel> bossLevel = new HashMap<Boss,WarningLevel>();
	//All bosses this block loaded and recorded
	public BossManager() {
		addBoss("Haxtar", Boss.Haxtar, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Light_Room)), 200, 500,WarningLevel.Kolay);
		addBoss("Derin Orman Ruhu", Boss.Deep_Forest_Soul, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Forest)), 500, 1000,WarningLevel.Normal);
		addBoss("Madenin Herk�r�", Boss.Mine_Hercur_Boss, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Deep_Mine)), 620, 1250,WarningLevel.Zor);
		addBoss("��l�n Cehennem Ruhu", Boss.Deserts_Hell_King, rand.nextInt(ArenaManager.arenaMaxBossHealth.get(Arenas.Deserts)), 750, 1500,WarningLevel.Tehlikeli);
	}
	//not a edit pls
	private static void addBoss(String bossNamea, Boss bossa, int health, int Damage,double energy, WarningLevel level) {
		
		boss.add(bossa);
		bossName.put(bossa, bossNamea);
		bossRawName.put(bossNamea, bossa);
		bossHealth.put(bossa, health);
		bossDamage.put(bossa, Damage);
		bossEnergy.put(bossa, energy);
		bossLevel.put(bossa, level);
		
	}
	//this method boss warning levels list
	public enum WarningLevel {
		Kolay,
		Normal,
		Zor,
		Tehlikeli,
		Olumcul;
	}
	//Add a boss
	public enum Boss {
		Haxtar,
		Deep_Forest_Soul,
		Mine_Hercur_Boss,
		Deserts_Hell_King
		;
	}
	
}
