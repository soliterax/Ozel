package com.savas.Managers;

import java.util.LinkedList;
import java.util.Random;

import com.savas.Managers.EffectManager.Effects;

public class EntityManager {
	
	private static Random rand = new Random();
	
	public static String pName;
	public static int pHealth;
	public static int pEnergy;
	public static LinkedList<Effects> playertakeEffect = new LinkedList<Effects>();
	
	public static String eName;
	public static int eHealth;
	public static int eEnergy;
	public static LinkedList<Effects> enemytakeEffect = new LinkedList<Effects>();
	
	public static int getHealth(Entity entity) {
		if(entity == Entity.Player) {
			return pHealth;
		}
		else {
			return eHealth;
		}
	}
	
	public static int getEnergy(Entity entity) {
		if(entity == Entity.Player) {
			return pEnergy;
		}
		else {
			return eEnergy;
		}
	}
	
	public static String getName(Entity entity) {
		if(entity == Entity.Player) {
			return pName;
		}
		else {
			return eName;
		}
	}
	
	public static void setName(Entity entity, String name) {
		if(entity == Entity.Player) {
			pName = name;
		}
		else {
			eName = name;
		}
	}
	
	public static void setHealth(Entity entity, int health) {
		if(entity == Entity.Player) {
			pHealth = health;
		}
		else {
			eHealth = health;
		}
	}
	
	public static void setEnergy(Entity entity, int energy) {
		if(entity == Entity.Player) {
			pEnergy = energy;
		}
		else {
			eEnergy = energy;
		}
	}
	
	public EntityManager() {
		
		EntityManager.setName(Entity.Player, "Gizli Üye");
		EntityManager.setHealth(Entity.Player, 500);
		EntityManager.setEnergy(Entity.Player, 1200);
		EntityManager.setName(Entity.Enemy, "Haxtar");
		EntityManager.setHealth(Entity.Enemy, rand.nextInt(5000));
		EntityManager.setEnergy(Entity.Enemy, 1000);
	}
	
	public enum Entity {
		
		Player,Enemy;
		
	}
	
}
