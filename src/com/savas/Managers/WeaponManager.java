package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

public class WeaponManager {
	
	public static LinkedList<String> weaponList = new LinkedList<String>();
	public static HashMap<Weapons,String> weaponRawName = new HashMap<Weapons,String>();
	public static HashMap<String,Weapons> weapon = new HashMap<String,Weapons>();
	public static HashMap<Weapons,Integer> attackPower = new HashMap<Weapons,Integer>();
	
	public WeaponManager() {
		addWeapon("Elementum Kýlýcý", Weapons.Elementum_Sword, 250);
		addWeapon("Kanternka", Weapons.Kanternka, 650);
		addWeapon("Sýrýk", Weapons.Nyouboi, 1250);
	}
	
	public static void addWeapon(String Name, Weapons weapon, int attackPower) {
		WeaponManager.weaponList.add(Name);
		WeaponManager.weaponRawName.put(weapon, Name);
		WeaponManager.weapon.put(Name, weapon);
		WeaponManager.attackPower.put(weapon, attackPower);
	}
	
	public enum Weapons {
		Elementum_Sword,
		Kanternka,
		Nyouboi;
	}

}
