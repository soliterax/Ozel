package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

public class ArmManager {
	
	public static LinkedList<String> helmetName = new LinkedList<String>();
	public static HashMap<Helmets,String> helmetRawName = new HashMap<Helmets,String>();
	public static HashMap<String,Helmets> helmet = new HashMap<String,Helmets>();
	public static HashMap<Helmets,Integer> helmetDefense = new HashMap<Helmets,Integer>();
	
	public static LinkedList<String> chestplateName = new LinkedList<String>();
	public static HashMap<Chestplates,String> chestplateRawName = new HashMap<Chestplates,String>();
	public static HashMap<String,Chestplates> chestplate = new HashMap<String,Chestplates>();
	public static HashMap<Chestplates,Integer> chestplateDefense = new HashMap<Chestplates,Integer>();
	
	public static LinkedList<String> leggingName = new LinkedList<String>();
	public static HashMap<Leggings,String> leggingRawName = new HashMap<Leggings,String>();
	public static HashMap<String,Leggings> legging = new HashMap<String,Leggings>();
	public static HashMap<Leggings,Integer> leggingDefense = new HashMap<Leggings,Integer>();
	
	public static LinkedList<String> bootName = new LinkedList<String>();
	public static HashMap<Boots,String> bootRawName = new HashMap<Boots,String>();
	public static HashMap<String,Boots> boot = new HashMap<String,Boots>();
	public static HashMap<Boots,Integer> bootDefense = new HashMap<Boots,Integer>();
	
	public ArmManager() {
		
		
		
	}
	public enum Helmets {

	}
	public enum Chestplates {

	}

	public enum Leggings {

	}

	public enum Boots {

	}
	
public static void addHelmet(String name, Helmets helmet, int defense) {
		
		ArmManager.helmetName.add(name);
		ArmManager.helmetRawName.put(helmet,name);
		ArmManager.helmet.put(name, helmet);
		ArmManager.helmetDefense.put(helmet, defense);
		
	}
	
	public static void addChestplate(String name,Chestplates cp,int defense) {
		
		ArmManager.chestplateName.add(name);
		ArmManager.chestplateRawName.put(cp, name);
		ArmManager.chestplate.put(name, cp);
		ArmManager.chestplateDefense.put(cp, defense);
		
	}
	
	public static void addLegging(String name,Leggings legging,int defense) {
		
		ArmManager.leggingName.add(name);
		ArmManager.leggingRawName.put(legging, name);
		ArmManager.legging.put(name, legging);
		ArmManager.leggingDefense.put(legging, defense);
		
	}
	
	public static void addBoot(String name, Boots boot, int defense) {
		
		ArmManager.bootName.add(name);
		ArmManager.bootRawName.put(boot, name);
		ArmManager.boot.put(name, boot);
		ArmManager.bootDefense.put(boot, defense);
		
	}

}
