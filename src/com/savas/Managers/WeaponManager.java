package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

import com.savas.Managers.EffectManager.Effects;

public class WeaponManager {
	
	public static LinkedList<String> weaponList = new LinkedList<String>();
	public static HashMap<Weapons,String> weaponRawName = new HashMap<Weapons,String>();
	public static HashMap<String,Weapons> weapon = new HashMap<String,Weapons>();
	public static HashMap<Weapons,Integer> attackPower = new HashMap<Weapons,Integer>();
	public static HashMap<Weapons,Effects> weaponEffects = new HashMap<Weapons,Effects>();
	
	public WeaponManager() {
		addWeapon("Elementum Kýlýcý", Weapons.Elementum_Sword, 250,Effects.Four_Element_Damage);
		addWeapon("Kanternka", Weapons.Kanternka, 650,Effects.Throw);
		addWeapon("Sýrýk", Weapons.Nyouboi, 1250,Effects.Four_Element_Damage);
	}
	
	public static void addWeapon(String Name, Weapons weapon, int attackPower) {
		WeaponManager.weaponList.add(Name);
		WeaponManager.weaponRawName.put(weapon, Name);
		WeaponManager.weapon.put(Name, weapon);
		WeaponManager.attackPower.put(weapon, attackPower);
	}
	
	public static void addWeapon(String name,Weapons weapon, int attackPower, Effects effect) {
		WeaponManager.weaponList.add(name);
		WeaponManager.weaponRawName.put(weapon, name);
		WeaponManager.weapon.put(name, weapon);
		WeaponManager.attackPower.put(weapon, attackPower);
		WeaponManager.weaponEffects.put(weapon,effect);
	}
	
	public enum Weapons {
		Elementum_Sword,
		Kanternka,
		Nyouboi;
	}

}
