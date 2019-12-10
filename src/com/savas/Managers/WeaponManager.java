package com.savas.Managers;

import java.util.HashMap;
import java.util.LinkedList;

import com.savas.Tools.Weapons;
import com.savas.powers.Weapon;

public class WeaponManager {
	
	public static LinkedList<String> weaponList = new LinkedList<String>();
	public static HashMap<Weapons,String> weaponRawName = new HashMap<Weapons,String>();
	public static HashMap<String,Weapons> weapon = new HashMap<String,Weapons>();
	public static HashMap<Weapons,Integer> attackPower = new HashMap<Weapons,Integer>();
	
	public WeaponManager() {
		Weapon.addWeapon("Elementum Kýlýcý", Weapons.Elementum_Sword, 250);
		Weapon.addWeapon("Kanternka", Weapons.Kanternka, 650);
		Weapon.addWeapon("Sýrýk", Weapons.Nyouboi, 1250);
	}

}
