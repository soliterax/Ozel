package com.savas.Managers;

import java.util.LinkedList;
import java.util.Random;

import com.savas.Managers.InventoryManager.Types;
import com.savas.Managers.WeaponManager.Weapons;

public class LootManager {
	
	private static LinkedList<String> silverLoot = new LinkedList<String>();
	private static LinkedList<Types> silverLootType = new LinkedList<Types>();
	
	private static LinkedList<String> goldLoot = new LinkedList<String>();
	private static LinkedList<Types> goldLootType = new LinkedList<Types>();
	
	private static LinkedList<String> diamondLoot = new LinkedList<String>();
	private static LinkedList<Types> diamondLootType = new LinkedList<Types>();
	
	private static LinkedList<String> crystalLoot = new LinkedList<String>();
	private static LinkedList<Types> crystalLootType = new LinkedList<Types>();
	
	private static LinkedList<String> quantumLoot = new LinkedList<String>();
	private static LinkedList<Types> quantumLootType = new LinkedList<Types>();
	
	
	private static Random rand = new Random();
	
	public static void addLoot(String Loot, Types type, Loots loot) {
		
		if(loot == Loots.silver) {
			silverLoot.add(Loot);
			silverLootType.add(type);
		}
		else if (loot == Loots.gold) {
			goldLoot.add(Loot);
			goldLootType.add(type);
		}
		else if (loot == Loots.diamond) {
			diamondLoot.add(Loot);
			diamondLootType.add(type);
		}
		else if (loot == Loots.crystal) {
			crystalLoot.add(Loot);
			crystalLootType.add(type);
		}
		else if (loot == Loots.quantum) {
			quantumLoot.add(Loot);
			quantumLootType.add(type);
		}
		
	}
	
	public static void takeLoot() {
		
		double random = rand.nextDouble() * 100;
		if(random >= 80 && random <= 100) {
			silverLoot();
		}
		else if (random < 80 && random >= 60) {
			goldLoot();
		}
		else if (random <60 && random >= 35) {
			diamondLoot();
		}
		else if (random < 35 && random >= 1) {
			crystalLoot();
		}
		else if (random < 1 && random >= 0.0001) {
			quantumLoot();
		}
		
	}
	
	public LootManager() {
		Silver();
		Gold();
		Diamond();
		Crystal();
		Quantum();
	}
	
	public static void Silver() {
		
	}
	
	public static void Gold() {
		addLoot(WeaponManager.weaponRawName.get(Weapons.Elementum_Sword),Types.Weapon,Loots.gold);
	}
	
	public static void Diamond() {
		
	}
	
	public static void Crystal() {
		
	}
	
	public static void Quantum() {
		
	}
	
	public static void silverLoot() {
		int random = rand.nextInt(silverLoot.size())-1;
		InventoryManager.invAdd(silverLoot.get(random), silverLootType.get(random));
	}
	
	public static void goldLoot() {
		int random = rand.nextInt(goldLoot.size())-1;
		InventoryManager.invAdd(goldLoot.get(random), goldLootType.get(random));
	}
	
	public static void diamondLoot() {
		int random = rand.nextInt(diamondLoot.size()) - 1;
		InventoryManager.invAdd(diamondLoot.get(random), diamondLootType.get(random));
	}
	
	public static void crystalLoot() {
		int random = rand.nextInt(crystalLoot.size())-1;
		InventoryManager.invAdd(crystalLoot.get(random), crystalLootType.get(random));
	}
	
	public static void quantumLoot() {
		int random = rand.nextInt(quantumLoot.size())-1;
		InventoryManager.invAdd(quantumLoot.get(random), quantumLootType.get(random));
	}
	
	public enum Loots {silver,gold,diamond,crystal,quantum;}

}
